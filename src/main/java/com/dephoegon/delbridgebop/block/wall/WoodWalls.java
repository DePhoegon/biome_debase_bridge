package com.dephoegon.delbridgebop.block.wall;

import com.dephoegon.delbridgebop.aid.extendedtypes.wall.WallWoods;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WallBlock;
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
import static com.dephoegon.delbridgebop.block.wall.StrippedWoodWalls.*;

public class WoodWalls {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<WallBlock> FIR_WOOD_WALL = register("fir_wood_wall",
            () -> new WallWoods(BlockBehaviour.Properties.copy(FIR_WOOD).sound(SoundType.WOOD),"","","",true, STRIPPED_FIR_WOOD_WALL.get().defaultBlockState()), 5001);
    public static final RegistryObject<WallBlock> REDWOOD_WOOD_WALL = register("redwood_wood_wall",
            () -> new WallWoods(BlockBehaviour.Properties.copy(REDWOOD_WOOD).sound(SoundType.WOOD),"","","", true, STRIPPED_REDWOOD_WOOD_WALL.get().defaultBlockState()), 5001);
    public static final RegistryObject<WallBlock> CHERRY_WOOD_WALL = register("cherry_wood_wall",
            () -> new WallWoods(BlockBehaviour.Properties.copy(CHERRY_WOOD).sound(SoundType.WOOD),"","","", true, STRIPPED_CHERRY_WOOD_WALL.get().defaultBlockState()), 5001);
    public static final RegistryObject<WallBlock> MAHOGANY_WOOD_WALL = register("mahogany_wood_wall",
            () -> new WallWoods(BlockBehaviour.Properties.copy(MAHOGANY_WOOD).sound(SoundType.WOOD),"","","", true, STRIPPED_MAHOGANY_WOOD_WALL.get().defaultBlockState()), 5001);
    public static final RegistryObject<WallBlock> JACARANDA_WOOD_WALL = register("jacaranda_wood_wall",
            () -> new WallWoods(BlockBehaviour.Properties.copy(JACARANDA_WOOD).sound(SoundType.WOOD),"","","", true, STRIPPED_JACARANDA_WOOD_WALL.get().defaultBlockState()), 5001);
    public static final RegistryObject<WallBlock> PALM_WOOD_WALL = register("palm_wood_wall",
            () -> new WallWoods(BlockBehaviour.Properties.copy(PALM_WOOD).sound(SoundType.WOOD),"","","", true, STRIPPED_PALM_WOOD_WALL.get().defaultBlockState()), 5001);
    public static final RegistryObject<WallBlock> WILLOW_WOOD_WALL = register("willow_wood_wall",
            () -> new WallWoods(BlockBehaviour.Properties.copy(WILLOW_WOOD).sound(SoundType.WOOD),"","","", true, STRIPPED_WILLOW_WOOD_WALL.get().defaultBlockState()), 5001);
    public static final RegistryObject<WallBlock> DEAD_WOOD_WALL = register("dead_wood_wall",
            () -> new WallWoods(BlockBehaviour.Properties.copy(DEAD_WOOD).sound(SoundType.WOOD),"","","", false, STRIPPED_DEAD_WOOD_WALL.get().defaultBlockState()));
    public static final RegistryObject<WallBlock> MAGIC_WOOD_WALL = register("magic_wood_wall",
            () -> new WallWoods(BlockBehaviour.Properties.copy(MAGIC_WOOD).sound(SoundType.WOOD),"","","", true, STRIPPED_MAGIC_WOOD_WALL.get().defaultBlockState()), 5001);
    public static final RegistryObject<WallBlock> UMBRAN_WOOD_WALL = register("umbran_wood_wall",
            () -> new WallWoods(BlockBehaviour.Properties.copy(UMBRAN_WOOD).sound(SoundType.WOOD),"","","", true, STRIPPED_UMBRAN_WOOD_WALL.get().defaultBlockState()), 5001);
    public static final RegistryObject<WallBlock> HELLBARK_WOOD_WALL = register("hellbark_wood_wall",
            () -> new WallWoods(BlockBehaviour.Properties.copy(HELLBARK_WOOD).sound(SoundType.WOOD),"","","", false, STRIPPED_HELLBARK_WOOD_WALL.get().defaultBlockState()));

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
