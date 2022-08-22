package com.dephoegon.delbridgebop.aid.extendedtypes.fence;
import com.dephoegon.delbase.aid.block.stock.fenceBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class FenceMiscs extends fenceBlock {
    public FenceMiscs(Properties properties, String normToolTip, String shiftToolTip, String ctrlToolTip, boolean flames, BlockState strippedState) {
        super(properties, normToolTip, shiftToolTip, ctrlToolTip, flames, strippedState);
    }
}
