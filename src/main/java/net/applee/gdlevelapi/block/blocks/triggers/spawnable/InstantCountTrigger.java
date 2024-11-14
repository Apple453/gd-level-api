
package net.applee.gdlevelapi.block.blocks.triggers.spawnable;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.block.key.BlockKeys;
import net.applee.gdlevelapi.block.key.BlockProperty;
import net.applee.gdlevelapi.block.blocks.TargetableTrigger;

@Getter
@Setter
public class InstantCountTrigger extends TargetableTrigger {

	private final BlockProperty<Integer> count         = property(BlockKeys.COUNT);
	private final BlockProperty<Integer> itemId        = property(BlockKeys.ITEM_ID);
	private final BlockProperty<Boolean> activateGroup = property(BlockKeys.ACTIVATE_GROUP);
	private final BlockProperty<Mode>    mode          = property(BlockKeys.INSTANT_COUNT_MODE);

	public enum Mode {
		EQUALS,
		LARGER,
		SMALLER
	}
}
