package net.applee.gdlevelapi.blocks;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.key.containers.BlockKeys;
import net.applee.gdlevelapi.key.Key;
import net.applee.gdlevelapi.key.Property;

import java.util.Map;
import java.util.function.Function;

@Getter
@Setter
public abstract class SpawnableTrigger extends AbstractTrigger {

	private Map<Key<?>, String> data;

	protected final Property<Boolean> spawnTrigger = property(BlockKeys.SPAWN_TRIGGER);
	protected final Property<Boolean> touchTrigger = property(BlockKeys.TOUCH_TRIGGER);
	protected final Property<Boolean> multiTrigger = property(BlockKeys.MULTI_TRIGGER);

	private void test() {
//		System.out.println(getClass().getSimpleName() + ": " + data);
	}

	@Override
	public void readRawProperties(Function<String, Key<?>> keyProvider, Map<String, String> rawData) {
		super.readRawProperties(keyProvider, rawData);
		test();
	}

	@Override
	public void readProperties(Map<Key<?>, String> data) {
		super.readProperties(data);
		this.data = data;
	}
}