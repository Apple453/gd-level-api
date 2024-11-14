package net.applee.gdlevelapi.key.containers;

import net.applee.gdlevelapi.key.Key;
import net.applee.gdlevelapi.key.KeyUtils;
import net.applee.gdlevelapi.objects.enums.*;
import net.applee.gdlevelapi.readers.*;

import java.util.ArrayList;
import java.util.List;

public class LevelKeys {

	private static final List<Key<?>> VALUES = new ArrayList<>();

	// Options
	public static final Key<Boolean> MINI_MODE        = add(new Key<>("kA3", false, BoolReader::new));
	public static final Key<Boolean> TWO_PLAYERS_MODE = add(new Key<>("kA10", false, BoolReader::new));
	public static final Key<Boolean> DUAL_MODE        = add(new Key<>("kA8", false, BoolReader::new));
	public static final Key<Boolean> MIRROR_MODE      = add(new Key<>("kA28", false, BoolReader::new));
	public static final Key<Boolean> FLIP_GRAVITY     = add(new Key<>("kA11", false, BoolReader::new));
	public static final Key<Boolean> REVERSE_GAMEPLAY = add(new Key<>("kA20", false, BoolReader::new));
	public static final Key<Boolean> ROTATE_GAMEPLAY  = add(new Key<>("kA29", false, BoolReader::new));
	public static final Key<Boolean> NO_TIME_PENALTY  = add(new Key<>("kA43", false, BoolReader::new));
	public static final Key<Integer> SPAWN_GROUP      = add(new Key<>("kA36", 0, IntReader::new));

	// Legacy Options
	public static final Key<Boolean> ALLOW_MULTI_ROTATION  = add(new Key<>("kA27", false, BoolReader::new));
	public static final Key<Boolean> ALLOW_STATIC_ROTATION = add(new Key<>("kA41", false, BoolReader::new));
	public static final Key<Boolean> FIX_GRAVITY_BUG       = add(new Key<>("kA32", false, BoolReader::new));
	public static final Key<Boolean> FIX_ROBOT_JUMP        = add(new Key<>("kA34", false, BoolReader::new));
	public static final Key<Boolean> SORT_GROUPS           = add(new Key<>("kA38", false, BoolReader::new));
	public static final Key<Boolean> ENABLE_2_2_CHANGES    = add(new Key<>("kA40", false, BoolReader::new));
	public static final Key<Boolean> ENABLE_PLAYER_SQUEEZE = add(new Key<>("kA31", false, BoolReader::new));
	public static final Key<Boolean> FIX_NEGATIVE_SCALE    = add(new Key<>("kA33", false, BoolReader::new));
	public static final Key<Boolean> DYNAMIC_LEVEL_HEIGHT  = add(new Key<>("kA37", false, BoolReader::new));
	public static final Key<Boolean> FIX_RADIUS_COLLISION  = add(new Key<>("kA39", false, BoolReader::new));

	// Music
	public static final Key<Double>  MUSIC_OFFSET = add(new Key<>("kA13", 0D, DoubleReader::new));
	public static final Key<Boolean> FADE_IN      = add(new Key<>("kA15", false, BoolReader::new));
	public static final Key<Boolean> FADE_OUT     = add(new Key<>("kA16", false, BoolReader::new));

	// Other
	public static final Key<PlayerMode>
			PLAYER_MODE =
			add(new Key<>("kA2", PlayerMode.CUBE, () -> new EnumReader<>(PlayerMode.class)));

	public static final Key<PlayerSpeed>
			PLAYER_SPEED =
			add(new Key<>("kA4", PlayerSpeed.X1, () -> new EnumReader<>(PlayerSpeed.class)));

	public static final Key<GameType>
			GAME_TYPE =
			add(new Key<>("kA22", GameType.CLASSIC, () -> new EnumReader<>(GameType.class)));

	public static final Key<FontType>
			FONT =
			add(new Key<>("kA18", FontType.FONT_1, () -> new EnumReader<>(FontType.class)));

	public static final Key<GroundType>
			GROUND =
			add(new Key<>("kA7", GroundType.GROUND_1, () -> new EnumReader<>(GroundType.class)));

	public static final Key<LineType>
			LINE_TYPE =
			add(new Key<>("kA17", LineType.LINE_1, () -> new EnumReader<>(LineType.class)));

	public static final Key<BackgroundType>
			BACKGROUND =
			add(new Key<>("kA6", BackgroundType.BACKGROUND_1, () -> new EnumReader<>(BackgroundType.class)));

	public static final Key<MiddleGroundType>
			MIDDLE_GROUND =
			add(new Key<>("kA25", MiddleGroundType.MIDDLE_GROUND_1, () -> new EnumReader<>(MiddleGroundType.class)));

	public static final Key<String> COLORS     = add(new Key<>("kS38", "", StringReader::new));
	public static final Key<String> GUIDELINES = add(new Key<>("kA14", "", StringReader::new));

	// Unknown fields
	public static final Key<String> UNKNOWN_0  = add(new Key<>("kA9", "", StringReader::new));
	public static final Key<String> UNKNOWN_1  = add(new Key<>("kA19", "", StringReader::new));
	public static final Key<String> UNKNOWN_2  = add(new Key<>("kA21", "", StringReader::new));
	public static final Key<String> UNKNOWN_3  = add(new Key<>("kA23", "", StringReader::new));
	public static final Key<String> UNKNOWN_4  = add(new Key<>("kA24", "", StringReader::new));
	public static final Key<String> UNKNOWN_5  = add(new Key<>("kA26", "", StringReader::new));
	public static final Key<String> UNKNOWN_6  = add(new Key<>("kA35", "", StringReader::new));
	public static final Key<String> UNKNOWN_7  = add(new Key<>("kA42", "", StringReader::new));
	public static final Key<String> UNKNOWN_8  = add(new Key<>("kA44", "", StringReader::new));
	public static final Key<String> UNKNOWN_9  = add(new Key<>("kA45", "", StringReader::new));
	public static final Key<String> UNKNOWN_10 = add(new Key<>("kS39", "", StringReader::new));

	private static <T> Key<T> add(Key<T> key) {
		VALUES.add(key);
		return key;
	}

	public static List<Key<?>> values() {
		return new ArrayList<>(VALUES);
	}

	public static Key<?> byKey(String rawKey) {
		return KeyUtils.byKey(VALUES, rawKey);
	}

	static {
		VALUES.forEach(v -> v.setName(KeyUtils.findName(LevelKeys.class, v)));
	}
}
