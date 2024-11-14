package net.applee.gdlevelapi.objects;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.applee.gdlevelapi.BlockPropertyContainer;
import net.applee.gdlevelapi.block.key.BlockKeys;
import net.applee.gdlevelapi.block.key.BlockProperty;

@Getter
@Setter
@ToString
public class ExtraSettings extends BlockPropertyContainer {

	private final BlockProperty<Boolean> dontFade          = property(BlockKeys.DONT_FADE);
	private final BlockProperty<Boolean> dontEnter         = property(BlockKeys.DONT_ENTER);
	private final BlockProperty<Boolean> noEffects         = property(BlockKeys.NO_EFFECTS);
	private final BlockProperty<Boolean> groupParent       = property(BlockKeys.GROUP_PARENT);
	private final BlockProperty<Boolean> areaParent        = property(BlockKeys.AREA_PARENT);
	private final BlockProperty<Boolean> dontBoostX        = property(BlockKeys.DONT_BOOST_X);
	private final BlockProperty<Boolean> dontBoostY        = property(BlockKeys.DONT_BOOST_Y);
	private final BlockProperty<Boolean> singlePTouch      = property(BlockKeys.SINGLE_P_TOUCH);
	private final BlockProperty<Boolean> highDetail        = property(BlockKeys.HIGH_DETAIL);
	private final BlockProperty<Boolean> noTouch           = property(BlockKeys.NO_TOUCH);
	private final BlockProperty<Boolean> passable          = property(BlockKeys.PASSABLE);
	private final BlockProperty<Boolean> hide              = property(BlockKeys.HIDE);
	private final BlockProperty<Boolean> nonStickX         = property(BlockKeys.NON_STICK_X);
	private final BlockProperty<Boolean> nonStickY         = property(BlockKeys.NON_STICK_Y);
	private final BlockProperty<Boolean> extraSticky       = property(BlockKeys.EXTRA_STICKY);
	private final BlockProperty<Boolean> extendedCollision = property(BlockKeys.EXTENDED_COLLISION);
	private final BlockProperty<Boolean> centerEffect      = property(BlockKeys.CENTER_EFFECT);
	private final BlockProperty<Boolean> iceBlock          = property(BlockKeys.ICE_BLOCK);
	private final BlockProperty<Boolean> gripSlope         = property(BlockKeys.GRIP_SLOPE);
	private final BlockProperty<Boolean> noGlow            = property(BlockKeys.NO_GLOW);
	private final BlockProperty<Boolean> noParticle        = property(BlockKeys.NO_PARTICLE);
	private final BlockProperty<Boolean> scaleStick        = property(BlockKeys.SCALE_STICK);
	private final BlockProperty<Boolean> noAudioScale      = property(BlockKeys.NO_AUDIO_SCALE);
}
