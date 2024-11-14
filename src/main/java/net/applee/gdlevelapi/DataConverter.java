package net.applee.gdlevelapi;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Base64;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class DataConverter {

	private static final int XOR_MASK = 11;

	public static String decode(byte[] source) {
		while (source[source.length - 1] == 11)
			source = Arrays.copyOf(source, source.length - 1);

		source = xor(source);

		String string = new String(source);

		//		string = string.substring(0, string.length() - 1);

		return unpack(string);
	}

	public static byte[] encode(String source) {
		String string = pack(source);
		byte[] data = string.getBytes();

		//		data = Arrays.copyOf(data, data.length + 1);
		//		data[data.length - 1] = 0;

		return xor(data);
	}

	public static String unpack(String string) {
		string = string.replace("_", "/").replace("-", "+");

		string = cleanString(string, 0xFFFD);
		string = cleanString(string, 0);

		byte[] data = Base64.getDecoder().decode(string);

		try (GZIPInputStream gzipInputStream = new GZIPInputStream(new ByteArrayInputStream(data))) {
			return new String(gzipInputStream.readAllBytes());
		}
		catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static String pack(String source) {
		try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		     GZIPOutputStream gzipOutputStream = new GZIPOutputStream(outputStream)
		) {
			gzipOutputStream.write(source.getBytes());
			gzipOutputStream.finish();

			String string = new String(Base64.getEncoder().encode(outputStream.toByteArray()));
			string = string.replace("/", "_").replace("+", "-");

			return string;
		}
		catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	private static byte[] xor(byte[] source) {
		byte[] decoded = new byte[source.length];

		for (int i = 0; i < source.length; i++) {
			decoded[i] = (byte) (source[i] ^ XOR_MASK);
		}

		return decoded;
	}

	private static String cleanString(String string, int value) {
		String v = ((char) value) + "";

		while (string.contains(v))
			string = string.substring(0, string.length() - 1);

		return string;
	}
}
