package net.applee.gdlevelapi.blocks;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.PropertyContainer;
import net.applee.gdlevelapi.key.containers.BlockKeys;
import net.applee.gdlevelapi.key.Key;
import net.applee.gdlevelapi.key.Property;
import net.applee.gdlevelapi.objects.ExtraSettings;
import net.applee.gdlevelapi.objects.ExtraSettingsTwo;
import net.applee.gdlevelapi.objects.HSVContainer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public abstract class Block extends PropertyContainer {

	public static final List<Integer> IDS = new ArrayList<>();

	protected final ExtraSettings    extraSettings    = new ExtraSettings();
	protected final ExtraSettingsTwo extraSettingsTwo = new ExtraSettingsTwo();

	protected final Property<List<Integer>> groups       = property(BlockKeys.GROUP_IDS);
	protected final Property<List<Integer>> pinkGroups   = property(BlockKeys.PINK_GROUP_IDS);
	protected final Property<Integer>       id           = property(BlockKeys.ID);
	protected final Property<Double>        posX         = property(BlockKeys.POS_X);
	protected final Property<Double>        posY         = property(BlockKeys.POS_Y);
	protected final Property<Double>        scaleX       = property(BlockKeys.SCALE_X);
	protected final Property<Double>        scaleY       = property(BlockKeys.SCALE_Y);
	protected final Property<Double>        offsetX      = property(BlockKeys.OFFSET_X);
	protected final Property<Double>        offsetY      = property(BlockKeys.OFFSET_Y);
	protected final Property<Double>        rotation     = property(BlockKeys.ROTATION);
	protected final Property<Integer>       editorL      = property(BlockKeys.EDITOR_L);
	protected final Property<Integer>       editorL2     = property(BlockKeys.EDITOR_L2);
	protected final Property<Integer>       zOrder       = property(BlockKeys.Z_ORDER);
	protected final Property<Integer>       zLayer       = property(BlockKeys.Z_LAYER);
	protected final Property<Integer>       order        = property(BlockKeys.ORDER);
	protected final Property<Integer>       channel      = property(BlockKeys.CHANNEL);
	protected final Property<HSVContainer>  hsv          = property(BlockKeys.BLOCK_HSV);
	protected final Property<Boolean>       hsvChanged   = property(BlockKeys.HSV_CHANGED);
	protected final Property<Boolean>       preview      = property(BlockKeys.PREVIEW);
	protected final Property<Integer>       colorChannel = property(BlockKeys.COLOR_CHANNEL);
	protected final Property<Boolean>       hasPreview   = property(BlockKeys.HAS_PREVIEW);

	@Override
	public void readProperties(Map<Key<?>, String> data) {
		super.readProperties(data);

		extraSettings.readProperties(data);
		extraSettingsTwo.readProperties(data);

		groups.getValue().sort(Comparator.comparing(a -> a));
		pinkGroups.getValue().sort(Comparator.comparing(a -> a));
	}

	@Override
	public Map<Key<?>, String> getProperties() {
		var props = super.getProperties();

		extraSettings.writeProperties(props);
		extraSettingsTwo.writeProperties(props);

		return props;
	}
}
