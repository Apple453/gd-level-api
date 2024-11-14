package net.applee.gdlevelapi.readers;

public class EnumReader<T extends Enum<T>> implements ValueReader<T> {

	private final Class<T> clazz;

	public EnumReader(Class<T> clazz) {
		this.clazz = clazz;
	}

	@Override
	public T read(String raw) {
		int index = Integer.parseInt(raw);
		return clazz.getEnumConstants()[index];
	}

	@Override
	public String convert(T value) {
		return value.ordinal() + "";
	}
}
