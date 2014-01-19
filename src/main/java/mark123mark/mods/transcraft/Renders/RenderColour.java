package mark123mark.mods.transcraft.Renders;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RenderColour 
{
	private static int RenderColours = 16;
	public static final RenderColour[] RenderColourS = new RenderColour[RenderColours];
	
	public static final RenderColour BLACK			= new RenderColour(0x19, 0x19, 0x19, "Black");
	public static final RenderColour RED			= new RenderColour(0x99, 0x33, 0x33, "Red");
	public static final RenderColour GREEN			= new RenderColour(0x66, 0x7F, 0x33, "Green");
	public static final RenderColour BROWN			= new RenderColour(0x66, 0x4C, 0x33, "Brown");
	public static final RenderColour BLUE			= new RenderColour(0x33, 0x4C, 0xB2, "Blue");
	public static final RenderColour PURPLE		= new RenderColour(0x7F, 0x3F, 0xB2, "Purple");
	public static final RenderColour CYAN			= new RenderColour(0x4C, 0x7F, 0x99, "Cyan");
	public static final RenderColour LIGHT_GRAY	= new RenderColour(0x99, 0x99, 0x99, "Light Gray");
	public static final RenderColour DARK_GRAY		= new RenderColour(0x4C, 0x4C, 0x4C, "Dark Gray");
	public static final RenderColour PINK			= new RenderColour(0xF2, 0x7F, 0xA2, "Pink");
	public static final RenderColour LIME			= new RenderColour(0x7F, 0xCC, 0x19, "Lime");
	public static final RenderColour YELLOW		= new RenderColour(0xE5, 0xE5, 0x33, "Yellow");
	public static final RenderColour LIGHT_BLUE	= new RenderColour(0x66, 0x99, 0xD8, "Light Blue");
	public static final RenderColour MAGENTA		= new RenderColour(0xB2, 0x4C, 0xD8, "Magenta");
	public static final RenderColour ORANGE		= new RenderColour(0xD8, 0x7F, 0x33, "Orange");
	public static final RenderColour WHITE			= new RenderColour(0xFF, 0xFF, 0xFF, "White");
	
	public final int id;
	public final int r, g, b;
	public final String name;
	private final ItemStack dye;
	
	public RenderColour(int red, int green, int blue, String name){
		this.id = --RenderColours;
		this.r = red;
		this.g = green;
		this.b = blue;
		this.name = name;
		this.dye = new ItemStack(Item.dyePowder, 1, 15 - id);
		RenderColourS[id] = this;
	}
	
	public float r(){
		return ((float)r) / 255F;
	}
	
	public float g(){
		return ((float)g) / 255F;
	}
	
	public float b(){
		return ((float)b) / 255F;
	}
	
	public ItemStack getDye(){
		return dye.copy();
	}
}
