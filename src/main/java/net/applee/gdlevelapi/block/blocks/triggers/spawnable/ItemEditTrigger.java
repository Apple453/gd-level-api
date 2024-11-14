
package net.applee.gdlevelapi.block.blocks.triggers.spawnable;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.block.blocks.triggers.AbstractItemTrigger;
import net.applee.gdlevelapi.block.key.BlockKeys;
import net.applee.gdlevelapi.block.key.BlockProperty;

@Getter
@Setter
public class ItemEditTrigger extends AbstractItemTrigger {

	private final   BlockProperty<ItemMode>      targetItemMode = property(BlockKeys.TARGET_ITEM_MODE);
	protected final BlockProperty<OperationType> operation3     = property(BlockKeys.OPERATION_TYPE_3);
	protected final BlockProperty<Integer>       targetItem     = property(BlockKeys.GROUP_ID);

}
