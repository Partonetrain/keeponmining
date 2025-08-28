package info.partonetrain.keeponmining;

import net.neoforged.neoforge.common.ModConfigSpec;

public class Config {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec.IntValue MINING_TICK_DELAY = BUILDER
            .comment("Number of ticks between breaking a block and starting to break the next one")
            .defineInRange("miningTickDelay", 0, 0, 20);

    static final ModConfigSpec SPEC = BUILDER.build();
}
