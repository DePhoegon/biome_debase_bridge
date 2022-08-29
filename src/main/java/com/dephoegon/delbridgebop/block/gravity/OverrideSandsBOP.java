package com.dephoegon.delbridgebop.block.gravity;

import biomesoplenty.api.block.BOPBlocks;
import biomesoplenty.common.util.CreativeModeTabBOP;
import biomesoplenty.core.BiomesOPlenty;
import com.dephoegon.delbase.aid.block.colorshift.grav.sandBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SandBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class OverrideSandsBOP {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BiomesOPlenty.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BiomesOPlenty.MOD_ID);

    public static final RegistryObject<SandBlock> WHITE_SAND = register("white_sand",
            () -> new sandBlock(0xffffff, BlockBehaviour.Properties.copy(BOPBlocks.WHITE_SAND).sound(SoundType.SAND),"tooltip.delbridgebop.bop","","",true));
    public static final RegistryObject<SandBlock> ORANGE_SAND = register("orange_sand",
            () -> new sandBlock(0xcc9a61, BlockBehaviour.Properties.copy(BOPBlocks.ORANGE_SAND).sound(SoundType.SAND),"tooltip.delbridgebop.bop","","",true));
    public static final RegistryObject<SandBlock> BLACK_SAND = register("black_sand",
            () -> new sandBlock(0x000000, BlockBehaviour.Properties.copy(BOPBlocks.BLACK_SAND).sound(SoundType.SAND),"tooltip.delbridgebop.bop","","",true));
    public static final RegistryObject<SandBlock> ROOTED_SAND = register("rooted_sand",
            () -> new sandBlock(14406560, BlockBehaviour.Properties.copy(BOPBlocks.ROOTED_SAND).sound(SoundType.SAND),"","","",true));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(), new Item.Properties().stacksTo(64).tab(CreativeModeTabBOP.INSTANCE)));
        return exit;
    }
}
