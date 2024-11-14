package net.applee.gdlevelapi;

import net.applee.gdlevelapi.key.Key;
import net.applee.gdlevelapi.key.Property;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public abstract class PropertyContainer {

	private final List<Property<?>> properties = new ArrayList<>();

	protected <T> Property<T> property(Key<T> key) {
		Property<T> property = new Property<>(key);
		properties.add(property);
		return property;
	}

	public void readRawProperties(Function<String, Key<?>> keyProvider, Map<String, String> rawData) {
		Map<Key<?>, String> parsedRawData = new HashMap<>();

		rawData.forEach((k, v) -> {
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

		readProperties(parsedRawData);
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
}
