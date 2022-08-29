package com.dephoegon.delbridgebop.block.fence;

import biomesoplenty.api.block.BOPBlocks;
import com.dephoegon.delbridgebop.aid.extendedtypes.fence.FenceSands;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.BASE_BLOCK;
import static com.dephoegon.delbridgebop.DelBridgeBOP.Mod_ID;

public class SandFences {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<FenceBlock> WHITE_SAND_FENCE = register("white_sand_fence",
            () -> new FenceSands(BlockBehaviour.Properties.copy(BOPBlocks.WHITE_SAND).sound(SoundType.SAND),"tooltip.delbridgebop.bop","",""));
    public static final RegistryObject<FenceBlock> ORANGE_SAND_FENCE = register("orange_sand_fence",
            () -> new FenceSands(BlockBehaviour.Properties.copy(BOPBlocks.ORANGE_SAND).sound(SoundType.SAND),"tooltip.delbridgebop.bop","",""));
    public static final RegistryObject<FenceBlock> BLACK_SAND_FENCE = register("black_sand_fence",
            () -> new FenceSands(BlockBehaviour.Properties.copy(BOPBlocks.BLACK_SAND).sound(SoundType.SAND),"tooltip.delbridgebop.bop","",""));
    public static final RegistryObject<FenceBlock> ROOTED_SAND_FENCE = register("rooted_sand_fence",
            () -> new FenceSands(BlockBehaviour.Properties.copy(BOPBlocks.ROOTED_SAND).sound(SoundType.SAND),"tooltip.delbridgebop.bop","",""));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(), new Item.Properties().stacksTo(64).tab(BASE_BLOCK)));
        return exit;
    }
}
