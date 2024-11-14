package net.applee.gdlevelapi.key;

import java.util.List;

public class KeyUtils {

	public static Key<?> byKey(List<Key<?>> values, String rawKey) {
		for (Key<?> key : values) {
			if (key.getKey().equals(rawKey))
				return key;
		}

		return Key.unknownKey(rawKey);
	}

	public static String findName(Class<?> clazz, Key<?> key) {
		if (key instanceof Key.Unknown unknown) {
			return unknown.getKey();
		}

		for (var f : clazz.getDeclaredFields()) {
			try {
				if (f.getType() == Key.class && f.get(clazz) == key) {
					return f.getName();
				}
			}
			catch (IllegalAccessException e) {
				throw new RuntimeException(e);
			}
		}

		return "";
	}
}
