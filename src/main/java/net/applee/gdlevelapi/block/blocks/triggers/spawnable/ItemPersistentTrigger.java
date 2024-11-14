
package net.applee.gdlevelapi.block.blocks.triggers.spawnable;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.block.blocks.SpawnableTrigger;
import net.applee.gdlevelapi.block.key.BlockKeys;
import net.applee.gdlevelapi.block.key.BlockProperty;

@Getter
@Setter
public class ItemPersistentTrigger extends SpawnableTrigger {

	private final BlockProperty<Integer> item       = property(BlockKeys.ITEM_ID);
	private final BlockProperty<Boolean> persistent = property(BlockKeys.PERSISTENT);
	private final BlockProperty<Boolean> targetAll  = property(BlockKeys.TARGET_ALL);
	private final BlockProperty<Boolean> reset      = property(BlockKeys.RESET);
	private final BlockProperty<Boolean> timer      = property(BlockKeys.TIMER);
}
