package net.applee.gdlevelapi.readers;

public class LongReader implements ValueReader<Long> {

	@Override
	public Long read(String raw) {
		return Long.parseLong(raw);
	}

	@Override
	public String convert(Long value) {
		return value + "";
	}
}
