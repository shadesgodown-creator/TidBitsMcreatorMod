
package net.mcreator.randomtidsandbits.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.randomtidsandbits.itemgroup.TidsandBitsItemGroup;
import net.mcreator.randomtidsandbits.RandomTidsAndBitsModElements;

@RandomTidsAndBitsModElements.ModElement.Tag
public class BitsItem extends RandomTidsAndBitsModElements.ModElement {
	@ObjectHolder("random_tids_and_bits:bits")
	public static final Item block = null;
	public BitsItem(RandomTidsAndBitsModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(TidsandBitsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("bits");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
