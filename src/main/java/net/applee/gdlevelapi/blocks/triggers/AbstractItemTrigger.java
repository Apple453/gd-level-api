package net.applee.gdlevelapi.blocks.triggers;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.blocks.SpawnableTrigger;
import net.applee.gdlevelapi.key.Property;
import net.applee.gdlevelapi.key.containers.BlockKeys;

@Getter
@Setter
public abstract class AbstractItemTrigger extends SpawnableTrigger {

	protected final Property<Integer>            firstItem           = property(BlockKeys.ITEM_ID);
	protected final Property<Integer>            secondItem          = property(BlockKeys.ITEM_ID_TWO);
	protected final Property<ItemMode>           firstItemMode       = property(BlockKeys.FIRST_ITEM_MODE);
	protected final Property<ItemMode>           secondItemMode      = property(BlockKeys.SECOND_ITEM_MODE);
	protected final Property<Double>             itemModifier        = property(BlockKeys.ITEM_MODIFIER);
	protected final Property<OperationType>      operation1          = property(BlockKeys.OPERATION_TYPE_1);
	protected final Property<OperationType>      operation2          = property(BlockKeys.OPERATION_TYPE_2);
	protected final Property<FirstFunctionType>  firstItemFunction1  = property(BlockKeys.FIRST_FUNCTION_TYPE_1);
	protected final Property<FirstFunctionType>  secondItemFunction1 = property(BlockKeys.FIRST_FUNCTION_TYPE_2);
	protected final Property<SecondFunctionType> firstItemFunction2  = property(BlockKeys.SECOND_FUNCTION_TYPE_1);
	protected final Property<SecondFunctionType> secondItemFunction2 = property(BlockKeys.SECOND_FUNCTION_TYPE_2);

	public enum FirstFunctionType {
		NONE,
		ABS,
		NEG
	}

	public enum SecondFunctionType {
		NONE,
		ROUND,
		FLOOR,
		CEIL
	}

	public enum ItemMode {
		NONE,
		ITEM,
		TIMER,
		POINTS,
		TIME,
		ATTEMPTS
	}

	public enum OperationType {
		SET,
		PLUS,
		MINUS,
		MULTIPLY,
		DIVIDE
	}
}
