package me.lonefelidae16.foodexpansion.items;

import me.lonefelidae16.foodexpansion.FoodExpansion;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ItemInitializer {
    public static final Item CREAM_BUN;
    public static final Item BEEF_SANDWICH;
    public static final Item PORK_SANDWICH;
    public static final Item MUTTON_SANDWICH;
    public static final Item CHICKEN_SANDWICH;
    public static final Item SALMON_SANDWICH;
    public static final Item FISH_SANDWICH;
    public static final Item RABBIT_SANDWICH;
    public static final Item APPLE_PIE;
    public static final Item CARROT_PIE;
    public static final Item GLOW_BERRIES_PIE;
    public static final Item SWEET_BERRIES_PIE;
    public static final Item CUSTARD_CREAM;

    static {
        // foods
        BEEF_SANDWICH = new BreadItem((new FoodComponent.Builder()).hunger(10).saturationModifier(1f).build());
        PORK_SANDWICH = new BreadItem((new FoodComponent.Builder()).hunger(10).saturationModifier(1f).build());
        MUTTON_SANDWICH = new BreadItem((new FoodComponent.Builder()).hunger(9).saturationModifier(.95f).build());
        SALMON_SANDWICH = new BreadItem((new FoodComponent.Builder()).hunger(9).saturationModifier(.95f).build());
        CHICKEN_SANDWICH = new BreadItem((new FoodComponent.Builder()).hunger(9).saturationModifier(.84f).build());
        FISH_SANDWICH = new BreadItem((new FoodComponent.Builder()).hunger(8).saturationModifier(.9f).build());
        RABBIT_SANDWICH = new BreadItem((new FoodComponent.Builder()).hunger(8).saturationModifier(.9f).build());
        CREAM_BUN = new BreadItem((new FoodComponent.Builder()).hunger(8).saturationModifier(.7f).build());

        APPLE_PIE = new PieItem((new FoodComponent.Builder()).hunger(8).saturationModifier(.38f).build());
        CARROT_PIE = new PieItem((new FoodComponent.Builder()).hunger(8).saturationModifier(.3f).build());
        GLOW_BERRIES_PIE = new PieItem((new FoodComponent.Builder()).hunger(7).saturationModifier(.3f).statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 20 * 10), 1).build());
        SWEET_BERRIES_PIE = new PieItem((new FoodComponent.Builder()).hunger(7).saturationModifier(.3f).build());

        // materials
        CUSTARD_CREAM = new CreamItem();
    }

    /**
     * register all items
     */
    public static void init() {
        // アイテムいろいろ
        Registry.register(Registry.ITEM, new Identifier(FoodExpansion.MOD_ID, "cream_bun"), ItemInitializer.CREAM_BUN);
        Registry.register(Registry.ITEM, new Identifier(FoodExpansion.MOD_ID, "beef_sandwich"), ItemInitializer.BEEF_SANDWICH);
        Registry.register(Registry.ITEM, new Identifier(FoodExpansion.MOD_ID, "pork_sandwich"), ItemInitializer.PORK_SANDWICH);
        Registry.register(Registry.ITEM, new Identifier(FoodExpansion.MOD_ID, "mutton_sandwich"), ItemInitializer.MUTTON_SANDWICH);
        Registry.register(Registry.ITEM, new Identifier(FoodExpansion.MOD_ID, "chicken_sandwich"), ItemInitializer.CHICKEN_SANDWICH);
        Registry.register(Registry.ITEM, new Identifier(FoodExpansion.MOD_ID, "salmon_sandwich"), ItemInitializer.SALMON_SANDWICH);
        Registry.register(Registry.ITEM, new Identifier(FoodExpansion.MOD_ID, "fish_sandwich"), ItemInitializer.FISH_SANDWICH);
        Registry.register(Registry.ITEM, new Identifier(FoodExpansion.MOD_ID, "rabbit_sandwich"), ItemInitializer.RABBIT_SANDWICH);
        Registry.register(Registry.ITEM, new Identifier(FoodExpansion.MOD_ID, "apple_pie"), ItemInitializer.APPLE_PIE);
        Registry.register(Registry.ITEM, new Identifier(FoodExpansion.MOD_ID, "carrot_pie"), ItemInitializer.CARROT_PIE);
        Registry.register(Registry.ITEM, new Identifier(FoodExpansion.MOD_ID, "glow_berries_pie"), ItemInitializer.GLOW_BERRIES_PIE);
        Registry.register(Registry.ITEM, new Identifier(FoodExpansion.MOD_ID, "sweet_berries_pie"), ItemInitializer.SWEET_BERRIES_PIE);

        // 中間素材
        Registry.register(Registry.ITEM, new Identifier(FoodExpansion.MOD_ID, "custard_cream"), ItemInitializer.CUSTARD_CREAM);
    }
}
