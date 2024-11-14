
package net.applee.gdlevelapi.blocks.triggers.spawnable;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.blocks.SpawnableTrigger;
import net.applee.gdlevelapi.key.containers.BlockKeys;
import net.applee.gdlevelapi.key.Property;

@Getter
@Setter
public class PickupTrigger extends SpawnableTrigger {

	private final Property<Integer> count    = property(BlockKeys.COUNT);
	private final Property<Integer> itemId   = property(BlockKeys.ITEM_ID);
	private final Property<Double>  modifier = property(BlockKeys.MODIFIER);
	private final Property<Boolean> override = property(BlockKeys.OVERRIDE);
	private final Property<Mode>    mode     = property(BlockKeys.PICKUP_MODE);

	public enum Mode {
		NONE,
		MULTIPLY,
		DIVIDE
	}
}
