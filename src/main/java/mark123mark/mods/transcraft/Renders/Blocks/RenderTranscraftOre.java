package mark123mark.mods.transcraft.Renders.Blocks;

import mark123mark.mods.transcraft.Renders.BlockRenderBase;
import mark123mark.mods.transcraft.Renders.IconRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;



public class RenderTranscraftOre extends BlockRenderBase 
{
	private static final RenderTranscraftOre INSTANCE = new RenderTranscraftOre();
	
	public static final String FACE_TRANSMUTTER_ORE = "transcraft:ores/ore_Transmutter";
	public static final String GLOW_TRANSMUTTER_ORE = "transcraft:ores/glow_Transmutter";
	
	public static RenderTranscraftOre instance(){
		return INSTANCE;
	}
	
	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer){
		if(world.getBlockMetadata(x, y, z) == 0)
		{
			Icon face = IconRegistry.blockIcons.get(FACE_TRANSMUTTER_ORE);
			Icon glow = IconRegistry.blockIcons.get(GLOW_TRANSMUTTER_ORE);
			renderer.setOverrideBlockTexture(face);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
			Tessellator tessellator = Tessellator.instance;
			tessellator.setColorOpaque_I(0xFFFFFF);
			tessellator.setBrightness(220);		

			/*################################################################# NEEDS FIXING
			 * 

			
			if(block.shouldSideBeRendered(world, x - 1, y, z, 4) || renderer.renderAllFaces){
				renderer.renderFaceXNeg(block, x, y, z, glow);
			}
			if(block.shouldSideBeRendered(world, x, y - 1, z, 0) || renderer.renderAllFaces){
				renderer.renderFaceYNeg(block, x, y, z, glow);
			}
			if(block.shouldSideBeRendered(world, x, y, z - 1, 2) || renderer.renderAllFaces){
				renderer.renderFaceZNeg(block, x, y, z, glow);
			}
			if(block.shouldSideBeRendered(world, x + 1, y, z, 5) || renderer.renderAllFaces){
				renderer.renderFaceXPos(block, x, y, z, glow);
			}
			if(block.shouldSideBeRendered(world, x, y + 1, z, 1) || renderer.renderAllFaces){
				renderer.renderFaceYPos(block, x, y, z, glow);
			}
			if(block.shouldSideBeRendered(world, x, y, z + 1, 3) || renderer.renderAllFaces){
				renderer.renderFaceZPos(block, x, y, z, glow);
			}
			
*/
			
			return true;
		}
		else
		{
			renderer.renderStandardBlock(block, x, y, z);
		}
		
		return false;
	}

}
