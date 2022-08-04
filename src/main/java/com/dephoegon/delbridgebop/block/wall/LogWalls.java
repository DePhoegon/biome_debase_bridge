package com.dephoegon.delbridgebop.block.wall;

import com.dephoegon.delbridgebop.aid.extendedtypes.wall.WallWoods;
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

import static biomesoplenty.api.block.BOPBlocks.*;
import static com.dephoegon.delbase.delbase.BASE_BLOCK;
import static com.dephoegon.delbridgebop.DelBridgeBOP.Mod_ID;

public class LogWalls {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<WallBlock> FIR_LOG_WALL = register("fir_log_wall",
            () -> new WallWoods(BlockBehaviour.Properties.copy(FIR_WOOD).sound(SoundType.WOOD),"","","",true));
    public static final RegistryObject<WallBlock> REDWOOD_LOG_WALL = register("redwood_log_wall",
            () -> new WallWoods(BlockBehaviour.Properties.copy(REDWOOD_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<WallBlock> CHERRY_LOG_WALL = register("cherry_log_wall",
            () -> new WallWoods(BlockBehaviour.Properties.copy(CHERRY_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<WallBlock> MAHOGANY_LOG_WALL = register("mahogany_log_wall",
            () -> new WallWoods(BlockBehaviour.Properties.copy(MAHOGANY_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<WallBlock> JACARANDA_LOG_WALL = register("jacaranda_log_wall",
            () -> new WallWoods(BlockBehaviour.Properties.copy(JACARANDA_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<WallBlock> PALM_LOG_WALL = register("palm_log_wall",
            () -> new WallWoods(BlockBehaviour.Properties.copy(PALM_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<WallBlock> WILLOW_LOG_WALL = register("willow_log_wall",
            () -> new WallWoods(BlockBehaviour.Properties.copy(WILLOW_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<WallBlock> DEAD_LOG_WALL = register("dead_log_wall",
            () -> new WallWoods(BlockBehaviour.Properties.copy(DEAD_WOOD).sound(SoundType.WOOD),"","","", false));
    public static final RegistryObject<WallBlock> MAGIC_LOG_WALL = register("magic_log_wall",
            () -> new WallWoods(BlockBehaviour.Properties.copy(MAGIC_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<WallBlock> UMBRAN_LOG_WALL = register("umbran_log_wall",
            () -> new WallWoods(BlockBehaviour.Properties.copy(UMBRAN_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<WallBlock> HELLBARK_LOG_WALL = register("hellbark_log_wall",
            () -> new WallWoods(BlockBehaviour.Properties.copy(HELLBARK_WOOD).sound(SoundType.WOOD),"","","", false));

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
