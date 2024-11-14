package net.applee.gdlevelapi.readers;

public class BoolReader implements ValueReader<Boolean> {

	@Override
	public Boolean read(String raw) {
		return readBool(raw);
	}

	@Override
	public String convert(Boolean value) {
		return convertBool(value);
	}

	public static boolean readBool(String raw) {
		return raw.equals("1");
	}

	public static String convertBool(boolean bool) {
		return bool ? "1" : "0";
	}
}
