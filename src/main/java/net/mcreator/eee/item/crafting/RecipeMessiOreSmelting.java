
package net.mcreator.eee.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.eee.item.ItemMessi;
import net.mcreator.eee.block.BlockMessiOre;
import net.mcreator.eee.ElementsEeeMod;

@ElementsEeeMod.ModElement.Tag
public class RecipeMessiOreSmelting extends ElementsEeeMod.ModElement {
	public RecipeMessiOreSmelting(ElementsEeeMod instance) {
		super(instance, 44);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockMessiOre.block, (int) (1)), new ItemStack(ItemMessi.block, (int) (1)), 0.7F);
	}
}
