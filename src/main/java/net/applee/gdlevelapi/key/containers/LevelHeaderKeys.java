package net.applee.gdlevelapi.key.containers;

import net.applee.gdlevelapi.key.Key;
import net.applee.gdlevelapi.key.KeyUtils;
import net.applee.gdlevelapi.objects.enums.OfficialMusic;
import net.applee.gdlevelapi.readers.*;

import java.util.ArrayList;
import java.util.List;

public class LevelHeaderKeys {

	private static final List<Key<?>> VALUES = new ArrayList<>();

	public static final Key<String> REVISION   = add(new Key<>("k46", "", RawReader::new));
	public static final Key<String> COIN_1     = add(new Key<>("k61", "", RawReader::new));
	public static final Key<String> COIN_2     = add(new Key<>("k62", "", RawReader::new));
	public static final Key<String> COIN_3     = add(new Key<>("k63", "", RawReader::new));
	public static final Key<String> DIFFICULTY = add(new Key<>("k66", "", RawReader::new));
	public static final Key<String> UNLISTED = add(new Key<>("k79", "", RawReader::new));

	public static final Key<Long>   ID          = add(new Key<>("k1", 0L, LongReader::new));
	public static final Key<String> NAME        = add(new Key<>("k2", "", StringReader::new));
	public static final Key<String> DESCRIPTION = add(new Key<>("k3", "", StringReader::new));
	public static final Key<String> EDITOR      = add(new Key<>("k4", "", StringReader::new));
	public static final Key<String> PLAYER_NAME = add(new Key<>("k5", "", StringReader::new));

	public static final Key<OfficialMusic>
			OFFICIAL_MUSIC =
			add(new Key<>("k8", OfficialMusic.STEREO_MADNESS, () -> new EnumReader<>(OfficialMusic.class)));

	public static final Key<Boolean> KEY_8            = add(new Key<>("k13", false, BoolReader::new));
	public static final Key<Integer> KEY_11           = add(new Key<>("k16", 0, IntReader::new));
	public static final Key<Integer> ATTEMPTS         = add(new Key<>("k18", 0, IntReader::new));
	public static final Key<Integer> PERCENT_NORMAL   = add(new Key<>("k19", 0, IntReader::new));
	public static final Key<Integer> PERCENT_PRACTICE = add(new Key<>("k20", 0, IntReader::new));
	public static final Key<Integer> LEVEL_TYPE       = add(new Key<>("k21", 0, IntReader::new));
	public static final Key<Integer> KEY_10           = add(new Key<>("k23", 0, IntReader::new));
	public static final Key<String>  REPLAY           = add(new Key<>("k34", "", StringReader::new));
	public static final Key<Integer> JUMPS            = add(new Key<>("k36", 0, IntReader::new));
	public static final Key<Integer> PASSWORD         = add(new Key<>("k41", 0, IntReader::new));
	public static final Key<Long>    SERVER_ID        = add(new Key<>("k42", 0L, LongReader::new));
	public static final Key<Long>    PLAYER_MUSIC_ID  = add(new Key<>("k45", 0L, LongReader::new));
	public static final Key<Boolean> IS_EDITOR        = add(new Key<>("k47", false, BoolReader::new));
	public static final Key<Integer> OBJECTS_COUNT    = add(new Key<>("k48", 0, IntReader::new));
	public static final Key<Integer> GAME_BUILD       = add(new Key<>("k50", 0, IntReader::new));
	public static final Key<Integer> KEY_4            = add(new Key<>("k64", 0, IntReader::new));
	public static final Key<Integer> OBJECT_LIMIT     = add(new Key<>("k69", 40000, IntReader::new));
	public static final Key<Integer> PERCENT_NORMAL_2 = add(new Key<>("k71", 0, IntReader::new));
	public static final Key<Integer> EDITOR_TIME      = add(new Key<>("k80", 0, IntReader::new));
	public static final Key<Integer> KEY_0            = add(new Key<>("k81", 0, IntReader::new));
	public static final Key<Integer> KEY_2            = add(new Key<>("k83", 0, IntReader::new));
	public static final Key<Integer> KEY_5            = add(new Key<>("k85", 0, IntReader::new));
	public static final Key<Integer> KEY_3            = add(new Key<>("k86", 0, IntReader::new));
	public static final Key<Integer> KEY_7            = add(new Key<>("k87", 0, IntReader::new));
	public static final Key<String>  KEY_6            = add(new Key<>("k88", "", StringReader::new));
	public static final Key<Boolean> KEY_9            = add(new Key<>("k89", false, BoolReader::new));
	public static final Key<Integer> PERCENT_NORMAL_3 = add(new Key<>("k90", 0, IntReader::new));
	public static final Key<Integer> KEY_1            = add(new Key<>("k95", 0, IntReader::new));

	public static final Key<List<Integer>>
			KEY_12 =
			add(new Key<List<Integer>>("k101", ArrayList::new, () -> new IntListReader(",")));

	public static final Key<List<Integer>>
			KEY_14 =
			add(new Key<List<Integer>>("k104", ArrayList::new, () -> new IntListReader(",")));

	public static final Key<List<Integer>>
			KEY_15 =
			add(new Key<List<Integer>>("k105", ArrayList::new, () -> new IntListReader(",")));

	public static final Key<Double>  CAMERA_X = add(new Key<>("kI1", 0D, DoubleReader::new));
	public static final Key<Double>  CAMERA_Y = add(new Key<>("kI2", 0D, DoubleReader::new));
	public static final Key<Double>  ZOOM     = add(new Key<>("kI3", 0D, DoubleReader::new));
	public static final Key<Integer> KEY_13   = add(new Key<>("kI4", 0, IntReader::new));
	public static final Key<Integer> TAB      = add(new Key<>("kI5", 0, IntReader::new));
	public static final Key<String>  TAB_LIST = add(new Key<>("kI6", "", RawReader::new));
	public static final Key<Integer> LAYER    = add(new Key<>("kI7", -1, IntReader::new));

	public static final Key<Integer> KEY_CHECK = add(new Key<>("kCEK", 0, IntReader::new));


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
		VALUES.forEach(v -> v.setName(KeyUtils.findName(LevelHeaderKeys.class, v)));
	}
}
