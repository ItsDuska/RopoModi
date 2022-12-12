package net.itsduska.amogusmoment.item.custom;

import net.itsduska.amogusmoment.sound.ModSounds;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;


public class AmogusItem extends Item {
    public AmogusItem(Settings settings){
        super(settings);
    }


    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        float NOTE = world.random.nextFloat();
        playerEntity.playSound(ModSounds.AMOGUS, 1.0F, NOTE);
        playerEntity.getItemCooldownManager().set(this,30);
        return new TypedActionResult<>(ActionResult.SUCCESS, playerEntity.getStackInHand(hand));
    }

}
