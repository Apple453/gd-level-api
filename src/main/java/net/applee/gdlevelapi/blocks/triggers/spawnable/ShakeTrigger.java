
package net.applee.gdlevelapi.blocks.triggers.spawnable;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.blocks.SpawnableTrigger;
import net.applee.gdlevelapi.key.Property;
import net.applee.gdlevelapi.key.containers.BlockKeys;

@Getter
@Setter
public class ShakeTrigger extends SpawnableTrigger {

	private final Property<Double> strength = property(BlockKeys.STRENGTH);
	private final Property<Double> interval = property(BlockKeys.INTERVAL);
	private final Property<Double> duration = property(BlockKeys.TIME);
}
