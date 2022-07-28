package me.lonefelidae16.foodexpansion.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public abstract class MaterialItemBase extends Item {
    public MaterialItemBase() {
        super(new FabricItemSettings().group(ItemGroup.MATERIALS).maxCount(64));
    }
}
