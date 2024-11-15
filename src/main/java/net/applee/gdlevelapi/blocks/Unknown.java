package net.applee.gdlevelapi.blocks;

import net.applee.gdlevelapi.key.Key;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

public class Unknown extends Block {

	public static final Set<String> unknowns = new HashSet<>();

	@Override
	public void readRawProperties(Function<String, Key<?>> keyProvider, Map<String, String> rawData) {
		super.readRawProperties(keyProvider, rawData);
//		System.out.println("Unknown raw data: " + rawData);
//		System.out.println();
	}

	@Override
	public void readProperties(Map<Key<?>, String> data) {
		super.readProperties(data);

		data.forEach((key, value) -> {
			if (key instanceof Key.Unknown unknown) {
				unknowns.add(unknown.getKey());
			}
		});
	}
}
