package com.calebrudolph.Tale_of_Ice_and_Fire.blocks;

import com.calebrudolph.Tale_of_Ice_and_Fire.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRuby extends Block {

	public BlockRuby() {
		super(Material.IRON);
		setUnlocalizedName(Reference.Tale_of_Ice_and_FireBlocks.RUBYBLOCK.getUnlocalizedName());
		setRegistryName(Reference.Tale_of_Ice_and_FireBlocks.RUBYBLOCK.getRegistryName());
	}

}
