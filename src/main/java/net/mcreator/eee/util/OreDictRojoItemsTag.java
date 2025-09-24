
package net.mcreator.eee.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.eee.block.BlockRojoWood;
import net.mcreator.eee.block.BlockRojoLog;
import net.mcreator.eee.ElementsEeeMod;

@ElementsEeeMod.ModElement.Tag
public class OreDictRojoItemsTag extends ElementsEeeMod.ModElement {
	public OreDictRojoItemsTag(ElementsEeeMod instance) {
		super(instance, 43);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("rojo_log", new ItemStack(BlockRojoWood.block, (int) (1)));
		OreDictionary.registerOre("rojo_log", new ItemStack(BlockRojoLog.block, (int) (1)));
	}
}
