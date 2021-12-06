package me.lonefelidae16.foodexpansion.items;

import me.lonefelidae16.foodexpansion.FoodExpansion;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.stream.Collectors;


public class ItemInitializer {
    public static final FoodItemBase CREAM_BUN;
    public static final FoodItemBase BEEF_SANDWICH;
    public static final FoodItemBase PORK_SANDWICH;
    public static final FoodItemBase MUTTON_SANDWICH;
    public static final FoodItemBase CHICKEN_SANDWICH;
    public static final FoodItemBase SALMON_SANDWICH;
    public static final FoodItemBase FISH_SANDWICH;
    public static final FoodItemBase RABBIT_SANDWICH;
    public static final FoodItemBase MEAT_PIE;
    public static final FoodItemBase APPLE_PIE;
    public static final FoodItemBase CARROT_PIE;
    public static final FoodItemBase GLOW_BERRIES_PIE;
    public static final FoodItemBase SWEET_BERRIES_PIE;
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

        MEAT_PIE = new PieItem((new FoodComponent.Builder()).hunger(8).saturationModifier(1f).build());
        APPLE_PIE = new PieItem((new FoodComponent.Builder()).hunger(8).saturationModifier(.38f).build());
        CARROT_PIE = new PieItem((new FoodComponent.Builder()).hunger(8).saturationModifier(.3f).build());
        GLOW_BERRIES_PIE = new PieItem((new FoodComponent.Builder()).hunger(7).saturationModifier(.3f).build());
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
        Registry.register(Registry.ITEM, new Identifier(FoodExpansion.MOD_ID, "meat_pie"), ItemInitializer.MEAT_PIE);
        Registry.register(Registry.ITEM, new Identifier(FoodExpansion.MOD_ID, "apple_pie"), ItemInitializer.APPLE_PIE);
        Registry.register(Registry.ITEM, new Identifier(FoodExpansion.MOD_ID, "carrot_pie"), ItemInitializer.CARROT_PIE);
        Registry.register(Registry.ITEM, new Identifier(FoodExpansion.MOD_ID, "glow_berries_pie"), ItemInitializer.GLOW_BERRIES_PIE);
        Registry.register(Registry.ITEM, new Identifier(FoodExpansion.MOD_ID, "sweet_berries_pie"), ItemInitializer.SWEET_BERRIES_PIE);

        // 中間素材
        Registry.register(Registry.ITEM, new Identifier(FoodExpansion.MOD_ID, "custard_cream"), ItemInitializer.CUSTARD_CREAM);
    }

    @Contract(pure = true)
    public static @NotNull Iterable<Item> getAllCustomItems() {
        return Arrays.stream(ItemInitializer.class.getFields()).map(field -> {
            try {
                return (Item) field.get(ItemInitializer.class);
            } catch (IllegalAccessException | ClassCastException e) {
                throw new RuntimeException(e);
            }
        }).collect(Collectors.toSet());
    }
}
