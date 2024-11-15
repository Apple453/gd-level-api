package net.applee.gdlevelapi.utils;

import net.applee.gdlevelapi.PropertyContainer;
import net.applee.gdlevelapi.key.Key;
import net.applee.gdlevelapi.level.LevelData;
import net.applee.gdlevelapi.level.LevelHeaders;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/**
 * Utils for load CCLocalLevels.dat.
 */
public class LevelLoader {

	private static final String LEVEL_STORAGE_KEY = "LLM_01";

	/**
	 * Loads all levels data from file
	 *
	 * @param file CCLocalLevels.dat
	 * @return List of loaded levels
	 */
	public static List<LevelData> loadLevels(File file) {
		return loadLevels(FileUtils.readData(file), null);
	}

	/**
	 * Loads levels data from file with headers predicate
	 *
	 * @param file      CCLocalLevels.dat
	 * @param predicate headers predicate for level. Null for load all levels
	 * @return List of loaded levels
	 */
	public static List<LevelData> loadLevels(File file, Predicate<LevelHeaders> predicate) {
		return loadLevels(FileUtils.readData(file), predicate);
	}

	/**
	 * Loads levels data from bytes with predicate
	 *
	 * @param data      binary data of CCLocalLevels.dat
	 * @param predicate headers predicate for level. Null for load all levels
	 * @return List of loaded levels
	 */
	public static List<LevelData> loadLevels(byte[] data, Predicate<LevelHeaders> predicate) {
		Map<String, PlistHandler.Value> fileData = parseData(data);

		List<LevelData> levels = new ArrayList<>();

		var levelsMap = (Map<String, PlistHandler.Value>) fileData.get(LEVEL_STORAGE_KEY).getValue();
		levelsMap.forEach((k, v) -> {
			if (v.getValue() instanceof Map<?, ?> _map) {
				Map<Key<?>, String> map = PropertyContainer.convertPlistMap((Map<String, PlistHandler.Value>) _map);

				LevelHeaders headers = new LevelHeaders();
				headers.readProperties(map);

				if (predicate == null || predicate.test(headers)) {
					LevelData levelData = new LevelData();
					levelData.setHeaders(headers);
					levelData.loadLevel(map);
					levels.add(levelData);
				}
			}
		});

		return levels;
	}

	/**
	 * Parses CCLocalLevels.dat to raw map
	 *
	 * @param data binary data of CCLocalLevels.dat
	 * @return List of loaded levels
	 */
	public static Map<String, PlistHandler.Value> parseData(byte[] data) {
		String decoded = DataConverter.decode(data);

		PlistHandler plistHandler = new PlistHandler();

		SAXParserFactory factory = SAXParserFactory.newInstance();
		try {
			SAXParser parser = factory.newSAXParser();
			parser.parse(new InputSource(new StringReader(decoded)), plistHandler);
		}
		catch (ParserConfigurationException | SAXException | IOException e) {
			throw new RuntimeException(e);
		}

		return plistHandler.getParsed();
	}
}
