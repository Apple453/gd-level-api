package net.applee.gdlevelapi.objects;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.applee.gdlevelapi.readers.BoolReader;
import net.applee.gdlevelapi.readers.ValueReader;

@Getter
@Setter
@ToString
public class HSVContainer {

	private static final String SEPARATOR = "a";

	private int     hue;
	private double  saturation = 1;
	private double  brightness = 1;
	private boolean saturationActive;
	private boolean brightnessActive;

	public HSVContainer() {}

	public HSVContainer(
			int hue,
			double saturation,
			double brightness,
			boolean saturationActive,
			boolean brightnessActive
	) {
		this.hue = hue;
		this.saturation = saturation;
		this.brightness = brightness;
		this.saturationActive = saturationActive;
		this.brightnessActive = brightnessActive;
	}

	public static class Reader implements ValueReader<HSVContainer> {

		@Override
		public HSVContainer read(String raw) {
			String[] parts = raw.split(SEPARATOR);
			return new HSVContainer(
					Integer.parseInt(parts[0]),
					Double.parseDouble(parts[1]),
					Double.parseDouble(parts[2]),
					BoolReader.readBool(parts[3]),
					BoolReader.readBool(parts[4])
			);
		}

		@Override
		public String convert(HSVContainer value) {
			return value.hue + SEPARATOR
					+ value.saturation + SEPARATOR
					+ value.brightness + SEPARATOR
					+ BoolReader.convertBool(value.saturationActive) + SEPARATOR
					+ BoolReader.convertBool(value.brightnessActive);
		}
	}
}
