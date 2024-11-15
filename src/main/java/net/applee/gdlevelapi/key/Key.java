package net.applee.gdlevelapi.key;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.readers.StringReader;
import net.applee.gdlevelapi.readers.ValueReader;

import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;

@Getter
@Setter
public class Key<T> {

	private String key;

	private String name;

	private final Supplier<ValueReader<T>> readerFactory;

	private final T           defaultValue;
	private final Supplier<T> defaultValueFactory;

	public Key(String key, Supplier<T> defaultValueFactory, Supplier<ValueReader<T>> readerFactory) {
		this.key = key;
		this.readerFactory = readerFactory;
		this.defaultValue = null;
		this.defaultValueFactory = defaultValueFactory;
	}

	public Key(String key, T defaultValue, Supplier<ValueReader<T>> readerFactory) {
		this.key = key;
		this.readerFactory = readerFactory;
		this.defaultValue = defaultValue;
		this.defaultValueFactory = null;
	}

	public T read(Map<Key<?>, String> data) {
		return read(data, defaultValueFactory == null ? defaultValue : defaultValueFactory.get());
	}

	public T read(Map<Key<?>, String> data, T defaultValue) {
		var value = data.get(this);
		if (value == null)
			return defaultValue;

		data.remove(this);

		return readerFactory.get().read(value);
	}

	public void write(Map<Key<?>, String> data, Object value) {
		data.put(this, readerFactory.get().convert((T) value));
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object)
			return true;
		if (!(object instanceof Key))
			return false;
		Key<?> blockKey = (Key<?>) object;
		return Objects.equals(key, blockKey.key) && Objects.equals(defaultValue, blockKey.defaultValue);
	}

	@Override
	public int hashCode() {
		return Objects.hash(key, defaultValue);
	}

	public static Key<String> unknownKey(String name) {
		return new Unknown(name);
	}

	public static class Unknown extends Key<String> {

		private Unknown(String key) {
			super(key, (String) null, StringReader::new);
			setName(key);
		}
	}
}
