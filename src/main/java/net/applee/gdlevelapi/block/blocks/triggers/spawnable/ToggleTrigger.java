
package net.applee.gdlevelapi.block.blocks.triggers.spawnable;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.block.key.BlockKeys;
import net.applee.gdlevelapi.block.key.BlockProperty;
import net.applee.gdlevelapi.block.blocks.TargetableTrigger;

@Getter
@Setter
public class ToggleTrigger extends TargetableTrigger {

	private final BlockProperty<Boolean> activateGroup = property(BlockKeys.ACTIVATE_GROUP);
}
