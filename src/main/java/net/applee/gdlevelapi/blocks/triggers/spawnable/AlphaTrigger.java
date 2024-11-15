
package net.applee.gdlevelapi.blocks.triggers.spawnable;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.blocks.TargetableTrigger;
import net.applee.gdlevelapi.key.Property;
import net.applee.gdlevelapi.key.containers.BlockKeys;

@Getter
@Setter
public class AlphaTrigger extends TargetableTrigger {

	private final Property<Double> opacity = property(BlockKeys.OPACITY);
	private final Property<Double> time    = property(BlockKeys.TIME);
}
