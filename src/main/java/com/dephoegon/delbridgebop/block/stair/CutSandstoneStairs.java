package com.dephoegon.delbridgebop.block.stair;

import biomesoplenty.api.block.BOPBlocks;
import com.dephoegon.delbridgebop.aid.extendedtypes.stair.StairSands;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.BASE_BLOCK;
import static com.dephoegon.delbridgebop.DelBridgeBOP.Mod_ID;

public class CutSandstoneStairs {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<StairBlock> WHITE_CUT_SANDSTONE_STAIR = register("white_cut_sandstone_stair",
            () -> new StairSands(BOPBlocks.CUT_WHITE_SANDSTONE::defaultBlockState, BlockBehaviour.Properties.copy(BOPBlocks.CUT_WHITE_SANDSTONE).sound(SoundType.STONE),"tooltip.delbridgebop.bop","",""));
    public static final RegistryObject<StairBlock> ORANGE_CUT_SANDSTONE_STAIR = register("orange_cut_sandstone_stair",
            () -> new StairSands(BOPBlocks.CUT_ORANGE_SANDSTONE::defaultBlockState, BlockBehaviour.Properties.copy(BOPBlocks.CUT_ORANGE_SANDSTONE).sound(SoundType.STONE),"tooltip.delbridgebop.bop","",""));
    public static final RegistryObject<StairBlock> BLACK_CUT_SANDSTONE_STAIR = register("black_cut_sandstone_stair",
            () -> new StairSands(BOPBlocks.CUT_BLACK_SANDSTONE::defaultBlockState, BlockBehaviour.Properties.copy(BOPBlocks.CUT_BLACK_SANDSTONE).sound(SoundType.STONE),"tooltip.delbridgebop.bop","",""));

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
