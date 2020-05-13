package com.supermartijn642.connectedglass;

import net.minecraft.block.IBeaconBeamColorProvider;
import net.minecraft.item.DyeColor;
import net.minecraft.util.BlockRenderLayer;

/**
 * Created 5/11/2020 by SuperMartijn642
 */
public class CGColoredGlassBlock extends CGGlassBlock implements IBeaconBeamColorProvider {

    private DyeColor color;

    public CGColoredGlassBlock(String registryName, String texture, boolean connected, DyeColor color){
        super(registryName, texture, connected);
        this.color = color;
    }

    public CGColoredGlassBlock(String registryName, boolean connected, DyeColor color){
        this(registryName, registryName, connected, color);
    }

    @Override
    public DyeColor getColor(){
        return this.color;
    }

    @Override
    public CGPaneBlock createPane(){
        return new CGColoredPaneBlock(this);
    }

    @Override
    public BlockRenderLayer getRenderLayer(){
        return BlockRenderLayer.TRANSLUCENT;
    }
}
