package net.applee.gdlevelapi.block.key;

import lombok.Getter;
import lombok.Setter;
import net.applee.gdlevelapi.readers.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;

@Getter
public class BlockKey<T> {

	private static final List<BlockKey<?>> VALUES = new ArrayList<>();

	@Setter
	private       String                   key;
	private final Supplier<ValueReader<T>> readerFactory;

	private final T           defaultValue;
	private final Supplier<T> defaultValueFactory;

	public BlockKey(String key, Supplier<T> defaultValueFactory, Supplier<ValueReader<T>> readerFactory) {
		this.key = key;
		this.readerFactory = readerFactory;
		this.defaultValue = null;
		this.defaultValueFactory = defaultValueFactory;
	}

	public BlockKey(String key, T defaultValue, Supplier<ValueReader<T>> readerFactory) {
		this.key = key;
		this.readerFactory = readerFactory;
		this.defaultValue = defaultValue;
		this.defaultValueFactory = null;
	}

	public T read(Map<BlockKey<?>, String> data) {
		return read(data, defaultValueFactory == null ? defaultValue : defaultValueFactory.get());
	}

	public T read(Map<BlockKey<?>, String> data, T defaultValue) {
		var value = data.get(this);
		if (value == null)
			return defaultValue;

		data.remove(this);

		return readerFactory.get().read(value);
	}

	public void write(Map<BlockKey<?>, String> data, Object value) {
		data.put(this, readerFactory.get().convert((T) value));
	}

	@Override
	public String toString() {
		if (this instanceof Unknown unknown) {
			return unknown.getKey();
		}

		for (var f : BlockKeys.class.getDeclaredFields()) {
			try {
				if (f.get(BlockKeys.class) == this)
					return f.getName();
			}
			catch (IllegalAccessException e) {
				throw new RuntimeException(e);
			}
		}

		return "";
	}


	@Override
	public boolean equals(Object object) {
		if (this == object)
			return true;
		if (!(object instanceof BlockKey))
			return false;
		BlockKey<?> blockKey = (BlockKey<?>) object;
		return Objects.equals(key, blockKey.key) && Objects.equals(defaultValue, blockKey.defaultValue);
	}

	@Override
	public int hashCode() {
		return Objects.hash(key, defaultValue);
	}

	public static BlockKey<?> byKey(String key) {
		for (var val : VALUES)
			if (val.key.equals(key))
				return val;

		return unknownField(key);
	}

	static <T> BlockKey<T> add(BlockKey<T> editorKey) {
		VALUES.add(editorKey);
		return editorKey;
	}

	public static BlockKey<String> unknownField(String name) {
		return new Unknown(name);
	}

	public static class Unknown extends BlockKey<String> {

		private Unknown(String key) {
			super(key, (String) null, StringReader::new);
		}
	}
}
