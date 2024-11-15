
package net.applee.gdlevelapi.blocks.triggers.spawnable;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.blocks.TargetableTrigger;
import net.applee.gdlevelapi.key.Property;
import net.applee.gdlevelapi.key.containers.BlockKeys;

@Getter
@Setter
public class ToggleTrigger extends TargetableTrigger {

	private final Property<Boolean> activateGroup = property(BlockKeys.ACTIVATE_GROUP);
}
