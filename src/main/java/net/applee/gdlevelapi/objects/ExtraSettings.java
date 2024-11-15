package net.applee.gdlevelapi.objects;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.applee.gdlevelapi.PropertyContainer;
import net.applee.gdlevelapi.key.Property;
import net.applee.gdlevelapi.key.containers.BlockKeys;

@Getter
@Setter
@ToString
public class ExtraSettings extends PropertyContainer {

	private final Property<Boolean> dontFade          = property(BlockKeys.DONT_FADE);
	private final Property<Boolean> dontEnter         = property(BlockKeys.DONT_ENTER);
	private final Property<Boolean> noEffects         = property(BlockKeys.NO_EFFECTS);
	private final Property<Boolean> groupParent       = property(BlockKeys.GROUP_PARENT);
	private final Property<Boolean> areaParent        = property(BlockKeys.AREA_PARENT);
	private final Property<Boolean> dontBoostX        = property(BlockKeys.DONT_BOOST_X);
	private final Property<Boolean> dontBoostY        = property(BlockKeys.DONT_BOOST_Y);
	private final Property<Boolean> singlePTouch      = property(BlockKeys.SINGLE_P_TOUCH);
	private final Property<Boolean> highDetail        = property(BlockKeys.HIGH_DETAIL);
	private final Property<Boolean> noTouch           = property(BlockKeys.NO_TOUCH);
	private final Property<Boolean> passable          = property(BlockKeys.PASSABLE);
	private final Property<Boolean> hide              = property(BlockKeys.HIDE);
	private final Property<Boolean> nonStickX         = property(BlockKeys.NON_STICK_X);
	private final Property<Boolean> nonStickY         = property(BlockKeys.NON_STICK_Y);
	private final Property<Boolean> extraSticky       = property(BlockKeys.EXTRA_STICKY);
	private final Property<Boolean> extendedCollision = property(BlockKeys.EXTENDED_COLLISION);
	private final Property<Boolean> centerEffect      = property(BlockKeys.CENTER_EFFECT);
	private final Property<Boolean> iceBlock          = property(BlockKeys.ICE_BLOCK);
	private final Property<Boolean> gripSlope         = property(BlockKeys.GRIP_SLOPE);
	private final Property<Boolean> noGlow            = property(BlockKeys.NO_GLOW);
	private final Property<Boolean> noParticle        = property(BlockKeys.NO_PARTICLE);
	private final Property<Boolean> scaleStick        = property(BlockKeys.SCALE_STICK);
	private final Property<Boolean> noAudioScale      = property(BlockKeys.NO_AUDIO_SCALE);
}
