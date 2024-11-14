package net.applee.gdlevelapi.block.blocks;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.block.key.BlockKeys;
import net.applee.gdlevelapi.block.key.BlockProperty;

@Getter
@Setter
public abstract class TargetableTrigger extends SpawnableTrigger {

	protected final BlockProperty<Integer> groupId = property(BlockKeys.GROUP_ID);

}
