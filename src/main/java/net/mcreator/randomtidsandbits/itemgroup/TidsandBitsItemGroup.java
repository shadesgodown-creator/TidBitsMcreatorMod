
package net.mcreator.randomtidsandbits.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.randomtidsandbits.item.TidBitsItem;
import net.mcreator.randomtidsandbits.RandomTidsAndBitsModElements;

@RandomTidsAndBitsModElements.ModElement.Tag
public class TidsandBitsItemGroup extends RandomTidsAndBitsModElements.ModElement {
	public TidsandBitsItemGroup(RandomTidsAndBitsModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabtidsand_bits") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(TidBitsItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
