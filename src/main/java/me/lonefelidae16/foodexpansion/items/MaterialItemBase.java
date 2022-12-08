package me.lonefelidae16.foodexpansion.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

public abstract class MaterialItemBase extends Item {
    public MaterialItemBase() {
        super(new FabricItemSettings().maxCount(64));
    }
}
