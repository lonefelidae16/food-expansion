package me.lonefelidae16.foodexpansion.items;

import me.lonefelidae16.foodexpansion.FoodExpansion;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;


public class ItemsInitializer {
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
    public static final Item BEEF_STEW;
    public static final Item PORK_STEW;
    public static final Item MUTTON_STEW;
    public static final Item SALMON_STEW;
    public static final Item CHICKEN_STEW;
    public static final Item FISH_STEW;
    public static final Item CUSTARD_CREAM;

    static {
        // foods
        BEEF_SANDWICH = new BreadItem(new FoodComponent.Builder().hunger(10).saturationModifier(.9f).build());
        PORK_SANDWICH = new BreadItem(new FoodComponent.Builder().hunger(10).saturationModifier(.9f).build());
        MUTTON_SANDWICH = new BreadItem(new FoodComponent.Builder().hunger(8).saturationModifier(.9f).build());
        SALMON_SANDWICH = new BreadItem(new FoodComponent.Builder().hunger(8).saturationModifier(.9f).build());
        CHICKEN_SANDWICH = new BreadItem(new FoodComponent.Builder().hunger(8).saturationModifier(.8f).build());
        FISH_SANDWICH = new BreadItem(new FoodComponent.Builder().hunger(7).saturationModifier(.8f).build());
        RABBIT_SANDWICH = new BreadItem(new FoodComponent.Builder().hunger(7).saturationModifier(.8f).build());
        CREAM_BUN = new BreadItem(new FoodComponent.Builder().hunger(7).saturationModifier(.45f).build());

        APPLE_PIE = new PieItem(new FoodComponent.Builder().hunger(8).saturationModifier(.3f).build());
        CARROT_PIE = new PieItem(new FoodComponent.Builder().hunger(7).saturationModifier(.45f).build());
        GLOW_BERRIES_PIE = new PieItem(new FoodComponent.Builder().hunger(7).saturationModifier(.3f).statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 20 * 10), 1).build());
        SWEET_BERRIES_PIE = new PieItem(new FoodComponent.Builder().hunger(7).saturationModifier(.3f).build());

        BEEF_STEW = new CustomStewItemImpl(new FoodComponent.Builder().hunger(14).saturationModifier(.6f).build());
        PORK_STEW = new CustomStewItemImpl(new FoodComponent.Builder().hunger(14).saturationModifier(.6f).build());
        MUTTON_STEW = new CustomStewItemImpl(new FoodComponent.Builder().hunger(12).saturationModifier(.6f).build());
        SALMON_STEW = new CustomStewItemImpl(new FoodComponent.Builder().hunger(12).saturationModifier(.6f).build());
        CHICKEN_STEW = new CustomStewItemImpl(new FoodComponent.Builder().hunger(11).saturationModifier(.6f).build());
        FISH_STEW = new CustomStewItemImpl(FoodComponents.RABBIT_STEW);

        // materials
        CUSTARD_CREAM = new CreamItem();
    }

    /**
     * register all items
     */
    public static void init() {
        // アイテムいろいろ
        Registry.register(Registries.ITEM, FoodExpansion.ID("cream_bun"), ItemsInitializer.CREAM_BUN);
        Registry.register(Registries.ITEM, FoodExpansion.ID("beef_sandwich"), ItemsInitializer.BEEF_SANDWICH);
        Registry.register(Registries.ITEM, FoodExpansion.ID("pork_sandwich"), ItemsInitializer.PORK_SANDWICH);
        Registry.register(Registries.ITEM, FoodExpansion.ID("mutton_sandwich"), ItemsInitializer.MUTTON_SANDWICH);
        Registry.register(Registries.ITEM, FoodExpansion.ID("chicken_sandwich"), ItemsInitializer.CHICKEN_SANDWICH);
        Registry.register(Registries.ITEM, FoodExpansion.ID("salmon_sandwich"), ItemsInitializer.SALMON_SANDWICH);
        Registry.register(Registries.ITEM, FoodExpansion.ID("fish_sandwich"), ItemsInitializer.FISH_SANDWICH);
        Registry.register(Registries.ITEM, FoodExpansion.ID("rabbit_sandwich"), ItemsInitializer.RABBIT_SANDWICH);

        Registry.register(Registries.ITEM, FoodExpansion.ID("beef_stew"), ItemsInitializer.BEEF_STEW);
        Registry.register(Registries.ITEM, FoodExpansion.ID("mutton_stew"), ItemsInitializer.MUTTON_STEW);
        Registry.register(Registries.ITEM, FoodExpansion.ID("pork_stew"), ItemsInitializer.PORK_STEW);
        Registry.register(Registries.ITEM, FoodExpansion.ID("salmon_stew"), ItemsInitializer.SALMON_STEW);
        Registry.register(Registries.ITEM, FoodExpansion.ID("chicken_stew"), ItemsInitializer.CHICKEN_STEW);
        Registry.register(Registries.ITEM, FoodExpansion.ID("fish_stew"), ItemsInitializer.FISH_STEW);

        Registry.register(Registries.ITEM, FoodExpansion.ID("apple_pie"), ItemsInitializer.APPLE_PIE);
        Registry.register(Registries.ITEM, FoodExpansion.ID("carrot_pie"), ItemsInitializer.CARROT_PIE);
        Registry.register(Registries.ITEM, FoodExpansion.ID("glow_berries_pie"), ItemsInitializer.GLOW_BERRIES_PIE);
        Registry.register(Registries.ITEM, FoodExpansion.ID("sweet_berries_pie"), ItemsInitializer.SWEET_BERRIES_PIE);

        CompostingChanceRegistry.INSTANCE.add(ItemsInitializer.CREAM_BUN, 1.0f);
        CompostingChanceRegistry.INSTANCE.add(ItemsInitializer.BEEF_SANDWICH, 1.0f);
        CompostingChanceRegistry.INSTANCE.add(ItemsInitializer.PORK_SANDWICH, 1.0f);
        CompostingChanceRegistry.INSTANCE.add(ItemsInitializer.MUTTON_SANDWICH, 1.0f);
        CompostingChanceRegistry.INSTANCE.add(ItemsInitializer.CHICKEN_SANDWICH, 1.0f);
        CompostingChanceRegistry.INSTANCE.add(ItemsInitializer.SALMON_SANDWICH, 1.0f);
        CompostingChanceRegistry.INSTANCE.add(ItemsInitializer.FISH_SANDWICH, 1.0f);
        CompostingChanceRegistry.INSTANCE.add(ItemsInitializer.RABBIT_SANDWICH, 1.0f);
        CompostingChanceRegistry.INSTANCE.add(ItemsInitializer.APPLE_PIE, 1.0f);
        CompostingChanceRegistry.INSTANCE.add(ItemsInitializer.CARROT_PIE, 1.0f);
        CompostingChanceRegistry.INSTANCE.add(ItemsInitializer.GLOW_BERRIES_PIE, 1.0f);
        CompostingChanceRegistry.INSTANCE.add(ItemsInitializer.SWEET_BERRIES_PIE, 1.0f);

        // 中間素材
        Registry.register(Registries.ITEM, FoodExpansion.ID("custard_cream"), ItemsInitializer.CUSTARD_CREAM);
    }
}
