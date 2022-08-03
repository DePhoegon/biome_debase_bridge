package com.dephoegon.delbridgebop.block.stair;

import biomesoplenty.api.block.BOPBlocks;
import com.dephoegon.delbridgebop.aid.extendedtypes.slab.SlabSands;
import com.dephoegon.delbridgebop.aid.extendedtypes.stair.StairSands;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
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

public class SandStairs {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<StairBlock> WHITE_SAND_STAIR = register("white_sand_stair",
            () -> new StairSands(BOPBlocks.WHITE_SANDSTONE::defaultBlockState, BlockBehaviour.Properties.copy(BOPBlocks.WHITE_SAND).sound(SoundType.SAND),"","",""));
    public static final RegistryObject<StairBlock> ORANGE_SAND_STAIR = register("orange_sand_stair",
            () -> new StairSands(BOPBlocks.ORANGE_SANDSTONE::defaultBlockState, BlockBehaviour.Properties.copy(BOPBlocks.ORANGE_SAND).sound(SoundType.SAND),"","",""));
    public static final RegistryObject<StairBlock> BLACK_SAND_STAIR = register("black_sand_stair",
            () -> new StairSands(BOPBlocks.BLACK_SANDSTONE::defaultBlockState, BlockBehaviour.Properties.copy(BOPBlocks.BLACK_SAND).sound(SoundType.SAND),"","",""));
    public static final RegistryObject<StairBlock> ROOTED_SAND_STAIR = register("rooted_sand_stair",
            () -> new StairSands(BOPBlocks.MUD_BRICKS::defaultBlockState, BlockBehaviour.Properties.copy(BOPBlocks.ROOTED_SAND).sound(SoundType.SAND),"","",""));

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
