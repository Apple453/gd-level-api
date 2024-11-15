
package net.applee.gdlevelapi.blocks.triggers.spawnable;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.blocks.SpawnableTrigger;
import net.applee.gdlevelapi.key.Property;
import net.applee.gdlevelapi.key.containers.BlockKeys;

@Getter
@Setter
public class RandomTrigger extends SpawnableTrigger {

	private final Property<Double>  chance = property(BlockKeys.TIME);
	private final Property<Integer> group1 = property(BlockKeys.GROUP_ID);
	private final Property<Integer> group2 = property(BlockKeys.TARGET_GROUP_ID);
}
