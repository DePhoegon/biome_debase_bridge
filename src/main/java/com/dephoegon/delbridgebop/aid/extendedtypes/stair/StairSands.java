package com.dephoegon.delbridgebop.aid.extendedtypes.stair;

import com.dephoegon.delbase.aid.block.stock.stairBlock;
import net.minecraft.world.level.block.state.BlockState;

import java.util.function.Supplier;

public class StairSands extends stairBlock {
    public StairSands(Supplier<BlockState> state, Properties properties, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(state, properties, normToolTip, shiftToolTip, ctrlToolTip, false, null);
    }
}
