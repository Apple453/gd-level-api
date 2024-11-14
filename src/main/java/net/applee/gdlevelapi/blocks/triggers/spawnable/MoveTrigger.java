
package net.applee.gdlevelapi.blocks.triggers.spawnable;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.blocks.MovingTrigger;
import net.applee.gdlevelapi.key.containers.BlockKeys;
import net.applee.gdlevelapi.key.Property;

@Getter
@Setter
public class MoveTrigger extends MovingTrigger {

	private final Property<Integer> moveX            = property(BlockKeys.MOVE_X);
	private final Property<Integer> moveY            = property(BlockKeys.MOVE_Y);
	private final Property<Double>  modX             = property(BlockKeys.MOVE_MOD_X);
	private final Property<Double>  modY             = property(BlockKeys.MOVE_MOD_Y);
	private final Property<Boolean> silent           = property(BlockKeys.SILENT);
	private final Property<Boolean> lockPlayerX      = property(BlockKeys.LOCK_PLAYER_X);
	private final Property<Boolean> lockPlayerY      = property(BlockKeys.LOCK_PLAYER_Y);
	private final Property<Boolean> lockCameraX      = property(BlockKeys.LOCK_CAMERA_X);
	private final Property<Boolean> lockCameraY      = property(BlockKeys.LOCK_CAMERA_Y);
	private final Property<Boolean> smallStep        = property(BlockKeys.SMALL_STEP);
	private final Property<Boolean> dynamicMode      = property(BlockKeys.DYNAMIC_MODE);
	private final Property<Boolean> targetMode       = property(BlockKeys.TARGET_MODE);
	private final Property<Boolean> player1          = property(BlockKeys.PLAYER_ONE);
	private final Property<Boolean> player2          = property(BlockKeys.PLAYER_TWO);
	private final Property<Boolean> directrionMode   = property(BlockKeys.DIRECTION_MODE);
	private final Property<Integer> centerGroupId    = property(BlockKeys.CENTER_GROUP_ID);
	private final Property<Integer> targetPosGroupId = property(BlockKeys.TARGET_GROUP_ID);
	private final Property<Integer> distance         = property(BlockKeys.DISTANCE);

	private OnlyMode onlyMode;

	public enum OnlyMode {
		NONE,
		ONLY_X,
		ONLY_Y
	}
}
