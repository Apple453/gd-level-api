package net.applee.gdlevelapi.readers;

public interface ValueReader<T> {

	T read(String raw);
	String convert(T value);
}
