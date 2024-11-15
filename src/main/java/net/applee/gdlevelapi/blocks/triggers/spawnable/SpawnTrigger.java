
package net.applee.gdlevelapi.blocks.triggers.spawnable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.applee.gdlevelapi.blocks.TargetableTrigger;
import net.applee.gdlevelapi.key.Property;
import net.applee.gdlevelapi.key.containers.BlockKeys;
import net.applee.gdlevelapi.readers.ValueReader;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

@Getter
@Setter
public class SpawnTrigger extends TargetableTrigger {

	private final Property<List<SpawnGroup>> spawnGroups    = property(BlockKeys.SPAWN_GROUPS);
	private final Property<Double>           spawnDelay     = property(BlockKeys.SPAWN_DELAY);
	private final Property<Double>           spawnRandom    = property(BlockKeys.SPAWN_RANDOM);
	private final Property<Boolean>          disablePreview = property(BlockKeys.DISABLE_PREVIEW);
	private final Property<Boolean>          spawnOrdered   = property(BlockKeys.SPAWN_ORDERED);
	private final Property<Boolean>          resetRemap     = property(BlockKeys.RESET_REMAP);

	@Getter
	@Setter
	@ToString
	public static class SpawnGroup {

		private int originalId;
		private int newId;

		public SpawnGroup() {}

		public SpawnGroup(int originalId, int newId) {
			this.originalId = originalId;
			this.newId = newId;
		}
	}

	public static class GroupsReader implements ValueReader<List<SpawnGroup>> {

		@Override
		public List<SpawnGroup> read(String raw) {
			List<SpawnGroup> groups = new ArrayList<>();

			if (raw.isBlank())
				return groups;

			String[] vals = raw.split(Pattern.quote("."));
			for (int i = 0; i < vals.length; i += 2)
				groups.add(new SpawnGroup(Integer.parseInt(vals[i]), Integer.parseInt(vals[i + 1])));

			return groups;
		}

		@Override
		public String convert(List<SpawnGroup> value) {
			if (value.isEmpty())
				return "";

			StringBuilder stringBuilder = new StringBuilder();
			value.forEach(v -> stringBuilder.append(v.originalId).append(".").append(v.newId).append("."));

			String string = stringBuilder.toString();
			if (string.endsWith("."))
				string = string.substring(0, string.length() - 1);

			return string;
		}
	}
}
