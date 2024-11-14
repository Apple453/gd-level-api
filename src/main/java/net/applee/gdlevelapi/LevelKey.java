package net.applee.gdlevelapi;

import lombok.Getter;

@Getter
public enum LevelKey {
	KEY_CHECK("kCEK"),
	ID("k1"),
	NAME("k2"),
	DESCRIPTION("k3"),
	EDITOR("k4"),
	PLAYER_NAME("k5"),
	OFFICIAL_MUSIC("k8"),
	ATTEMPTS("k18"),
	PERCENT_NORMAL("k19"),
	PERCENT_PRACTICE("k20"),
	LEVEL_TYPE("k21"),
	REPLAY("k34"),
	JUMPS("k36"),
	PASSWORD("k41"),
	SERVER_ID("k42"),
	PLAYER_MUSIC_ID("k45"),
	REVISION("k46"),
	IS_EDITOR("k47"),
	OBJECTS_COUNT("k48"),
	GAME_BUILD("k50"),
	COIN_1("k61"),
	COIN_2("k62"),
	COIN_3("k63"),
	DIFFICULTY("k66"),
	OBJECT_LIMIT("k69"),
	PERCENT_NORMAL_2("k71"),
	UNLISTED("k79"),
	EDITOR_TIME("k80"),
	PERCENT_NORMAL_3("k90"),
	CAMERA_X("kI1"),
	CAMERA_Y("kI2"),
	ZOOM("kI3"),
	TAB("kI5"),
	TAB_LIST("kI6"),
	LAYER("kI7"),
	UNKNOWN("");

	private final String key;

	LevelKey(String key) {
		this.key = key;
	}

	public static LevelKey byKey(String key) {
		for (var val : values())
			if (val.key.equals(key))
				return val;

		return UNKNOWN;
	}
}
