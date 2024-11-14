
package net.applee.gdlevelapi.block.blocks.triggers.spawnable;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.block.key.BlockKey;
import net.applee.gdlevelapi.block.key.BlockKeys;
import net.applee.gdlevelapi.block.key.BlockProperty;
import net.applee.gdlevelapi.block.blocks.TargetableTrigger;
import net.applee.gdlevelapi.objects.HSVContainer;

import java.awt.*;
import java.util.Map;

@Getter
@Setter
public class PulseTrigger extends TargetableTrigger {

	private Color color;

	private final BlockProperty<HSVContainer> pulseHsv     = property(BlockKeys.PULSE_HSV);
	private final BlockProperty<Double>       fadeIn       = property(BlockKeys.FADE_IN);
	private final BlockProperty<Double>       hold         = property(BlockKeys.HOLD);
	private final BlockProperty<Double>       fadeOut      = property(BlockKeys.FADE_OUT);
	private final BlockProperty<Mode>         pulseMode    = property(BlockKeys.PULSE_MODE);
	private final BlockProperty<TargetType>   targetType   = property(BlockKeys.PULSE_TARGET_TYPE);
	private final BlockProperty<Integer>      colorId      = property(BlockKeys.COLOR_CHANNEL_ID);
	private final BlockProperty<Boolean>      mainOnly     = property(BlockKeys.MAIN_ONLY);
	private final BlockProperty<Boolean>      detailOnly   = property(BlockKeys.DETAIL_ONLY);
	private final BlockProperty<Boolean>      nonStaticHsv = property(BlockKeys.NON_STATIC_HSV);
	private final BlockProperty<Boolean>      exclusive    = property(BlockKeys.EXLUSIVE);

	@Override
	public void readProperties(Map<BlockKey<?>, String> data) {
		super.readProperties(data);
		color = BlockKeys.readColor(data);
	}

	@Override
	public void writeProperties(Map<BlockKey<?>, String> data) {
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
