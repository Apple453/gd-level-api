package net.applee.gdlevelapi.block.key;

import net.applee.gdlevelapi.block.blocks.triggers.AbstractItemTrigger;
import net.applee.gdlevelapi.block.blocks.triggers.spawnable.*;
import net.applee.gdlevelapi.objects.HSVContainer;
import net.applee.gdlevelapi.objects.enums.ColorType;
import net.applee.gdlevelapi.objects.enums.Easing;
import net.applee.gdlevelapi.readers.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static net.applee.gdlevelapi.block.key.BlockKey.add;

public class BlockKeys {

	// Object
	public static final BlockKey<Integer> ID       = add(new BlockKey<>("1", -1, IntReader::new));
	public static final BlockKey<Double>  POS_X    = add(new BlockKey<>("2", 0D, DoubleReader::new));
	public static final BlockKey<Double>  POS_Y    = add(new BlockKey<>("3", 0D, DoubleReader::new));
	public static final BlockKey<Double>  ROTATION = add(new BlockKey<>("6", 0D, DoubleReader::new));
	public static final BlockKey<Double>  SCALE_X  = add(new BlockKey<>("128", 1D, DoubleReader::new));
	public static final BlockKey<Double>  SCALE_Y  = add(new BlockKey<>("129", 1D, DoubleReader::new));
	public static final BlockKey<Double>  OFFSET_X = add(new BlockKey<>("131", 0D, DoubleReader::new));
	public static final BlockKey<Double>  OFFSET_Y = add(new BlockKey<>("132", 0D, DoubleReader::new));

	public static final BlockKey<List<Integer>>
			GROUP_IDS =
			add(new BlockKey<List<Integer>>("57", ArrayList::new, () -> new IntListReader(".")));

	public static final BlockKey<List<Integer>>
			PINK_GROUP_IDS =
			add(new BlockKey<List<Integer>>("274", ArrayList::new, () -> new IntListReader(".")));

	public static final BlockKey<Integer> EDITOR_L  = add(new BlockKey<>("20", 0, IntReader::new));
	public static final BlockKey<Integer> EDITOR_L2 = add(new BlockKey<>("61", 0, IntReader::new));
	public static final BlockKey<Integer> Z_ORDER   = add(new BlockKey<>("25", 2, IntReader::new));
	public static final BlockKey<Integer> Z_LAYER   = add(new BlockKey<>("24", 0, IntReader::new));
	public static final BlockKey<Integer> CHANNEL   = add(new BlockKey<>("170", 0, IntReader::new));
	public static final BlockKey<Integer> ORDER     = add(new BlockKey<>("115", 0, IntReader::new));

	public static final BlockKey<Integer> COLOR_GROUP   = add(new BlockKey<>("21", 1, IntReader::new));
	public static final BlockKey<Integer> COLOR_CHANNEL = add(new BlockKey<>("155", 1, IntReader::new));

	public static final BlockKey<ColorType>
			COLOR_TYPE =
			add(new BlockKey<>("497", ColorType.DEFAULT, () -> new EnumReader<>(ColorType.class)));

	public static final BlockKey<HSVContainer>
			BLOCK_HSV =
			add(new BlockKey<HSVContainer>("43", HSVContainer::new, HSVContainer.Reader::new));

	public static final BlockKey<Boolean> HSV_CHANGED = add(new BlockKey<>("41", false, BoolReader::new));
	public static final BlockKey<Boolean> HAS_PREVIEW = add(new BlockKey<>("36", false, BoolReader::new));

	// Extra settings
	public static final BlockKey<Boolean> DONT_FADE          = add(new BlockKey<>("64", false, BoolReader::new));
	public static final BlockKey<Boolean> DONT_ENTER         = add(new BlockKey<>("67", false, BoolReader::new));
	public static final BlockKey<Boolean> NO_EFFECTS         = add(new BlockKey<>("116", false, BoolReader::new));
	public static final BlockKey<Boolean> GROUP_PARENT       = add(new BlockKey<>("34", false, BoolReader::new));
	public static final BlockKey<Boolean> AREA_PARENT        = add(new BlockKey<>("279", false, BoolReader::new));
	public static final BlockKey<Boolean> DONT_BOOST_Y       = add(new BlockKey<>("496", false, BoolReader::new));
	public static final BlockKey<Boolean> DONT_BOOST_X       = add(new BlockKey<>("509", false, BoolReader::new));
	public static final BlockKey<Boolean> SINGLE_P_TOUCH     = add(new BlockKey<>("284", false, BoolReader::new));
	public static final BlockKey<Boolean> HIGH_DETAIL        = add(new BlockKey<>("103", false, BoolReader::new));
	public static final BlockKey<Boolean> NO_TOUCH           = add(new BlockKey<>("121", false, BoolReader::new));
	public static final BlockKey<Boolean> PASSABLE           = add(new BlockKey<>("134", false, BoolReader::new));
	public static final BlockKey<Boolean> HIDE               = add(new BlockKey<>("135", false, BoolReader::new));
	public static final BlockKey<Boolean> NON_STICK_X        = add(new BlockKey<>("136", false, BoolReader::new));
	public static final BlockKey<Boolean> EXTRA_STICKY       = add(new BlockKey<>("495", false, BoolReader::new));
	public static final BlockKey<Boolean> EXTENDED_COLLISION = add(new BlockKey<>("511", false, BoolReader::new));
	public static final BlockKey<Boolean> CENTER_EFFECT      = add(new BlockKey<>("369", false, BoolReader::new));
	public static final BlockKey<Boolean> ICE_BLOCK          = add(new BlockKey<>("137", false, BoolReader::new));
	public static final BlockKey<Boolean> GRIP_SLOPE         = add(new BlockKey<>("193", false, BoolReader::new));
	public static final BlockKey<Boolean> NO_GLOW            = add(new BlockKey<>("96", false, BoolReader::new));
	public static final BlockKey<Boolean> NO_PARTICLE        = add(new BlockKey<>("507", false, BoolReader::new));
	public static final BlockKey<Boolean> NON_STICK_Y        = add(new BlockKey<>("289", false, BoolReader::new));
	public static final BlockKey<Boolean> SCALE_STICK        = add(new BlockKey<>("356", false, BoolReader::new));
	public static final BlockKey<Boolean> NO_AUDIO_SCALE     = add(new BlockKey<>("372", false, BoolReader::new));

	// Extra Settings 2
	public static final BlockKey<Integer> ENTER_CHANNEL = add(new BlockKey<>("343", 0, IntReader::new));
	public static final BlockKey<Integer> MATERIAL      = add(new BlockKey<>("446", 0, IntReader::new));
	public static final BlockKey<Integer> CONTROL_ID    = add(new BlockKey<>("534", 0, IntReader::new));

	public static final BlockKey<Boolean> PREVIEW = add(new BlockKey<>("13", false, BoolReader::new));

	// Trigger
	public static final BlockKey<Boolean> SPAWN_TRIGGER = add(new BlockKey<>("62", false, BoolReader::new));
	public static final BlockKey<Boolean> MULTI_TRIGGER = add(new BlockKey<>("87", false, BoolReader::new));
	public static final BlockKey<Boolean> TOUCH_TRIGGER = add(new BlockKey<>("11", false, BoolReader::new));

	public static final BlockKey<Integer> RED_COLOR      = add(new BlockKey<>("7", 255, IntReader::new));
	public static final BlockKey<Integer> GREEN_COLOR    = add(new BlockKey<>("8", 255, IntReader::new));
	public static final BlockKey<Integer> BLUE_COLOR     = add(new BlockKey<>("9", 255, IntReader::new));
	public static final BlockKey<Double>  TIME           = add(new BlockKey<>("10", 0.5, DoubleReader::new));
	public static final BlockKey<Boolean> PLAYER_COLOR_1 = add(new BlockKey<>("15", false, BoolReader::new));
	public static final BlockKey<Boolean> PLAYER_COLOR_2 = add(new BlockKey<>("16", false, BoolReader::new));
	public static final BlockKey<Boolean> BLENDING       = add(new BlockKey<>("17", false, BoolReader::new));
	public static final BlockKey<Integer> COLOR_ID       = add(new BlockKey<>("23", 1, IntReader::new));
	public static final BlockKey<Double>  OPACITY        = add(new BlockKey<>("35", 1D, DoubleReader::new));
	public static final BlockKey<Double>  FADE_IN        = add(new BlockKey<>("45", 0D, DoubleReader::new));
	public static final BlockKey<Double>  HOLD           = add(new BlockKey<>("46", 0D, DoubleReader::new));
	public static final BlockKey<Double>  FADE_OUT       = add(new BlockKey<>("47", 0D, DoubleReader::new));

