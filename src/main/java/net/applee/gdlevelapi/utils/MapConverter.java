package net.applee.gdlevelapi.utils;

import net.applee.gdlevelapi.key.Key;
import net.applee.gdlevelapi.key.Property;
import net.applee.gdlevelapi.key.containers.LevelHeaderKeys;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class MapConverter {

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

	public static Map<String, String> convertArrayToMap(String[] array) {
		Map<String, String> map = new Hashtable<>();

		for (int i = 0; i < array.length; i += 2)
			map.put(array[i], i + 1 < array.length ? array[i + 1] : "");

		return map;
	}

	public static String[] convertMapToArray(Map<Key<?>, String> map) {
		Map<String, String> rawMap = new HashMap<>();
		map.forEach((k,v) -> rawMap.put(k.getKey(), v));

		return convertRawMapToArray(rawMap);
	}

	public static String[] convertRawMapToArray(Map<String, String> map) {
		String[] array = new String[map.size() * 2];

		int index = 0;
		for (var entry : map.entrySet()) {

			array[index] = entry.getKey();
			array[index + 1] = entry.getValue();

			index += 2;
		}

		return array;
	}

}
