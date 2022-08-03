package com.dephoegon.delbridgebop.aid.extendedtypes.stair;

import com.dephoegon.delbase.aid.block.alt.woodStair;
import net.minecraft.world.level.block.state.BlockState;

import java.util.function.Supplier;

public class StairWoods extends woodStair {
    public StairWoods(Supplier<BlockState> state, Properties properties, String normToolTip, String shiftToolTip, String ctrlToolTip, boolean flame) {
        super(state, properties, normToolTip, shiftToolTip, ctrlToolTip, flame);
    }
}
