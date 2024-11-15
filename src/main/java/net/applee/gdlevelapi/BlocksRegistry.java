package net.applee.gdlevelapi;

import lombok.Getter;
import net.applee.gdlevelapi.blocks.Block;
import net.applee.gdlevelapi.blocks.Unknown;
import net.applee.gdlevelapi.blocks.triggers.*;
import net.applee.gdlevelapi.blocks.triggers.spawnable.*;
import net.applee.gdlevelapi.blocks.triggers.spawnable.todo.*;
import net.applee.gdlevelapi.blocks.triggers.spawnable.todo.effects.block_enter.*;
import net.applee.gdlevelapi.blocks.triggers.spawnable.todo.effects.enter.*;
import net.applee.gdlevelapi.key.containers.BlockKeys;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class BlocksRegistry {

	private static final List<RegistryBlock<? extends Block>> REGISTRY = new ArrayList<>();

	@Getter
	private static int lastId = -1;

	private static boolean initialized = false;

	private static void registerBlocks() {
		register(StartPosTrigger.class, StartPosTrigger::new, 31);
		register(SetupKeyframeTrigger.class, SetupKeyframeTrigger::new, 3032);
		register(CameraGuideTrigger.class, CameraGuideTrigger::new, 2016);
		register(ItemLabelTrigger.class, ItemLabelTrigger::new, 1615);
		register(UISettingsTrigger.class, UISettingsTrigger::new, 3613);
		register(VisibleLinkTrigger.class, VisibleLinkTrigger::new, 3662);
		register(CollisionStateTrigger.class, CollisionStateTrigger::new, 3640);
		register(CollisionBlockTrigger.class, CollisionBlockTrigger::new, 1816);
		register(ToggleBlockTrigger.class, ToggleBlockTrigger::new, 3643);
		register(BPMTrigger.class, BPMTrigger::new, 3642);
		register(ColorTrigger.class, ColorTrigger::new, 899);
		register(MoveTrigger.class, MoveTrigger::new, 901);
		register(StopTrigger.class, StopTrigger::new, 1616);
		register(PulseTrigger.class, PulseTrigger::new, 1006);
		register(AlphaTrigger.class, AlphaTrigger::new, 1007);
		register(ToggleTrigger.class, ToggleTrigger::new, 1049);
		register(SpawnTrigger.class, SpawnTrigger::new, 1268);
		register(RotateTrigger.class, RotateTrigger::new, 1346);
		register(ScaleTrigger.class, ScaleTrigger::new, 2067);
		register(FollowTrigger.class, FollowTrigger::new, 1347);
		register(ShakeTrigger.class, ShakeTrigger::new, 1520);
		register(AnimateTrigger.class, AnimateTrigger::new, 1585);
		register(KeyframeTrigger.class, KeyframeTrigger::new, 3033);
		register(FollowPlayerYTrigger.class, FollowPlayerYTrigger::new, 1814);
		register(AdvancedFollowTrigger.class, AdvancedFollowTrigger::new, 3016);
		register(EditAdvFollowTrigger.class, EditAdvFollowTrigger::new, 3660);
		register(ReTargetAdvFollowTrigger.class, ReTargetAdvFollowTrigger::new, 3661);
		register(AreaMoveTrigger.class, AreaMoveTrigger::new, 3006);
		register(AreaRotateTrigger.class, AreaRotateTrigger::new, 3007);
		register(AreaScaleTrigger.class, AreaScaleTrigger::new, 3008);
		register(AreaFadeTrigger.class, AreaFadeTrigger::new, 3009);
		register(AreaTintTrigger.class, AreaTintTrigger::new, 3010);
		register(EditAreaMoveTrigger.class, EditAreaMoveTrigger::new, 3011);
		register(EditAreaRotateTrigger.class, EditAreaRotateTrigger::new, 3012);
		register(EditAreaScaleTrigger.class, EditAreaScaleTrigger::new, 3013);
		register(EditAreaFadeTrigger.class, EditAreaFadeTrigger::new, 3014);
		register(EditAreaTintTrigger.class, EditAreaTintTrigger::new, 3015);
		register(AreaStopTrigger.class, AreaStopTrigger::new, 3024);
		register(BakgroundTrigger.class, BakgroundTrigger::new, 3029);
		register(GroundTrigger.class, GroundTrigger::new, 3030);
		register(MiddleGroundTrigger.class, MiddleGroundTrigger::new, 3031);
		register(TouchTrigger.class, TouchTrigger::new, 1595);
		register(CountTrigger.class, CountTrigger::new, 1611);
		register(InstantCountTrigger.class, InstantCountTrigger::new, 1811);
		register(PickupTrigger.class, PickupTrigger::new, 1817);
		register(TimeTrigger.class, TimeTrigger::new, 3614);
		register(EventTrigger.class, EventTrigger::new, 3615);
		register(ControlTrigger.class, ControlTrigger::new, 3617);
		register(ItemEditTrigger.class, ItemEditTrigger::new, 3619);
		register(ItemCompareTrigger.class, ItemCompareTrigger::new, 3620);
		register(ItemPersistentTrigger.class, ItemPersistentTrigger::new, 3641);
		register(RandomTrigger.class, RandomTrigger::new, 1912);
		register(AdvancedRandomTrigger.class, AdvancedRandomTrigger::new, 2068);
		register(SequenceTrigger.class, SequenceTrigger::new, 3607);
		register(SpawnParticleTrigger.class, SpawnParticleTrigger::new, 3608);
		register(ResetTrigger.class, ResetTrigger::new, 3618);
		register(ZoomCameraTrigger.class, ZoomCameraTrigger::new, 1913);
		register(StaticCameraTrigger.class, StaticCameraTrigger::new, 1914);
		register(OffsetCameraTrigger.class, OffsetCameraTrigger::new, 1916);
		register(RotateCameraTrigger.class, RotateCameraTrigger::new, 2015);
		register(EdgeCameraTrigger.class, EdgeCameraTrigger::new, 2062);
		register(CameraModeTrigger.class, CameraModeTrigger::new, 2925);
		register(ReverseTrigger.class, ReverseTrigger::new, 1917);
		register(RotateGameplayTrigger.class, RotateGameplayTrigger::new, 2900);
		register(OffsetGameplayTrigger.class, OffsetGameplayTrigger::new, 2901);
		register(SongTrigger.class, SongTrigger::new, 1934);
		register(EditSongTrigger.class, EditSongTrigger::new, 3605);
		register(SFXTrigger.class, SFXTrigger::new, 3602);
		register(EditSFXTrigger.class, EditSFXTrigger::new, 3603);
		register(EventLinkTrigger.class, EventLinkTrigger::new, 3604);
		register(TimeWarpTrigger.class, TimeWarpTrigger::new, 1935);
		register(MiddleGroundSettingsTrigger.class, MiddleGroundSettingsTrigger::new, 2999);
		register(BackgroundSpeedTrigger.class, BackgroundSpeedTrigger::new, 3606);
		register(MiddleGroundSpeedTrigger.class, MiddleGroundSpeedTrigger::new, 3612);
		register(CollisionTrigger.class, CollisionTrigger::new, 1815);
		register(InstantCollisionTrigger.class, InstantCollisionTrigger::new, 3609);
		register(OnDeathTrigger.class, OnDeathTrigger::new, 1812);
		register(EnableTrailTrigger.class, EnableTrailTrigger::new, 32);
		register(DisableTrailTrigger.class, DisableTrailTrigger::new, 33);
		register(HidePlayerTrigger.class, HidePlayerTrigger::new, 1612);
		register(ShowPlayerTrigger.class, ShowPlayerTrigger::new, 1613);
		register(EnableBackgroundEffectTrigger.class, EnableBackgroundEffectTrigger::new, 1818);
		register(DisableBackgroundEffectTrigger.class, DisableBackgroundEffectTrigger::new, 1819);
		register(EndTrigger.class, EndTrigger::new, 3600);
		register(PlayerControlTrigger.class, PlayerControlTrigger::new, 1932);
		register(OptionsTrigger.class, OptionsTrigger::new, 2899);
		register(GradientTrigger.class, GradientTrigger::new, 2903);
		register(GravityTrigger.class, GravityTrigger::new, 2066);
		register(TeleportTrigger.class, TeleportTrigger::new, 3022);
		register(ShaderEffectTrigger.class, ShaderEffectTrigger::new, 2904);
		register(ShockWaveEffectTrigger.class, ShockWaveEffectTrigger::new, 2905);
		register(ShockLineEffectTrigger.class, ShockLineEffectTrigger::new, 2907);
		register(GlitchEffectTrigger.class, GlitchEffectTrigger::new, 2909);
		register(ChromaticEffectTrigger.class, ChromaticEffectTrigger::new, 2910);
		register(ChromaticGlitchEffectTrigger.class, ChromaticGlitchEffectTrigger::new, 2911);
		register(PixelateEffectTrigger.class, PixelateEffectTrigger::new, 2912);
		register(LensEffectTrigger.class, LensEffectTrigger::new, 2913);
		register(RadialBlurEffectTrigger.class, RadialBlurEffectTrigger::new, 2914);
		register(MotionBlurEffectTrigger.class, MotionBlurEffectTrigger::new, 2915);
		register(BulgeEffectTrigger.class, BulgeEffectTrigger::new, 2916);
		register(PinchEffectTrigger.class, PinchEffectTrigger::new, 2917);
		register(GrayScaleEffectTrigger.class, GrayScaleEffectTrigger::new, 2919);
		register(SepiaEffectTrigger.class, SepiaEffectTrigger::new, 2920);
		register(InvertColorEffectTrigger.class, InvertColorEffectTrigger::new, 2921);
		register(HueEffectTrigger.class, HueEffectTrigger::new, 2922);
		register(EditColorEffectTrigger.class, EditColorEffectTrigger::new, 2923);
		register(SplitScreenEffectTrigger.class, SplitScreenEffectTrigger::new, 2924);
		register(EnterEffectTrigger_22.class, EnterEffectTrigger_22::new, 22);
		register(DownEnterEffectTrigger.class, DownEnterEffectTrigger::new, 23);
		register(UpEnterEffectTrigger.class, UpEnterEffectTrigger::new, 24);
		register(LeftEnterEffectTrigger.class, LeftEnterEffectTrigger::new, 25);
		register(RightEnterEffectTrigger.class, RightEnterEffectTrigger::new, 26);
		register(EnterEffectTrigger_27.class, EnterEffectTrigger_27::new, 27);
		register(EnterEffectTrigger_28.class, EnterEffectTrigger_28::new, 28);
		register(EnterEffectTrigger_55.class, EnterEffectTrigger_55::new, 55);
		register(EnterEffectTrigger_56.class, EnterEffectTrigger_56::new, 56);
		register(EnterEffectTrigger_57.class, EnterEffectTrigger_57::new, 57);
		register(EnterEffectTrigger_58.class, EnterEffectTrigger_58::new, 58);
		register(EnterEffectTrigger_59.class, EnterEffectTrigger_59::new, 59);
		register(EnterEffectTrigger_1915.class, EnterEffectTrigger_1915::new, 1915);
		register(MoveEnterEffectTrigger.class, MoveEnterEffectTrigger::new, 3017);
		register(RotateEnterEffectTrigger.class, RotateEnterEffectTrigger::new, 3018);
		register(ScaleEnterEffectTrigger.class, ScaleEnterEffectTrigger::new, 3019);
		register(FadeEnterEffectTrigger.class, FadeEnterEffectTrigger::new, 3020);
		register(TintEnterEffectTrigger.class, TintEnterEffectTrigger::new, 3021);
		register(StopEnterEffectTrigger.class, StopEnterEffectTrigger::new, 3023);
	}

	public static void init() {
		if (initialized)
			return;

		registerBlocks();

		initialized = true;
	}

	public static <T extends Block> void register(Class<T> blockClass, Supplier<T> blockFactory, int id) {
		REGISTRY.add(new RegistryBlock<>(id, blockClass, blockFactory));
	}

	public static Block create(Map<String, String> rawData) {
		init();

		String _id = rawData.get("1");
		if (_id == null) {
			lastId = -1;
			return null;
		}

		int id = Integer.parseInt(_id);

		Block block = create(id);
		if (block == null) {
			lastId = id;
			block = new Unknown();
		}

		block.readRawProperties(BlockKeys::byKey, rawData);
		return block;
	}

	public static Block create(int id) {
		init();

		for (var r : REGISTRY)
			if (r.id == id)
				return r.factory.get();

		return null;
	}

	public static <T extends Block> T create(Class<T> blockClass) {
		init();

		for (var r : REGISTRY)
			if (r.clazz == blockClass)
				return (T) r.factory.get();

		return null;
	}

	public static int getId(Class<? extends Block> blockClass) {
		init();

		int id = 0;

		for (var r : REGISTRY) {
			if (r.clazz == blockClass)
				return id;
			id++;
		}

		return -1;
	}

	private record RegistryBlock<T extends Block>(
			int id,
			Class<T> clazz,
			Supplier<T> factory
	) {}
}
