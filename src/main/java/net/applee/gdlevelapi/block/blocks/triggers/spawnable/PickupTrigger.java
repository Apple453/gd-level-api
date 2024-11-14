
package net.applee.gdlevelapi.block.blocks.triggers.spawnable;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.block.key.BlockKeys;
import net.applee.gdlevelapi.block.blocks.SpawnableTrigger;
import net.applee.gdlevelapi.block.key.BlockProperty;

@Getter
@Setter
public class PickupTrigger extends SpawnableTrigger {

	private final BlockProperty<Integer> count    = property(BlockKeys.COUNT);
	private final BlockProperty<Integer> itemId   = property(BlockKeys.ITEM_ID);
	private final BlockProperty<Double>  modifier = property(BlockKeys.MODIFIER);
	private final BlockProperty<Boolean> override = property(BlockKeys.OVERRIDE);
	private final BlockProperty<Mode>    mode     = property(BlockKeys.PICKUP_MODE);

	public enum Mode {
		NONE,
		MULTIPLY,
		DIVIDE
	}
}
