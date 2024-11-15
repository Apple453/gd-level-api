
package net.applee.gdlevelapi.blocks.triggers.spawnable;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.blocks.triggers.AbstractItemTrigger;
import net.applee.gdlevelapi.key.Property;
import net.applee.gdlevelapi.key.containers.BlockKeys;

@Getter
@Setter
public class ItemCompareTrigger extends AbstractItemTrigger {

	protected final Property<Double>          itemModifier2 = property(BlockKeys.ITEM_MODIFIER_TWO);
	protected final Property<ComparationType> comparation   = property(BlockKeys.COMPARATION_TYPE);
	protected final Property<Double>          tol           = property(BlockKeys.TOL);
	protected final Property<Integer>         falseGroup    = property(BlockKeys.TARGET_GROUP_ID);
	protected final Property<Integer>         trueGroup     = property(BlockKeys.GROUP_ID);

	public enum ComparationType {
		EQUALS,
		BIGGER,
		BIGGER_EQUALS,
		LOWER,
		LOWER_EQUALS,
		NON_EQUALS
	}
}
