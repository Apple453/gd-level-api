package net.applee.gdlevelapi.block.key;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;
import java.util.Objects;

@Getter
@Setter
public class BlockProperty<T> {

	private T           value;
	private BlockKey<T> key;

	public BlockProperty(BlockKey<T> key) {
		this.key = key;
	}

	public void read(Map<BlockKey<?>, String> data) {
		if (key != null)
			value = key.read(data);
	}

	@Override
	public String toString() {
		return value == null ? null : value.toString();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object)
			return true;
		if (!(object instanceof BlockProperty))
			return false;
		BlockProperty<?> blockProperty1 = (BlockProperty<?>) object;
		return Objects.equals(value, blockProperty1.value) && Objects.equals(key, blockProperty1.key);
	}

	@Override
	public int hashCode() {
		return Objects.hash(value, key);
	}
}
