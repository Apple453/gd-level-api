package net.applee.gdlevelapi.utils;

import java.io.*;

public class FileUtils {

	public static final void writeString(String path, String s) {
		writeData(path, s.getBytes());
	}

	public static final void writeData(String path, byte[] data) {
		try (OutputStream outputStream = new FileOutputStream(path)) {
			outputStream.write(data);
		}
		catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static final void writeString(File file, String s) {
		writeData(file, s.getBytes());
	}

	public static final void writeData(File file, byte[] data) {
		try (OutputStream outputStream = new FileOutputStream(file)) {
			outputStream.write(data);
		}
		catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static final String readString(String path) {
		return new String(readData(path));
	}

	public static final byte[] readData(String path) {
		try (InputStream inputStream = new FileInputStream(path)) {
			return inputStream.readAllBytes();
		}
		catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static final String readString(File file) {
		return new String(readData(file));
	}

	public static final byte[] readData(File file) {
		try (InputStream inputStream = new FileInputStream(file)) {
			return inputStream.readAllBytes();
		}
		catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
