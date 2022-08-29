package com.dephoegon.delbridgebop.aid.util;
import com.dephoegon.delbridgebop.block.fence.*;
import com.dephoegon.delbridgebop.block.gravity.OverrideSandsBOP;
import com.dephoegon.delbridgebop.block.gravity.SolidSands;
import com.dephoegon.delbridgebop.block.slab.*;
import com.dephoegon.delbridgebop.block.stair.*;
import com.dephoegon.delbridgebop.block.wall.*;
import net.minecraftforge.eventbus.api.IEventBus;

public class RegList {
    public static void ListOrder(IEventBus eventBus) {
        StrippedWoodSlabs.register(eventBus);
        StrippedLogSlabs.register(eventBus);
        WoodSlabs.register(eventBus);
        LogSlabs.register(eventBus);
        SandSlabs.register(eventBus);
        ChiseledSandstoneSlabs.register(eventBus);
        EnergySandSlabs.register(eventBus);
        EnergySandstoneSlabs.register(eventBus);

        StrippedLogStairs.register(eventBus);
        StrippedWoodStairs.register(eventBus);
        SandStairs.register(eventBus);
        LogStairs.register(eventBus);
        WoodStairs.register(eventBus);
        CutSandstoneStairs.register(eventBus);
        ChiseledSandstoneStairs.register(eventBus);

        ChiseledSandstoneWalls.register(eventBus);
        CutSandstoneWalls.register(eventBus);
        SmoothSandstoneWalls.register(eventBus);
        SandWalls.register(eventBus);
        StrippedWoodWalls.register(eventBus);
        StrippedLogWalls.register(eventBus);
        WoodWalls.register(eventBus);
        LogWalls.register(eventBus);

        BrickFences.register(eventBus);
        ChiseledSandstoneFences.register(eventBus);
        SandFences.register(eventBus);
        SandstoneFences.register(eventBus);
        StrippedWoodFences.register(eventBus);
        StrippedLogFences.register(eventBus);
        WoodFences.register(eventBus);
        LogFences.register(eventBus);

        SmoothSandstoneFences.register(eventBus);
        CutSandstoneFences.register(eventBus);
        BrickFenceGates.register(eventBus);
        ChiseledSandstoneFenceGates.register(eventBus);
        CutSandstoneFenceGates.register(eventBus);
        SandFenceGates.register(eventBus);
        SandstoneFenceGates.register(eventBus);
        SmoothSandstoneFenceGates.register(eventBus);
        StrippedWoodFenceGates.register(eventBus);
        StrippedLogFenceGates.register(eventBus);
        WoodFenceGates.register(eventBus);
        LogFenceGates.register(eventBus);

        OverrideSandsBOP.register(eventBus);
        SolidSands.register(eventBus);
    }
}
