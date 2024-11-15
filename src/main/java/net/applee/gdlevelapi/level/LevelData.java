package net.applee.gdlevelapi.level;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.BlocksRegistry;
import net.applee.gdlevelapi.PropertyContainer;
import net.applee.gdlevelapi.blocks.Block;
import net.applee.gdlevelapi.key.Key;
import net.applee.gdlevelapi.key.containers.LevelHeaderKeys;
import net.applee.gdlevelapi.key.containers.LevelKeys;
import net.applee.gdlevelapi.utils.DataConverter;
import net.applee.gdlevelapi.utils.PlistHandler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class LevelData {

	public static final int CELL_SIZE = 30;

	private LevelHeaders  headers;
	private LevelSettings settings = new LevelSettings();

	private final List<Block> blocks = new ArrayList<>();

	public LevelData() {}

	public void loadLevel(Map<Key<?>, String> data) {
		if (data.containsKey(LevelHeaderKeys.LEVEL))
			loadLevelData((data.get(LevelHeaderKeys.LEVEL))
					.replaceAll(" ", "")
					.replaceAll("\n", ""));
	}

	public void loadLevelData(String packedData) {
		String editor = DataConverter.unpack(packedData);

		String[] vals = editor.split(";");

		settings.readRawProperties(LevelKeys::byKey, PropertyContainer.convertArray(vals[0].split(",")));

		for (int i = 1; i < vals.length; i++)
			loadBlock(vals[i].split(","));
	}

	private void loadBlock(String[] raw) {
		var block = BlocksRegistry.create(PropertyContainer.convertArray(raw));

		if (block == null)
			System.err.println("Block " + BlocksRegistry.getLastId() + " not found!");
		else
			blocks.add(block);
	}
}
