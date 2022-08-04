package com.dephoegon.delbridgebop.block.fences;

import com.dephoegon.delbridgebop.aid.extendedtypes.fence.FenceWoods;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
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

public class StrippedLogFences {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<FenceBlock> STRIPPED_FIR_LOG_FENCE = register("stripped_fir_log_fence",
            () -> new FenceWoods(BlockBehaviour.Properties.copy(FIR_WOOD).sound(SoundType.WOOD),"","","",true));
    public static final RegistryObject<FenceBlock> STRIPPED_REDWOOD_LOG_FENCE = register("stripped_redwood_log_fence",
            () -> new FenceWoods(BlockBehaviour.Properties.copy(REDWOOD_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<FenceBlock> STRIPPED_CHERRY_LOG_FENCE = register("stripped_cherry_log_fence",
            () -> new FenceWoods(BlockBehaviour.Properties.copy(CHERRY_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<FenceBlock> STRIPPED_MAHOGANY_LOG_FENCE = register("stripped_mahogany_log_fence",
            () -> new FenceWoods(BlockBehaviour.Properties.copy(MAHOGANY_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<FenceBlock> STRIPPED_JACARANDA_LOG_FENCE = register("stripped_jacaranda_log_fence",
            () -> new FenceWoods(BlockBehaviour.Properties.copy(JACARANDA_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<FenceBlock> STRIPPED_PALM_LOG_FENCE = register("stripped_palm_log_fence",
            () -> new FenceWoods(BlockBehaviour.Properties.copy(PALM_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<FenceBlock> STRIPPED_WILLOW_LOG_FENCE = register("stripped_willow_log_fence",
            () -> new FenceWoods(BlockBehaviour.Properties.copy(WILLOW_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<FenceBlock> STRIPPED_DEAD_LOG_FENCE = register("stripped_dead_log_fence",
            () -> new FenceWoods(BlockBehaviour.Properties.copy(DEAD_WOOD).sound(SoundType.WOOD),"","","", false));
    public static final RegistryObject<FenceBlock> STRIPPED_MAGIC_LOG_FENCE = register("stripped_magic_log_fence",
            () -> new FenceWoods(BlockBehaviour.Properties.copy(MAGIC_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<FenceBlock> STRIPPED_UMBRAN_LOG_FENCE = register("stripped_umbran_log_fence",
            () -> new FenceWoods(BlockBehaviour.Properties.copy(UMBRAN_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<FenceBlock> STRIPPED_HELLBARK_LOG_FENCE = register("stripped_hellbark_log_fence",
            () -> new FenceWoods(BlockBehaviour.Properties.copy(HELLBARK_WOOD).sound(SoundType.WOOD),"","","", false));

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
