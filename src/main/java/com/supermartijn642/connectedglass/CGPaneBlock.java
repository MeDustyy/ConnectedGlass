package com.supermartijn642.connectedglass;

import com.supermartijn642.core.block.EditableBlockRenderLayer;
import net.minecraft.block.PaneBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.state.BooleanProperty;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.Direction;

/**
 * Created 5/11/2020 by SuperMartijn642
 */
public class CGPaneBlock extends PaneBlock implements EditableBlockRenderLayer {

    public final CGGlassBlock block;
    private BlockRenderLayer renderLayer;

    public CGPaneBlock(CGGlassBlock block){
        super(Properties.of(Material.GLASS).sound(SoundType.GLASS).strength(0.3f));
        this.block = block;
    }

    public static BooleanProperty getConnectionProperty(Direction side){
        return PROPERTY_BY_DIRECTION.get(side);
    }

    @Override
    public void setRenderLayer(BlockRenderLayer layer){
        this.renderLayer = layer;
    }

    @Override
    public BlockRenderLayer getRenderLayer(){
        return this.renderLayer;
    }
}
