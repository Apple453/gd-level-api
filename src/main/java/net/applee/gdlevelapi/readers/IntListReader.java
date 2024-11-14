package net.applee.gdlevelapi.readers;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class IntListReader implements ValueReader<List<Integer>> {

	private final String separator;

	public IntListReader(String separator) {
		this.separator = separator;
	}

	@Override
	public List<Integer> read(String raw) {
		String[] vals = raw.split(Pattern.quote(separator));

		List<Integer> values = new ArrayList<>();
		for (String val : vals) {
			values.add(Integer.parseInt(val));
		}

		return values;
	}

	@Override
	public String convert(List<Integer> value) {
		StringBuilder stringBuilder = new StringBuilder();

		boolean started = false;
		for (int v : value) {
			if (started)
				stringBuilder.append(separator);

			stringBuilder.append(v);
			started = true;
		}

		return stringBuilder.toString();
	}
}
