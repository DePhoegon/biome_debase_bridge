package com.dephoegon.delbridgebop.aid.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class CommonConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    static {
        BUILDER.push("Delbase Common Configs");




        // Client&Server Side Configs
        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
