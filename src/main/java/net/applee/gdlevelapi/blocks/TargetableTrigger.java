package net.applee.gdlevelapi.blocks;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.key.containers.BlockKeys;
import net.applee.gdlevelapi.key.Property;

@Getter
@Setter
public abstract class TargetableTrigger extends SpawnableTrigger {

	protected final Property<Integer> groupId = property(BlockKeys.GROUP_ID);

}
