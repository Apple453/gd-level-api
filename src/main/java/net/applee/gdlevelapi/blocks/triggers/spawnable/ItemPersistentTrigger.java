
package net.applee.gdlevelapi.blocks.triggers.spawnable;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.blocks.SpawnableTrigger;
import net.applee.gdlevelapi.key.Property;
import net.applee.gdlevelapi.key.containers.BlockKeys;

@Getter
@Setter
public class ItemPersistentTrigger extends SpawnableTrigger {

	private final Property<Integer> item       = property(BlockKeys.ITEM_ID);
	private final Property<Boolean> persistent = property(BlockKeys.PERSISTENT);
	private final Property<Boolean> targetAll  = property(BlockKeys.TARGET_ALL);
	private final Property<Boolean> reset      = property(BlockKeys.RESET);
	private final Property<Boolean> timer      = property(BlockKeys.TIMER);
}
