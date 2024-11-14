package net.applee.gdlevelapi.readers;

public class StringReader implements ValueReader<String> {

	@Override
	public String read(String raw) {
		return raw;
	}

	@Override
	public String convert(String value) {
		return value;
	}
}
