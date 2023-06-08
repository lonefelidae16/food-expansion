package me.lonefelidae16.foodexpansion.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;

public class FoodItem extends FoodItemBase {
    protected FoodItem(FoodComponent component) {
        super(new FabricItemSettings().maxCount(64).food(component));
    }
}
