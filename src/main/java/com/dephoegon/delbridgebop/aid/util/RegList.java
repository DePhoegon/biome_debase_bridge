package com.dephoegon.delbridgebop.aid.util;

import com.dephoegon.delbridgebop.block.gravity.OverrideSandsBOP;
import com.dephoegon.delbridgebop.block.gravity.SolidSands;
import com.dephoegon.delbridgebop.block.slab.*;
import com.dephoegon.delbridgebop.block.stair.*;
import net.minecraftforge.eventbus.api.IEventBus;

public class RegList {
    public static void ListOrder(IEventBus eventBus) {
        //aid

        //Items

        //Standard Blocks

        //Slabs
        WoodSlabs.register(eventBus);
        LogSlabs.register(eventBus);
        StrippedWoodSlabs.register(eventBus);
        StrippedLogSlabs.register(eventBus);
        SandSlabs.register(eventBus);
        ChiseledSandstoneSlabs.register(eventBus);

        //Stairs
        SandStairs.register(eventBus);
        LogStairs.register(eventBus);
        WoodStairs.register(eventBus);
        StrippedLogStairs.register(eventBus);
        StrippedWoodStairs.register(eventBus);
        CutSandstoneStairs.register(eventBus);
        ChiseledSandstoneStairs.register(eventBus);

        //Pillars

        //Walls

        //Fences

        //Special_Blocks

        //Special
        OverrideSandsBOP.register(eventBus);
        SolidSands.register(eventBus);
    }
}
