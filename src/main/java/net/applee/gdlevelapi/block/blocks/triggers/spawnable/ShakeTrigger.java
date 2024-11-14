
package net.applee.gdlevelapi.block.blocks.triggers.spawnable;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.block.key.BlockKeys;
import net.applee.gdlevelapi.block.blocks.SpawnableTrigger;
import net.applee.gdlevelapi.block.key.BlockProperty;

@Getter
@Setter
public class ShakeTrigger extends SpawnableTrigger {

	private final BlockProperty<Double> strength = property(BlockKeys.STRENGTH);
	private final BlockProperty<Double> interval = property(BlockKeys.INTERVAL);
	private final BlockProperty<Double> duration = property(BlockKeys.TIME);
}
