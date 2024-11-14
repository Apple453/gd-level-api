package net.applee.gdlevelapi.block.blocks;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.block.key.BlockKey;
import net.applee.gdlevelapi.block.key.BlockKeys;
import net.applee.gdlevelapi.block.key.BlockProperty;

import java.util.Map;

@Getter
@Setter
public abstract class SpawnableTrigger extends AbstractTriggerBlock {

	private Map<BlockKey<?>, String> data;

	protected final BlockProperty<Boolean> spawnTrigger = property(BlockKeys.SPAWN_TRIGGER);
	protected final BlockProperty<Boolean> touchTrigger = property(BlockKeys.TOUCH_TRIGGER);
	protected final BlockProperty<Boolean> multiTrigger = property(BlockKeys.MULTI_TRIGGER);

	private void test() {
		System.out.println(getClass().getSimpleName() + ": " + data);
		System.out.println("Prev: " + preview);
	}

	@Override
	public void readRawProperties(Map<String, String> rawData) {
		super.readRawProperties(rawData);
		test();
	}

	@Override
	public void readProperties(Map<BlockKey<?>, String> data) {
		super.readProperties(data);
		this.data = data;
	}
}