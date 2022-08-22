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

public class StrippedLogWalls {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<WallBlock> STRIPPED_FIR_LOG_WALL = register("stripped_fir_log_wall",
            () -> new WallWoods(BlockBehaviour.Properties.copy(FIR_WOOD).sound(SoundType.WOOD),"","","",true, null), 5001);
    public static final RegistryObject<WallBlock> STRIPPED_REDWOOD_LOG_WALL = register("stripped_redwood_log_wall",
            () -> new WallWoods(BlockBehaviour.Properties.copy(REDWOOD_WOOD).sound(SoundType.WOOD),"","","", true, null), 5001);
    public static final RegistryObject<WallBlock> STRIPPED_CHERRY_LOG_WALL = register("stripped_cherry_log_wall",
            () -> new WallWoods(BlockBehaviour.Properties.copy(CHERRY_WOOD).sound(SoundType.WOOD),"","","", true, null), 5001);
    public static final RegistryObject<WallBlock> STRIPPED_MAHOGANY_LOG_WALL = register("stripped_mahogany_log_wall",
            () -> new WallWoods(BlockBehaviour.Properties.copy(MAHOGANY_WOOD).sound(SoundType.WOOD),"","","", true, null), 5001);
    public static final RegistryObject<WallBlock> STRIPPED_JACARANDA_LOG_WALL = register("stripped_jacaranda_log_wall",
            () -> new WallWoods(BlockBehaviour.Properties.copy(JACARANDA_WOOD).sound(SoundType.WOOD),"","","", true, null), 5001);
    public static final RegistryObject<WallBlock> STRIPPED_PALM_LOG_WALL = register("stripped_palm_log_wall",
            () -> new WallWoods(BlockBehaviour.Properties.copy(PALM_WOOD).sound(SoundType.WOOD),"","","", true, null), 5001);
    public static final RegistryObject<WallBlock> STRIPPED_WILLOW_LOG_WALL = register("stripped_willow_log_wall",
            () -> new WallWoods(BlockBehaviour.Properties.copy(WILLOW_WOOD).sound(SoundType.WOOD),"","","", true, null), 5001);
    public static final RegistryObject<WallBlock> STRIPPED_DEAD_LOG_WALL = register("stripped_dead_log_wall",
            () -> new WallWoods(BlockBehaviour.Properties.copy(DEAD_WOOD).sound(SoundType.WOOD),"","","", false, null));
    public static final RegistryObject<WallBlock> STRIPPED_MAGIC_LOG_WALL = register("stripped_magic_log_wall",
            () -> new WallWoods(BlockBehaviour.Properties.copy(MAGIC_WOOD).sound(SoundType.WOOD),"","","", true, null), 5001);
    public static final RegistryObject<WallBlock> STRIPPED_UMBRAN_LOG_WALL = register("stripped_umbran_log_wall",
            () -> new WallWoods(BlockBehaviour.Properties.copy(UMBRAN_WOOD).sound(SoundType.WOOD),"","","", true, null), 5001);
    public static final RegistryObject<WallBlock> STRIPPED_HELLBARK_LOG_WALL = register("stripped_hellbark_log_wall",
            () -> new WallWoods(BlockBehaviour.Properties.copy(HELLBARK_WOOD).sound(SoundType.WOOD),"","","", false, null));

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