	public static final BlockKey<PulseTrigger.Mode>
			PULSE_MODE =
			add(new BlockKey<>("48", PulseTrigger.Mode.COLOR, () -> new EnumReader<>(PulseTrigger.Mode.class)));

	public static final BlockKey<HSVContainer>
			PULSE_HSV =
			add(new BlockKey<HSVContainer>("49", HSVContainer::new, HSVContainer.Reader::new));

	public static final BlockKey<Integer> COLOR_CHANNEL_ID = add(new BlockKey<>("50", 0, IntReader::new));

	public static final BlockKey<Integer> GROUP_ID = add(new BlockKey<>("51", 0, IntReader::new));

	public static final BlockKey<PulseTrigger.TargetType>
			PULSE_TARGET_TYPE =
			add(new BlockKey<>(
					"52",
					PulseTrigger.TargetType.CHANNEL,
					() -> new EnumReader<>(PulseTrigger.TargetType.class)
			));

	public static final BlockKey<Boolean> COPY_OPACITY = add(new BlockKey<>("60", false, BoolReader::new));
	public static final BlockKey<Boolean> MAIN_ONLY    = add(new BlockKey<>("65", false, BoolReader::new));
	public static final BlockKey<Boolean> DETAIL_ONLY  = add(new BlockKey<>("66", false, BoolReader::new));
	public static final BlockKey<Boolean> EXLUSIVE     = add(new BlockKey<>("86", false, BoolReader::new));

	public static final BlockKey<Boolean> NON_STATIC_HSV = add(new BlockKey<>("210", true, BoolReader::new));

	public static final BlockKey<Double>  SPAWN_DELAY     = add(new BlockKey<>("63", 0D, DoubleReader::new));
	public static final BlockKey<Double>  SPAWN_RANDOM    = add(new BlockKey<>("556", 0D, DoubleReader::new));
	public static final BlockKey<Boolean> DISABLE_PREVIEW = add(new BlockKey<>("102", false, BoolReader::new));
	public static final BlockKey<Boolean> SPAWN_ORDERED   = add(new BlockKey<>("441", false, BoolReader::new));
	public static final BlockKey<Boolean> RESET_REMAP     = add(new BlockKey<>("581", false, BoolReader::new));

	public static final BlockKey<List<SpawnTrigger.SpawnGroup>>
			SPAWN_GROUPS =
			add(new BlockKey<List<SpawnTrigger.SpawnGroup>>(
					"442",
					ArrayList::new,
					() -> new SpawnTrigger.GroupsReader()
			));

	public static final BlockKey<Boolean> USE_CONTROL_ID = add(new BlockKey<>("535", false, BoolReader::new));

	public static final BlockKey<StopTrigger.Mode>
			STOP_MODE =
			add(new BlockKey<>("580", StopTrigger.Mode.STOP, () -> new EnumReader<>(StopTrigger.Mode.class)));

	public static final BlockKey<Easing>
			EASING =
			add(new BlockKey<>("30", Easing.NONE, () -> new EnumReader<>(Easing.class)));

	public static final BlockKey<Double> EASING_RATE = add(new BlockKey<>("85", 2D, DoubleReader::new));

	public static final BlockKey<Integer> MOVE_X        = add(new BlockKey<>("28", 0, IntReader::new));
	public static final BlockKey<Integer> MOVE_Y        = add(new BlockKey<>("29", 0, IntReader::new));
	public static final BlockKey<Double>  MOVE_MOD_X    = add(new BlockKey<>("143", 1D, DoubleReader::new));
	public static final BlockKey<Double>  MOVE_MOD_Y    = add(new BlockKey<>("144", 1D, DoubleReader::new));
	public static final BlockKey<Boolean> SILENT        = add(new BlockKey<>("544", false, BoolReader::new));
	public static final BlockKey<Boolean> LOCK_PLAYER_X = add(new BlockKey<>("58", false, BoolReader::new));
	public static final BlockKey<Boolean> LOCK_PLAYER_Y = add(new BlockKey<>("59", false, BoolReader::new));
	public static final BlockKey<Boolean> LOCK_CAMERA_X = add(new BlockKey<>("141", false, BoolReader::new));
	public static final BlockKey<Boolean> LOCK_CAMERA_Y = add(new BlockKey<>("142", false, BoolReader::new));
	public static final BlockKey<Boolean> SMALL_STEP    = add(new BlockKey<>("393", false, BoolReader::new));
	public static final BlockKey<Boolean> DYNAMIC_MODE  = add(new BlockKey<>("397", false, BoolReader::new));
	public static final BlockKey<Boolean> TARGET_MODE   = add(new BlockKey<>("100", false, BoolReader::new));

	public static final BlockKey<MoveTrigger.OnlyMode>
			ONLY_MODE =
			add(new BlockKey<>("101", MoveTrigger.OnlyMode.NONE, () -> new EnumReader<>(MoveTrigger.OnlyMode.class)));

	public static final BlockKey<Boolean> PLAYER_ONE      = add(new BlockKey<>("138", false, BoolReader::new));
	public static final BlockKey<Boolean> PLAYER_TWO      = add(new BlockKey<>("200", false, BoolReader::new));
	public static final BlockKey<Boolean> DIRECTION_MODE  = add(new BlockKey<>("394", false, BoolReader::new));
	public static final BlockKey<Integer> CENTER_GROUP_ID = add(new BlockKey<>("395", 0, IntReader::new));
	public static final BlockKey<Integer> TARGET_GROUP_ID = add(new BlockKey<>("71", 0, IntReader::new));
	public static final BlockKey<Integer> DISTANCE        = add(new BlockKey<>("396", 0, IntReader::new));

	public static final BlockKey<Boolean> ACTIVATE_GROUP = add(new BlockKey<>("56", false, BoolReader::new));
	public static final BlockKey<Double>  FOLLOW_MOD_X   = add(new BlockKey<>("72", 1D, DoubleReader::new));
	public static final BlockKey<Double>  FOLLOW_MOD_Y   = add(new BlockKey<>("73", 1D, DoubleReader::new));

	public static final BlockKey<Double> STRENGTH = add(new BlockKey<>("75", 0D, DoubleReader::new));
	public static final BlockKey<Double> INTERVAL = add(new BlockKey<>("84", 0D, DoubleReader::new));

	public static final BlockKey<Integer> COUNT       = add(new BlockKey<>("77", 0, IntReader::new));
	public static final BlockKey<Integer> ITEM_ID     = add(new BlockKey<>("80", 0, IntReader::new));
	public static final BlockKey<Integer> ITEM_ID_TWO = add(new BlockKey<>("95", 0, IntReader::new));
	public static final BlockKey<Double>  MODIFIER    = add(new BlockKey<>("449", 1D, DoubleReader::new));
	public static final BlockKey<Boolean> OVERRIDE    = add(new BlockKey<>("139", false, BoolReader::new));

	public static final BlockKey<PickupTrigger.Mode>
			PICKUP_MODE =
			add(new BlockKey<>("88", PickupTrigger.Mode.NONE, () -> new EnumReader<>(PickupTrigger.Mode.class)));

	public static final BlockKey<Boolean> MULTI_ACTIVATE = add(new BlockKey<>("104", false, BoolReader::new));

	public static final BlockKey<InstantCountTrigger.Mode>
			INSTANT_COUNT_MODE =
			add(new BlockKey<>(
					"88",
					InstantCountTrigger.Mode.EQUALS,
					() -> new EnumReader<>(InstantCountTrigger.Mode.class)
			));

	public static final BlockKey<Double> ITEM_MODIFIER     = add(new BlockKey<>("479", 1D, DoubleReader::new));
	public static final BlockKey<Double> ITEM_MODIFIER_TWO = add(new BlockKey<>("483", 1D, DoubleReader::new));

	public static final BlockKey<AbstractItemTrigger.ItemMode>
			FIRST_ITEM_MODE =
			add(new BlockKey<>(
					"476",
					AbstractItemTrigger.ItemMode.NONE,
					() -> new EnumReader<>(AbstractItemTrigger.ItemMode.class)
			));

