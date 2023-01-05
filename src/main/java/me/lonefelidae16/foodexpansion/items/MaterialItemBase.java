package me.lonefelidae16.foodexpansion.items;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;

public abstract class MaterialItemBase extends Item {
    public MaterialItemBase(Item.Settings itemSettings) {
        super(itemSettings);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> entries.add(this));
    }
}
