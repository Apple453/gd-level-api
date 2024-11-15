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
public class ExtraSettingsTwo extends PropertyContainer {

	private final Property<Integer> enterChannel = property(BlockKeys.ENTER_CHANNEL);
	private final Property<Integer> material     = property(BlockKeys.MATERIAL);
	private final Property<Integer> controlId    = property(BlockKeys.CONTROL_ID);

}
