package net.applee.gdlevelapi.key;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;
import java.util.Objects;

@Getter
@Setter
public class Property<T> {

	private T      value;
	private Key<T> key;

	public Property(Key<T> key) {
		this.key = key;
	}

	public void read(Map<Key<?>, String> data) {
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
		if (!(object instanceof Property))
			return false;
		Property<?> property1 = (Property<?>) object;
		return Objects.equals(value, property1.value) && Objects.equals(key, property1.key);
	}

	@Override
	public int hashCode() {
		return Objects.hash(value, key);
	}
}
