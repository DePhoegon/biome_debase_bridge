package com.dephoegon.delbridgebop.block.fence;

import com.dephoegon.delbase.aid.block.stock.fenceBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
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
import static com.dephoegon.delbridgebop.block.fence.StrippedLogFences.*;

public class LogFences {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<FenceBlock> FIR_LOG_FENCE = register("fir_log_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(FIR_WOOD).sound(SoundType.WOOD),"","","",true, STRIPPED_FIR_LOG_FENCE.get().defaultBlockState()), 1000);
    public static final RegistryObject<FenceBlock> REDWOOD_LOG_FENCE = register("redwood_log_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(REDWOOD_WOOD).sound(SoundType.WOOD),"","","", true, STRIPPED_REDWOOD_LOG_FENCE.get().defaultBlockState()), 1000);
    public static final RegistryObject<FenceBlock> CHERRY_LOG_FENCE = register("cherry_log_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(CHERRY_WOOD).sound(SoundType.WOOD),"","","", true, STRIPPED_CHERRY_LOG_FENCE.get().defaultBlockState()), 1000);
    public static final RegistryObject<FenceBlock> MAHOGANY_LOG_FENCE = register("mahogany_log_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(MAHOGANY_WOOD).sound(SoundType.WOOD),"","","", true, STRIPPED_MAHOGANY_LOG_FENCE.get().defaultBlockState()), 1000);
    public static final RegistryObject<FenceBlock> JACARANDA_LOG_FENCE = register("jacaranda_log_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(JACARANDA_WOOD).sound(SoundType.WOOD),"","","", true, STRIPPED_JACARANDA_LOG_FENCE.get().defaultBlockState()), 1000);
    public static final RegistryObject<FenceBlock> PALM_LOG_FENCE = register("palm_log_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(PALM_WOOD).sound(SoundType.WOOD),"","","", true, STRIPPED_PALM_LOG_FENCE.get().defaultBlockState()), 1000);
    public static final RegistryObject<FenceBlock> WILLOW_LOG_FENCE = register("willow_log_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(WILLOW_WOOD).sound(SoundType.WOOD),"","","", true, STRIPPED_WILLOW_LOG_FENCE.get().defaultBlockState()), 1000);
    public static final RegistryObject<FenceBlock> DEAD_LOG_FENCE = register("dead_log_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(DEAD_WOOD).sound(SoundType.WOOD),"","","", false, STRIPPED_DEAD_LOG_FENCE.get().defaultBlockState()));
    public static final RegistryObject<FenceBlock> MAGIC_LOG_FENCE = register("magic_log_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(MAGIC_WOOD).sound(SoundType.WOOD),"","","", true, STRIPPED_MAGIC_LOG_FENCE.get().defaultBlockState()), 1000);
    public static final RegistryObject<FenceBlock> UMBRAN_LOG_FENCE = register("umbran_log_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(UMBRAN_WOOD).sound(SoundType.WOOD),"","","", true, STRIPPED_UMBRAN_LOG_FENCE.get().defaultBlockState()), 1000);
    public static final RegistryObject<FenceBlock> HELLBARK_LOG_FENCE = register("hellbark_log_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(HELLBARK_WOOD).sound(SoundType.WOOD),"","","", false, STRIPPED_HELLBARK_LOG_FENCE.get().defaultBlockState()));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block, int burn) {
        RegistryObject<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(), new Item.Properties().stacksTo(64).tab(BASE_BLOCK)) {
            public int getBurnTime(ItemStack stack, @Nullable RecipeType<?> recipeType) {
                return burn;
            }
        });
        return exit;
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(), new Item.Properties().stacksTo(64).tab(BASE_BLOCK)));
        return exit;
    }
}
