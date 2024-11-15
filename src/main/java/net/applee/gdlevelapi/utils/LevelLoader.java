package net.applee.gdlevelapi.utils;

import net.applee.gdlevelapi.key.containers.LevelHeaderKeys;
import net.applee.gdlevelapi.level.LevelData;
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

public class LevelLoader {

	private static final String LEVEL_STORAGE_KEY = "LLM_01";

	/**
	 * Loads levels data from file
	 *
	 * @param file CCLocalLevels.dat
	 * @return List of levels
	 */
	public static List<LevelData> loadLevels(File file) {
		return loadLevels(FileUtils.readData(file));
	}

	public static List<LevelData> loadLevels(byte[] data) {
		Map<String, PlistHandler.Value> fileData = parseData(data);

		var levelsMap = (Map<String, PlistHandler.Value>) fileData.get(LEVEL_STORAGE_KEY).getValue();

		List<LevelData> levels = new ArrayList<>();

		levelsMap.forEach((k, v) -> {
			if (v.getValue() instanceof Map map) {
				levels.add(new LevelData((Map<String, PlistHandler.Value>) map));
			}
		});

		return levels;
	}

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
