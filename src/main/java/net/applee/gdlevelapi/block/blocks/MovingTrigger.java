package net.applee.gdlevelapi.block.blocks;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.block.key.BlockProperty;
import net.applee.gdlevelapi.block.key.BlockKeys;
import net.applee.gdlevelapi.objects.enums.Easing;

@Getter
@Setter
public abstract class MovingTrigger extends TargetableTrigger {

	private final BlockProperty<Double> time       = property(BlockKeys.TIME);
	private final BlockProperty<Easing> easing     = property(BlockKeys.EASING);
	private final BlockProperty<Double> easingRate = property(BlockKeys.EASING_RATE);
}
