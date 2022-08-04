package com.dephoegon.delbridgebop.block.fences;

import biomesoplenty.api.block.BOPBlocks;
import com.dephoegon.delbridgebop.aid.extendedtypes.fence.FenceGateSands;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.BASE_BLOCK;
import static com.dephoegon.delbridgebop.DelBridgeBOP.Mod_ID;

public class SandFenceGates {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<FenceGateBlock> WHITE_SAND_FENCE_GATE = register("white_sand_fence_gate",
            () -> new FenceGateSands(BlockBehaviour.Properties.copy(BOPBlocks.WHITE_SAND).sound(SoundType.SAND),"","",""));
    public static final RegistryObject<FenceGateBlock> ORANGE_SAND_FENCE_GATE = register("orange_sand_fence_gate",
            () -> new FenceGateSands(BlockBehaviour.Properties.copy(BOPBlocks.ORANGE_SAND).sound(SoundType.SAND),"","",""));
    public static final RegistryObject<FenceGateBlock> BLACK_SAND_FENCE_GATE = register("black_sand_fence_gate",
            () -> new FenceGateSands(BlockBehaviour.Properties.copy(BOPBlocks.BLACK_SAND).sound(SoundType.SAND),"","",""));
    public static final RegistryObject<FenceGateBlock> ROOTED_SAND_FENCE_GATE = register("rooted_sand_fence_gate",
            () -> new FenceGateSands(BlockBehaviour.Properties.copy(BOPBlocks.ROOTED_SAND).sound(SoundType.SAND),"","",""));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(),
                new Item.Properties().stacksTo(64).tab(BASE_BLOCK)));
        return exit;
    }
}
