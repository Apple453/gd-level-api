package net.applee.gdlevelapi.readers;

public class IntReader implements ValueReader<Integer> {

	@Override
	public Integer read(String raw) {
		return Integer.parseInt(raw);
	}

	@Override
	public String convert(Integer value) {
		return value + "";
	}
}
