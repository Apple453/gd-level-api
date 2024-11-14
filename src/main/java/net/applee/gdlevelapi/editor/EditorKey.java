package net.applee.gdlevelapi.editor;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.objects.enums.*;
import net.applee.gdlevelapi.readers.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@Getter
public class EditorKey<T> {

	private static final List<EditorKey<?>> VALUES = new ArrayList<>();


	// Options
	public static final EditorKey<Boolean> MINI_MODE        = add(new EditorKey<>("kA3", BoolReader::new));
	public static final EditorKey<Boolean> TWO_PLAYERS_MODE = add(new EditorKey<>("kA10", BoolReader::new));
	public static final EditorKey<Boolean> DUAL_MODE        = add(new EditorKey<>("kA8", BoolReader::new));
	public static final EditorKey<Boolean> MIRROR_MODE      = add(new EditorKey<>("kA28", BoolReader::new));
	public static final EditorKey<Boolean> FLIP_GRAVITY     = add(new EditorKey<>("kA11", BoolReader::new));
	public static final EditorKey<Boolean> REVERSE_GAMEPLAY = add(new EditorKey<>("kA20", BoolReader::new));
	public static final EditorKey<Boolean> ROTATE_GAMEPLAY  = add(new EditorKey<>("kA29", BoolReader::new));
	public static final EditorKey<Boolean> NO_TIME_PENALTY  = add(new EditorKey<>("kA43", BoolReader::new));
	public static final EditorKey<Integer> SPAWN_GROUP      = add(new EditorKey<>("kA36", IntReader::new));

	// Legacy Options
	public static final EditorKey<Boolean> ALLOW_MULTI_ROTATION  = add(new EditorKey<>("kA27", BoolReader::new));
	public static final EditorKey<Boolean> ALLOW_STATIC_ROTATION = add(new EditorKey<>("kA41", BoolReader::new));
	public static final EditorKey<Boolean> FIX_GRAVITY_BUG       = add(new EditorKey<>("kA32", BoolReader::new));
	public static final EditorKey<Boolean> FIX_ROBOT_JUMP        = add(new EditorKey<>("kA34", BoolReader::new));
	public static final EditorKey<Boolean> SORT_GROUPS           = add(new EditorKey<>("kA38", BoolReader::new));
	public static final EditorKey<Boolean> ENABLE_2_2_CHANGES    = add(new EditorKey<>("kA40", BoolReader::new));
	public static final EditorKey<Boolean> ENABLE_PLAYER_SQUEEZE = add(new EditorKey<>("kA31", BoolReader::new));
	public static final EditorKey<Boolean> FIX_NEGATIVE_SCALE    = add(new EditorKey<>("kA33", BoolReader::new));
	public static final EditorKey<Boolean> DYNAMIC_LEVEL_HEIGHT  = add(new EditorKey<>("kA37", BoolReader::new));
	public static final EditorKey<Boolean> FIX_RADIUS_COLLISION  = add(new EditorKey<>("kA39", BoolReader::new));

	// Music
	public static final EditorKey<Double>  MUSIC_OFFSET = add(new EditorKey<>("kA13", DoubleReader::new));
	public static final EditorKey<Boolean> FADE_IN      = add(new EditorKey<>("kA15", BoolReader::new));
	public static final EditorKey<Boolean> FADE_OUT     = add(new EditorKey<>("kA16", BoolReader::new));

	// Other
	public static final EditorKey<PlayerMode>
			PLAYER_MODE =
			add(new EditorKey<>("kA2", () -> new EnumReader<>(PlayerMode.class)));

	public static final EditorKey<PlayerSpeed>
			PLAYER_SPEED =
			add(new EditorKey<>("kA4", () -> new EnumReader<>(PlayerSpeed.class)));

	public static final EditorKey<GameType>
			GAME_TYPE =
			add(new EditorKey<>("kA22", () -> new EnumReader<>(GameType.class)));

	public static final EditorKey<FontType> FONT = add(new EditorKey<>("kA18", () -> new EnumReader<>(FontType.class)));

	public static final EditorKey<GroundType>
			GROUND =
			add(new EditorKey<>("kA7", () -> new EnumReader<>(GroundType.class)));

	public static final EditorKey<LineType>
			LINE_TYPE =
			add(new EditorKey<>("kA17", () -> new EnumReader<>(LineType.class)));

	public static final EditorKey<BackgroundType>
			BACKGROUND =
			add(new EditorKey<>("kA6", () -> new EnumReader<>(BackgroundType.class)));

	public static final EditorKey<MiddleGroundType>
			MIDDLE_GROUND =
			add(new EditorKey<>("kA25", () -> new EnumReader<>(MiddleGroundType.class)));

	public static final EditorKey<String> COLORS     = add(new EditorKey<>("kS38", StringReader::new));
	public static final EditorKey<String> GUIDELINES = add(new EditorKey<>("kA14", StringReader::new));

	// Unknown fields
	public static final EditorKey<String> UNKNOWN_0  = add(new EditorKey<>("kA9", StringReader::new));
	public static final EditorKey<String> UNKNOWN_1  = add(new EditorKey<>("kA19", StringReader::new));
	public static final EditorKey<String> UNKNOWN_2  = add(new EditorKey<>("kA21", StringReader::new));
	public static final EditorKey<String> UNKNOWN_3  = add(new EditorKey<>("kA23", StringReader::new));
	public static final EditorKey<String> UNKNOWN_4  = add(new EditorKey<>("kA24", StringReader::new));
	public static final EditorKey<String> UNKNOWN_5  = add(new EditorKey<>("kA26", StringReader::new));
	public static final EditorKey<String> UNKNOWN_6  = add(new EditorKey<>("kA35", StringReader::new));
	public static final EditorKey<String> UNKNOWN_7  = add(new EditorKey<>("kA42", StringReader::new));
	public static final EditorKey<String> UNKNOWN_8  = add(new EditorKey<>("kA44", StringReader::new));
	public static final EditorKey<String> UNKNOWN_9  = add(new EditorKey<>("kA45", StringReader::new));
	public static final EditorKey<String> UNKNOWN_10 = add(new EditorKey<>("kS39", StringReader::new));

	@Setter
	private       String                   key;
	private final Supplier<ValueReader<T>> readerFactory;

	public EditorKey(String key, Supplier<ValueReader<T>> readerFactory) {
		this.key = key;
		this.readerFactory = readerFactory;
	}

	@Override
	public String toString() {
		for (var f : EditorKey.class.getDeclaredFields()) {
			try {
				if (f.get(EditorKey.class) == this)
					return f.getName();
			}
			catch (IllegalAccessException e) {
				throw new RuntimeException(e);
			}
		}

		return "";
	}

	public static EditorKey<?> byKey(String key) {
		for (var val : VALUES)
			if (val.key.equals(key))
				return val;

		return unknownField(key);
	}

	private static <T> EditorKey<T> add(EditorKey<T> editorKey) {
		VALUES.add(editorKey);
		return editorKey;
	}

	public static EditorKey<String> unknownField(String name) {
		return new Unknown(name);
	}

	public static class Unknown extends EditorKey<String> {

		private Unknown(String key) {
			super(key, StringReader::new);
		}
	}
}
