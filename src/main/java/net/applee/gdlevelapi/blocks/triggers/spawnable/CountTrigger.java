
package net.applee.gdlevelapi.blocks.triggers.spawnable;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.blocks.TargetableTrigger;
import net.applee.gdlevelapi.key.Property;
import net.applee.gdlevelapi.key.containers.BlockKeys;

@Getter
@Setter
public class CountTrigger extends TargetableTrigger {

	private final Property<Integer> count         = property(BlockKeys.COUNT);
	private final Property<Integer> itemId        = property(BlockKeys.ITEM_ID);
	private final Property<Boolean> activateGroup = property(BlockKeys.ACTIVATE_GROUP);
	private final Property<Boolean> multiActivate = property(BlockKeys.MULTI_ACTIVATE);
}
