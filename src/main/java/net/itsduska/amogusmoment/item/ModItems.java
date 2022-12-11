package net.itsduska.amogusmoment.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.itsduska.amogusmoment.AmogusMoment;
import net.itsduska.amogusmoment.item.custom.AmogusItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item AMOGUSITEM = registerItem("amogus",
            new AmogusItem(new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    private static Item registerItem(String name,Item item){
        return Registry.register(Registry.ITEM,new Identifier(AmogusMoment.MOD_ID,name),item);
    }

    public static void registerModItems(){
        AmogusMoment.LOGGER.debug("Registering Mod Items for " + AmogusMoment.MOD_ID);
    }
}
