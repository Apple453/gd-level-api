package net.applee.gdlevelapi.blocks;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.key.Property;
import net.applee.gdlevelapi.key.containers.BlockKeys;

@Getter
@Setter
public abstract class TargetableTrigger extends SpawnableTrigger {

	protected final Property<Integer> groupId = property(BlockKeys.GROUP_ID);

}
