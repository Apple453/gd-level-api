package net.applee.gdlevelapi.level;

import lombok.Getter;
import net.applee.gdlevelapi.BlocksRegistry;
import net.applee.gdlevelapi.blocks.Block;
import net.applee.gdlevelapi.key.Key;
import net.applee.gdlevelapi.key.containers.LevelHeaderKeys;
import net.applee.gdlevelapi.key.containers.LevelKeys;
import net.applee.gdlevelapi.readers.RawReader;
import net.applee.gdlevelapi.utils.DataConverter;
import net.applee.gdlevelapi.utils.PlistHandler;

import java.util.*;

@Getter
public class LevelData {

	public static final int CELL_SIZE = 30;

	private final LevelHeaders  headers  = new LevelHeaders();
	private final LevelSettings settings = new LevelSettings();

	private final List<Block> blocks = new ArrayList<>();

	public LevelData() {}

	public LevelData(Map<String, PlistHandler.Value> data) {
		loadLevel(data);
	}

	public void loadLevel(Map<String, PlistHandler.Value> data) {
		loadLevel(((String) data.get(LevelHeaderKeys.EDITOR.getKey()).getValue())
				.replaceAll(" ", "")
				.replaceAll("\n", ""));

		Map<Key<?>, String> headersData = new HashMap<>();
		data.forEach((k, v) -> {
			var key = LevelHeaderKeys.byKey(k);

			if (key != LevelHeaderKeys.EDITOR) {
				String raw = v.toString();
				if ("t".equals(v.getTag()))
					raw = "1";
				else if ("f".equals(v.getTag()))
					raw = "0";

				headersData.put(key, raw);

//				System.out.println(key + ": " + key.getReaderFactory().get().read(raw) + " -> " + v.getTag());
			}
		});

		headers.readProperties(headersData);
	}

	public void loadLevel(String packedData) {
		String editor = DataConverter.unpack(packedData);

		String[] vals = editor.split(";");

		loadSettings(vals[0].split(","));

		for (int i = 1; i < vals.length; i++)
			loadBlock(vals[i].split(","));
	}

	private void loadBlock(String[] raw) {
		Map<String, String> blockData = new Hashtable<>();

		for (int i = 0; i < raw.length; i += 2)
			blockData.put(raw[i], i + 1 < raw.length ? raw[i + 1] : "");

		var block = BlocksRegistry.create(blockData);
		if (block == null)
			System.err.println("Block " + BlocksRegistry.getLastId() + " not found!");
		else
			blocks.add(block);
	}

	private void loadSettings(String[] raw) {
		Map<Key<?>, String> _settings = new HashMap<>();

		for (int i = 0; i < raw.length; i += 2) {
			_settings.put(LevelKeys.byKey(raw[i]), raw[i + 1]);
		}

		settings.readProperties(_settings);
	}

	private void loadHeaders(String[] raw) {
		Map<Key<?>, String> _settings = new HashMap<>();

		for (int i = 0; i < raw.length; i += 2) {
			_settings.put(LevelHeaderKeys.byKey(raw[i]), raw[i + 1]);
		}

		settings.readProperties(_settings);
	}
}
