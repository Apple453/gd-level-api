
package net.applee.gdlevelapi.block.blocks.triggers.spawnable;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.block.key.BlockProperty;
import net.applee.gdlevelapi.block.key.BlockKey;
import net.applee.gdlevelapi.block.key.BlockKeys;
import net.applee.gdlevelapi.block.blocks.SpawnableTrigger;

import java.awt.*;
import java.util.Map;

@Getter
@Setter
public class ColorTrigger extends SpawnableTrigger {

	private Color color;

	private final BlockProperty<Double>  fadeTime     = property(BlockKeys.TIME);
	private final BlockProperty<Integer> colorId      = property(BlockKeys.COLOR_ID);
	private final BlockProperty<Integer> channelId    = property(BlockKeys.COLOR_CHANNEL_ID);
	private final BlockProperty<Double>  opacity      = property(BlockKeys.OPACITY);
	private final BlockProperty<Boolean> playerColor1 = property(BlockKeys.PLAYER_COLOR_1);
	private final BlockProperty<Boolean> playerColor2 = property(BlockKeys.PLAYER_COLOR_2);
	private final BlockProperty<Boolean> copyOpacity  = property(BlockKeys.COPY_OPACITY);

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
}
