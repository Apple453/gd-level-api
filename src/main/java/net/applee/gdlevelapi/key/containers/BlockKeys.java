package net.applee.gdlevelapi.key.containers;

import net.applee.gdlevelapi.blocks.triggers.AbstractItemTrigger;
import net.applee.gdlevelapi.blocks.triggers.spawnable.*;
import net.applee.gdlevelapi.key.Key;
import net.applee.gdlevelapi.key.KeyUtils;
import net.applee.gdlevelapi.objects.HSVContainer;
import net.applee.gdlevelapi.objects.enums.ColorType;
import net.applee.gdlevelapi.objects.enums.Easing;
import net.applee.gdlevelapi.readers.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BlockKeys {

	private static final List<Key<?>> VALUES = new ArrayList<>();

	// Object
	public static final Key<Integer> ID       = add(new Key<>("1", -1, IntReader::new));
	public static final Key<Double>  POS_X    = add(new Key<>("2", 0D, DoubleReader::new));
	public static final Key<Double>  POS_Y    = add(new Key<>("3", 0D, DoubleReader::new));
	public static final Key<Double>  ROTATION = add(new Key<>("6", 0D, DoubleReader::new));
	public static final Key<Double>  SCALE_X  = add(new Key<>("128", 1D, DoubleReader::new));
	public static final Key<Double>  SCALE_Y  = add(new Key<>("129", 1D, DoubleReader::new));
	public static final Key<Double>  OFFSET_X = add(new Key<>("131", 0D, DoubleReader::new));
	public static final Key<Double>  OFFSET_Y = add(new Key<>("132", 0D, DoubleReader::new));

	public static final Key<List<Integer>>
			GROUP_IDS =
			add(new Key<List<Integer>>("57", ArrayList::new, () -> new IntListReader(".")));

	public static final Key<List<Integer>>
			PINK_GROUP_IDS =
			add(new Key<List<Integer>>("274", ArrayList::new, () -> new IntListReader(".")));

	public static final Key<Integer> EDITOR_L  = add(new Key<>("20", 0, IntReader::new));
	public static final Key<Integer> EDITOR_L2 = add(new Key<>("61", 0, IntReader::new));
	public static final Key<Integer> Z_ORDER   = add(new Key<>("25", 2, IntReader::new));
	public static final Key<Integer> Z_LAYER   = add(new Key<>("24", 0, IntReader::new));
	public static final Key<Integer> CHANNEL   = add(new Key<>("170", 0, IntReader::new));
	public static final Key<Integer> ORDER     = add(new Key<>("115", 0, IntReader::new));

	public static final Key<Integer> COLOR_GROUP   = add(new Key<>("21", 1, IntReader::new));
	public static final Key<Integer> COLOR_CHANNEL = add(new Key<>("155", 1, IntReader::new));

	public static final Key<ColorType>
			COLOR_TYPE =
			add(new Key<>("497", ColorType.DEFAULT, () -> new EnumReader<>(ColorType.class)));

	public static final Key<HSVContainer>
			BLOCK_HSV =
			add(new Key<HSVContainer>("43", HSVContainer::new, HSVContainer.Reader::new));

	public static final Key<Boolean> HSV_CHANGED = add(new Key<>("41", false, BoolReader::new));
	public static final Key<Boolean> HAS_PREVIEW = add(new Key<>("36", false, BoolReader::new));

	// Extra settings
	public static final Key<Boolean> DONT_FADE          = add(new Key<>("64", false, BoolReader::new));
	public static final Key<Boolean> DONT_ENTER         = add(new Key<>("67", false, BoolReader::new));
	public static final Key<Boolean> NO_EFFECTS         = add(new Key<>("116", false, BoolReader::new));
	public static final Key<Boolean> GROUP_PARENT       = add(new Key<>("34", false, BoolReader::new));
	public static final Key<Boolean> AREA_PARENT        = add(new Key<>("279", false, BoolReader::new));
	public static final Key<Boolean> DONT_BOOST_Y       = add(new Key<>("496", false, BoolReader::new));
	public static final Key<Boolean> DONT_BOOST_X       = add(new Key<>("509", false, BoolReader::new));
	public static final Key<Boolean> SINGLE_P_TOUCH     = add(new Key<>("284", false, BoolReader::new));
	public static final Key<Boolean> HIGH_DETAIL        = add(new Key<>("103", false, BoolReader::new));
	public static final Key<Boolean> NO_TOUCH           = add(new Key<>("121", false, BoolReader::new));
	public static final Key<Boolean> PASSABLE           = add(new Key<>("134", false, BoolReader::new));
	public static final Key<Boolean> HIDE               = add(new Key<>("135", false, BoolReader::new));
	public static final Key<Boolean> NON_STICK_X        = add(new Key<>("136", false, BoolReader::new));
	public static final Key<Boolean> EXTRA_STICKY       = add(new Key<>("495", false, BoolReader::new));
	public static final Key<Boolean> EXTENDED_COLLISION = add(new Key<>("511", false, BoolReader::new));
	public static final Key<Boolean> CENTER_EFFECT      = add(new Key<>("369", false, BoolReader::new));
	public static final Key<Boolean> ICE_BLOCK          = add(new Key<>("137", false, BoolReader::new));
	public static final Key<Boolean> GRIP_SLOPE         = add(new Key<>("193", false, BoolReader::new));
	public static final Key<Boolean> NO_GLOW            = add(new Key<>("96", false, BoolReader::new));
	public static final Key<Boolean> NO_PARTICLE        = add(new Key<>("507", false, BoolReader::new));
	public static final Key<Boolean> NON_STICK_Y        = add(new Key<>("289", false, BoolReader::new));
	public static final Key<Boolean> SCALE_STICK        = add(new Key<>("356", false, BoolReader::new));
	public static final Key<Boolean> NO_AUDIO_SCALE     = add(new Key<>("372", false, BoolReader::new));

	// Extra Settings 2
	public static final Key<Integer> ENTER_CHANNEL = add(new Key<>("343", 0, IntReader::new));
	public static final Key<Integer> MATERIAL      = add(new Key<>("446", 0, IntReader::new));
	public static final Key<Integer> CONTROL_ID    = add(new Key<>("534", 0, IntReader::new));

	public static final Key<Boolean> PREVIEW = add(new Key<>("13", false, BoolReader::new));

	// Trigger
	public static final Key<Boolean> SPAWN_TRIGGER = add(new Key<>("62", false, BoolReader::new));
	public static final Key<Boolean> MULTI_TRIGGER = add(new Key<>("87", false, BoolReader::new));
	public static final Key<Boolean> TOUCH_TRIGGER = add(new Key<>("11", false, BoolReader::new));

	public static final Key<Integer> RED_COLOR      = add(new Key<>("7", 255, IntReader::new));
	public static final Key<Integer> GREEN_COLOR    = add(new Key<>("8", 255, IntReader::new));
	public static final Key<Integer> BLUE_COLOR     = add(new Key<>("9", 255, IntReader::new));
	public static final Key<Double>  TIME           = add(new Key<>("10", 0.5, DoubleReader::new));
	public static final Key<Boolean> PLAYER_COLOR_1 = add(new Key<>("15", false, BoolReader::new));
	public static final Key<Boolean> PLAYER_COLOR_2 = add(new Key<>("16", false, BoolReader::new));
	public static final Key<Boolean> BLENDING       = add(new Key<>("17", false, BoolReader::new));
	public static final Key<Integer> COLOR_ID       = add(new Key<>("23", 1, IntReader::new));
	public static final Key<Double>  OPACITY        = add(new Key<>("35", 1D, DoubleReader::new));
	public static final Key<Double>  FADE_IN        = add(new Key<>("45", 0D, DoubleReader::new));
	public static final Key<Double>  HOLD           = add(new Key<>("46", 0D, DoubleReader::new));
	public static final Key<Double>  FADE_OUT       = add(new Key<>("47", 0D, DoubleReader::new));

	public static final Key<PulseTrigger.Mode>
			PULSE_MODE =
			add(new Key<>("48", PulseTrigger.Mode.COLOR, () -> new EnumReader<>(PulseTrigger.Mode.class)));

	public static final Key<HSVContainer>
			PULSE_HSV =
			add(new Key<HSVContainer>("49", HSVContainer::new, HSVContainer.Reader::new));

	public static final Key<Integer> COLOR_CHANNEL_ID = add(new Key<>("50", 0, IntReader::new));

	public static final Key<Integer> GROUP_ID = add(new Key<>("51", 0, IntReader::new));

	public static final Key<PulseTrigger.TargetType>
			PULSE_TARGET_TYPE =
			add(new Key<>(
					"52",
					PulseTrigger.TargetType.CHANNEL,
					() -> new EnumReader<>(PulseTrigger.TargetType.class)
			));

	public static final Key<Boolean> COPY_OPACITY = add(new Key<>("60", false, BoolReader::new));
	public static final Key<Boolean> MAIN_ONLY    = add(new Key<>("65", false, BoolReader::new));
	public static final Key<Boolean> DETAIL_ONLY  = add(new Key<>("66", false, BoolReader::new));
	public static final Key<Boolean> EXLUSIVE     = add(new Key<>("86", false, BoolReader::new));

	public static final Key<Boolean> NON_STATIC_HSV = add(new Key<>("210", true, BoolReader::new));

	public static final Key<Double>  SPAWN_DELAY     = add(new Key<>("63", 0D, DoubleReader::new));
	public static final Key<Double>  SPAWN_RANDOM    = add(new Key<>("556", 0D, DoubleReader::new));
	public static final Key<Boolean> DISABLE_PREVIEW = add(new Key<>("102", false, BoolReader::new));
	public static final Key<Boolean> SPAWN_ORDERED   = add(new Key<>("441", false, BoolReader::new));
	public static final Key<Boolean> RESET_REMAP     = add(new Key<>("581", false, BoolReader::new));

	public static final Key<List<SpawnTrigger.SpawnGroup>>
			SPAWN_GROUPS =
			add(new Key<List<SpawnTrigger.SpawnGroup>>(
					"442",
					ArrayList::new,
					() -> new SpawnTrigger.GroupsReader()
			));

	public static final Key<Boolean> USE_CONTROL_ID = add(new Key<>("535", false, BoolReader::new));

	public static final Key<StopTrigger.Mode>
			STOP_MODE =
			add(new Key<>("580", StopTrigger.Mode.STOP, () -> new EnumReader<>(StopTrigger.Mode.class)));

	public static final Key<Easing>
			EASING =
			add(new Key<>("30", Easing.NONE, () -> new EnumReader<>(Easing.class)));

	public static final Key<Double> EASING_RATE = add(new Key<>("85", 2D, DoubleReader::new));

	public static final Key<Integer> MOVE_X        = add(new Key<>("28", 0, IntReader::new));
	public static final Key<Integer> MOVE_Y        = add(new Key<>("29", 0, IntReader::new));
	public static final Key<Double>  MOVE_MOD_X    = add(new Key<>("143", 1D, DoubleReader::new));
	public static final Key<Double>  MOVE_MOD_Y    = add(new Key<>("144", 1D, DoubleReader::new));
	public static final Key<Boolean> SILENT        = add(new Key<>("544", false, BoolReader::new));
	public static final Key<Boolean> LOCK_PLAYER_X = add(new Key<>("58", false, BoolReader::new));
	public static final Key<Boolean> LOCK_PLAYER_Y = add(new Key<>("59", false, BoolReader::new));
	public static final Key<Boolean> LOCK_CAMERA_X = add(new Key<>("141", false, BoolReader::new));
	public static final Key<Boolean> LOCK_CAMERA_Y = add(new Key<>("142", false, BoolReader::new));
	public static final Key<Boolean> SMALL_STEP    = add(new Key<>("393", false, BoolReader::new));
	public static final Key<Boolean> DYNAMIC_MODE  = add(new Key<>("397", false, BoolReader::new));
	public static final Key<Boolean> TARGET_MODE   = add(new Key<>("100", false, BoolReader::new));

	public static final Key<MoveTrigger.OnlyMode>
			ONLY_MODE =
			add(new Key<>("101", MoveTrigger.OnlyMode.NONE, () -> new EnumReader<>(MoveTrigger.OnlyMode.class)));

	public static final Key<Boolean> PLAYER_ONE      = add(new Key<>("138", false, BoolReader::new));
	public static final Key<Boolean> PLAYER_TWO      = add(new Key<>("200", false, BoolReader::new));
	public static final Key<Boolean> DIRECTION_MODE  = add(new Key<>("394", false, BoolReader::new));
	public static final Key<Integer> CENTER_GROUP_ID = add(new Key<>("395", 0, IntReader::new));
	public static final Key<Integer> TARGET_GROUP_ID = add(new Key<>("71", 0, IntReader::new));
	public static final Key<Integer> DISTANCE        = add(new Key<>("396", 0, IntReader::new));

	public static final Key<Boolean> ACTIVATE_GROUP = add(new Key<>("56", false, BoolReader::new));
	public static final Key<Double>  FOLLOW_MOD_X   = add(new Key<>("72", 1D, DoubleReader::new));
	public static final Key<Double>  FOLLOW_MOD_Y   = add(new Key<>("73", 1D, DoubleReader::new));

	public static final Key<Double> STRENGTH = add(new Key<>("75", 0D, DoubleReader::new));
	public static final Key<Double> INTERVAL = add(new Key<>("84", 0D, DoubleReader::new));

	public static final Key<Integer> COUNT       = add(new Key<>("77", 0, IntReader::new));
	public static final Key<Integer> ITEM_ID     = add(new Key<>("80", 0, IntReader::new));
	public static final Key<Integer> ITEM_ID_TWO = add(new Key<>("95", 0, IntReader::new));
	public static final Key<Double>  MODIFIER    = add(new Key<>("449", 1D, DoubleReader::new));
	public static final Key<Boolean> OVERRIDE    = add(new Key<>("139", false, BoolReader::new));

	public static final Key<PickupTrigger.Mode>
			PICKUP_MODE =
			add(new Key<>("88", PickupTrigger.Mode.NONE, () -> new EnumReader<>(PickupTrigger.Mode.class)));

	public static final Key<Boolean> MULTI_ACTIVATE = add(new Key<>("104", false, BoolReader::new));

	public static final Key<InstantCountTrigger.Mode>
			INSTANT_COUNT_MODE =
			add(new Key<>(
					"88",
					InstantCountTrigger.Mode.EQUALS,
					() -> new EnumReader<>(InstantCountTrigger.Mode.class)
			));

	public static final Key<Double> ITEM_MODIFIER     = add(new Key<>("479", 1D, DoubleReader::new));
	public static final Key<Double> ITEM_MODIFIER_TWO = add(new Key<>("483", 1D, DoubleReader::new));

	public static final Key<AbstractItemTrigger.ItemMode>
			FIRST_ITEM_MODE =
			add(new Key<>(
					"476",
					AbstractItemTrigger.ItemMode.NONE,
					() -> new EnumReader<>(AbstractItemTrigger.ItemMode.class)
			));

	public static final Key<AbstractItemTrigger.ItemMode>
			SECOND_ITEM_MODE =
			add(new Key<>(
					"477",
					AbstractItemTrigger.ItemMode.NONE,
					() -> new EnumReader<>(AbstractItemTrigger.ItemMode.class)
			));

	public static final Key<AbstractItemTrigger.ItemMode>
			TARGET_ITEM_MODE =
			add(new Key<>(
					"478",
					AbstractItemTrigger.ItemMode.NONE,
					() -> new EnumReader<>(AbstractItemTrigger.ItemMode.class)
			));

	public static final Key<AbstractItemTrigger.OperationType>
			OPERATION_TYPE_1 =
			add(new Key<>(
					"480",
					AbstractItemTrigger.OperationType.SET,
					() -> new EnumReader<>(AbstractItemTrigger.OperationType.class)
			));

	public static final Key<AbstractItemTrigger.OperationType>
			OPERATION_TYPE_2 =
			add(new Key<>(
					"481",
					AbstractItemTrigger.OperationType.PLUS,
					() -> new EnumReader<>(AbstractItemTrigger.OperationType.class)
			));

	public static final Key<AbstractItemTrigger.OperationType>
			OPERATION_TYPE_3 =
			add(new Key<>(
					"482",
					AbstractItemTrigger.OperationType.MULTIPLY,
					() -> new EnumReader<>(AbstractItemTrigger.OperationType.class)
			));

	public static final Key<ItemCompareTrigger.ComparationType>
			COMPARATION_TYPE =
			add(new Key<>(
					"482",
					ItemCompareTrigger.ComparationType.EQUALS,
					() -> new EnumReader<>(ItemCompareTrigger.ComparationType.class)
			));

	public static final Key<AbstractItemTrigger.FirstFunctionType>
			FIRST_FUNCTION_TYPE_1 =
			add(new Key<>(
					"578",
					AbstractItemTrigger.FirstFunctionType.NONE,
					() -> new EnumReader<>(AbstractItemTrigger.FirstFunctionType.class)
			));

	public static final Key<AbstractItemTrigger.FirstFunctionType>
			FIRST_FUNCTION_TYPE_2 =
			add(new Key<>(
					"579",
					AbstractItemTrigger.FirstFunctionType.NONE,
					() -> new EnumReader<>(AbstractItemTrigger.FirstFunctionType.class)
			));

	public static final Key<AbstractItemTrigger.SecondFunctionType>
			SECOND_FUNCTION_TYPE_1 =
			add(new Key<>(
					"485",
					AbstractItemTrigger.SecondFunctionType.NONE,
					() -> new EnumReader<>(AbstractItemTrigger.SecondFunctionType.class)
			));

	public static final Key<AbstractItemTrigger.SecondFunctionType>
			SECOND_FUNCTION_TYPE_2 =
			add(new Key<>(
					"486",
					AbstractItemTrigger.SecondFunctionType.NONE,
					() -> new EnumReader<>(AbstractItemTrigger.SecondFunctionType.class)
			));

	public static final Key<Double> TOL = add(new Key<>("484", 1D, DoubleReader::new));

	public static final Key<Boolean> PERSISTENT = add(new Key<>("491", false, BoolReader::new));
	public static final Key<Boolean> TARGET_ALL = add(new Key<>("492", false, BoolReader::new));
	public static final Key<Boolean> RESET      = add(new Key<>("493", false, BoolReader::new));
	public static final Key<Boolean> TIMER      = add(new Key<>("494", false, BoolReader::new));

	public static final Key<List<AdvancedRandomTrigger.RandomGroup>>
			RANDOM_GROUPS =
			add(new Key<List<AdvancedRandomTrigger.RandomGroup>>(
					"152",
					ArrayList::new,
					AdvancedRandomTrigger.Reader::new
			));

	// Area move
	public static final Key<Easing>
			AREA_EASING =
			add(new Key<>("242", Easing.NONE, () -> new EnumReader<>(Easing.class)));

	public static final Key<Easing>
			AREA_EASING_OUT =
			add(new Key<>("248", Easing.NONE, () -> new EnumReader<>(Easing.class)));


	// Unknown
	//	public static final Key<String> KEY_0   = add(new Key<>("5", StringReader::new));
	//	public static final Key<String> KEY_1   = add(new Key<>("6", StringReader::new));
	//	public static final Key<String> KEY_7   = add(new Key<>("13", StringReader::new));
	//	public static final Key<String> KEY_8   = add(new Key<>("15", StringReader::new));
	//	public static final Key<String> KEY_9   = add(new Key<>("17", StringReader::new));
	//	public static final Key<String> KEY_11  = add(new Key<>("22", StringReader::new));
	//	public static final Key<String> KEY_15  = add(new Key<>("28", StringReader::new));
	//	public static final Key<String> KEY_16  = add(new Key<>("29", StringReader::new));
	//	public static final Key<String> KEY_17  = add(new Key<>("30", StringReader::new));
	//	public static final Key<String> KEY_18  = add(new Key<>("31", StringReader::new));
	//	public static final Key<String> KEY_19  = add(new Key<>("32", StringReader::new));
	//	public static final Key<String> KEY_24  = add(new Key<>("42", StringReader::new));
	//	public static final Key<String> KEY_26  = add(new Key<>("44", StringReader::new));
	//	public static final Key<String> KEY_27  = add(new Key<>("45", StringReader::new));
	//	public static final Key<String> KEY_28  = add(new Key<>("46", StringReader::new));
	//	public static final Key<String> KEY_29  = add(new Key<>("47", StringReader::new));
	//	public static final Key<String> KEY_30  = add(new Key<>("48", StringReader::new));
	//	public static final Key<String> KEY_31  = add(new Key<>("49", StringReader::new));
	//	public static final Key<String> KEY_32  = add(new Key<>("50", StringReader::new));
	//	public static final Key<String> KEY_33  = add(new Key<>("51", StringReader::new));
	//	public static final Key<String> KEY_34  = add(new Key<>("52", StringReader::new));
	//	public static final Key<String> KEY_35  = add(new Key<>("54", StringReader::new));
	//	public static final Key<String> KEY_36  = add(new Key<>("55", StringReader::new));
	//	public static final Key<String> KEY_37  = add(new Key<>("56", StringReader::new));
	//	public static final Key<String> KEY_38  = add(new Key<>("58", StringReader::new));
	//	public static final Key<String> KEY_39  = add(new Key<>("59", StringReader::new));
	//	public static final Key<String> KEY_42  = add(new Key<>("63", StringReader::new));
	//	public static final Key<String> KEY_44  = add(new Key<>("65", StringReader::new));
	//	public static final Key<String> KEY_45  = add(new Key<>("66", StringReader::new));
	//	public static final Key<String> KEY_47  = add(new Key<>("68", StringReader::new));
	//	public static final Key<String> KEY_48  = add(new Key<>("69", StringReader::new));
	//	public static final Key<String> KEY_49  = add(new Key<>("70", StringReader::new));
	//	public static final Key<String> KEY_50  = add(new Key<>("71", StringReader::new));
	//	public static final Key<String> KEY_51  = add(new Key<>("72", StringReader::new));
	//	public static final Key<String> KEY_52  = add(new Key<>("73", StringReader::new));
	//	public static final Key<String> KEY_53  = add(new Key<>("75", StringReader::new));
	//	public static final Key<String> KEY_54  = add(new Key<>("76", StringReader::new));
	//	public static final Key<String> KEY_55  = add(new Key<>("77", StringReader::new));
	//	public static final Key<String> KEY_56  = add(new Key<>("80", StringReader::new));
	//	public static final Key<String> KEY_57  = add(new Key<>("81", StringReader::new));
	//	public static final Key<String> KEY_58  = add(new Key<>("82", StringReader::new));
	//	public static final Key<String> KEY_59  = add(new Key<>("84", StringReader::new));
	//	public static final Key<String> KEY_60  = add(new Key<>("85", StringReader::new));
	//	public static final Key<String> KEY_61  = add(new Key<>("86", StringReader::new));
	//	public static final Key<String> KEY_63  = add(new Key<>("88", StringReader::new));
	//	public static final Key<String> KEY_64  = add(new Key<>("90", StringReader::new));
	//	public static final Key<String> KEY_65  = add(new Key<>("93", StringReader::new));
	//	public static final Key<String> KEY_66  = add(new Key<>("94", StringReader::new));
	//	public static final Key<String> KEY_67  = add(new Key<>("95", StringReader::new));
	//	public static final Key<String> KEY_68  = add(new Key<>("96", StringReader::new));
	//	public static final Key<String> KEY_69  = add(new Key<>("97", StringReader::new));
	//	public static final Key<String> KEY_70  = add(new Key<>("98", StringReader::new));
	//	public static final Key<String> KEY_71  = add(new Key<>("[4", StringReader::new));
	//	public static final Key<String> KEY_72  = add(new Key<>("100", StringReader::new));
	//	public static final Key<String> KEY_73  = add(new Key<>("101", StringReader::new));
	//	public static final Key<String> KEY_74  = add(new Key<>("102", StringReader::new));
	//	public static final Key<String> KEY_75  = add(new Key<>("103", StringReader::new));
	//	public static final Key<String> KEY_76  = add(new Key<>("104", StringReader::new));
	//	public static final Key<String> KEY_77  = add(new Key<>("106", StringReader::new));
	//	public static final Key<String> KEY_78  = add(new Key<>("107", StringReader::new));
	//	public static final Key<String> KEY_79  = add(new Key<>("108", StringReader::new));
	//	public static final Key<String> KEY_80  = add(new Key<>("110", StringReader::new));
	//	public static final Key<String> KEY_81  = add(new Key<>("111", StringReader::new));
	//	public static final Key<String> KEY_82  = add(new Key<>("112", StringReader::new));
	//	public static final Key<String> KEY_83  = add(new Key<>("113", StringReader::new));
	//	public static final Key<String> KEY_84  = add(new Key<>("114", StringReader::new));
	//	public static final Key<String> KEY_87  = add(new Key<>("120", StringReader::new));
	//	public static final Key<String> KEY_88  = add(new Key<>("121", StringReader::new));
	//	public static final Key<String> KEY_89  = add(new Key<>("122", StringReader::new));
	//	public static final Key<String> KEY_90  = add(new Key<>("123", StringReader::new));
	//	public static final Key<String> KEY_91  = add(new Key<>("126", StringReader::new));
	//	public static final Key<String> KEY_92  = add(new Key<>("127", StringReader::new));
	//	public static final Key<String> KEY_93  = add(new Key<>("128", StringReader::new));
	//	public static final Key<String> KEY_94  = add(new Key<>("129", StringReader::new));
	//	public static final Key<String> KEY_95  = add(new Key<>("131", StringReader::new));
	//	public static final Key<String> KEY_96  = add(new Key<>("132", StringReader::new));
	//	public static final Key<String> KEY_97  = add(new Key<>("133", StringReader::new));
	//	public static final Key<String> KEY_98  = add(new Key<>("134", StringReader::new));
	//	public static final Key<String> KEY_99  = add(new Key<>("135", StringReader::new));
	//	public static final Key<String> KEY_100 = add(new Key<>("137", StringReader::new));
	//	public static final Key<String> KEY_101 = add(new Key<>("138", StringReader::new));
	//	public static final Key<String> KEY_102 = add(new Key<>("139", StringReader::new));
	//	public static final Key<String> KEY_103 = add(new Key<>("141", StringReader::new));
	//	public static final Key<String> KEY_104 = add(new Key<>("142", StringReader::new));
	//	public static final Key<String> KEY_105 = add(new Key<>("143", StringReader::new));
	//	public static final Key<String> KEY_106 = add(new Key<>("144", StringReader::new));
	//	public static final Key<String> KEY_107 = add(new Key<>("145", StringReader::new));
	//	public static final Key<String> KEY_108 = add(new Key<>("146", StringReader::new));
	//	public static final Key<String> KEY_109 = add(new Key<>("147", StringReader::new));
	//	public static final Key<String> KEY_110 = add(new Key<>("148", StringReader::new));
	//	public static final Key<String> KEY_111 = add(new Key<>("149", StringReader::new));
	//	public static final Key<String> KEY_112 = add(new Key<>("150", StringReader::new));
	//	public static final Key<String> KEY_113 = add(new Key<>("151", StringReader::new));
	//	public static final Key<String> KEY_114 = add(new Key<>("152", StringReader::new));
	//	public static final Key<String> KEY_115 = add(new Key<>("153", StringReader::new));
	//	public static final Key<String> KEY_116 = add(new Key<>("154", StringReader::new));
	//	public static final Key<String> KEY_118 = add(new Key<>("156", StringReader::new));
	//	public static final Key<String> KEY_119 = add(new Key<>("159", StringReader::new));
	//	public static final Key<String> KEY_120 = add(new Key<>("160", StringReader::new));
	//	public static final Key<String> KEY_121 = add(new Key<>("161", StringReader::new));
	//	public static final Key<String> KEY_122 = add(new Key<>("162", StringReader::new));
	//	public static final Key<String> KEY_123 = add(new Key<>("163", StringReader::new));
	//	public static final Key<String> KEY_124 = add(new Key<>("164", StringReader::new));
	//	public static final Key<String> KEY_125 = add(new Key<>("165", StringReader::new));
	//	public static final Key<String> KEY_126 = add(new Key<>("166", StringReader::new));
	//	public static final Key<String> KEY_127 = add(new Key<>("167", StringReader::new));
	//	public static final Key<String> KEY_128 = add(new Key<>("169", StringReader::new));
	//	public static final Key<String> KEY_130 = add(new Key<>("171", StringReader::new));
	//	public static final Key<String> KEY_131 = add(new Key<>("172", StringReader::new));
	//	public static final Key<String> KEY_132 = add(new Key<>("173", StringReader::new));
	//	public static final Key<String> KEY_133 = add(new Key<>("174", StringReader::new));
	//	public static final Key<String> KEY_134 = add(new Key<>("175", StringReader::new));
	//	public static final Key<String> KEY_135 = add(new Key<>("176", StringReader::new));
	//	public static final Key<String> KEY_136 = add(new Key<>("177", StringReader::new));
	//	public static final Key<String> KEY_137 = add(new Key<>("179", StringReader::new));
	//	public static final Key<String> KEY_138 = add(new Key<>("180", StringReader::new));
	//	public static final Key<String> KEY_139 = add(new Key<>("181", StringReader::new));
	//	public static final Key<String> KEY_140 = add(new Key<>("182", StringReader::new));
	//	public static final Key<String> KEY_141 = add(new Key<>("183", StringReader::new));
	//	public static final Key<String> KEY_142 = add(new Key<>("184", StringReader::new));
	//	public static final Key<String> KEY_143 = add(new Key<>("186", StringReader::new));
	//	public static final Key<String> KEY_144 = add(new Key<>("187", StringReader::new));
	//	public static final Key<String> KEY_145 = add(new Key<>("188", StringReader::new));
	//	public static final Key<String> KEY_146 = add(new Key<>("189", StringReader::new));
	//	public static final Key<String> KEY_147 = add(new Key<>("190", StringReader::new));
	//	public static final Key<String> KEY_148 = add(new Key<>("191", StringReader::new));
	//	public static final Key<String> KEY_149 = add(new Key<>("192", StringReader::new));
	//	public static final Key<String> KEY_150 = add(new Key<>("193", StringReader::new));
	//	public static final Key<String> KEY_151 = add(new Key<>("194", StringReader::new));
	//	public static final Key<String> KEY_152 = add(new Key<>("195", StringReader::new));
	//	public static final Key<String> KEY_153 = add(new Key<>("196", StringReader::new));
	//	public static final Key<String> KEY_154 = add(new Key<>("197", StringReader::new));
	//	public static final Key<String> KEY_155 = add(new Key<>("199", StringReader::new));
	//	public static final Key<String> KEY_156 = add(new Key<>("200", StringReader::new));
	//	public static final Key<String> KEY_157 = add(new Key<>("201", StringReader::new));
	//	public static final Key<String> KEY_158 = add(new Key<>("202", StringReader::new));
	//	public static final Key<String> KEY_159 = add(new Key<>("203", StringReader::new));
	//	public static final Key<String> KEY_160 = add(new Key<>("204", StringReader::new));
	//	public static final Key<String> KEY_161 = add(new Key<>("205", StringReader::new));
	//	public static final Key<String> KEY_162 = add(new Key<>("206", StringReader::new));
	//	public static final Key<String> KEY_163 = add(new Key<>("207", StringReader::new));
	//	public static final Key<String> KEY_164 = add(new Key<>("208", StringReader::new));
	//	public static final Key<String> KEY_165 = add(new Key<>("209", StringReader::new));
	//	public static final Key<String> KEY_166 = add(new Key<>("210", StringReader::new));
	//	public static final Key<String> KEY_167 = add(new Key<>("211", StringReader::new));
	//	public static final Key<String> KEY_168 = add(new Key<>("212", StringReader::new));
	//	public static final Key<String> KEY_169 = add(new Key<>("213", StringReader::new));
	//	public static final Key<String> KEY_170 = add(new Key<>("214", StringReader::new));
	//	public static final Key<String> KEY_171 = add(new Key<>("217", StringReader::new));
	//	public static final Key<String> KEY_172 = add(new Key<>("218", StringReader::new));
	//	public static final Key<String> KEY_173 = add(new Key<>("219", StringReader::new));
	//	public static final Key<String> KEY_174 = add(new Key<>("220", StringReader::new));
	//	public static final Key<String> KEY_175 = add(new Key<>("221", StringReader::new));
	//	public static final Key<String> KEY_176 = add(new Key<>("222", StringReader::new));
	//	public static final Key<String> KEY_177 = add(new Key<>("223", StringReader::new));
	//	public static final Key<String> KEY_178 = add(new Key<>("225", StringReader::new));
	//	public static final Key<String> KEY_179 = add(new Key<>("231", StringReader::new));
	//	public static final Key<String> KEY_180 = add(new Key<>("232", StringReader::new));
	//	public static final Key<String> KEY_181 = add(new Key<>("233", StringReader::new));
	//	public static final Key<String> KEY_182 = add(new Key<>("234", StringReader::new));
	//	public static final Key<String> KEY_183 = add(new Key<>("235", StringReader::new));
	//	public static final Key<String> KEY_184 = add(new Key<>("236", StringReader::new));
	//	public static final Key<String> KEY_185 = add(new Key<>("237", StringReader::new));
	//	public static final Key<String> KEY_186 = add(new Key<>("238", StringReader::new));
	//	public static final Key<String> KEY_187 = add(new Key<>("239", StringReader::new));
	//	public static final Key<String> KEY_188 = add(new Key<>("240", StringReader::new));
	//	public static final Key<String> KEY_189 = add(new Key<>("241", StringReader::new));
	//	public static final Key<String> KEY_190 = add(new Key<>("242", StringReader::new));
	//	public static final Key<String> KEY_191 = add(new Key<>("243", StringReader::new));
	//	public static final Key<String> KEY_192 = add(new Key<>("248", StringReader::new));
	//	public static final Key<String> KEY_193 = add(new Key<>("249", StringReader::new));
	//	public static final Key<String> KEY_194 = add(new Key<>("252", StringReader::new));
	//	public static final Key<String> KEY_195 = add(new Key<>("253", StringReader::new));
	//	public static final Key<String> KEY_196 = add(new Key<>("260", StringReader::new));
	//	public static final Key<String> KEY_197 = add(new Key<>("261", StringReader::new));
	//	public static final Key<String> KEY_198 = add(new Key<>("262", StringReader::new));
	//	public static final Key<String> KEY_199 = add(new Key<>("263", StringReader::new));
	//	public static final Key<String> KEY_200 = add(new Key<>("264", StringReader::new));
	//	public static final Key<String> KEY_201 = add(new Key<>("265", StringReader::new));
	//	public static final Key<String> KEY_202 = add(new Key<>("270", StringReader::new));
	//	public static final Key<String> KEY_203 = add(new Key<>("271", StringReader::new));
	//	public static final Key<String> KEY_204 = add(new Key<>("275", StringReader::new));
	//	public static final Key<String> KEY_205 = add(new Key<>("276", StringReader::new));
	//	public static final Key<String> KEY_206 = add(new Key<>("278", StringReader::new));
	//	public static final Key<String> KEY_208 = add(new Key<>("280", StringReader::new));
	//	public static final Key<String> KEY_209 = add(new Key<>("281", StringReader::new));
	//	public static final Key<String> KEY_210 = add(new Key<>("282", StringReader::new));
	//	public static final Key<String> KEY_211 = add(new Key<>("283", StringReader::new));
	//	public static final Key<String> KEY_212 = add(new Key<>("285", StringReader::new));
	//	public static final Key<String> KEY_213 = add(new Key<>("286", StringReader::new));
	//	public static final Key<String> KEY_214 = add(new Key<>("287", StringReader::new));
	//	public static final Key<String> KEY_215 = add(new Key<>("288", StringReader::new));
	//	public static final Key<String> KEY_216 = add(new Key<>("290", StringReader::new));
	//	public static final Key<String> KEY_217 = add(new Key<>("291", StringReader::new));
	//	public static final Key<String> KEY_218 = add(new Key<>("292", StringReader::new));
	//	public static final Key<String> KEY_219 = add(new Key<>("293", StringReader::new));
	//	public static final Key<String> KEY_220 = add(new Key<>("298", StringReader::new));
	//	public static final Key<String> KEY_221 = add(new Key<>("300", StringReader::new));
	//	public static final Key<String> KEY_222 = add(new Key<>("306", StringReader::new));
	//	public static final Key<String> KEY_223 = add(new Key<>("307", StringReader::new));
	//	public static final Key<String> KEY_224 = add(new Key<>("308", StringReader::new));
	//	public static final Key<String> KEY_225 = add(new Key<>("316", StringReader::new));
	//	public static final Key<String> KEY_226 = add(new Key<>("318", StringReader::new));
	//	public static final Key<String> KEY_227 = add(new Key<>("320", StringReader::new));
	//	public static final Key<String> KEY_228 = add(new Key<>("324", StringReader::new));
	//	public static final Key<String> KEY_229 = add(new Key<>("326", StringReader::new));
	//	public static final Key<String> KEY_230 = add(new Key<>("328", StringReader::new));
	//	public static final Key<String> KEY_231 = add(new Key<>("330", StringReader::new));
	//	public static final Key<String> KEY_232 = add(new Key<>("332", StringReader::new));
	//	public static final Key<String> KEY_233 = add(new Key<>("334", StringReader::new));
	//	public static final Key<String> KEY_234 = add(new Key<>("337", StringReader::new));
	//	public static final Key<String> KEY_235 = add(new Key<>("338", StringReader::new));
	//	public static final Key<String> KEY_236 = add(new Key<>("339", StringReader::new));
	//	public static final Key<String> KEY_237 = add(new Key<>("340", StringReader::new));
	//	public static final Key<String> KEY_238 = add(new Key<>("341", StringReader::new));
	//	public static final Key<String> KEY_239 = add(new Key<>("343", StringReader::new));
	//	public static final Key<String> KEY_240 = add(new Key<>("344", StringReader::new));
	//	public static final Key<String> KEY_241 = add(new Key<>("345", StringReader::new));
	//	public static final Key<String> KEY_242 = add(new Key<>("347", StringReader::new));
	//	public static final Key<String> KEY_243 = add(new Key<>("348", StringReader::new));
	//	public static final Key<String> KEY_244 = add(new Key<>("349", StringReader::new));
	//	public static final Key<String> KEY_245 = add(new Key<>("350", StringReader::new));
	//	public static final Key<String> KEY_246 = add(new Key<>("352", StringReader::new));
	//	public static final Key<String> KEY_247 = add(new Key<>("353", StringReader::new));
	//	public static final Key<String> KEY_248 = add(new Key<>("354", StringReader::new));
	//	public static final Key<String> KEY_249 = add(new Key<>("355", StringReader::new));
	//	public static final Key<String> KEY_250 = add(new Key<>("357", StringReader::new));
	//	public static final Key<String> KEY_251 = add(new Key<>("359", StringReader::new));
	//	public static final Key<String> KEY_252 = add(new Key<>("361", StringReader::new));
	//	public static final Key<String> KEY_253 = add(new Key<>("367", StringReader::new));
	//	public static final Key<String> KEY_254 = add(new Key<>("369", StringReader::new));
	//	public static final Key<String> KEY_255 = add(new Key<>("371", StringReader::new));
	//	public static final Key<String> KEY_256 = add(new Key<>("372", StringReader::new));
	//	public static final Key<String> KEY_257 = add(new Key<>("373", StringReader::new));
	//	public static final Key<String> KEY_258 = add(new Key<>("374", StringReader::new));
	//	public static final Key<String> KEY_259 = add(new Key<>("375", StringReader::new));
	//	public static final Key<String> KEY_260 = add(new Key<>("376", StringReader::new));
	//	public static final Key<String> KEY_261 = add(new Key<>("378", StringReader::new));
	//	public static final Key<String> KEY_262 = add(new Key<>("379", StringReader::new));
	//	public static final Key<String> KEY_263 = add(new Key<>("380", StringReader::new));
	//	public static final Key<String> KEY_264 = add(new Key<>("381", StringReader::new));
	//	public static final Key<String> KEY_265 = add(new Key<>("382", StringReader::new));
	//	public static final Key<String> KEY_266 = add(new Key<>("383", StringReader::new));
	//	public static final Key<String> KEY_267 = add(new Key<>("385", StringReader::new));
	//	public static final Key<String> KEY_268 = add(new Key<>("386", StringReader::new));
	//	public static final Key<String> KEY_269 = add(new Key<>("387", StringReader::new));
	//	public static final Key<String> KEY_270 = add(new Key<>("388", StringReader::new));
	//	public static final Key<String> KEY_271 = add(new Key<>("391", StringReader::new));
	//	public static final Key<String> KEY_272 = add(new Key<>("392", StringReader::new));
	//	public static final Key<String> KEY_273 = add(new Key<>("393", StringReader::new));
	//	public static final Key<String> KEY_274 = add(new Key<>("394", StringReader::new));
	//	public static final Key<String> KEY_275 = add(new Key<>("395", StringReader::new));
	//	public static final Key<String> KEY_276 = add(new Key<>("396", StringReader::new));
	//	public static final Key<String> KEY_277 = add(new Key<>("397", StringReader::new));
	//	public static final Key<String> KEY_278 = add(new Key<>("399", StringReader::new));
	//	public static final Key<String> KEY_279 = add(new Key<>("400", StringReader::new));
	//	public static final Key<String> KEY_280 = add(new Key<>("401", StringReader::new));
	//	public static final Key<String> KEY_281 = add(new Key<>("402", StringReader::new));
	//	public static final Key<String> KEY_282 = add(new Key<>("403", StringReader::new));
	//	public static final Key<String> KEY_283 = add(new Key<>("404", StringReader::new));
	//	public static final Key<String> KEY_284 = add(new Key<>("405", StringReader::new));
	//	public static final Key<String> KEY_285 = add(new Key<>("406", StringReader::new));
	//	public static final Key<String> KEY_286 = add(new Key<>("407", StringReader::new));
	//	public static final Key<String> KEY_287 = add(new Key<>("408", StringReader::new));
	//	public static final Key<String> KEY_288 = add(new Key<>("409", StringReader::new));
	//	public static final Key<String> KEY_289 = add(new Key<>("410", StringReader::new));
	//	public static final Key<String> KEY_290 = add(new Key<>("411", StringReader::new));
	//	public static final Key<String> KEY_291 = add(new Key<>("412", StringReader::new));
	//	public static final Key<String> KEY_292 = add(new Key<>("413", StringReader::new));
	//	public static final Key<String> KEY_293 = add(new Key<>("414", StringReader::new));
	//	public static final Key<String> KEY_294 = add(new Key<>("415", StringReader::new));
	//	public static final Key<String> KEY_295 = add(new Key<>("416", StringReader::new));
	//	public static final Key<String> KEY_296 = add(new Key<>("417", StringReader::new));
	//	public static final Key<String> KEY_297 = add(new Key<>("418", StringReader::new));
	//	public static final Key<String> KEY_298 = add(new Key<>("419", StringReader::new));
	//	public static final Key<String> KEY_299 = add(new Key<>("420", StringReader::new));
	//	public static final Key<String> KEY_300 = add(new Key<>("421", StringReader::new));
	//	public static final Key<String> KEY_301 = add(new Key<>("422", StringReader::new));
	//	public static final Key<String> KEY_302 = add(new Key<>("423", StringReader::new));
	//	public static final Key<String> KEY_303 = add(new Key<>("424", StringReader::new));
	//	public static final Key<String> KEY_304 = add(new Key<>("425", StringReader::new));
	//	public static final Key<String> KEY_305 = add(new Key<>("426", StringReader::new));
	//	public static final Key<String> KEY_306 = add(new Key<>("428", StringReader::new));
	//	public static final Key<String> KEY_307 = add(new Key<>("430", StringReader::new));
	//	public static final Key<String> KEY_308 = add(new Key<>("432", StringReader::new));
	//	public static final Key<String> KEY_309 = add(new Key<>("433", StringReader::new));
	//	public static final Key<String> KEY_310 = add(new Key<>("435", StringReader::new));
	//	public static final Key<String> KEY_311 = add(new Key<>("436", StringReader::new));
	//	public static final Key<String> KEY_312 = add(new Key<>("437", StringReader::new));
	//	public static final Key<String> KEY_313 = add(new Key<>("438", StringReader::new));
	//	public static final Key<String> KEY_314 = add(new Key<>("440", StringReader::new));
	//	public static final Key<String> KEY_315 = add(new Key<>("441", StringReader::new));
	//	public static final Key<String> KEY_316 = add(new Key<>("442", StringReader::new));
	//	public static final Key<String> KEY_317 = add(new Key<>("444", StringReader::new));
	//	public static final Key<String> KEY_318 = add(new Key<>("445", StringReader::new));
	//	public static final Key<String> KEY_319 = add(new Key<>("446", StringReader::new));
	//	public static final Key<String> KEY_320 = add(new Key<>("447", StringReader::new));
	//	public static final Key<String> KEY_321 = add(new Key<>("448", StringReader::new));
	//	public static final Key<String> KEY_322 = add(new Key<>("449", StringReader::new));
	//	public static final Key<String> KEY_323 = add(new Key<>("452", StringReader::new));
	//	public static final Key<String> KEY_324 = add(new Key<>("453", StringReader::new));
	//	public static final Key<String> KEY_325 = add(new Key<>("454", StringReader::new));
	//	public static final Key<String> KEY_326 = add(new Key<>("455", StringReader::new));
	//	public static final Key<String> KEY_327 = add(new Key<>("456", StringReader::new));
	//	public static final Key<String> KEY_328 = add(new Key<>("457", StringReader::new));
	//	public static final Key<String> KEY_329 = add(new Key<>("458", StringReader::new));
	//	public static final Key<String> KEY_330 = add(new Key<>("459", StringReader::new));
	//	public static final Key<String> KEY_331 = add(new Key<>("460", StringReader::new));
	//	public static final Key<String> KEY_332 = add(new Key<>("461", StringReader::new));
	//	public static final Key<String> KEY_333 = add(new Key<>("462", StringReader::new));
	//	public static final Key<String> KEY_334 = add(new Key<>("463", StringReader::new));
	//	public static final Key<String> KEY_335 = add(new Key<>("464", StringReader::new));
	//	public static final Key<String> KEY_336 = add(new Key<>("465", StringReader::new));
	//	public static final Key<String> KEY_337 = add(new Key<>("466", StringReader::new));
	//	public static final Key<String> KEY_338 = add(new Key<>("467", StringReader::new));
	//	public static final Key<String> KEY_339 = add(new Key<>("470", StringReader::new));
	//	public static final Key<String> KEY_340 = add(new Key<>("471", StringReader::new));
	//	public static final Key<String> KEY_341 = add(new Key<>("472", StringReader::new));
	//	public static final Key<String> KEY_342 = add(new Key<>("473", StringReader::new));
	//	public static final Key<String> KEY_343 = add(new Key<>("474", StringReader::new));
	//	public static final Key<String> KEY_344 = add(new Key<>("475", StringReader::new));
	//	public static final Key<String> KEY_345 = add(new Key<>("476", StringReader::new));
	//	public static final Key<String> KEY_346 = add(new Key<>("477", StringReader::new));
	//	public static final Key<String> KEY_347 = add(new Key<>("478", StringReader::new));
	//	public static final Key<String> KEY_348 = add(new Key<>("479", StringReader::new));
	//	public static final Key<String> KEY_349 = add(new Key<>("480", StringReader::new));
	//	public static final Key<String> KEY_350 = add(new Key<>("481", StringReader::new));
	//	public static final Key<String> KEY_351 = add(new Key<>("482", StringReader::new));
	//	public static final Key<String> KEY_352 = add(new Key<>("483", StringReader::new));
	//	public static final Key<String> KEY_353 = add(new Key<>("487", StringReader::new));
	//	public static final Key<String> KEY_354 = add(new Key<>("488", StringReader::new));
	//	public static final Key<String> KEY_355 = add(new Key<>("489", StringReader::new));
	//	public static final Key<String> KEY_356 = add(new Key<>("490", StringReader::new));
	//	public static final Key<String> KEY_357 = add(new Key<>("491", StringReader::new));
	//	public static final Key<String> KEY_358 = add(new Key<>("494", StringReader::new));
	//	public static final Key<String> KEY_359 = add(new Key<>("495", StringReader::new));
	//	public static final Key<String> KEY_360 = add(new Key<>("498", StringReader::new));
	//	public static final Key<String> KEY_361 = add(new Key<>("501", StringReader::new));
	//	public static final Key<String> KEY_362 = add(new Key<>("502", StringReader::new));
	//	public static final Key<String> KEY_363 = add(new Key<>("503", StringReader::new));
	//	public static final Key<String> KEY_364 = add(new Key<>("504", StringReader::new));
	//	public static final Key<String> KEY_365 = add(new Key<>("506", StringReader::new));
	//	public static final Key<String> KEY_366 = add(new Key<>("507", StringReader::new));
	//	public static final Key<String> KEY_367 = add(new Key<>("508", StringReader::new));
	//	public static final Key<String> KEY_368 = add(new Key<>("509", StringReader::new));
	//	public static final Key<String> KEY_369 = add(new Key<>("511", StringReader::new));
	//	public static final Key<String> KEY_370 = add(new Key<>("512", StringReader::new));
	//	public static final Key<String> KEY_371 = add(new Key<>("513", StringReader::new));
	//	public static final Key<String> KEY_372 = add(new Key<>("514", StringReader::new));
	//	public static final Key<String> KEY_373 = add(new Key<>("515", StringReader::new));
	//	public static final Key<String> KEY_374 = add(new Key<>("516", StringReader::new));
	//	public static final Key<String> KEY_375 = add(new Key<>("517", StringReader::new));
	//	public static final Key<String> KEY_376 = add(new Key<>("518", StringReader::new));
	//	public static final Key<String> KEY_377 = add(new Key<>("519", StringReader::new));
	//	public static final Key<String> KEY_378 = add(new Key<>("520", StringReader::new));
	//	public static final Key<String> KEY_379 = add(new Key<>("521", StringReader::new));
	//	public static final Key<String> KEY_380 = add(new Key<>("522", StringReader::new));
	//	public static final Key<String> KEY_381 = add(new Key<>("523", StringReader::new));
	//	public static final Key<String> KEY_382 = add(new Key<>("524", StringReader::new));
	//	public static final Key<String> KEY_383 = add(new Key<>("525", StringReader::new));
	//	public static final Key<String> KEY_384 = add(new Key<>("526", StringReader::new));
	//	public static final Key<String> KEY_385 = add(new Key<>("527", StringReader::new));
	//	public static final Key<String> KEY_386 = add(new Key<>("528", StringReader::new));
	//	public static final Key<String> KEY_387 = add(new Key<>("530", StringReader::new));
	//	public static final Key<String> KEY_388 = add(new Key<>("531", StringReader::new));
	//	public static final Key<String> KEY_389 = add(new Key<>("532", StringReader::new));
	//	public static final Key<String> KEY_390 = add(new Key<>("533", StringReader::new));
	//	public static final Key<String> KEY_391 = add(new Key<>("537", StringReader::new));
	//	public static final Key<String> KEY_392 = add(new Key<>("538", StringReader::new));
	//	public static final Key<String> KEY_393 = add(new Key<>("539", StringReader::new));
	//	public static final Key<String> KEY_394 = add(new Key<>("540", StringReader::new));
	//	public static final Key<String> KEY_395 = add(new Key<>("541", StringReader::new));
	//	public static final Key<String> KEY_396 = add(new Key<>("542", StringReader::new));
	//	public static final Key<String> KEY_397 = add(new Key<>("543", StringReader::new));
	//	public static final Key<String> KEY_398 = add(new Key<>("544", StringReader::new));
	//	public static final Key<String> KEY_399 = add(new Key<>("545", StringReader::new));
	//	public static final Key<String> KEY_400 = add(new Key<>("546", StringReader::new));
	//	public static final Key<String> KEY_401 = add(new Key<>("547", StringReader::new));
	//	public static final Key<String> KEY_402 = add(new Key<>("548", StringReader::new));
	//	public static final Key<String> KEY_403 = add(new Key<>("551", StringReader::new));
	//	public static final Key<String> KEY_404 = add(new Key<>("552", StringReader::new));
	//	public static final Key<String> KEY_405 = add(new Key<>("554", StringReader::new));
	//	public static final Key<String> KEY_406 = add(new Key<>("555", StringReader::new));
	//	public static final Key<String> KEY_407 = add(new Key<>("556", StringReader::new));
	//	public static final Key<String> KEY_408 = add(new Key<>("557", StringReader::new));
	//	public static final Key<String> KEY_409 = add(new Key<>("558", StringReader::new));
	//	public static final Key<String> KEY_410 = add(new Key<>("563", StringReader::new));
	//	public static final Key<String> KEY_411 = add(new Key<>("566", StringReader::new));
	//	public static final Key<String> KEY_412 = add(new Key<>("568", StringReader::new));
	//	public static final Key<String> KEY_413 = add(new Key<>("572", StringReader::new));
	//	public static final Key<String> KEY_414 = add(new Key<>("573", StringReader::new));
	//	public static final Key<String> KEY_415 = add(new Key<>("574", StringReader::new));
	//	public static final Key<String> KEY_416 = add(new Key<>("575", StringReader::new));
	//	public static final Key<String> KEY_417 = add(new Key<>("576", StringReader::new));
	//	public static final Key<String> KEY_418 = add(new Key<>("577", StringReader::new));
	//	public static final Key<String> KEY_419 = add(new Key<>("580", StringReader::new));
	//	public static final Key<String> KEY_420 = add(new Key<>("581", StringReader::new));
	//	public static final Key<String> KEY_421 = add(new Key<>("582", StringReader::new));
	//	public static final Key<String> KEY_422 = add(new Key<>("583", StringReader::new));
	//	public static final Key<String> KEY_423 = add(new Key<>("584", StringReader::new));
	//	public static final Key<String> KEY_424 = add(new Key<>("586", StringReader::new));
	//	public static final Key<String> KEY_425 = add(new Key<>("588", StringReader::new));
	//	public static final Key<String> KEY_426 = add(new Key<>("590", StringReader::new));
	//	public static final Key<String> KEY_427 = add(new Key<>("592", StringReader::new));

	// WTF ??????
	public static final Key<String> KEY_428 = add(new Key<>("99]", "", StringReader::new));

	public static final Key<String> KEY_429 = add(new Key<>("kA2", "", StringReader::new));
	public static final Key<String> KEY_430 = add(new Key<>("kA3", "", StringReader::new));
	public static final Key<String> KEY_431 = add(new Key<>("kA4", "", StringReader::new));
	public static final Key<String> KEY_432 = add(new Key<>("kA8", "", StringReader::new));
	public static final Key<String> KEY_433 = add(new Key<>("kA9", "", StringReader::new));
	public static final Key<String> KEY_434 = add(new Key<>("kA10", "", StringReader::new));
	public static final Key<String> KEY_435 = add(new Key<>("kA11", "", StringReader::new));
	public static final Key<String> KEY_436 = add(new Key<>("kA19", "", StringReader::new));
	public static final Key<String> KEY_437 = add(new Key<>("kA20", "", StringReader::new));
	public static final Key<String> KEY_438 = add(new Key<>("kA21", "", StringReader::new));
	public static final Key<String> KEY_439 = add(new Key<>("kA22", "", StringReader::new));
	public static final Key<String> KEY_440 = add(new Key<>("kA23", "", StringReader::new));
	public static final Key<String> KEY_441 = add(new Key<>("kA24", "", StringReader::new));
	public static final Key<String> KEY_442 = add(new Key<>("kA26", "", StringReader::new));
	public static final Key<String> KEY_443 = add(new Key<>("kA27", "", StringReader::new));
	public static final Key<String> KEY_444 = add(new Key<>("kA28", "", StringReader::new));
	public static final Key<String> KEY_445 = add(new Key<>("kA29", "", StringReader::new));
	public static final Key<String> KEY_446 = add(new Key<>("kA31", "", StringReader::new));
	public static final Key<String> KEY_447 = add(new Key<>("kA32", "", StringReader::new));
	public static final Key<String> KEY_448 = add(new Key<>("kA33", "", StringReader::new));
	public static final Key<String> KEY_449 = add(new Key<>("kA34", "", StringReader::new));
	public static final Key<String> KEY_450 = add(new Key<>("kA35", "", StringReader::new));
	public static final Key<String> KEY_451 = add(new Key<>("kA36", "", StringReader::new));
	public static final Key<String> KEY_452 = add(new Key<>("kA37", "", StringReader::new));
	public static final Key<String> KEY_453 = add(new Key<>("kA38", "", StringReader::new));
	public static final Key<String> KEY_454 = add(new Key<>("kA39", "", StringReader::new));
	public static final Key<String> KEY_455 = add(new Key<>("kA40", "", StringReader::new));
	public static final Key<String> KEY_456 = add(new Key<>("kA41", "", StringReader::new));
	public static final Key<String> KEY_457 = add(new Key<>("kA42", "", StringReader::new));
	public static final Key<String> KEY_458 = add(new Key<>("kA43", "", StringReader::new));
	public static final Key<String> KEY_459 = add(new Key<>("kA44", "", StringReader::new));
	public static final Key<String> KEY_460 = add(new Key<>("kA45", "", StringReader::new));
	public static final Key<String> KEY_461 = add(new Key<>("kA46", "", StringReader::new));

	public static Color readColor(Map<Key<?>, String> data) {
		return new Color(
				RED_COLOR.read(data),
				GREEN_COLOR.read(data),
				BLUE_COLOR.read(data)
		);
	}

	public static void writeColor(Map<Key<?>, String> data, Color color) {
		RED_COLOR.write(data, color.getRed());
		GREEN_COLOR.write(data, color.getGreen());
		BLUE_COLOR.write(data, color.getBlue());
	}

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
		VALUES.forEach(v -> v.setName(KeyUtils.findName(BlockKeys.class, v)));
	}
}
