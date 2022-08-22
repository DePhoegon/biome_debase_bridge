package com.dephoegon.delbridgebop.block.stair;

import com.dephoegon.delbridgebop.aid.extendedtypes.stair.StairWoods;
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
import static biomesoplenty.api.block.BOPBlocks.HELLBARK_WOOD;
import static com.dephoegon.delbase.delbase.BASE_BLOCK;
import static com.dephoegon.delbridgebop.DelBridgeBOP.Mod_ID;
import static com.dephoegon.delbridgebop.block.stair.StrippedWoodStairs.*;

public class WoodStairs {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<StairBlock> FIR_WOOD_STAIR = register("fir_wood_stair",
            () -> new StairWoods(FIR_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(FIR_WOOD).sound(SoundType.WOOD),"","","",true, STRIPPED_FIR_WOOD_STAIR.get().defaultBlockState()), 5001);
    public static final RegistryObject<StairBlock> REDWOOD_WOOD_STAIR = register("redwood_wood_stair",
            () -> new StairWoods(REDWOOD_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(REDWOOD_WOOD).sound(SoundType.WOOD),"","","", true, STRIPPED_REDWOOD_WOOD_STAIR.get().defaultBlockState()), 5001);
    public static final RegistryObject<StairBlock> CHERRY_WOOD_STAIR = register("cherry_wood_stair",
            () -> new StairWoods(CHERRY_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(CHERRY_WOOD).sound(SoundType.WOOD),"","","", true, STRIPPED_CHERRY_WOOD_STAIR.get().defaultBlockState()), 5001);
    public static final RegistryObject<StairBlock> MAHOGANY_WOOD_STAIR = register("mahogany_wood_stair",
            () -> new StairWoods(MAHOGANY_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(MAHOGANY_WOOD).sound(SoundType.WOOD),"","","", true, STRIPPED_MAHOGANY_WOOD_STAIR.get().defaultBlockState()), 5001);
    public static final RegistryObject<StairBlock> JACARANDA_WOOD_STAIR = register("jacaranda_wood_stair",
            () -> new StairWoods(JACARANDA_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(JACARANDA_WOOD).sound(SoundType.WOOD),"","","", true, STRIPPED_JACARANDA_WOOD_STAIR.get().defaultBlockState()), 5001);
    public static final RegistryObject<StairBlock> PALM_WOOD_STAIR = register("palm_wood_stair",
            () -> new StairWoods(PALM_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(PALM_WOOD).sound(SoundType.WOOD),"","","", true, STRIPPED_PALM_WOOD_STAIR.get().defaultBlockState()), 5001);
    public static final RegistryObject<StairBlock> WILLOW_WOOD_STAIR = register("willow_wood_stair",
            () -> new StairWoods(WILLOW_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(WILLOW_WOOD).sound(SoundType.WOOD),"","","", true, STRIPPED_WILLOW_WOOD_STAIR.get().defaultBlockState()), 5001);
    public static final RegistryObject<StairBlock> DEAD_WOOD_STAIR = register("dead_wood_stair",
            () -> new StairWoods(DEAD_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(DEAD_WOOD).sound(SoundType.WOOD),"","","", false, STRIPPED_DEAD_WOOD_STAIR.get().defaultBlockState()));
    public static final RegistryObject<StairBlock> MAGIC_WOOD_STAIR = register("magic_wood_stair",
            () -> new StairWoods(MAGIC_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(MAGIC_WOOD).sound(SoundType.WOOD),"","","", true, STRIPPED_MAGIC_WOOD_STAIR.get().defaultBlockState()), 5001);
    public static final RegistryObject<StairBlock> UMBRAN_WOOD_STAIR = register("umbran_wood_stair",
            () -> new StairWoods(UMBRAN_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(UMBRAN_WOOD).sound(SoundType.WOOD),"","","", true, STRIPPED_UMBRAN_WOOD_STAIR.get().defaultBlockState()), 5001);
    public static final RegistryObject<StairBlock> HELLBARK_WOOD_STAIR = register("hellbark_wood_stair",
            () -> new StairWoods(HELLBARK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(HELLBARK_WOOD).sound(SoundType.WOOD),"","","", false, STRIPPED_HELLBARK_WOOD_STAIR.get().defaultBlockState()));

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
