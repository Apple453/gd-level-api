package net.applee.gdlevelapi;

import lombok.Getter;
import net.applee.gdlevelapi.blocks.Block;
import net.applee.gdlevelapi.key.containers.LevelKeys;
import net.applee.gdlevelapi.key.Key;

import java.util.*;

@Getter
public class LevelData {

	public static final int CELL_SIZE = 30;

	private final Map<Key<?>, String> settings = new HashMap<>();
	private final List<Block>         blocks   = new ArrayList<>();

	public void loadLevel(String packedData) {
		String editor = DataConverter.unpack(packedData);

		String[] vals = editor.split(";");

		loadEditorSettings(vals[0].split(","));

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

	private void loadEditorSettings(String[] raw) {
		for (int i = 0; i < raw.length; i += 2)
			settings.put(LevelKeys.byKey(raw[i]), raw[i + 1]);
	}

	public <T> T getSetting(Key<T> key) {
		var raw = settings.get(key);

		if (raw == null)
			return null;


		return key.getReaderFactory().get().read(settings.get(key));
	}
}
