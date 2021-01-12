
package net.mcreator.randomtidsandbits.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.mcreator.randomtidsandbits.itemgroup.TidsandBitsItemGroup;
import net.mcreator.randomtidsandbits.RandomTidsAndBitsModElements;

import java.util.List;

@RandomTidsAndBitsModElements.ModElement.Tag
public class TidsItem extends RandomTidsAndBitsModElements.ModElement {
	@ObjectHolder("random_tids_and_bits:tids")
	public static final Item block = null;
	public TidsItem(RandomTidsAndBitsModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(TidsandBitsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("tids");
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

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Main Item"));
		}
	}
}
