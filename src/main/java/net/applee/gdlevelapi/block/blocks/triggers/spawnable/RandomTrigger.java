
package net.applee.gdlevelapi.block.blocks.triggers.spawnable;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.block.blocks.SpawnableTrigger;
import net.applee.gdlevelapi.block.key.BlockKeys;
import net.applee.gdlevelapi.block.key.BlockProperty;

@Getter
@Setter
public class RandomTrigger extends SpawnableTrigger {

	private final BlockProperty<Double>  chance = property(BlockKeys.TIME);
	private final BlockProperty<Integer> group1 = property(BlockKeys.GROUP_ID);
	private final BlockProperty<Integer> group2 = property(BlockKeys.TARGET_GROUP_ID);
}
