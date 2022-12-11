package net.itsduska.amogusmoment.item.custom;

import net.itsduska.amogusmoment.sound.ModSounds;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.ActionResult;



public class AmogusItem extends Item {
    public AmogusItem(Settings settings){
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if (!context.getWorld().isClient) {
            context.getWorld().playSound(context.getPlayer(),context.getBlockPos(),ModSounds.AMOGUS,SoundCategory.BLOCKS,1f,1f);
            context.getPlayer().getItemCooldownManager().set(this,30);
        }
        return super.useOnBlock(context);
    }
}
