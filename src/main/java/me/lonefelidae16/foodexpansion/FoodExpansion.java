package me.lonefelidae16.foodexpansion;

import me.lonefelidae16.foodexpansion.items.ItemsInitializer;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FoodExpansion implements ModInitializer {
    public static final String MOD_ID = "foodexpansion";
    public static final Logger LOGGER = LoggerFactory.getLogger(FoodExpansion.MOD_ID);

    @Contract(value = "_ -> new", pure = true)
    public static @NotNull Identifier ID(@NotNull String path) {
        return new Identifier(FoodExpansion.MOD_ID, path);
    }

    @Override
    public void onInitialize() {
        ItemsInitializer.init();
    }
}
