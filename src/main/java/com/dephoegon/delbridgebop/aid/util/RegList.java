package com.dephoegon.delbridgebop.aid.util;

import com.dephoegon.delbridgebop.block.slab.LogSlabs;
import com.dephoegon.delbridgebop.block.slab.StrippedLogSlabs;
import com.dephoegon.delbridgebop.block.slab.StrippedWoodSlabs;
import com.dephoegon.delbridgebop.block.slab.WoodSlabs;
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

        //Stairs

        //Pillars

        //Walls

        //Fences

        //Special_Blocks

        //Special
    }
}
