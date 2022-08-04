package com.dephoegon.delbridgebop.block.wall;

import biomesoplenty.api.block.BOPBlocks;
import com.dephoegon.delbridgebop.aid.extendedtypes.wall.WallSandstones;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.BASE_BLOCK;
import static com.dephoegon.delbridgebop.DelBridgeBOP.Mod_ID;

public class ChiseledSandstoneWalls {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<WallBlock> WHITE_CHISELED_SANDSTONE_WALL = register("white_chiseled_sandstone_wall",
            () -> new WallSandstones(BlockBehaviour.Properties.copy(BOPBlocks.CHISELED_WHITE_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> ORANGE_CHISELED_SANDSTONE_WALL = register("orange_chiseled_sandstone_wall",
            () -> new WallSandstones(BlockBehaviour.Properties.copy(BOPBlocks.CHISELED_ORANGE_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> BLACK_CHISELED_SANDSTONE_WALL = register("black_chiseled_sandstone_wall",
            () -> new WallSandstones(BlockBehaviour.Properties.copy(BOPBlocks.CHISELED_BLACK_SANDSTONE).sound(SoundType.STONE),"","",""));

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
