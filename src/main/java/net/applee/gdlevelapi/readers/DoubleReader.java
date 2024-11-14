package net.applee.gdlevelapi.readers;

public class DoubleReader implements ValueReader<Double> {

	@Override
	public Double read(String raw) {
		return Double.parseDouble(raw);
	}

	@Override
	public String convert(Double value) {
		return value + "";
	}
}
