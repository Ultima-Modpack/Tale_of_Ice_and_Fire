package init;

import com.calebrudolph.Tale_of_Ice_and_Fire.Reference;

import items.ItemObsidianingot;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.GameData;
import net.minecraftforge.registries.IForgeRegistryEntry;

public class ModItems {
	
	public static Item obsidianingot;
		
	
	public static void init() {
		obsidianingot = new ItemObsidianingot();
		
	}
	
	public static void register() {
		register(obsidianingot);

	}
	
	public static void registerRenders() {
		registerRender(obsidianingot);
		
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(),"inventory"));
		
	}
	
	private static <K extends IForgeRegistryEntry<K>> K register(K object)
    {
        return (K)GameData.register_impl(object);
    }

}
