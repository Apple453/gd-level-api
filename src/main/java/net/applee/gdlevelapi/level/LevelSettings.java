package net.applee.gdlevelapi.level;

import lombok.Getter;
import lombok.ToString;
import net.applee.gdlevelapi.PropertyContainer;
import net.applee.gdlevelapi.key.Property;
import net.applee.gdlevelapi.key.containers.LevelKeys;
import net.applee.gdlevelapi.objects.enums.*;

@Getter
@ToString
public class LevelSettings extends PropertyContainer {

	private final Property<Boolean>          miniMode            = property(LevelKeys.MINI_MODE);
	private final Property<Boolean>          twoPlayersMode      = property(LevelKeys.TWO_PLAYERS_MODE);
	private final Property<Boolean>          dualMode            = property(LevelKeys.DUAL_MODE);
	private final Property<Boolean>          mirrorMode          = property(LevelKeys.MIRROR_MODE);
	private final Property<Boolean>          flipGravity         = property(LevelKeys.FLIP_GRAVITY);
	private final Property<Boolean>          reverseGameplay     = property(LevelKeys.REVERSE_GAMEPLAY);
	private final Property<Boolean>          rotateGameplay      = property(LevelKeys.ROTATE_GAMEPLAY);
	private final Property<Boolean>          noTimePenalty       = property(LevelKeys.NO_TIME_PENALTY);
	private final Property<Integer>          spawnGroup          = property(LevelKeys.SPAWN_GROUP);
	private final Property<Boolean>          allowMultiRotation  = property(LevelKeys.ALLOW_MULTI_ROTATION);
	private final Property<Boolean>          allowStaticRotation = property(LevelKeys.ALLOW_STATIC_ROTATION);
	private final Property<Boolean>          fixGravityBug       = property(LevelKeys.FIX_GRAVITY_BUG);
	private final Property<Boolean>          fixRobotJump        = property(LevelKeys.FIX_ROBOT_JUMP);
	private final Property<Boolean>          sortGroups          = property(LevelKeys.SORT_GROUPS);
	private final Property<Boolean>          enable22Changes     = property(LevelKeys.ENABLE_2_2_CHANGES);
	private final Property<Boolean>          enablePlayerSqueeze = property(LevelKeys.ENABLE_PLAYER_SQUEEZE);
	private final Property<Boolean>          fixNegativeScale    = property(LevelKeys.FIX_NEGATIVE_SCALE);
	private final Property<Boolean>          dynamicLevelHeight  = property(LevelKeys.DYNAMIC_LEVEL_HEIGHT);
	private final Property<Boolean>          fixRadiusCollision  = property(LevelKeys.FIX_RADIUS_COLLISION);
	private final Property<Double>           musicOffset         = property(LevelKeys.MUSIC_OFFSET);
	private final Property<Boolean>          fadeIn              = property(LevelKeys.FADE_IN);
	private final Property<Boolean>          fadeOut             = property(LevelKeys.FADE_OUT);
	private final Property<PlayerMode>       playerMode          = property(LevelKeys.PLAYER_MODE);
	private final Property<PlayerSpeed>      playerSpeed         = property(LevelKeys.PLAYER_SPEED);
	private final Property<GameType>         gameType            = property(LevelKeys.GAME_TYPE);
	private final Property<FontType>         font                = property(LevelKeys.FONT);
	private final Property<GroundType>       ground              = property(LevelKeys.GROUND);
	private final Property<LineType>         lineType            = property(LevelKeys.LINE_TYPE);
	private final Property<BackgroundType>   background          = property(LevelKeys.BACKGROUND);
	private final Property<MiddleGroundType> middleGround        = property(LevelKeys.MIDDLE_GROUND);
	private final Property<String>           colors              = property(LevelKeys.COLORS);
	private final Property<String>           guidelines          = property(LevelKeys.GUIDELINES);
	private final Property<String>           unknown0            = property(LevelKeys.UNKNOWN_0);
	private final Property<String>           unknown1            = property(LevelKeys.UNKNOWN_1);
	private final Property<String>           unknown2            = property(LevelKeys.UNKNOWN_2);
	private final Property<String>           unknown3            = property(LevelKeys.UNKNOWN_3);
	private final Property<String>           unknown4            = property(LevelKeys.UNKNOWN_4);
	private final Property<String>           unknown5            = property(LevelKeys.UNKNOWN_5);
	private final Property<String>           unknown6            = property(LevelKeys.UNKNOWN_6);
	private final Property<String>           unknown7            = property(LevelKeys.UNKNOWN_7);
	private final Property<String>           unknown8            = property(LevelKeys.UNKNOWN_8);
	private final Property<String>           unknown9            = property(LevelKeys.UNKNOWN_9);
	private final Property<String>           unknown10           = property(LevelKeys.UNKNOWN_10);
}
