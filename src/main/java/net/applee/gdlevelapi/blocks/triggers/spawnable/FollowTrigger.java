
package net.applee.gdlevelapi.blocks.triggers.spawnable;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.blocks.TargetableTrigger;
import net.applee.gdlevelapi.key.Property;
import net.applee.gdlevelapi.key.containers.BlockKeys;

@Getter
@Setter
public class FollowTrigger extends TargetableTrigger {

	private final Property<Integer> targetGroupId = property(BlockKeys.TARGET_GROUP_ID);
	private final Property<Double>  time          = property(BlockKeys.TIME);
	private final Property<Double>  modX          = property(BlockKeys.FOLLOW_MOD_X);
	private final Property<Double>  modY          = property(BlockKeys.FOLLOW_MOD_Y);
}
