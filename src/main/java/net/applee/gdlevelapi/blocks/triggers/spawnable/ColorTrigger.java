
package net.applee.gdlevelapi.blocks.triggers.spawnable;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.blocks.SpawnableTrigger;
import net.applee.gdlevelapi.key.Key;
import net.applee.gdlevelapi.key.Property;
import net.applee.gdlevelapi.key.containers.BlockKeys;

import java.awt.*;
import java.util.Map;

@Getter
@Setter
public class ColorTrigger extends SpawnableTrigger {

	private Color color;

	private final Property<Double>  fadeTime     = property(BlockKeys.TIME);
	private final Property<Integer> colorId      = property(BlockKeys.COLOR_ID);
	private final Property<Integer> channelId    = property(BlockKeys.COLOR_CHANNEL_ID);
	private final Property<Double>  opacity      = property(BlockKeys.OPACITY);
	private final Property<Boolean> playerColor1 = property(BlockKeys.PLAYER_COLOR_1);
	private final Property<Boolean> playerColor2 = property(BlockKeys.PLAYER_COLOR_2);
	private final Property<Boolean> copyOpacity  = property(BlockKeys.COPY_OPACITY);

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
}
