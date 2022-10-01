package me.lonefelidae16.foodexpansion;

import com.mojang.logging.LogUtils;
import me.lonefelidae16.foodexpansion.items.ItemInitializer;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;

public class FoodExpansion implements ModInitializer {
    public static final String MOD_ID = "foodexpansion";
    public static final Logger LOGGER = LogUtils.getLogger();

    @Override
    public void onInitialize() {
        ItemInitializer.init();
    }
}
