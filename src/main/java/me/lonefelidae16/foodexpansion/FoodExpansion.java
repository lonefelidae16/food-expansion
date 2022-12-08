package me.lonefelidae16.foodexpansion;

import me.lonefelidae16.foodexpansion.items.ItemInitializer;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FoodExpansion implements ModInitializer {
    public static final String MOD_ID = "foodexpansion";
    public static final Logger LOGGER = LoggerFactory.getLogger(FoodExpansion.MOD_ID);

    @Override
    public void onInitialize() {
        ItemInitializer.init();
    }
}
