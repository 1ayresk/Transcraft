package mark123mark.mods.transcraft.Renders.Blocks;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import mark123mark.mods.transcraft.Transcraft;
import mark123mark.mods.transcraft.TranscraftClientProxy;
import mark123mark.mods.transcraft.Renders.BlockRenderBase;
import mark123mark.mods.transcraft.Renders.IconRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;



public class RenderTranscraftOre implements ISimpleBlockRenderingHandler {

    @Override
    public void renderInventoryBlock(Block block, int metadata, int modelID,
                    RenderBlocks renderer) {
            
    }

    @Override
    public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z,
                    Block block, int modelId, RenderBlocks renderer) {
            
    	if(world.getBlockMetadata(x, y, z) == 0)
    	{
    		//which render pass are we doing?
            if(TranscraftClientProxy.renderPass == 0)
            {
                    //we are on the solid block render pass, lets render the solid diamond block   
                    renderer.renderStandardBlock(Block.stone, x, y, z);
            }
            else                    
            {
                    //we are on the alpha render pass, draw the ice around the diamond
                    renderer.renderStandardBlock(Block.glass, x, y, z);
                    
            }
            
            return true;
    	}
    	else
    	{
    		renderer.renderStandardBlock(block, x, y, z);
    	}
    	return true;
    }


    
    @Override
    public boolean shouldRender3DInInventory() {
            
            return false;
    }

    @Override
    public int getRenderId() {
            
            return TranscraftClientProxy.TranscraftOreRenderType;
    }

}