	public static final BlockKey<AbstractItemTrigger.ItemMode>
			SECOND_ITEM_MODE =
			add(new BlockKey<>(
					"477",
					AbstractItemTrigger.ItemMode.NONE,
					() -> new EnumReader<>(AbstractItemTrigger.ItemMode.class)
			));

	public static final BlockKey<AbstractItemTrigger.ItemMode>
			TARGET_ITEM_MODE =
			add(new BlockKey<>(
					"478",
					AbstractItemTrigger.ItemMode.NONE,
					() -> new EnumReader<>(AbstractItemTrigger.ItemMode.class)
			));

	public static final BlockKey<AbstractItemTrigger.OperationType>
			OPERATION_TYPE_1 =
			add(new BlockKey<>(
					"480",
					AbstractItemTrigger.OperationType.SET,
					() -> new EnumReader<>(AbstractItemTrigger.OperationType.class)
			));

	public static final BlockKey<AbstractItemTrigger.OperationType>
			OPERATION_TYPE_2 =
			add(new BlockKey<>(
					"481",
					AbstractItemTrigger.OperationType.PLUS,
					() -> new EnumReader<>(AbstractItemTrigger.OperationType.class)
			));

	public static final BlockKey<AbstractItemTrigger.OperationType>
			OPERATION_TYPE_3 =
			add(new BlockKey<>(
					"482",
					AbstractItemTrigger.OperationType.MULTIPLY,
					() -> new EnumReader<>(AbstractItemTrigger.OperationType.class)
			));

	public static final BlockKey<ItemCompareTrigger.ComparationType>
			COMPARATION_TYPE =
			add(new BlockKey<>(
					"482",
					ItemCompareTrigger.ComparationType.EQUALS,
					() -> new EnumReader<>(ItemCompareTrigger.ComparationType.class)
			));

	public static final BlockKey<AbstractItemTrigger.FirstFunctionType>
			FIRST_FUNCTION_TYPE_1 =
			add(new BlockKey<>(
					"578",
					AbstractItemTrigger.FirstFunctionType.NONE,
					() -> new EnumReader<>(AbstractItemTrigger.FirstFunctionType.class)
			));

	public static final BlockKey<AbstractItemTrigger.FirstFunctionType>
			FIRST_FUNCTION_TYPE_2 =
			add(new BlockKey<>(
					"579",
					AbstractItemTrigger.FirstFunctionType.NONE,
					() -> new EnumReader<>(AbstractItemTrigger.FirstFunctionType.class)
			));

	public static final BlockKey<AbstractItemTrigger.SecondFunctionType>
			SECOND_FUNCTION_TYPE_1 =
			add(new BlockKey<>(
					"485",
					AbstractItemTrigger.SecondFunctionType.NONE,
					() -> new EnumReader<>(AbstractItemTrigger.SecondFunctionType.class)
			));

	public static final BlockKey<AbstractItemTrigger.SecondFunctionType>
			SECOND_FUNCTION_TYPE_2 =
			add(new BlockKey<>(
					"486",
					AbstractItemTrigger.SecondFunctionType.NONE,
					() -> new EnumReader<>(AbstractItemTrigger.SecondFunctionType.class)
			));

	public static final BlockKey<Double> TOL = add(new BlockKey<>("484", 1D, DoubleReader::new));

	public static final BlockKey<Boolean> PERSISTENT = add(new BlockKey<>("491", false, BoolReader::new));
	public static final BlockKey<Boolean> TARGET_ALL = add(new BlockKey<>("492", false, BoolReader::new));
	public static final BlockKey<Boolean> RESET      = add(new BlockKey<>("493", false, BoolReader::new));
	public static final BlockKey<Boolean> TIMER      = add(new BlockKey<>("494", false, BoolReader::new));

	public static final BlockKey<List<AdvancedRandomTrigger.RandomGroup>>
			RANDOM_GROUPS =
			add(new BlockKey<List<AdvancedRandomTrigger.RandomGroup>>(
					"152",
					ArrayList::new,
					AdvancedRandomTrigger.Reader::new
			));

	// Area move
	public static final BlockKey<Easing>
			AREA_EASING =
			add(new BlockKey<>("242", Easing.NONE, () -> new EnumReader<>(Easing.class)));

	public static final BlockKey<Easing>
			AREA_EASING_OUT =
			add(new BlockKey<>("248", Easing.NONE, () -> new EnumReader<>(Easing.class)));


