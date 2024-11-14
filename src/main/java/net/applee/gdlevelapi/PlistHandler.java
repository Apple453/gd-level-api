package net.applee.gdlevelapi;

import lombok.Getter;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlistHandler extends DefaultHandler {

	@Getter
	private final Map<String, Value> parsed = new HashMap<>();

	@Getter
	private String version = "";

	@Getter
	private String gjVersion = "";

	private String _key   = "";
	private String _value = "";
	private String _type  = "";

	private MapContainer _map = new MapContainer("root", parsed);

	private final List<MapContainer> mapStack = new ArrayList<>();

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) {
		//		System.out.println("Start element");
		switch (qName) {
			case "plist" -> {
				version = attributes.getValue("version");
				gjVersion = attributes.getValue("gjver");
			}
			case "dict" -> {
			}
			case "d" -> {
				mapStack.add(_map);
				_map = new MapContainer(getKey());
			}
		}

		_type = qName;
	}

	@Override
	public void endElement(String uri, String localName, String qName) {
		//		System.out.println("End element");
		switch (qName) {
			case "k" -> _key = getVal();
			case "dict" -> {
			}
			case "d" -> {
				var map = mapStack.removeLast();
				map.map.put(_map.name, new Value("d", _map.map));
				_map = map;
			}

			default -> _map.map.put(getKey(), new Value(_type, getVal()));
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) {
		String string = new String(ch).substring(start, start + length);

		if (!string.isBlank())
			_value += string;
	}

	private String getKey() {
		String k = _key;
		_key = "";
		return k;
	}

	private String getVal() {
		String v = _value;
		_value = "";
		return v;
	}

	@Getter
	public static class Value {

		private final String type;
		private final Object value;

		public Value(String type, Object value) {
			this.type = type;
			this.value = value;
		}

		@Override
		public String toString() {
			return value.toString() + " -> " + type;
		}
	}

	private static class MapContainer {

		private final String             name;
		private final Map<String, Value> map;

		public MapContainer(String name) {
			this.name = name;
			map = new HashMap<>();
		}

		public MapContainer(String name, Map<String, Value> map) {
			this.name = name;
			this.map = map;
		}
	}
}
