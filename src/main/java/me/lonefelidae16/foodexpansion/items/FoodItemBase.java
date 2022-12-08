package me.lonefelidae16.foodexpansion.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.util.UseAction;


/**
 * Base class of Food
 */
public abstract class FoodItemBase extends Item {
    protected FoodItemBase(FoodComponent component) {
        // 1スタック最大64個
        super(new FabricItemSettings().maxCount(64).food(component));
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        // can eat
        return UseAction.EAT;
    }
}
