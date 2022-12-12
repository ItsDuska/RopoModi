package net.itsduska.amogusmoment.sound;

import net.itsduska.amogusmoment.AmogusMoment;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {
    public static SoundEvent AMOGUS = registerSoundEvent("amogus");

    private static SoundEvent registerSoundEvent(String name){
        Identifier id = new Identifier(AmogusMoment.MOD_ID,name);
        return Registry.register(Registry.SOUND_EVENT,id,new SoundEvent(id));
    }
    public static void registerModSounds(){
        AmogusMoment.LOGGER.debug("Registering Mod Sounds for " + AmogusMoment.MOD_ID);
    }
}
//custom amogus itemissa laita tää jotta soi ääni
//context.getWorld.playSound(player,positionClicked, ModSounds.AMOGUS, SoundCategory.BLOCKS, 1f,1f);