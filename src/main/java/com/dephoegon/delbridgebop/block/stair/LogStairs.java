package com.dephoegon.delbridgebop.block.stair;

import com.dephoegon.delbase.aid.block.alt.woodStair;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
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
import static com.dephoegon.delbridgebop.block.stair.StrippedLogStairs.*;

public class LogStairs {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<StairBlock> FIR_LOG_STAIR = register("fir_log_stair",
            () -> new woodStair(FIR_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(FIR_WOOD).sound(SoundType.WOOD),"","","",true, STRIPPED_FIR_LOG_STAIR.get().defaultBlockState()), 5001);
    public static final RegistryObject<StairBlock> REDWOOD_LOG_STAIR = register("redwood_log_stair",
            () -> new woodStair(REDWOOD_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(REDWOOD_WOOD).sound(SoundType.WOOD),"","","", true, STRIPPED_REDWOOD_LOG_STAIR.get().defaultBlockState()), 5001);
    public static final RegistryObject<StairBlock> CHERRY_LOG_STAIR = register("cherry_log_stair",
            () -> new woodStair(CHERRY_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(CHERRY_WOOD).sound(SoundType.WOOD),"","","", true, STRIPPED_CHERRY_LOG_STAIR.get().defaultBlockState()), 5001);
    public static final RegistryObject<StairBlock> MAHOGANY_LOG_STAIR = register("mahogany_log_stair",
            () -> new woodStair(MAHOGANY_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(MAHOGANY_WOOD).sound(SoundType.WOOD),"","","", true, STRIPPED_MAHOGANY_LOG_STAIR.get().defaultBlockState()), 5001);
    public static final RegistryObject<StairBlock> JACARANDA_LOG_STAIR = register("jacaranda_log_stair",
            () -> new woodStair(JACARANDA_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(JACARANDA_WOOD).sound(SoundType.WOOD),"","","", true, STRIPPED_JACARANDA_LOG_STAIR.get().defaultBlockState()), 5001);
    public static final RegistryObject<StairBlock> PALM_LOG_STAIR = register("palm_log_stair",
            () -> new woodStair(PALM_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(PALM_WOOD).sound(SoundType.WOOD),"","","", true, STRIPPED_PALM_LOG_STAIR.get().defaultBlockState()), 5001);
    public static final RegistryObject<StairBlock> WILLOW_LOG_STAIR = register("willow_log_stair",
            () -> new woodStair(WILLOW_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(WILLOW_WOOD).sound(SoundType.WOOD),"","","", true, STRIPPED_WILLOW_LOG_STAIR.get().defaultBlockState()), 5001);
    public static final RegistryObject<StairBlock> DEAD_LOG_STAIR = register("dead_log_stair",
            () -> new woodStair(DEAD_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(DEAD_WOOD).sound(SoundType.WOOD),"","","", false, STRIPPED_DEAD_LOG_STAIR.get().defaultBlockState()));
    public static final RegistryObject<StairBlock> MAGIC_LOG_STAIR = register("magic_log_stair",
            () -> new woodStair(MAGIC_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(MAGIC_WOOD).sound(SoundType.WOOD),"","","", true, STRIPPED_MAGIC_LOG_STAIR.get().defaultBlockState()), 5001);
    public static final RegistryObject<StairBlock> UMBRAN_LOG_STAIR = register("umbran_log_stair",
            () -> new woodStair(UMBRAN_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(UMBRAN_WOOD).sound(SoundType.WOOD),"","","", true, STRIPPED_UMBRAN_LOG_STAIR.get().defaultBlockState()), 5001);
    public static final RegistryObject<StairBlock> HELLBARK_LOG_STAIR = register("hellbark_log_stair",
            () -> new woodStair(HELLBARK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(HELLBARK_WOOD).sound(SoundType.WOOD),"","","", false, STRIPPED_HELLBARK_LOG_STAIR.get().defaultBlockState()));

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
