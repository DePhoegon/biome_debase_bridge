package com.dephoegon.delbridgebop.block.slab;

import com.dephoegon.delbridgebop.aid.extendedtypes.slab.SlabWoods;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import java.util.function.Supplier;

import static biomesoplenty.api.block.BOPBlocks.*;
import static com.dephoegon.delbase.delbase.BASE_BLOCK;
import static com.dephoegon.delbridgebop.DelBridgeBOP.Mod_ID;
import static com.dephoegon.delbridgebop.block.slab.StrippedLogSlabs.*;

public class LogSlabs {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<SlabBlock> FIR_LOG_SLAB = register("fir_log_slab",
            () -> new SlabWoods(BlockBehaviour.Properties.copy(FIR_WOOD).sound(SoundType.WOOD),"","","",true, STRIPPED_FIR_LOG_SLAB.get().defaultBlockState()), 3001);
    public static final RegistryObject<SlabBlock> REDWOOD_LOG_SLAB = register("redwood_log_slab",
            () -> new SlabWoods(BlockBehaviour.Properties.copy(REDWOOD_WOOD).sound(SoundType.WOOD),"","","", true, STRIPPED_REDWOOD_LOG_SLAB.get().defaultBlockState()), 3001);
    public static final RegistryObject<SlabBlock> CHERRY_LOG_SLAB = register("cherry_log_slab",
            () -> new SlabWoods(BlockBehaviour.Properties.copy(CHERRY_WOOD).sound(SoundType.WOOD),"","","", true, STRIPPED_CHERRY_LOG_SLAB.get().defaultBlockState()), 3001);
    public static final RegistryObject<SlabBlock> MAHOGANY_LOG_SLAB = register("mahogany_log_slab",
            () -> new SlabWoods(BlockBehaviour.Properties.copy(MAHOGANY_WOOD).sound(SoundType.WOOD),"","","", true, STRIPPED_MAHOGANY_LOG_SLAB.get().defaultBlockState()), 3001);
    public static final RegistryObject<SlabBlock> JACARANDA_LOG_SLAB = register("jacaranda_log_slab",
            () -> new SlabWoods(BlockBehaviour.Properties.copy(JACARANDA_WOOD).sound(SoundType.WOOD),"","","", true, STRIPPED_JACARANDA_LOG_SLAB.get().defaultBlockState()), 3001);
    public static final RegistryObject<SlabBlock> PALM_LOG_SLAB = register("palm_log_slab",
            () -> new SlabWoods(BlockBehaviour.Properties.copy(PALM_WOOD).sound(SoundType.WOOD),"","","", true, STRIPPED_PALM_LOG_SLAB.get().defaultBlockState()), 3001);
    public static final RegistryObject<SlabBlock> WILLOW_LOG_SLAB = register("willow_log_slab",
            () -> new SlabWoods(BlockBehaviour.Properties.copy(WILLOW_WOOD).sound(SoundType.WOOD),"","","", true, STRIPPED_WILLOW_LOG_SLAB.get().defaultBlockState()), 3001);
    public static final RegistryObject<SlabBlock> DEAD_LOG_SLAB = register("dead_log_slab",
            () -> new SlabWoods(BlockBehaviour.Properties.copy(DEAD_WOOD).sound(SoundType.WOOD),"","","", false, STRIPPED_DEAD_LOG_SLAB.get().defaultBlockState()));
    public static final RegistryObject<SlabBlock> MAGIC_LOG_SLAB = register("magic_log_slab",
            () -> new SlabWoods(BlockBehaviour.Properties.copy(MAGIC_WOOD).sound(SoundType.WOOD),"","","", true, STRIPPED_MAGIC_LOG_SLAB.get().defaultBlockState()), 3001);
    public static final RegistryObject<SlabBlock> UMBRAN_LOG_SLAB = register("umbran_log_slab",
            () -> new SlabWoods(BlockBehaviour.Properties.copy(UMBRAN_WOOD).sound(SoundType.WOOD),"","","", true, STRIPPED_UMBRAN_LOG_SLAB.get().defaultBlockState()), 3001);
    public static final RegistryObject<SlabBlock> HELLBARK_LOG_SLAB = register("hellbark_log_slab",
            () -> new SlabWoods(BlockBehaviour.Properties.copy(HELLBARK_WOOD).sound(SoundType.WOOD),"","","", false, STRIPPED_HELLBARK_LOG_SLAB.get().defaultBlockState()));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block, int burn) {
        RegistryObject<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(),
                new Item.Properties().stacksTo(64).tab(BASE_BLOCK)) {
            public int getBurnTime(ItemStack stack, @Nullable RecipeType<?> recipeType) {
                return burn;
            }
        });
        return exit;
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(),
                new Item.Properties().stacksTo(64).tab(BASE_BLOCK)));
        return exit;
    }
}
