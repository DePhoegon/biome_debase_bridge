package com.dephoegon.delbridgebop.block.fence;

import com.dephoegon.delbridgebop.aid.extendedtypes.fence.FenceGateWoods;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceGateBlock;
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

public class StrippedWoodFenceGates {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<FenceGateBlock> STRIPPED_FIR_WOOD_FENCE_GATE = register("stripped_fir_wood_fence_gate",
            () -> new FenceGateWoods(BlockBehaviour.Properties.copy(FIR_WOOD).sound(SoundType.WOOD),"","","",true, null), 1000);
    public static final RegistryObject<FenceGateBlock> STRIPPED_REDWOOD_WOOD_FENCE_GATE = register("stripped_redwood_wood_fence_gate",
            () -> new FenceGateWoods(BlockBehaviour.Properties.copy(REDWOOD_WOOD).sound(SoundType.WOOD),"","","", true, null), 1000);
    public static final RegistryObject<FenceGateBlock> STRIPPED_CHERRY_WOOD_FENCE_GATE = register("stripped_cherry_wood_fence_gate",
            () -> new FenceGateWoods(BlockBehaviour.Properties.copy(CHERRY_WOOD).sound(SoundType.WOOD),"","","", true, null), 1000);
    public static final RegistryObject<FenceGateBlock> STRIPPED_MAHOGANY_WOOD_FENCE_GATE = register("stripped_mahogany_wood_fence_gate",
            () -> new FenceGateWoods(BlockBehaviour.Properties.copy(MAHOGANY_WOOD).sound(SoundType.WOOD),"","","", true, null), 1000);
    public static final RegistryObject<FenceGateBlock> STRIPPED_JACARANDA_WOOD_FENCE_GATE = register("stripped_jacaranda_wood_fence_gate",
            () -> new FenceGateWoods(BlockBehaviour.Properties.copy(JACARANDA_WOOD).sound(SoundType.WOOD),"","","", true, null), 1000);
    public static final RegistryObject<FenceGateBlock> STRIPPED_PALM_WOOD_FENCE_GATE = register("stripped_palm_wood_fence_gate",
            () -> new FenceGateWoods(BlockBehaviour.Properties.copy(PALM_WOOD).sound(SoundType.WOOD),"","","", true, null), 1000);
    public static final RegistryObject<FenceGateBlock> STRIPPED_WILLOW_WOOD_FENCE_GATE = register("stripped_willow_wood_fence_gate",
            () -> new FenceGateWoods(BlockBehaviour.Properties.copy(WILLOW_WOOD).sound(SoundType.WOOD),"","","", true, null), 1000);
    public static final RegistryObject<FenceGateBlock> STRIPPED_DEAD_WOOD_FENCE_GATE = register("stripped_dead_wood_fence_gate",
            () -> new FenceGateWoods(BlockBehaviour.Properties.copy(DEAD_WOOD).sound(SoundType.WOOD),"","","", false, null));
    public static final RegistryObject<FenceGateBlock> STRIPPED_MAGIC_WOOD_FENCE_GATE = register("stripped_magic_wood_fence_gate",
            () -> new FenceGateWoods(BlockBehaviour.Properties.copy(MAGIC_WOOD).sound(SoundType.WOOD),"","","", true, null), 1000);
    public static final RegistryObject<FenceGateBlock> STRIPPED_UMBRAN_WOOD_FENCE_GATE = register("stripped_umbran_wood_fence_gate",
            () -> new FenceGateWoods(BlockBehaviour.Properties.copy(UMBRAN_WOOD).sound(SoundType.WOOD),"","","", true, null), 1000);
    public static final RegistryObject<FenceGateBlock> STRIPPED_HELLBARK_WOOD_FENCE_GATE = register("stripped_hellbark_wood_fence_gate",
            () -> new FenceGateWoods(BlockBehaviour.Properties.copy(HELLBARK_WOOD).sound(SoundType.WOOD),"","","", false, null));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block, int burn) {
        RegistryObject<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(),
                new Item.Properties().stacksTo(64).tab(BASE_BLOCK)){
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
