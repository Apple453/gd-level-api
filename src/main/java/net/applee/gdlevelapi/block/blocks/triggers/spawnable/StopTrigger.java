
package net.applee.gdlevelapi.block.blocks.triggers.spawnable;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.block.key.BlockKeys;
import net.applee.gdlevelapi.block.key.BlockProperty;
import net.applee.gdlevelapi.block.blocks.TargetableTrigger;

@Getter
@Setter
public class StopTrigger extends TargetableTrigger {

	private final BlockProperty<Mode>    mode         = property(BlockKeys.STOP_MODE);
	private final BlockProperty<Boolean> useControlId = property(BlockKeys.USE_CONTROL_ID);

	public enum Mode {
		STOP,
		PAUSE,
		RESUME
	}
}