	// Unknown
	//	public static final BlockKey<String> KEY_0   = add(new BlockKey<>("5", StringReader::new));
	//	public static final BlockKey<String> KEY_1   = add(new BlockKey<>("6", StringReader::new));
	//	public static final BlockKey<String> KEY_7   = add(new BlockKey<>("13", StringReader::new));
	//	public static final BlockKey<String> KEY_8   = add(new BlockKey<>("15", StringReader::new));
	//	public static final BlockKey<String> KEY_9   = add(new BlockKey<>("17", StringReader::new));
	//	public static final BlockKey<String> KEY_11  = add(new BlockKey<>("22", StringReader::new));
	//	public static final BlockKey<String> KEY_15  = add(new BlockKey<>("28", StringReader::new));
	//	public static final BlockKey<String> KEY_16  = add(new BlockKey<>("29", StringReader::new));
	//	public static final BlockKey<String> KEY_17  = add(new BlockKey<>("30", StringReader::new));
	//	public static final BlockKey<String> KEY_18  = add(new BlockKey<>("31", StringReader::new));
	//	public static final BlockKey<String> KEY_19  = add(new BlockKey<>("32", StringReader::new));
	//	public static final BlockKey<String> KEY_24  = add(new BlockKey<>("42", StringReader::new));
	//	public static final BlockKey<String> KEY_26  = add(new BlockKey<>("44", StringReader::new));
	//	public static final BlockKey<String> KEY_27  = add(new BlockKey<>("45", StringReader::new));
	//	public static final BlockKey<String> KEY_28  = add(new BlockKey<>("46", StringReader::new));
	//	public static final BlockKey<String> KEY_29  = add(new BlockKey<>("47", StringReader::new));
	//	public static final BlockKey<String> KEY_30  = add(new BlockKey<>("48", StringReader::new));
	//	public static final BlockKey<String> KEY_31  = add(new BlockKey<>("49", StringReader::new));
	//	public static final BlockKey<String> KEY_32  = add(new BlockKey<>("50", StringReader::new));
	//	public static final BlockKey<String> KEY_33  = add(new BlockKey<>("51", StringReader::new));
	//	public static final BlockKey<String> KEY_34  = add(new BlockKey<>("52", StringReader::new));
	//	public static final BlockKey<String> KEY_35  = add(new BlockKey<>("54", StringReader::new));
	//	public static final BlockKey<String> KEY_36  = add(new BlockKey<>("55", StringReader::new));
	//	public static final BlockKey<String> KEY_37  = add(new BlockKey<>("56", StringReader::new));
	//	public static final BlockKey<String> KEY_38  = add(new BlockKey<>("58", StringReader::new));
	//	public static final BlockKey<String> KEY_39  = add(new BlockKey<>("59", StringReader::new));
	//	public static final BlockKey<String> KEY_42  = add(new BlockKey<>("63", StringReader::new));
	//	public static final BlockKey<String> KEY_44  = add(new BlockKey<>("65", StringReader::new));
	//	public static final BlockKey<String> KEY_45  = add(new BlockKey<>("66", StringReader::new));
	//	public static final BlockKey<String> KEY_47  = add(new BlockKey<>("68", StringReader::new));
	//	public static final BlockKey<String> KEY_48  = add(new BlockKey<>("69", StringReader::new));
	//	public static final BlockKey<String> KEY_49  = add(new BlockKey<>("70", StringReader::new));
	//	public static final BlockKey<String> KEY_50  = add(new BlockKey<>("71", StringReader::new));
	//	public static final BlockKey<String> KEY_51  = add(new BlockKey<>("72", StringReader::new));
	//	public static final BlockKey<String> KEY_52  = add(new BlockKey<>("73", StringReader::new));
	//	public static final BlockKey<String> KEY_53  = add(new BlockKey<>("75", StringReader::new));
	//	public static final BlockKey<String> KEY_54  = add(new BlockKey<>("76", StringReader::new));
	//	public static final BlockKey<String> KEY_55  = add(new BlockKey<>("77", StringReader::new));
	//	public static final BlockKey<String> KEY_56  = add(new BlockKey<>("80", StringReader::new));
	//	public static final BlockKey<String> KEY_57  = add(new BlockKey<>("81", StringReader::new));
	//	public static final BlockKey<String> KEY_58  = add(new BlockKey<>("82", StringReader::new));
	//	public static final BlockKey<String> KEY_59  = add(new BlockKey<>("84", StringReader::new));
	//	public static final BlockKey<String> KEY_60  = add(new BlockKey<>("85", StringReader::new));
	//	public static final BlockKey<String> KEY_61  = add(new BlockKey<>("86", StringReader::new));
	//	public static final BlockKey<String> KEY_63  = add(new BlockKey<>("88", StringReader::new));
	//	public static final BlockKey<String> KEY_64  = add(new BlockKey<>("90", StringReader::new));
	//	public static final BlockKey<String> KEY_65  = add(new BlockKey<>("93", StringReader::new));
	//	public static final BlockKey<String> KEY_66  = add(new BlockKey<>("94", StringReader::new));
	//	public static final BlockKey<String> KEY_67  = add(new BlockKey<>("95", StringReader::new));
	//	public static final BlockKey<String> KEY_68  = add(new BlockKey<>("96", StringReader::new));
	//	public static final BlockKey<String> KEY_69  = add(new BlockKey<>("97", StringReader::new));
	//	public static final BlockKey<String> KEY_70  = add(new BlockKey<>("98", StringReader::new));
	//	public static final BlockKey<String> KEY_71  = add(new BlockKey<>("[4", StringReader::new));
	//	public static final BlockKey<String> KEY_72  = add(new BlockKey<>("100", StringReader::new));
	//	public static final BlockKey<String> KEY_73  = add(new BlockKey<>("101", StringReader::new));
	//	public static final BlockKey<String> KEY_74  = add(new BlockKey<>("102", StringReader::new));
	//	public static final BlockKey<String> KEY_75  = add(new BlockKey<>("103", StringReader::new));
	//	public static final BlockKey<String> KEY_76  = add(new BlockKey<>("104", StringReader::new));
	//	public static final BlockKey<String> KEY_77  = add(new BlockKey<>("106", StringReader::new));
	//	public static final BlockKey<String> KEY_78  = add(new BlockKey<>("107", StringReader::new));
	//	public static final BlockKey<String> KEY_79  = add(new BlockKey<>("108", StringReader::new));
	//	public static final BlockKey<String> KEY_80  = add(new BlockKey<>("110", StringReader::new));
	//	public static final BlockKey<String> KEY_81  = add(new BlockKey<>("111", StringReader::new));
	//	public static final BlockKey<String> KEY_82  = add(new BlockKey<>("112", StringReader::new));
	//	public static final BlockKey<String> KEY_83  = add(new BlockKey<>("113", StringReader::new));
	//	public static final BlockKey<String> KEY_84  = add(new BlockKey<>("114", StringReader::new));
	//	public static final BlockKey<String> KEY_87  = add(new BlockKey<>("120", StringReader::new));
	//	public static final BlockKey<String> KEY_88  = add(new BlockKey<>("121", StringReader::new));
	//	public static final BlockKey<String> KEY_89  = add(new BlockKey<>("122", StringReader::new));
	//	public static final BlockKey<String> KEY_90  = add(new BlockKey<>("123", StringReader::new));
	//	public static final BlockKey<String> KEY_91  = add(new BlockKey<>("126", StringReader::new));
	//	public static final BlockKey<String> KEY_92  = add(new BlockKey<>("127", StringReader::new));
	//	public static final BlockKey<String> KEY_93  = add(new BlockKey<>("128", StringReader::new));
	//	public static final BlockKey<String> KEY_94  = add(new BlockKey<>("129", StringReader::new));
	//	public static final BlockKey<String> KEY_95  = add(new BlockKey<>("131", StringReader::new));
	//	public static final BlockKey<String> KEY_96  = add(new BlockKey<>("132", StringReader::new));
	//	public static final BlockKey<String> KEY_97  = add(new BlockKey<>("133", StringReader::new));
	//	public static final BlockKey<String> KEY_98  = add(new BlockKey<>("134", StringReader::new));
	//	public static final BlockKey<String> KEY_99  = add(new BlockKey<>("135", StringReader::new));
	//	public static final BlockKey<String> KEY_100 = add(new BlockKey<>("137", StringReader::new));
	//	public static final BlockKey<String> KEY_101 = add(new BlockKey<>("138", StringReader::new));
	//	public static final BlockKey<String> KEY_102 = add(new BlockKey<>("139", StringReader::new));
	//	public static final BlockKey<String> KEY_103 = add(new BlockKey<>("141", StringReader::new));
	//	public static final BlockKey<String> KEY_104 = add(new BlockKey<>("142", StringReader::new));
	//	public static final BlockKey<String> KEY_105 = add(new BlockKey<>("143", StringReader::new));
	//	public static final BlockKey<String> KEY_106 = add(new BlockKey<>("144", StringReader::new));
	//	public static final BlockKey<String> KEY_107 = add(new BlockKey<>("145", StringReader::new));
	//	public static final BlockKey<String> KEY_108 = add(new BlockKey<>("146", StringReader::new));
	//	public static final BlockKey<String> KEY_109 = add(new BlockKey<>("147", StringReader::new));
	//	public static final BlockKey<String> KEY_110 = add(new BlockKey<>("148", StringReader::new));
	//	public static final BlockKey<String> KEY_111 = add(new BlockKey<>("149", StringReader::new));
	//	public static final BlockKey<String> KEY_112 = add(new BlockKey<>("150", StringReader::new));
	//	public static final BlockKey<String> KEY_113 = add(new BlockKey<>("151", StringReader::new));
	//	public static final BlockKey<String> KEY_114 = add(new BlockKey<>("152", StringReader::new));
	//	public static final BlockKey<String> KEY_115 = add(new BlockKey<>("153", StringReader::new));
	//	public static final BlockKey<String> KEY_116 = add(new BlockKey<>("154", StringReader::new));
	//	public static final BlockKey<String> KEY_118 = add(new BlockKey<>("156", StringReader::new));
	//	public static final BlockKey<String> KEY_119 = add(new BlockKey<>("159", StringReader::new));
	//	public static final BlockKey<String> KEY_120 = add(new BlockKey<>("160", StringReader::new));
	//	public static final BlockKey<String> KEY_121 = add(new BlockKey<>("161", StringReader::new));
	//	public static final BlockKey<String> KEY_122 = add(new BlockKey<>("162", StringReader::new));
	//	public static final BlockKey<String> KEY_123 = add(new BlockKey<>("163", StringReader::new));
	//	public static final BlockKey<String> KEY_124 = add(new BlockKey<>("164", StringReader::new));
	//	public static final BlockKey<String> KEY_125 = add(new BlockKey<>("165", StringReader::new));
	//	public static final BlockKey<String> KEY_126 = add(new BlockKey<>("166", StringReader::new));
	//	public static final BlockKey<String> KEY_127 = add(new BlockKey<>("167", StringReader::new));
	//	public static final BlockKey<String> KEY_128 = add(new BlockKey<>("169", StringReader::new));
	//	public static final BlockKey<String> KEY_130 = add(new BlockKey<>("171", StringReader::new));
	//	public static final BlockKey<String> KEY_131 = add(new BlockKey<>("172", StringReader::new));
	//	public static final BlockKey<String> KEY_132 = add(new BlockKey<>("173", StringReader::new));
	//	public static final BlockKey<String> KEY_133 = add(new BlockKey<>("174", StringReader::new));
	//	public static final BlockKey<String> KEY_134 = add(new BlockKey<>("175", StringReader::new));
	//	public static final BlockKey<String> KEY_135 = add(new BlockKey<>("176", StringReader::new));
	//	public static final BlockKey<String> KEY_136 = add(new BlockKey<>("177", StringReader::new));
	//	public static final BlockKey<String> KEY_137 = add(new BlockKey<>("179", StringReader::new));
	//	public static final BlockKey<String> KEY_138 = add(new BlockKey<>("180", StringReader::new));
	//	public static final BlockKey<String> KEY_139 = add(new BlockKey<>("181", StringReader::new));
	//	public static final BlockKey<String> KEY_140 = add(new BlockKey<>("182", StringReader::new));
	//	public static final BlockKey<String> KEY_141 = add(new BlockKey<>("183", StringReader::new));
	//	public static final BlockKey<String> KEY_142 = add(new BlockKey<>("184", StringReader::new));
	//	public static final BlockKey<String> KEY_143 = add(new BlockKey<>("186", StringReader::new));
	//	public static final BlockKey<String> KEY_144 = add(new BlockKey<>("187", StringReader::new));
	//	public static final BlockKey<String> KEY_145 = add(new BlockKey<>("188", StringReader::new));
	//	public static final BlockKey<String> KEY_146 = add(new BlockKey<>("189", StringReader::new));
	//	public static final BlockKey<String> KEY_147 = add(new BlockKey<>("190", StringReader::new));
	//	public static final BlockKey<String> KEY_148 = add(new BlockKey<>("191", StringReader::new));
	//	public static final BlockKey<String> KEY_149 = add(new BlockKey<>("192", StringReader::new));
	//	public static final BlockKey<String> KEY_150 = add(new BlockKey<>("193", StringReader::new));
	//	public static final BlockKey<String> KEY_151 = add(new BlockKey<>("194", StringReader::new));
	//	public static final BlockKey<String> KEY_152 = add(new BlockKey<>("195", StringReader::new));
	//	public static final BlockKey<String> KEY_153 = add(new BlockKey<>("196", StringReader::new));
	//	public static final BlockKey<String> KEY_154 = add(new BlockKey<>("197", StringReader::new));
	//	public static final BlockKey<String> KEY_155 = add(new BlockKey<>("199", StringReader::new));
	//	public static final BlockKey<String> KEY_156 = add(new BlockKey<>("200", StringReader::new));
	//	public static final BlockKey<String> KEY_157 = add(new BlockKey<>("201", StringReader::new));
	//	public static final BlockKey<String> KEY_158 = add(new BlockKey<>("202", StringReader::new));
	//	public static final BlockKey<String> KEY_159 = add(new BlockKey<>("203", StringReader::new));
	//	public static final BlockKey<String> KEY_160 = add(new BlockKey<>("204", StringReader::new));
	//	public static final BlockKey<String> KEY_161 = add(new BlockKey<>("205", StringReader::new));
	//	public static final BlockKey<String> KEY_162 = add(new BlockKey<>("206", StringReader::new));
	//	public static final BlockKey<String> KEY_163 = add(new BlockKey<>("207", StringReader::new));
	//	public static final BlockKey<String> KEY_164 = add(new BlockKey<>("208", StringReader::new));
	//	public static final BlockKey<String> KEY_165 = add(new BlockKey<>("209", StringReader::new));
	//	public static final BlockKey<String> KEY_166 = add(new BlockKey<>("210", StringReader::new));
	//	public static final BlockKey<String> KEY_167 = add(new BlockKey<>("211", StringReader::new));
	//	public static final BlockKey<String> KEY_168 = add(new BlockKey<>("212", StringReader::new));
	//	public static final BlockKey<String> KEY_169 = add(new BlockKey<>("213", StringReader::new));
	//	public static final BlockKey<String> KEY_170 = add(new BlockKey<>("214", StringReader::new));
	//	public static final BlockKey<String> KEY_171 = add(new BlockKey<>("217", StringReader::new));
	//	public static final BlockKey<String> KEY_172 = add(new BlockKey<>("218", StringReader::new));
	//	public static final BlockKey<String> KEY_173 = add(new BlockKey<>("219", StringReader::new));
	//	public static final BlockKey<String> KEY_174 = add(new BlockKey<>("220", StringReader::new));
	//	public static final BlockKey<String> KEY_175 = add(new BlockKey<>("221", StringReader::new));
	//	public static final BlockKey<String> KEY_176 = add(new BlockKey<>("222", StringReader::new));
	//	public static final BlockKey<String> KEY_177 = add(new BlockKey<>("223", StringReader::new));
	//	public static final BlockKey<String> KEY_178 = add(new BlockKey<>("225", StringReader::new));
	//	public static final BlockKey<String> KEY_179 = add(new BlockKey<>("231", StringReader::new));
	//	public static final BlockKey<String> KEY_180 = add(new BlockKey<>("232", StringReader::new));
	//	public static final BlockKey<String> KEY_181 = add(new BlockKey<>("233", StringReader::new));
	//	public static final BlockKey<String> KEY_182 = add(new BlockKey<>("234", StringReader::new));
	//	public static final BlockKey<String> KEY_183 = add(new BlockKey<>("235", StringReader::new));
	//	public static final BlockKey<String> KEY_184 = add(new BlockKey<>("236", StringReader::new));
	//	public static final BlockKey<String> KEY_185 = add(new BlockKey<>("237", StringReader::new));
	//	public static final BlockKey<String> KEY_186 = add(new BlockKey<>("238", StringReader::new));
	//	public static final BlockKey<String> KEY_187 = add(new BlockKey<>("239", StringReader::new));
	//	public static final BlockKey<String> KEY_188 = add(new BlockKey<>("240", StringReader::new));
	//	public static final BlockKey<String> KEY_189 = add(new BlockKey<>("241", StringReader::new));
	//	public static final BlockKey<String> KEY_190 = add(new BlockKey<>("242", StringReader::new));
	//	public static final BlockKey<String> KEY_191 = add(new BlockKey<>("243", StringReader::new));
	//	public static final BlockKey<String> KEY_192 = add(new BlockKey<>("248", StringReader::new));
	//	public static final BlockKey<String> KEY_193 = add(new BlockKey<>("249", StringReader::new));
	//	public static final BlockKey<String> KEY_194 = add(new BlockKey<>("252", StringReader::new));
	//	public static final BlockKey<String> KEY_195 = add(new BlockKey<>("253", StringReader::new));
	//	public static final BlockKey<String> KEY_196 = add(new BlockKey<>("260", StringReader::new));
	//	public static final BlockKey<String> KEY_197 = add(new BlockKey<>("261", StringReader::new));
	//	public static final BlockKey<String> KEY_198 = add(new BlockKey<>("262", StringReader::new));
	//	public static final BlockKey<String> KEY_199 = add(new BlockKey<>("263", StringReader::new));
	//	public static final BlockKey<String> KEY_200 = add(new BlockKey<>("264", StringReader::new));
	//	public static final BlockKey<String> KEY_201 = add(new BlockKey<>("265", StringReader::new));
	//	public static final BlockKey<String> KEY_202 = add(new BlockKey<>("270", StringReader::new));
	//	public static final BlockKey<String> KEY_203 = add(new BlockKey<>("271", StringReader::new));
	//	public static final BlockKey<String> KEY_204 = add(new BlockKey<>("275", StringReader::new));
	//	public static final BlockKey<String> KEY_205 = add(new BlockKey<>("276", StringReader::new));
	//	public static final BlockKey<String> KEY_206 = add(new BlockKey<>("278", StringReader::new));
	//	public static final BlockKey<String> KEY_208 = add(new BlockKey<>("280", StringReader::new));
	//	public static final BlockKey<String> KEY_209 = add(new BlockKey<>("281", StringReader::new));
	//	public static final BlockKey<String> KEY_210 = add(new BlockKey<>("282", StringReader::new));
	//	public static final BlockKey<String> KEY_211 = add(new BlockKey<>("283", StringReader::new));
	//	public static final BlockKey<String> KEY_212 = add(new BlockKey<>("285", StringReader::new));
	//	public static final BlockKey<String> KEY_213 = add(new BlockKey<>("286", StringReader::new));
	//	public static final BlockKey<String> KEY_214 = add(new BlockKey<>("287", StringReader::new));
	//	public static final BlockKey<String> KEY_215 = add(new BlockKey<>("288", StringReader::new));
	//	public static final BlockKey<String> KEY_216 = add(new BlockKey<>("290", StringReader::new));
	//	public static final BlockKey<String> KEY_217 = add(new BlockKey<>("291", StringReader::new));
	//	public static final BlockKey<String> KEY_218 = add(new BlockKey<>("292", StringReader::new));
	//	public static final BlockKey<String> KEY_219 = add(new BlockKey<>("293", StringReader::new));
	//	public static final BlockKey<String> KEY_220 = add(new BlockKey<>("298", StringReader::new));
	//	public static final BlockKey<String> KEY_221 = add(new BlockKey<>("300", StringReader::new));
	//	public static final BlockKey<String> KEY_222 = add(new BlockKey<>("306", StringReader::new));
	//	public static final BlockKey<String> KEY_223 = add(new BlockKey<>("307", StringReader::new));
	//	public static final BlockKey<String> KEY_224 = add(new BlockKey<>("308", StringReader::new));
	//	public static final BlockKey<String> KEY_225 = add(new BlockKey<>("316", StringReader::new));
	//	public static final BlockKey<String> KEY_226 = add(new BlockKey<>("318", StringReader::new));
	//	public static final BlockKey<String> KEY_227 = add(new BlockKey<>("320", StringReader::new));
	//	public static final BlockKey<String> KEY_228 = add(new BlockKey<>("324", StringReader::new));
	//	public static final BlockKey<String> KEY_229 = add(new BlockKey<>("326", StringReader::new));
	//	public static final BlockKey<String> KEY_230 = add(new BlockKey<>("328", StringReader::new));
	//	public static final BlockKey<String> KEY_231 = add(new BlockKey<>("330", StringReader::new));
	//	public static final BlockKey<String> KEY_232 = add(new BlockKey<>("332", StringReader::new));
	//	public static final BlockKey<String> KEY_233 = add(new BlockKey<>("334", StringReader::new));
	//	public static final BlockKey<String> KEY_234 = add(new BlockKey<>("337", StringReader::new));
	//	public static final BlockKey<String> KEY_235 = add(new BlockKey<>("338", StringReader::new));
	//	public static final BlockKey<String> KEY_236 = add(new BlockKey<>("339", StringReader::new));
	//	public static final BlockKey<String> KEY_237 = add(new BlockKey<>("340", StringReader::new));
	//	public static final BlockKey<String> KEY_238 = add(new BlockKey<>("341", StringReader::new));
	//	public static final BlockKey<String> KEY_239 = add(new BlockKey<>("343", StringReader::new));
	//	public static final BlockKey<String> KEY_240 = add(new BlockKey<>("344", StringReader::new));
	//	public static final BlockKey<String> KEY_241 = add(new BlockKey<>("345", StringReader::new));
	//	public static final BlockKey<String> KEY_242 = add(new BlockKey<>("347", StringReader::new));
	//	public static final BlockKey<String> KEY_243 = add(new BlockKey<>("348", StringReader::new));
	//	public static final BlockKey<String> KEY_244 = add(new BlockKey<>("349", StringReader::new));
	//	public static final BlockKey<String> KEY_245 = add(new BlockKey<>("350", StringReader::new));
	//	public static final BlockKey<String> KEY_246 = add(new BlockKey<>("352", StringReader::new));
	//	public static final BlockKey<String> KEY_247 = add(new BlockKey<>("353", StringReader::new));
	//	public static final BlockKey<String> KEY_248 = add(new BlockKey<>("354", StringReader::new));
	//	public static final BlockKey<String> KEY_249 = add(new BlockKey<>("355", StringReader::new));
	//	public static final BlockKey<String> KEY_250 = add(new BlockKey<>("357", StringReader::new));
	//	public static final BlockKey<String> KEY_251 = add(new BlockKey<>("359", StringReader::new));
	//	public static final BlockKey<String> KEY_252 = add(new BlockKey<>("361", StringReader::new));
	//	public static final BlockKey<String> KEY_253 = add(new BlockKey<>("367", StringReader::new));
	//	public static final BlockKey<String> KEY_254 = add(new BlockKey<>("369", StringReader::new));
	//	public static final BlockKey<String> KEY_255 = add(new BlockKey<>("371", StringReader::new));
	//	public static final BlockKey<String> KEY_256 = add(new BlockKey<>("372", StringReader::new));
	//	public static final BlockKey<String> KEY_257 = add(new BlockKey<>("373", StringReader::new));
	//	public static final BlockKey<String> KEY_258 = add(new BlockKey<>("374", StringReader::new));
	//	public static final BlockKey<String> KEY_259 = add(new BlockKey<>("375", StringReader::new));
	//	public static final BlockKey<String> KEY_260 = add(new BlockKey<>("376", StringReader::new));
	//	public static final BlockKey<String> KEY_261 = add(new BlockKey<>("378", StringReader::new));
	//	public static final BlockKey<String> KEY_262 = add(new BlockKey<>("379", StringReader::new));
	//	public static final BlockKey<String> KEY_263 = add(new BlockKey<>("380", StringReader::new));
	//	public static final BlockKey<String> KEY_264 = add(new BlockKey<>("381", StringReader::new));
	//	public static final BlockKey<String> KEY_265 = add(new BlockKey<>("382", StringReader::new));
	//	public static final BlockKey<String> KEY_266 = add(new BlockKey<>("383", StringReader::new));
	//	public static final BlockKey<String> KEY_267 = add(new BlockKey<>("385", StringReader::new));
	//	public static final BlockKey<String> KEY_268 = add(new BlockKey<>("386", StringReader::new));
	//	public static final BlockKey<String> KEY_269 = add(new BlockKey<>("387", StringReader::new));
	//	public static final BlockKey<String> KEY_270 = add(new BlockKey<>("388", StringReader::new));
	//	public static final BlockKey<String> KEY_271 = add(new BlockKey<>("391", StringReader::new));
	//	public static final BlockKey<String> KEY_272 = add(new BlockKey<>("392", StringReader::new));
	//	public static final BlockKey<String> KEY_273 = add(new BlockKey<>("393", StringReader::new));
	//	public static final BlockKey<String> KEY_274 = add(new BlockKey<>("394", StringReader::new));
	//	public static final BlockKey<String> KEY_275 = add(new BlockKey<>("395", StringReader::new));
	//	public static final BlockKey<String> KEY_276 = add(new BlockKey<>("396", StringReader::new));
	//	public static final BlockKey<String> KEY_277 = add(new BlockKey<>("397", StringReader::new));
	//	public static final BlockKey<String> KEY_278 = add(new BlockKey<>("399", StringReader::new));
	//	public static final BlockKey<String> KEY_279 = add(new BlockKey<>("400", StringReader::new));
	//	public static final BlockKey<String> KEY_280 = add(new BlockKey<>("401", StringReader::new));
	//	public static final BlockKey<String> KEY_281 = add(new BlockKey<>("402", StringReader::new));
	//	public static final BlockKey<String> KEY_282 = add(new BlockKey<>("403", StringReader::new));
	//	public static final BlockKey<String> KEY_283 = add(new BlockKey<>("404", StringReader::new));
	//	public static final BlockKey<String> KEY_284 = add(new BlockKey<>("405", StringReader::new));
	//	public static final BlockKey<String> KEY_285 = add(new BlockKey<>("406", StringReader::new));
	//	public static final BlockKey<String> KEY_286 = add(new BlockKey<>("407", StringReader::new));
	//	public static final BlockKey<String> KEY_287 = add(new BlockKey<>("408", StringReader::new));
	//	public static final BlockKey<String> KEY_288 = add(new BlockKey<>("409", StringReader::new));
	//	public static final BlockKey<String> KEY_289 = add(new BlockKey<>("410", StringReader::new));
	//	public static final BlockKey<String> KEY_290 = add(new BlockKey<>("411", StringReader::new));
	//	public static final BlockKey<String> KEY_291 = add(new BlockKey<>("412", StringReader::new));
	//	public static final BlockKey<String> KEY_292 = add(new BlockKey<>("413", StringReader::new));
	//	public static final BlockKey<String> KEY_293 = add(new BlockKey<>("414", StringReader::new));
	//	public static final BlockKey<String> KEY_294 = add(new BlockKey<>("415", StringReader::new));
	//	public static final BlockKey<String> KEY_295 = add(new BlockKey<>("416", StringReader::new));
	//	public static final BlockKey<String> KEY_296 = add(new BlockKey<>("417", StringReader::new));
	//	public static final BlockKey<String> KEY_297 = add(new BlockKey<>("418", StringReader::new));
	//	public static final BlockKey<String> KEY_298 = add(new BlockKey<>("419", StringReader::new));
	//	public static final BlockKey<String> KEY_299 = add(new BlockKey<>("420", StringReader::new));
	//	public static final BlockKey<String> KEY_300 = add(new BlockKey<>("421", StringReader::new));
	//	public static final BlockKey<String> KEY_301 = add(new BlockKey<>("422", StringReader::new));
	//	public static final BlockKey<String> KEY_302 = add(new BlockKey<>("423", StringReader::new));
	//	public static final BlockKey<String> KEY_303 = add(new BlockKey<>("424", StringReader::new));
	//	public static final BlockKey<String> KEY_304 = add(new BlockKey<>("425", StringReader::new));
	//	public static final BlockKey<String> KEY_305 = add(new BlockKey<>("426", StringReader::new));
	//	public static final BlockKey<String> KEY_306 = add(new BlockKey<>("428", StringReader::new));
	//	public static final BlockKey<String> KEY_307 = add(new BlockKey<>("430", StringReader::new));
	//	public static final BlockKey<String> KEY_308 = add(new BlockKey<>("432", StringReader::new));
	//	public static final BlockKey<String> KEY_309 = add(new BlockKey<>("433", StringReader::new));
	//	public static final BlockKey<String> KEY_310 = add(new BlockKey<>("435", StringReader::new));
	//	public static final BlockKey<String> KEY_311 = add(new BlockKey<>("436", StringReader::new));
	//	public static final BlockKey<String> KEY_312 = add(new BlockKey<>("437", StringReader::new));
	//	public static final BlockKey<String> KEY_313 = add(new BlockKey<>("438", StringReader::new));
	//	public static final BlockKey<String> KEY_314 = add(new BlockKey<>("440", StringReader::new));
	//	public static final BlockKey<String> KEY_315 = add(new BlockKey<>("441", StringReader::new));
	//	public static final BlockKey<String> KEY_316 = add(new BlockKey<>("442", StringReader::new));
	//	public static final BlockKey<String> KEY_317 = add(new BlockKey<>("444", StringReader::new));
	//	public static final BlockKey<String> KEY_318 = add(new BlockKey<>("445", StringReader::new));
	//	public static final BlockKey<String> KEY_319 = add(new BlockKey<>("446", StringReader::new));
	//	public static final BlockKey<String> KEY_320 = add(new BlockKey<>("447", StringReader::new));
	//	public static final BlockKey<String> KEY_321 = add(new BlockKey<>("448", StringReader::new));
	//	public static final BlockKey<String> KEY_322 = add(new BlockKey<>("449", StringReader::new));
	//	public static final BlockKey<String> KEY_323 = add(new BlockKey<>("452", StringReader::new));
	//	public static final BlockKey<String> KEY_324 = add(new BlockKey<>("453", StringReader::new));
	//	public static final BlockKey<String> KEY_325 = add(new BlockKey<>("454", StringReader::new));
	//	public static final BlockKey<String> KEY_326 = add(new BlockKey<>("455", StringReader::new));
	//	public static final BlockKey<String> KEY_327 = add(new BlockKey<>("456", StringReader::new));
	//	public static final BlockKey<String> KEY_328 = add(new BlockKey<>("457", StringReader::new));
	//	public static final BlockKey<String> KEY_329 = add(new BlockKey<>("458", StringReader::new));
	//	public static final BlockKey<String> KEY_330 = add(new BlockKey<>("459", StringReader::new));
	//	public static final BlockKey<String> KEY_331 = add(new BlockKey<>("460", StringReader::new));
	//	public static final BlockKey<String> KEY_332 = add(new BlockKey<>("461", StringReader::new));
	//	public static final BlockKey<String> KEY_333 = add(new BlockKey<>("462", StringReader::new));
	//	public static final BlockKey<String> KEY_334 = add(new BlockKey<>("463", StringReader::new));
	//	public static final BlockKey<String> KEY_335 = add(new BlockKey<>("464", StringReader::new));
	//	public static final BlockKey<String> KEY_336 = add(new BlockKey<>("465", StringReader::new));
	//	public static final BlockKey<String> KEY_337 = add(new BlockKey<>("466", StringReader::new));
	//	public static final BlockKey<String> KEY_338 = add(new BlockKey<>("467", StringReader::new));
	//	public static final BlockKey<String> KEY_339 = add(new BlockKey<>("470", StringReader::new));
	//	public static final BlockKey<String> KEY_340 = add(new BlockKey<>("471", StringReader::new));
	//	public static final BlockKey<String> KEY_341 = add(new BlockKey<>("472", StringReader::new));
	//	public static final BlockKey<String> KEY_342 = add(new BlockKey<>("473", StringReader::new));
	//	public static final BlockKey<String> KEY_343 = add(new BlockKey<>("474", StringReader::new));
	//	public static final BlockKey<String> KEY_344 = add(new BlockKey<>("475", StringReader::new));
	//	public static final BlockKey<String> KEY_345 = add(new BlockKey<>("476", StringReader::new));
	//	public static final BlockKey<String> KEY_346 = add(new BlockKey<>("477", StringReader::new));
	//	public static final BlockKey<String> KEY_347 = add(new BlockKey<>("478", StringReader::new));
	//	public static final BlockKey<String> KEY_348 = add(new BlockKey<>("479", StringReader::new));
	//	public static final BlockKey<String> KEY_349 = add(new BlockKey<>("480", StringReader::new));
	//	public static final BlockKey<String> KEY_350 = add(new BlockKey<>("481", StringReader::new));
	//	public static final BlockKey<String> KEY_351 = add(new BlockKey<>("482", StringReader::new));
	//	public static final BlockKey<String> KEY_352 = add(new BlockKey<>("483", StringReader::new));
	//	public static final BlockKey<String> KEY_353 = add(new BlockKey<>("487", StringReader::new));
	//	public static final BlockKey<String> KEY_354 = add(new BlockKey<>("488", StringReader::new));
	//	public static final BlockKey<String> KEY_355 = add(new BlockKey<>("489", StringReader::new));
	//	public static final BlockKey<String> KEY_356 = add(new BlockKey<>("490", StringReader::new));
	//	public static final BlockKey<String> KEY_357 = add(new BlockKey<>("491", StringReader::new));
	//	public static final BlockKey<String> KEY_358 = add(new BlockKey<>("494", StringReader::new));
	//	public static final BlockKey<String> KEY_359 = add(new BlockKey<>("495", StringReader::new));
	//	public static final BlockKey<String> KEY_360 = add(new BlockKey<>("498", StringReader::new));
	//	public static final BlockKey<String> KEY_361 = add(new BlockKey<>("501", StringReader::new));
	//	public static final BlockKey<String> KEY_362 = add(new BlockKey<>("502", StringReader::new));
	//	public static final BlockKey<String> KEY_363 = add(new BlockKey<>("503", StringReader::new));
	//	public static final BlockKey<String> KEY_364 = add(new BlockKey<>("504", StringReader::new));
	//	public static final BlockKey<String> KEY_365 = add(new BlockKey<>("506", StringReader::new));
	//	public static final BlockKey<String> KEY_366 = add(new BlockKey<>("507", StringReader::new));
	//	public static final BlockKey<String> KEY_367 = add(new BlockKey<>("508", StringReader::new));
	//	public static final BlockKey<String> KEY_368 = add(new BlockKey<>("509", StringReader::new));
	//	public static final BlockKey<String> KEY_369 = add(new BlockKey<>("511", StringReader::new));
	//	public static final BlockKey<String> KEY_370 = add(new BlockKey<>("512", StringReader::new));
	//	public static final BlockKey<String> KEY_371 = add(new BlockKey<>("513", StringReader::new));
	//	public static final BlockKey<String> KEY_372 = add(new BlockKey<>("514", StringReader::new));
	//	public static final BlockKey<String> KEY_373 = add(new BlockKey<>("515", StringReader::new));
	//	public static final BlockKey<String> KEY_374 = add(new BlockKey<>("516", StringReader::new));
	//	public static final BlockKey<String> KEY_375 = add(new BlockKey<>("517", StringReader::new));
	//	public static final BlockKey<String> KEY_376 = add(new BlockKey<>("518", StringReader::new));
	//	public static final BlockKey<String> KEY_377 = add(new BlockKey<>("519", StringReader::new));
	//	public static final BlockKey<String> KEY_378 = add(new BlockKey<>("520", StringReader::new));
	//	public static final BlockKey<String> KEY_379 = add(new BlockKey<>("521", StringReader::new));
	//	public static final BlockKey<String> KEY_380 = add(new BlockKey<>("522", StringReader::new));
	//	public static final BlockKey<String> KEY_381 = add(new BlockKey<>("523", StringReader::new));
	//	public static final BlockKey<String> KEY_382 = add(new BlockKey<>("524", StringReader::new));
	//	public static final BlockKey<String> KEY_383 = add(new BlockKey<>("525", StringReader::new));
	//	public static final BlockKey<String> KEY_384 = add(new BlockKey<>("526", StringReader::new));
	//	public static final BlockKey<String> KEY_385 = add(new BlockKey<>("527", StringReader::new));
	//	public static final BlockKey<String> KEY_386 = add(new BlockKey<>("528", StringReader::new));
	//	public static final BlockKey<String> KEY_387 = add(new BlockKey<>("530", StringReader::new));
	//	public static final BlockKey<String> KEY_388 = add(new BlockKey<>("531", StringReader::new));
	//	public static final BlockKey<String> KEY_389 = add(new BlockKey<>("532", StringReader::new));
	//	public static final BlockKey<String> KEY_390 = add(new BlockKey<>("533", StringReader::new));
	//	public static final BlockKey<String> KEY_391 = add(new BlockKey<>("537", StringReader::new));
	//	public static final BlockKey<String> KEY_392 = add(new BlockKey<>("538", StringReader::new));
	//	public static final BlockKey<String> KEY_393 = add(new BlockKey<>("539", StringReader::new));
	//	public static final BlockKey<String> KEY_394 = add(new BlockKey<>("540", StringReader::new));
	//	public static final BlockKey<String> KEY_395 = add(new BlockKey<>("541", StringReader::new));
	//	public static final BlockKey<String> KEY_396 = add(new BlockKey<>("542", StringReader::new));
	//	public static final BlockKey<String> KEY_397 = add(new BlockKey<>("543", StringReader::new));
	//	public static final BlockKey<String> KEY_398 = add(new BlockKey<>("544", StringReader::new));
	//	public static final BlockKey<String> KEY_399 = add(new BlockKey<>("545", StringReader::new));
	//	public static final BlockKey<String> KEY_400 = add(new BlockKey<>("546", StringReader::new));
	//	public static final BlockKey<String> KEY_401 = add(new BlockKey<>("547", StringReader::new));
	//	public static final BlockKey<String> KEY_402 = add(new BlockKey<>("548", StringReader::new));
	//	public static final BlockKey<String> KEY_403 = add(new BlockKey<>("551", StringReader::new));
	//	public static final BlockKey<String> KEY_404 = add(new BlockKey<>("552", StringReader::new));
	//	public static final BlockKey<String> KEY_405 = add(new BlockKey<>("554", StringReader::new));
	//	public static final BlockKey<String> KEY_406 = add(new BlockKey<>("555", StringReader::new));
	//	public static final BlockKey<String> KEY_407 = add(new BlockKey<>("556", StringReader::new));
	//	public static final BlockKey<String> KEY_408 = add(new BlockKey<>("557", StringReader::new));
	//	public static final BlockKey<String> KEY_409 = add(new BlockKey<>("558", StringReader::new));
	//	public static final BlockKey<String> KEY_410 = add(new BlockKey<>("563", StringReader::new));
	//	public static final BlockKey<String> KEY_411 = add(new BlockKey<>("566", StringReader::new));
	//	public static final BlockKey<String> KEY_412 = add(new BlockKey<>("568", StringReader::new));
	//	public static final BlockKey<String> KEY_413 = add(new BlockKey<>("572", StringReader::new));
	//	public static final BlockKey<String> KEY_414 = add(new BlockKey<>("573", StringReader::new));
	//	public static final BlockKey<String> KEY_415 = add(new BlockKey<>("574", StringReader::new));
	//	public static final BlockKey<String> KEY_416 = add(new BlockKey<>("575", StringReader::new));
	//	public static final BlockKey<String> KEY_417 = add(new BlockKey<>("576", StringReader::new));
	//	public static final BlockKey<String> KEY_418 = add(new BlockKey<>("577", StringReader::new));
	//	public static final BlockKey<String> KEY_419 = add(new BlockKey<>("580", StringReader::new));
	//	public static final BlockKey<String> KEY_420 = add(new BlockKey<>("581", StringReader::new));
	//	public static final BlockKey<String> KEY_421 = add(new BlockKey<>("582", StringReader::new));
	//	public static final BlockKey<String> KEY_422 = add(new BlockKey<>("583", StringReader::new));
	//	public static final BlockKey<String> KEY_423 = add(new BlockKey<>("584", StringReader::new));
	//	public static final BlockKey<String> KEY_424 = add(new BlockKey<>("586", StringReader::new));
	//	public static final BlockKey<String> KEY_425 = add(new BlockKey<>("588", StringReader::new));
	//	public static final BlockKey<String> KEY_426 = add(new BlockKey<>("590", StringReader::new));
	//	public static final BlockKey<String> KEY_427 = add(new BlockKey<>("592", StringReader::new));

