
package net.applee.gdlevelapi.blocks.triggers.spawnable;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.blocks.TargetableTrigger;
import net.applee.gdlevelapi.key.containers.BlockKeys;
import net.applee.gdlevelapi.key.Property;

@Getter
@Setter
public class InstantCountTrigger extends TargetableTrigger {

	private final Property<Integer> count         = property(BlockKeys.COUNT);
	private final Property<Integer> itemId        = property(BlockKeys.ITEM_ID);
	private final Property<Boolean> activateGroup = property(BlockKeys.ACTIVATE_GROUP);
	private final Property<Mode>    mode          = property(BlockKeys.INSTANT_COUNT_MODE);

	public enum Mode {
		EQUALS,
		LARGER,
		SMALLER
	}
}
