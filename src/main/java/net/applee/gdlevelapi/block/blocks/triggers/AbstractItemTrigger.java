package net.applee.gdlevelapi.block.blocks.triggers;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.block.blocks.SpawnableTrigger;
import net.applee.gdlevelapi.block.key.BlockKeys;
import net.applee.gdlevelapi.block.key.BlockProperty;

@Getter
@Setter
public abstract class AbstractItemTrigger extends SpawnableTrigger {

	protected final BlockProperty<Integer>            firstItem           = property(BlockKeys.ITEM_ID);
	protected final BlockProperty<Integer>            secondItem          = property(BlockKeys.ITEM_ID_TWO);
	protected final BlockProperty<ItemMode>           firstItemMode       = property(BlockKeys.FIRST_ITEM_MODE);
	protected final BlockProperty<ItemMode>           secondItemMode      = property(BlockKeys.SECOND_ITEM_MODE);
	protected final BlockProperty<Double>             itemModifier        = property(BlockKeys.ITEM_MODIFIER);
	protected final BlockProperty<OperationType>      operation1          = property(BlockKeys.OPERATION_TYPE_1);
	protected final BlockProperty<OperationType>      operation2          = property(BlockKeys.OPERATION_TYPE_2);
	protected final BlockProperty<FirstFunctionType>  firstItemFunction1  = property(BlockKeys.FIRST_FUNCTION_TYPE_1);
	protected final BlockProperty<FirstFunctionType>  secondItemFunction1 = property(BlockKeys.FIRST_FUNCTION_TYPE_2);
	protected final BlockProperty<SecondFunctionType> firstItemFunction2  = property(BlockKeys.SECOND_FUNCTION_TYPE_1);
	protected final BlockProperty<SecondFunctionType> secondItemFunction2 = property(BlockKeys.SECOND_FUNCTION_TYPE_2);

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
