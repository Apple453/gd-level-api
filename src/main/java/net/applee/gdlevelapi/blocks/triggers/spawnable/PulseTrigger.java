
package net.applee.gdlevelapi.blocks.triggers.spawnable;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.blocks.TargetableTrigger;
import net.applee.gdlevelapi.key.Key;
import net.applee.gdlevelapi.key.Property;
import net.applee.gdlevelapi.key.containers.BlockKeys;
import net.applee.gdlevelapi.objects.HSVContainer;

import java.awt.*;
import java.util.Map;

@Getter
@Setter
public class PulseTrigger extends TargetableTrigger {

	private Color color;

	private final Property<HSVContainer> pulseHsv     = property(BlockKeys.PULSE_HSV);
	private final Property<Double>       fadeIn       = property(BlockKeys.FADE_IN);
	private final Property<Double>       hold         = property(BlockKeys.HOLD);
	private final Property<Double>       fadeOut      = property(BlockKeys.FADE_OUT);
	private final Property<Mode>         pulseMode    = property(BlockKeys.PULSE_MODE);
	private final Property<TargetType>   targetType   = property(BlockKeys.PULSE_TARGET_TYPE);
	private final Property<Integer>      colorId      = property(BlockKeys.COLOR_CHANNEL_ID);
	private final Property<Boolean>      mainOnly     = property(BlockKeys.MAIN_ONLY);
	private final Property<Boolean>      detailOnly   = property(BlockKeys.DETAIL_ONLY);
	private final Property<Boolean>      nonStaticHsv = property(BlockKeys.NON_STATIC_HSV);
	private final Property<Boolean>      exclusive    = property(BlockKeys.EXLUSIVE);

	@Override
	public void readProperties(Map<Key<?>, String> data) {
		super.readProperties(data);
		color = BlockKeys.readColor(data);
	}

	@Override
	public void writeProperties(Map<Key<?>, String> data) {
		super.writeProperties(data);
		BlockKeys.writeColor(data, color);
	}

	public enum Mode {
		COLOR,
		HSV
	}

	public enum TargetType {
		CHANNEL,
		GROUP
	}
}
