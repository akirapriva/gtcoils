import net.minecraftforge.event.entity.player.ArrowNockEvent
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickItem
import net.minecraft.util.ActionResult
import net.minecraft.util.EnumActionResult
import net.minecraft.advancements.critereon.ConsumeItemTrigger
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLiving;
import net.minecraft.world.IBlockAccess;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import gregtech.api.block.VariantBlock;
import gregtech.api.block.IHeatingCoilBlockStats;
import gregtech.api.unification.material.Material;
import gregtech.client.utils.TooltipHelper;
import gregtech.common.metatileentities.multi.electric.MetaTileEntityMultiSmelter;


content.createItem('steam_motor').register()
content.createItem('ncancmp').register()
content.createItem('mmssi').register()

class CustomItem extends Item {
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
        ItemStack stack = player.getHeldItem(hand)
        world.createExplosion(player, player.posX, player.posY, player.posZ, 100, true)
        stack.shrink(1)
        return new ActionResult<>(EnumActionResult.SUCCESS, player.getHeldItem(hand));
    }
}

content.registerItem('mmussi', new CustomItem())
content.createItem('max_mainframe').register()

