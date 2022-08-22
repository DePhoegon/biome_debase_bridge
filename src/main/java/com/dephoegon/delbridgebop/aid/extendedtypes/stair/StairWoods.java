package com.dephoegon.delbridgebop.aid.extendedtypes.stair;

import com.dephoegon.delbase.aid.block.alt.woodStair;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.level.block.state.properties.StairsShape;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class StairWoods extends woodStair {
    public StairWoods(Supplier<BlockState> state, Properties properties, String normToolTip, String shiftToolTip, String ctrlToolTip, boolean flame, BlockState strippedState) {
        super(state, properties, normToolTip, shiftToolTip, ctrlToolTip, flame, strippedState);
    }
}
