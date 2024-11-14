package net.applee.gdlevelapi.key.containers;

import net.applee.gdlevelapi.key.Key;
import net.applee.gdlevelapi.key.KeyUtils;
import net.applee.gdlevelapi.readers.StringReader;

import java.util.ArrayList;
import java.util.List;

public class LevelHeaderKeys {

	private static final List<Key<?>> VALUES = new ArrayList<>();

	public static final Key<String> ID               = add(new Key<>("k1", "", StringReader::new));
	public static final Key<String> NAME             = add(new Key<>("k2", "", StringReader::new));
	public static final Key<String> DESCRIPTION      = add(new Key<>("k3", "", StringReader::new));
	public static final Key<String> EDITOR           = add(new Key<>("k4", "", StringReader::new));
	public static final Key<String> PLAYER_NAME      = add(new Key<>("k5", "", StringReader::new));
	public static final Key<String> OFFICIAL_MUSIC   = add(new Key<>("k8", "", StringReader::new));
	public static final Key<String> ATTEMPTS         = add(new Key<>("k18", "", StringReader::new));
	public static final Key<String> PERCENT_NORMAL   = add(new Key<>("k19", "", StringReader::new));
	public static final Key<String> PERCENT_PRACTICE = add(new Key<>("k20", "", StringReader::new));
	public static final Key<String> LEVEL_TYPE       = add(new Key<>("k21", "", StringReader::new));
	public static final Key<String> REPLAY           = add(new Key<>("k34", "", StringReader::new));
	public static final Key<String> JUMPS            = add(new Key<>("k36", "", StringReader::new));
	public static final Key<String> PASSWORD         = add(new Key<>("k41", "", StringReader::new));
	public static final Key<String> SERVER_ID        = add(new Key<>("k42", "", StringReader::new));
	public static final Key<String> PLAYER_MUSIC_ID  = add(new Key<>("k45", "", StringReader::new));
	public static final Key<String> REVISION         = add(new Key<>("k46", "", StringReader::new));
	public static final Key<String> IS_EDITOR        = add(new Key<>("k47", "", StringReader::new));
	public static final Key<String> OBJECTS_COUNT    = add(new Key<>("k48", "", StringReader::new));
	public static final Key<String> GAME_BUILD       = add(new Key<>("k50", "", StringReader::new));
	public static final Key<String> COIN_1           = add(new Key<>("k61", "", StringReader::new));
	public static final Key<String> COIN_2           = add(new Key<>("k62", "", StringReader::new));
	public static final Key<String> COIN_3           = add(new Key<>("k63", "", StringReader::new));
	public static final Key<String> DIFFICULTY       = add(new Key<>("k66", "", StringReader::new));
	public static final Key<String> OBJECT_LIMIT     = add(new Key<>("k69", "", StringReader::new));
	public static final Key<String> PERCENT_NORMAL_2 = add(new Key<>("k71", "", StringReader::new));
	public static final Key<String> UNLISTED         = add(new Key<>("k79", "", StringReader::new));
	public static final Key<String> EDITOR_TIME      = add(new Key<>("k80", "", StringReader::new));
	public static final Key<String> PERCENT_NORMAL_3 = add(new Key<>("k90", "", StringReader::new));
	public static final Key<String> CAMERA_X         = add(new Key<>("kI1", "", StringReader::new));
	public static final Key<String> CAMERA_Y         = add(new Key<>("kI2", "", StringReader::new));
	public static final Key<String> ZOOM             = add(new Key<>("kI3", "", StringReader::new));
	public static final Key<String> TAB              = add(new Key<>("kI5", "", StringReader::new));
	public static final Key<String> TAB_LIST         = add(new Key<>("kI6", "", StringReader::new));
	public static final Key<String> LAYER            = add(new Key<>("kI7", "", StringReader::new));
	public static final Key<String> KEY_CHECK        = add(new Key<>("kCEK", "", StringReader::new));

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
