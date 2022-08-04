package com.dephoegon.delbridgebop.aid.util;
import com.dephoegon.delbridgebop.block.fences.*;
import com.dephoegon.delbridgebop.block.gravity.OverrideSandsBOP;
import com.dephoegon.delbridgebop.block.gravity.SolidSands;
import com.dephoegon.delbridgebop.block.slab.*;
import com.dephoegon.delbridgebop.block.stair.*;
import com.dephoegon.delbridgebop.block.wall.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.dephoegon.delbridgebop.DelBridgeBOP.Mod_ID;

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
        EnergySandSlabs.register(eventBus);
        EnergySandstoneSlabs.register(eventBus);

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
        ChiseledSandstoneWalls.register(eventBus);
        SandWalls.register(eventBus);
        WoodWalls.register(eventBus);
        LogWalls.register(eventBus);
        StrippedWoodWalls.register(eventBus);
        StrippedLogWalls.register(eventBus);

        //Fences
        BrickFences.register(eventBus);
        BrickFenceGates.register(eventBus);
        ChiseledSandstoneFences.register(eventBus);
        ChiseledSandstoneFenceGates.register(eventBus);
        CutSandstoneFences.register(eventBus);
        CutSandstoneFenceGates.register(eventBus);
        SandFences.register(eventBus);
        SandFenceGates.register(eventBus);
        SandstoneFences.register(eventBus);
        SandstoneFenceGates.register(eventBus);
        SmoothSandstoneFences.register(eventBus);
        SmoothSandstoneFenceGates.register(eventBus);
        WoodFences.register(eventBus);
        WoodFenceGates.register(eventBus);
        LogFences.register(eventBus);
        LogFenceGates.register(eventBus);
        StrippedWoodFences.register(eventBus);
        StrippedWoodFenceGates.register(eventBus);
        StrippedLogFences.register(eventBus);
        StrippedLogFenceGates.register(eventBus);

        //Special_Blocks

        //Special
        OverrideSandsBOP.register(eventBus);
        SolidSands.register(eventBus);
    }
}
