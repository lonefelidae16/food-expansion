package me.lonefelidae16.foodexpansion.items;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.util.UseAction;


/**
 * Base class of Food
 */
public abstract class FoodItemBase extends Item {
    protected FoodItemBase(Item.Settings itemSettings) {
        super(itemSettings);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> entries.add(this));
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        // can eat
        return UseAction.EAT;
    }
}
