package net.applee.gdlevelapi;

import net.applee.gdlevelapi.key.Key;
import net.applee.gdlevelapi.key.Property;
import net.applee.gdlevelapi.key.containers.LevelHeaderKeys;
import net.applee.gdlevelapi.utils.PlistHandler;

import java.util.*;
import java.util.function.Function;

public abstract class PropertyContainer {

	private final List<Property<?>> properties = new ArrayList<>();

	protected <T> Property<T> property(Key<T> key) {
		Property<T> property = new Property<>(key);
		properties.add(property);
		return property;
	}

	public void readRawProperties(Function<String, Key<?>> keyProvider, Map<String, String> rawMap) {
		readProperties(convertMap(keyProvider, properties, rawMap));
	}

	public void readProperties(Map<Key<?>, String> data) {
		properties.forEach(v -> v.read(data));
	}

	public Map<Key<?>, String> getProperties() {
		Map<Key<?>, String> data = new HashMap<>();

		properties.forEach(v -> v.getKey().write(data, v.getValue()));

		writeProperties(data);

		return data;
	}

	public void writeProperties(Map<Key<?>, String> data) {}

	public static Map<Key<?>, String> convertPlistMap(Map<String, PlistHandler.Value> plistMap) {
		Map<Key<?>, String> map = new HashMap<>();

		plistMap.forEach((k, v) -> {
			Key<?> key = LevelHeaderKeys.byKey(k);

			String raw = v.toString();
			if ("t".equals(v.getTag()))
				raw = "1";
			else if ("f".equals(v.getTag()))
				raw = "0";

			map.put(key, raw);

			// System.out.println(key + ": " + key.getReaderFactory().get().read(raw) + " -> " + v.getTag());
		});

		return map;
	}

	public static Map<Key<?>, String> convertMap(
			Function<String, Key<?>> keyProvider,
			List<Property<?>> properties,
			Map<String, String> rawMap
	) {
		Map<Key<?>, String> parsedRawData = new HashMap<>();

		rawMap.forEach((k, v) -> {
			Property<?> property = null;

			for (var p : properties) {
				String key = p.getKey().getKey();
				if (key.equals(k)) {
					property = p;
					break;
				}
			}

			if (property == null)
				parsedRawData.put(keyProvider.apply(k), v);
			else
				parsedRawData.put(property.getKey(), v);
		});

		return parsedRawData;
	}

	public static Map<String, String> convertArray(String[] array) {
		Map<String, String> map = new Hashtable<>();

		for (int i = 0; i < array.length; i += 2)
			map.put(array[i], i + 1 < array.length ? array[i + 1] : "");

		return map;
	}
}
