package com.dephoegon.delbridgebop.block.slab;

import biomesoplenty.api.block.BOPBlocks;
import com.dephoegon.delbridgebop.aid.extendedtypes.slab.SlabSandstones;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.BASE_BLOCK;
import static com.dephoegon.delbridgebop.DelBridgeBOP.Mod_ID;

public class EnergySandstoneSlabs {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<SlabBlock> WHITE_ENERGY_CHISELED_SANDSTONE_SLAB = register("white_energy_chiseled_sandstone_slab",
            () -> new SlabSandstones(BlockBehaviour.Properties.copy(BOPBlocks.CHISELED_WHITE_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> ORANGE_ENERGY_CHISELED_SANDSTONE_SLAB = register("orange_energy_chiseled_sandstone_slab",
            () -> new SlabSandstones(BlockBehaviour.Properties.copy(BOPBlocks.CHISELED_ORANGE_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> BLACK_ENERGY_CHISELED_SANDSTONE_SLAB = register("black_energy_chiseled_sandstone_slab",
            () -> new SlabSandstones(BlockBehaviour.Properties.copy(BOPBlocks.CHISELED_BLACK_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> WHITE_ENERGY_CUT_SANDSTONE_SLAB = register("white_energy_cut_sandstone_slab",
            () -> new SlabSandstones(BlockBehaviour.Properties.copy(BOPBlocks.CUT_WHITE_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> ORANGE_ENERGY_CUT_SANDSTONE_SLAB = register("orange_energy_cut_sandstone_slab",
            () -> new SlabSandstones(BlockBehaviour.Properties.copy(BOPBlocks.CUT_ORANGE_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> BLACK_ENERGY_CUT_SANDSTONE_SLAB = register("black_energy_cut_sandstone_slab",
            () -> new SlabSandstones(BlockBehaviour.Properties.copy(BOPBlocks.CUT_BLACK_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> WHITE_ENERGY_SMOOTH_SANDSTONE_SLAB = register("white_energy_smooth_sandstone_slab",
            () -> new SlabSandstones(BlockBehaviour.Properties.copy(BOPBlocks.SMOOTH_WHITE_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> ORANGE_ENERGY_SMOOTH_SANDSTONE_SLAB = register("orange_energy_smooth_sandstone_slab",
            () -> new SlabSandstones(BlockBehaviour.Properties.copy(BOPBlocks.SMOOTH_ORANGE_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> BLACK_ENERGY_SMOOTH_SANDSTONE_SLAB = register("black_energy_smooth_sandstone_slab",
            () -> new SlabSandstones(BlockBehaviour.Properties.copy(BOPBlocks.SMOOTH_BLACK_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> WHITE_ENERGY_SANDSTONE_SLAB = register("white_energy_sandstone_slab",
            () -> new SlabSandstones(BlockBehaviour.Properties.copy(BOPBlocks.WHITE_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> ORANGE_ENERGY_SANDSTONE_SLAB = register("orange_energy_sandstone_slab",
            () -> new SlabSandstones(BlockBehaviour.Properties.copy(BOPBlocks.ORANGE_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> BLACK_ENERGY_SANDSTONE_SLAB = register("black_energy_sandstone_slab",
            () -> new SlabSandstones(BlockBehaviour.Properties.copy(BOPBlocks.BLACK_SANDSTONE).sound(SoundType.STONE),"","",""));

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
