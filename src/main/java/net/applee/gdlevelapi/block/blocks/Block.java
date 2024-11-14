package net.applee.gdlevelapi.block.blocks;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.BlockPropertyContainer;
import net.applee.gdlevelapi.block.key.BlockKey;
import net.applee.gdlevelapi.block.key.BlockKeys;
import net.applee.gdlevelapi.block.key.BlockProperty;
import net.applee.gdlevelapi.objects.ExtraSettings;
import net.applee.gdlevelapi.objects.ExtraSettingsTwo;
import net.applee.gdlevelapi.objects.HSVContainer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public abstract class Block extends BlockPropertyContainer {

	public static final List<Integer> IDS = new ArrayList<>();

	protected final ExtraSettings    extraSettings    = new ExtraSettings();
	protected final ExtraSettingsTwo extraSettingsTwo = new ExtraSettingsTwo();

	protected final BlockProperty<List<Integer>> groups       = property(BlockKeys.GROUP_IDS);
	protected final BlockProperty<List<Integer>> pinkGroups   = property(BlockKeys.PINK_GROUP_IDS);
	protected final BlockProperty<Integer>       id           = property(BlockKeys.ID);
	protected final BlockProperty<Double>        posX         = property(BlockKeys.POS_X);
	protected final BlockProperty<Double>        posY         = property(BlockKeys.POS_Y);
	protected final BlockProperty<Double>        scaleX       = property(BlockKeys.SCALE_X);
	protected final BlockProperty<Double>        scaleY       = property(BlockKeys.SCALE_Y);
	protected final BlockProperty<Double>        offsetX      = property(BlockKeys.OFFSET_X);
	protected final BlockProperty<Double>        offsetY      = property(BlockKeys.OFFSET_Y);
	protected final BlockProperty<Double>        rotation     = property(BlockKeys.ROTATION);
	protected final BlockProperty<Integer>       editorL      = property(BlockKeys.EDITOR_L);
	protected final BlockProperty<Integer>       editorL2     = property(BlockKeys.EDITOR_L2);
	protected final BlockProperty<Integer>       zOrder       = property(BlockKeys.Z_ORDER);
	protected final BlockProperty<Integer>       zLayer       = property(BlockKeys.Z_LAYER);
	protected final BlockProperty<Integer>       order        = property(BlockKeys.ORDER);
	protected final BlockProperty<Integer>       channel      = property(BlockKeys.CHANNEL);
	protected final BlockProperty<HSVContainer>  hsv          = property(BlockKeys.BLOCK_HSV);
	protected final BlockProperty<Boolean>       hsvChanged   = property(BlockKeys.HSV_CHANGED);
	protected final BlockProperty<Boolean>       preview      = property(BlockKeys.PREVIEW);
	protected final BlockProperty<Integer>       colorChannel = property(BlockKeys.COLOR_CHANNEL);
	protected final BlockProperty<Boolean>       hasPreview   = property(BlockKeys.HAS_PREVIEW);

	@Override
	public void readProperties(Map<BlockKey<?>, String> data) {
		super.readProperties(data);

		extraSettings.readProperties(data);
		extraSettingsTwo.readProperties(data);

		groups.getValue().sort(Comparator.comparing(a -> a));
		pinkGroups.getValue().sort(Comparator.comparing(a -> a));
	}

	@Override
	public Map<BlockKey<?>, String> getProperties() {
		var props = super.getProperties();

		extraSettings.writeProperties(props);
		extraSettingsTwo.writeProperties(props);

		return props;
	}
}
