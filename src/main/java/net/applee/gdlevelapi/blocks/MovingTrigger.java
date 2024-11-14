package net.applee.gdlevelapi.blocks;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.key.containers.BlockKeys;
import net.applee.gdlevelapi.key.Property;
import net.applee.gdlevelapi.objects.enums.Easing;

@Getter
@Setter
public abstract class MovingTrigger extends TargetableTrigger {

	private final Property<Double> time       = property(BlockKeys.TIME);
	private final Property<Easing> easing     = property(BlockKeys.EASING);
	private final Property<Double> easingRate = property(BlockKeys.EASING_RATE);
}
