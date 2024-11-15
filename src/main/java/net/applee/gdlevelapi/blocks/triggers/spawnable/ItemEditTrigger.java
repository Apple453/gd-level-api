
package net.applee.gdlevelapi.blocks.triggers.spawnable;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.blocks.triggers.AbstractItemTrigger;
import net.applee.gdlevelapi.key.Property;
import net.applee.gdlevelapi.key.containers.BlockKeys;

@Getter
@Setter
public class ItemEditTrigger extends AbstractItemTrigger {

	private final   Property<ItemMode>      targetItemMode = property(BlockKeys.TARGET_ITEM_MODE);
	protected final Property<OperationType> operation3     = property(BlockKeys.OPERATION_TYPE_3);
	protected final Property<Integer>       targetItem     = property(BlockKeys.GROUP_ID);

}
