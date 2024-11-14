
package net.applee.gdlevelapi.block.blocks.triggers.spawnable;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.block.key.BlockProperty;
import net.applee.gdlevelapi.block.key.BlockKeys;
import net.applee.gdlevelapi.block.blocks.MovingTrigger;

@Getter
@Setter
public class MoveTrigger extends MovingTrigger {

	private final BlockProperty<Integer> moveX            = property(BlockKeys.MOVE_X);
	private final BlockProperty<Integer> moveY            = property(BlockKeys.MOVE_Y);
	private final BlockProperty<Double>  modX             = property(BlockKeys.MOVE_MOD_X);
	private final BlockProperty<Double>  modY             = property(BlockKeys.MOVE_MOD_Y);
	private final BlockProperty<Boolean> silent           = property(BlockKeys.SILENT);
	private final BlockProperty<Boolean> lockPlayerX      = property(BlockKeys.LOCK_PLAYER_X);
	private final BlockProperty<Boolean> lockPlayerY      = property(BlockKeys.LOCK_PLAYER_Y);
	private final BlockProperty<Boolean> lockCameraX      = property(BlockKeys.LOCK_CAMERA_X);
	private final BlockProperty<Boolean> lockCameraY      = property(BlockKeys.LOCK_CAMERA_Y);
	private final BlockProperty<Boolean> smallStep        = property(BlockKeys.SMALL_STEP);
	private final BlockProperty<Boolean> dynamicMode      = property(BlockKeys.DYNAMIC_MODE);
	private final BlockProperty<Boolean> targetMode       = property(BlockKeys.TARGET_MODE);
	private final BlockProperty<Boolean> player1          = property(BlockKeys.PLAYER_ONE);
	private final BlockProperty<Boolean> player2          = property(BlockKeys.PLAYER_TWO);
	private final BlockProperty<Boolean> directrionMode   = property(BlockKeys.DIRECTION_MODE);
	private final BlockProperty<Integer> centerGroupId    = property(BlockKeys.CENTER_GROUP_ID);
	private final BlockProperty<Integer> targetPosGroupId = property(BlockKeys.TARGET_GROUP_ID);
	private final BlockProperty<Integer> distance         = property(BlockKeys.DISTANCE);

	private OnlyMode onlyMode;

	public enum OnlyMode {
		NONE,
		ONLY_X,
		ONLY_Y
	}
}
