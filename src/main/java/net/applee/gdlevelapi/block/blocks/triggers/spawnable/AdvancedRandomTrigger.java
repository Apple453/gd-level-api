
package net.applee.gdlevelapi.block.blocks.triggers.spawnable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.applee.gdlevelapi.block.blocks.SpawnableTrigger;
import net.applee.gdlevelapi.block.key.BlockKeys;
import net.applee.gdlevelapi.block.key.BlockProperty;
import net.applee.gdlevelapi.readers.ValueReader;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

@Getter
@Setter
public class AdvancedRandomTrigger extends SpawnableTrigger {

	private final BlockProperty<List<RandomGroup>> randomGroups = property(BlockKeys.RANDOM_GROUPS);

	@Getter
	@Setter
	@ToString
	public static class RandomGroup {
		private int groupId;
		private int chance;

		public RandomGroup() {}

		public RandomGroup(int groupId, int chance) {
			this.groupId = groupId;
			this.chance = chance;
		}
	}

	public static class Reader implements ValueReader<List<RandomGroup>> {

		@Override
		public List<RandomGroup> read(String raw) {

			List<RandomGroup> groups = new ArrayList<>();

			String[] vals = raw.split(Pattern.quote("."));
			for (int i = 0; i < vals.length; i += 2)
				groups.add(new RandomGroup(Integer.parseInt(vals[i]), Integer.parseInt(vals[i + 1])));

			return groups;
		}

		@Override
		public String convert(List<RandomGroup> value) {
			StringBuilder stringBuilder = new StringBuilder();
			value.forEach(v -> stringBuilder.append(v.groupId).append(".").append(v.chance).append("."));

			String string = stringBuilder.toString();
			if (string.endsWith("."))
				string = string.substring(0, string.length() - 1);

			return string;
		}
	}
}
