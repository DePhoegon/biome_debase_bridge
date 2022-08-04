package com.dephoegon.delbridgebop.block.slab;

import biomesoplenty.api.block.BOPBlocks;
import com.dephoegon.delbridgebop.aid.extendedtypes.slab.SlabEnergies;
import com.dephoegon.delbridgebop.aid.extendedtypes.slab.SlabSands;
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

public class EnergySandSlabs {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<SlabBlock> WHITE_ENERGY_SAND_SLAB = register("white_energy_sand_slab",
            () -> new SlabEnergies(BlockBehaviour.Properties.copy(BOPBlocks.WHITE_SAND).sound(SoundType.SAND),"","","",false));
    public static final RegistryObject<SlabBlock> ORANGE_ENERGY_SAND_SLAB = register("orange_energy_sand_slab",
            () -> new SlabEnergies(BlockBehaviour.Properties.copy(BOPBlocks.ORANGE_SAND).sound(SoundType.SAND),"","","", false));
    public static final RegistryObject<SlabBlock> BLACK_ENERGY_SAND_SLAB = register("black_energy_sand_slab",
            () -> new SlabEnergies(BlockBehaviour.Properties.copy(BOPBlocks.BLACK_SAND).sound(SoundType.SAND),"","","", false));
    public static final RegistryObject<SlabBlock> ROOTED_ENERGY_SAND_SLAB = register("rooted_energy_sand_slab",
            () -> new SlabEnergies(BlockBehaviour.Properties.copy(BOPBlocks.ROOTED_SAND).sound(SoundType.SAND),"","","", false));

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
