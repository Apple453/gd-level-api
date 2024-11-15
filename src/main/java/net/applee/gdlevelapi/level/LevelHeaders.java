package net.applee.gdlevelapi.level;

import lombok.Getter;
import lombok.ToString;
import net.applee.gdlevelapi.PropertyContainer;
import net.applee.gdlevelapi.key.Property;
import net.applee.gdlevelapi.key.containers.LevelHeaderKeys;
import net.applee.gdlevelapi.objects.enums.OfficialMusic;

import java.util.List;

@Getter
@ToString
public class LevelHeaders extends PropertyContainer {

	private final Property<String>        revision        = property(LevelHeaderKeys.REVISION);
	private final Property<String>        coin1           = property(LevelHeaderKeys.COIN_1);
	private final Property<String>        coin2           = property(LevelHeaderKeys.COIN_2);
	private final Property<String>        coin3           = property(LevelHeaderKeys.COIN_3);
	private final Property<String>        difficulty      = property(LevelHeaderKeys.DIFFICULTY);
	private final Property<String>        unlisted        = property(LevelHeaderKeys.UNLISTED);
	private final Property<Long>          id              = property(LevelHeaderKeys.ID);
	private final Property<String>        name            = property(LevelHeaderKeys.NAME);
	private final Property<String>        description     = property(LevelHeaderKeys.DESCRIPTION);
	private final Property<String>        playerName      = property(LevelHeaderKeys.PLAYER_NAME);
	private final Property<OfficialMusic> officialMusic   = property(LevelHeaderKeys.OFFICIAL_MUSIC);
	private final Property<Boolean>       key8            = property(LevelHeaderKeys.KEY_8);
	private final Property<Integer>       key11           = property(LevelHeaderKeys.KEY_11);
	private final Property<Integer>       attempts        = property(LevelHeaderKeys.ATTEMPTS);
	private final Property<Integer>       percentNormal   = property(LevelHeaderKeys.PERCENT_NORMAL);
	private final Property<Integer>       percentPractice = property(LevelHeaderKeys.PERCENT_PRACTICE);
	private final Property<Integer>       levelType       = property(LevelHeaderKeys.LEVEL_TYPE);
	private final Property<Integer>       key10           = property(LevelHeaderKeys.KEY_10);
	private final Property<String>        replay          = property(LevelHeaderKeys.REPLAY);
	private final Property<Integer>       jumps           = property(LevelHeaderKeys.JUMPS);
	private final Property<Integer>       password        = property(LevelHeaderKeys.PASSWORD);
	private final Property<Long>          serverId        = property(LevelHeaderKeys.SERVER_ID);
	private final Property<Long>          playerMusicId   = property(LevelHeaderKeys.PLAYER_MUSIC_ID);
	private final Property<Boolean>       isEditor        = property(LevelHeaderKeys.IS_EDITOR);
	private final Property<Integer>       objectsCount    = property(LevelHeaderKeys.OBJECTS_COUNT);
	private final Property<Integer>       gameBuild       = property(LevelHeaderKeys.GAME_BUILD);
	private final Property<Integer>       key4            = property(LevelHeaderKeys.KEY_4);
	private final Property<Integer>       objectLimit     = property(LevelHeaderKeys.OBJECT_LIMIT);
	private final Property<Integer>       percentNormal2  = property(LevelHeaderKeys.PERCENT_NORMAL_2);
	private final Property<Integer>       editorTime      = property(LevelHeaderKeys.EDITOR_TIME);
	private final Property<Integer>       key0            = property(LevelHeaderKeys.KEY_0);
	private final Property<Integer>       key2            = property(LevelHeaderKeys.KEY_2);
	private final Property<Integer>       key5            = property(LevelHeaderKeys.KEY_5);
	private final Property<Integer>       key3            = property(LevelHeaderKeys.KEY_3);
	private final Property<Integer>       key7            = property(LevelHeaderKeys.KEY_7);
	private final Property<String>        key6            = property(LevelHeaderKeys.KEY_6);
	private final Property<Boolean>       key9            = property(LevelHeaderKeys.KEY_9);
	private final Property<Integer>       percentNormal3  = property(LevelHeaderKeys.PERCENT_NORMAL_3);
	private final Property<Integer>       key1            = property(LevelHeaderKeys.KEY_1);
	private final Property<List<Integer>> key12           = property(LevelHeaderKeys.KEY_12);
	private final Property<List<Integer>> key14           = property(LevelHeaderKeys.KEY_14);
	private final Property<List<Integer>> key15           = property(LevelHeaderKeys.KEY_15);
	private final Property<Double>        cameraX         = property(LevelHeaderKeys.CAMERA_X);
	private final Property<Double>        cameraY         = property(LevelHeaderKeys.CAMERA_Y);
	private final Property<Double>        zoom            = property(LevelHeaderKeys.ZOOM);
	private final Property<Integer>       key13           = property(LevelHeaderKeys.KEY_13);
	private final Property<Integer>       tab             = property(LevelHeaderKeys.TAB);
	private final Property<String>        tabList         = property(LevelHeaderKeys.TAB_LIST);
	private final Property<Integer>       layer           = property(LevelHeaderKeys.LAYER);
	private final Property<Integer>       keyCheck        = property(LevelHeaderKeys.KEY_CHECK);
}
