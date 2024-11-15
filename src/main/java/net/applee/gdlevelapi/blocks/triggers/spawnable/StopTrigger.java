
package net.applee.gdlevelapi.blocks.triggers.spawnable;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.blocks.TargetableTrigger;
import net.applee.gdlevelapi.key.Property;
import net.applee.gdlevelapi.key.containers.BlockKeys;

@Getter
@Setter
public class StopTrigger extends TargetableTrigger {

	private final Property<Mode>    mode         = property(BlockKeys.STOP_MODE);
	private final Property<Boolean> useControlId = property(BlockKeys.USE_CONTROL_ID);

	public enum Mode {
		STOP,
		PAUSE,
		RESUME
	}
}
