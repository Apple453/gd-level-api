
package net.applee.gdlevelapi.block.blocks.triggers.spawnable;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.block.blocks.triggers.AbstractItemTrigger;
import net.applee.gdlevelapi.block.key.BlockKeys;
import net.applee.gdlevelapi.block.key.BlockProperty;

@Getter
@Setter
public class ItemCompareTrigger extends AbstractItemTrigger {

	protected final BlockProperty<Double>          itemModifier2 = property(BlockKeys.ITEM_MODIFIER_TWO);
	protected final BlockProperty<ComparationType> comparation   = property(BlockKeys.COMPARATION_TYPE);
	protected final BlockProperty<Double>          tol           = property(BlockKeys.TOL);
	protected final BlockProperty<Integer>         falseGroup    = property(BlockKeys.TARGET_GROUP_ID);
	protected final BlockProperty<Integer>         trueGroup     = property(BlockKeys.GROUP_ID);

	public enum ComparationType {
		EQUALS,
		BIGGER,
		BIGGER_EQUALS,
		LOWER,
		LOWER_EQUALS,
		NON_EQUALS
	}
}
