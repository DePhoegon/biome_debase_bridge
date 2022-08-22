package com.dephoegon.delbridgebop.aid.extendedtypes.slab;
import com.dephoegon.delbase.aid.block.stock.energySlab;
import net.minecraft.world.level.block.state.BlockState;

public class SlabEnergies extends energySlab {
    public SlabEnergies(Properties properties, String normToolTip, String shiftToolTip, String ctrlToolTip, boolean flame, BlockState strippedState) {
        super(properties, normToolTip, shiftToolTip, ctrlToolTip, flame, strippedState);
    }
}
