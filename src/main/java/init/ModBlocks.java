package init;

import com.calebrudolph.Tale_of_Ice_and_Fire.Reference;
import com.calebrudolph.Tale_of_Ice_and_Fire.blocks.BlockRuby;

import items.ItemObsidianingot;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.GameData;
import net.minecraftforge.registries.IForgeRegistryEntry;

public class ModBlocks {

	public static Block rubyblock;
	
	public static void init() {
		rubyblock = new BlockRuby();
		
	}
	
	public static void register() {
		registerBlock(rubyblock);

	}
	
	private static void registerBlock(Block block) {
		register(rubyblock);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		register(item);
	}
	
	public static void registerRenders() {
		registerRender(rubyblock);
		
	}
	
	private static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(),"inventory"));
		
	}
	
	private static <K extends IForgeRegistryEntry<K>> K register(K object)
    {
        return (K)GameData.register_impl(object);
    }

}
