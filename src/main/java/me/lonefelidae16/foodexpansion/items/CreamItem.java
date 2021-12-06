package me.lonefelidae16.foodexpansion.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.ItemGroup;

public class CreamItem extends MaterialItemBase {
    public CreamItem() {
        super(new FabricItemSettings().group(ItemGroup.MATERIALS).maxCount(64));
    }
}
