
package net.applee.gdlevelapi.block.blocks.triggers.spawnable;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.block.key.BlockKeys;
import net.applee.gdlevelapi.block.key.BlockProperty;
import net.applee.gdlevelapi.block.blocks.TargetableTrigger;

@Getter
@Setter
public class FollowTrigger extends TargetableTrigger {

	private final BlockProperty<Integer> targetGroupId = property(BlockKeys.TARGET_GROUP_ID);
	private final BlockProperty<Double>  time          = property(BlockKeys.TIME);
	private final BlockProperty<Double>  modX          = property(BlockKeys.FOLLOW_MOD_X);
	private final BlockProperty<Double>  modY          = property(BlockKeys.FOLLOW_MOD_Y);
}
