package com.dephoegon.delbridgebop.block.slab;

import com.dephoegon.delbridgebop.aid.extendedtypes.slab.SlabWoods;
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

import static biomesoplenty.api.block.BOPBlocks.*;
import static com.dephoegon.delbase.delbase.BASE_BLOCK;
import static com.dephoegon.delbridgebop.DelBridgeBOP.Mod_ID;

public class StrippedLogSlabs {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<SlabBlock> STRIPPED_FIR_LOG_SLAB = register("stripped_fir_log_slab",
            () -> new SlabWoods(BlockBehaviour.Properties.copy(STRIPPED_FIR_WOOD).sound(SoundType.WOOD),"","","",true));
    public static final RegistryObject<SlabBlock> STRIPPED_REDWOOD_LOG_SLAB = register("stripped_redwood_log_slab",
            () -> new SlabWoods(BlockBehaviour.Properties.copy(STRIPPED_REDWOOD_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<SlabBlock> STRIPPED_CHERRY_LOG_SLAB = register("stripped_cherry_log_slab",
            () -> new SlabWoods(BlockBehaviour.Properties.copy(STRIPPED_CHERRY_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<SlabBlock> STRIPPED_MAHOGANY_LOG_SLAB = register("stripped_mahogany_log_slab",
            () -> new SlabWoods(BlockBehaviour.Properties.copy(STRIPPED_MAHOGANY_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<SlabBlock> STRIPPED_JACARANDA_LOG_SLAB = register("stripped_jacaranda_log_slab",
            () -> new SlabWoods(BlockBehaviour.Properties.copy(STRIPPED_JACARANDA_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<SlabBlock> STRIPPED_PALM_LOG_SLAB = register("stripped_palm_log_slab",
            () -> new SlabWoods(BlockBehaviour.Properties.copy(STRIPPED_PALM_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<SlabBlock> STRIPPED_WILLOW_LOG_SLAB = register("stripped_willow_log_slab",
            () -> new SlabWoods(BlockBehaviour.Properties.copy(STRIPPED_WILLOW_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<SlabBlock> STRIPPED_DEAD_LOG_SLAB = register("stripped_dead_log_slab",
            () -> new SlabWoods(BlockBehaviour.Properties.copy(STRIPPED_DEAD_WOOD).sound(SoundType.WOOD),"","","", false));
    public static final RegistryObject<SlabBlock> STRIPPED_MAGIC_LOG_SLAB = register("stripped_magic_log_slab",
            () -> new SlabWoods(BlockBehaviour.Properties.copy(STRIPPED_MAGIC_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<SlabBlock> STRIPPED_UMBRAN_LOG_SLAB = register("stripped_umbran_log_slab",
            () -> new SlabWoods(BlockBehaviour.Properties.copy(STRIPPED_UMBRAN_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<SlabBlock> STRIPPED_HELLBARK_LOG_SLAB = register("stripped_hellbark_log_slab",
            () -> new SlabWoods(BlockBehaviour.Properties.copy(STRIPPED_HELLBARK_WOOD).sound(SoundType.WOOD),"","","", false));

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