	// WTF ??????
	public static final BlockKey<String> KEY_428 = add(new BlockKey<>("99]", "", StringReader::new));

	public static final BlockKey<String> KEY_429 = add(new BlockKey<>("kA2", "", StringReader::new));
	public static final BlockKey<String> KEY_430 = add(new BlockKey<>("kA3", "", StringReader::new));
	public static final BlockKey<String> KEY_431 = add(new BlockKey<>("kA4", "", StringReader::new));
	public static final BlockKey<String> KEY_432 = add(new BlockKey<>("kA8", "", StringReader::new));
	public static final BlockKey<String> KEY_433 = add(new BlockKey<>("kA9", "", StringReader::new));
	public static final BlockKey<String> KEY_434 = add(new BlockKey<>("kA10", "", StringReader::new));
	public static final BlockKey<String> KEY_435 = add(new BlockKey<>("kA11", "", StringReader::new));
	public static final BlockKey<String> KEY_436 = add(new BlockKey<>("kA19", "", StringReader::new));
	public static final BlockKey<String> KEY_437 = add(new BlockKey<>("kA20", "", StringReader::new));
	public static final BlockKey<String> KEY_438 = add(new BlockKey<>("kA21", "", StringReader::new));
	public static final BlockKey<String> KEY_439 = add(new BlockKey<>("kA22", "", StringReader::new));
	public static final BlockKey<String> KEY_440 = add(new BlockKey<>("kA23", "", StringReader::new));
	public static final BlockKey<String> KEY_441 = add(new BlockKey<>("kA24", "", StringReader::new));
	public static final BlockKey<String> KEY_442 = add(new BlockKey<>("kA26", "", StringReader::new));
	public static final BlockKey<String> KEY_443 = add(new BlockKey<>("kA27", "", StringReader::new));
	public static final BlockKey<String> KEY_444 = add(new BlockKey<>("kA28", "", StringReader::new));
	public static final BlockKey<String> KEY_445 = add(new BlockKey<>("kA29", "", StringReader::new));
	public static final BlockKey<String> KEY_446 = add(new BlockKey<>("kA31", "", StringReader::new));
	public static final BlockKey<String> KEY_447 = add(new BlockKey<>("kA32", "", StringReader::new));
	public static final BlockKey<String> KEY_448 = add(new BlockKey<>("kA33", "", StringReader::new));
	public static final BlockKey<String> KEY_449 = add(new BlockKey<>("kA34", "", StringReader::new));
	public static final BlockKey<String> KEY_450 = add(new BlockKey<>("kA35", "", StringReader::new));
	public static final BlockKey<String> KEY_451 = add(new BlockKey<>("kA36", "", StringReader::new));
	public static final BlockKey<String> KEY_452 = add(new BlockKey<>("kA37", "", StringReader::new));
	public static final BlockKey<String> KEY_453 = add(new BlockKey<>("kA38", "", StringReader::new));
	public static final BlockKey<String> KEY_454 = add(new BlockKey<>("kA39", "", StringReader::new));
	public static final BlockKey<String> KEY_455 = add(new BlockKey<>("kA40", "", StringReader::new));
	public static final BlockKey<String> KEY_456 = add(new BlockKey<>("kA41", "", StringReader::new));
	public static final BlockKey<String> KEY_457 = add(new BlockKey<>("kA42", "", StringReader::new));
	public static final BlockKey<String> KEY_458 = add(new BlockKey<>("kA43", "", StringReader::new));
	public static final BlockKey<String> KEY_459 = add(new BlockKey<>("kA44", "", StringReader::new));
	public static final BlockKey<String> KEY_460 = add(new BlockKey<>("kA45", "", StringReader::new));
	public static final BlockKey<String> KEY_461 = add(new BlockKey<>("kA46", "", StringReader::new));


	public static Color readColor(Map<BlockKey<?>, String> data) {
		return new Color(
				RED_COLOR.read(data),
				GREEN_COLOR.read(data),
				BLUE_COLOR.read(data)
		);
	}

	public static void writeColor(Map<BlockKey<?>, String> data, Color color) {
		RED_COLOR.write(data, color.getRed());
		GREEN_COLOR.write(data, color.getGreen());
		BLUE_COLOR.write(data, color.getBlue());
	}
}
