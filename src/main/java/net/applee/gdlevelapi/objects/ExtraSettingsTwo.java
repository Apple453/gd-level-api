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
public class ExtraSettingsTwo extends BlockPropertyContainer {

	private final BlockProperty<Integer> enterChannel = property(BlockKeys.ENTER_CHANNEL);
	private final BlockProperty<Integer> material     = property(BlockKeys.MATERIAL);
	private final BlockProperty<Integer> controlId    = property(BlockKeys.CONTROL_ID);

}
