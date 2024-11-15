package net.applee.gdlevelapi.blocks;

import lombok.Getter;
import net.applee.gdlevelapi.key.Key;

import java.util.HashMap;
import java.util.Map;

@Getter
public class UnknownBlock extends Block {

	private final Map<Key<?>, String> unknownProperties = new HashMap<>();

	@Override
	public void readProperties(Map<Key<?>, String> data) {
		super.readProperties(data);
		unknownProperties.putAll(data);
	}

	@Override
	public void writeProperties(Map<Key<?>, String> data) {
		super.writeProperties(data);
		data.putAll(unknownProperties);
	}
}
