package mctmods.immersivetechnology.common.util.compat.jei.distiller;

import blusunrize.immersiveengineering.api.crafting.MultiblockRecipe;
import blusunrize.immersiveengineering.common.util.compat.jei.MultiblockRecipeWrapper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class DistillerRecipeWrapper extends MultiblockRecipeWrapper {

	public MultiblockRecipe recipe;

	public DistillerRecipeWrapper(MultiblockRecipe recipe) {
		super(recipe);
		this.recipe = recipe;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void drawInfo(Minecraft minecraft, int recipeWidth, int recipeHeight, int mouseX, int mouseY) {
		String text = (GuiScreen.isShiftKeyDown())? recipe.getTotalProcessTime() + "t" : ((float)recipe.getTotalProcessTime()) / 20 + "s";
		minecraft.fontRenderer.drawString(text, 16, 5, 0x8B8B8B, true);
	}

}