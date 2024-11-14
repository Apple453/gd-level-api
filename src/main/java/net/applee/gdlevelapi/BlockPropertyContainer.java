package net.applee.gdlevelapi;

import net.applee.gdlevelapi.block.key.BlockKey;
import net.applee.gdlevelapi.block.key.BlockProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class BlockPropertyContainer {

	private final List<BlockProperty<?>> properties = new ArrayList<>();

	protected <T> BlockProperty<T> property(BlockKey<T> key) {
		BlockProperty<T> blockProperty = new BlockProperty<>(key);
		properties.add(blockProperty);
		return blockProperty;
	}

	public void readRawProperties(Map<String, String> rawData) {
		Map<BlockKey<?>, String> parsedRawData = new HashMap<>();

		rawData.forEach((k, v) -> {
			BlockProperty<?> blockProperty = null;

			for (var p : properties) {
				String key = p.getKey().getKey();
				if (key.equals(k)) {
					blockProperty = p;
					break;
				}
			}

			if (blockProperty == null)
				parsedRawData.put(BlockKey.byKey(k), v);
			else
				parsedRawData.put(blockProperty.getKey(), v);
		});

		readProperties(parsedRawData);
	}

	public void readProperties(Map<BlockKey<?>, String> data) {
		properties.forEach(v -> v.read(data));
	}

	public Map<BlockKey<?>, String> getProperties() {
		Map<BlockKey<?>, String> data = new HashMap<>();

		properties.forEach(v -> v.getKey().write(data, v.getValue()));

		writeProperties(data);

		return data;
	}

	public void writeProperties(Map<BlockKey<?>, String> data) {}
}
