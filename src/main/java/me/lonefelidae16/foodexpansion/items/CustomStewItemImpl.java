package me.lonefelidae16.foodexpansion.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;

public class CustomStewItemImpl extends StewItem {
    public CustomStewItemImpl(FoodComponent component) {
        super(new FabricItemSettings().maxCount(1).food(component));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> entries.add(this));
    }
}
