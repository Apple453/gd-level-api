package net.applee.gdlevelapi.block.blocks;

import net.applee.gdlevelapi.block.key.BlockKey;

import java.util.*;

public class UnknownBlock extends Block {

	public static final Set<String> unknowns = new HashSet<>();

	@Override
	public void readRawProperties(Map<String, String> rawData) {
		super.readRawProperties(rawData);
//		System.out.println("Unknown raw data: " + rawData);
//		System.out.println();
	}

	@Override
	public void readProperties(Map<BlockKey<?>, String> data) {
		super.readProperties(data);

		System.out.println(data);

		data.forEach((key, value) -> {
			if (key instanceof BlockKey.Unknown unknown) {
				unknowns.add(unknown.getKey());
			}
		});

//		System.out.println(id + ": " + posX + ", " + posY);

//		System.out.println("Unknown data: " + data);
	}
}
