
package net.applee.gdlevelapi.block.blocks.triggers.spawnable;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.block.key.BlockKeys;
import net.applee.gdlevelapi.block.key.BlockProperty;
import net.applee.gdlevelapi.block.blocks.TargetableTrigger;

@Getter
@Setter
public class AlphaTrigger extends TargetableTrigger {

	private final BlockProperty<Double> opacity = property(BlockKeys.OPACITY);
	private final BlockProperty<Double> time    = property(BlockKeys.TIME);
}
