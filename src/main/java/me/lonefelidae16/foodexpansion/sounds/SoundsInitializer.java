package me.lonefelidae16.foodexpansion.sounds;

import net.minecraft.util.registry.Registry;

public class SoundsInitializer {

    /**
     * register all sound assets
     */
    public static void init() {
        Registry.register(Registry.SOUND_EVENT, SoundEvents.ID_SWALLOW, SoundEvents.EV_SWALLOW);
    }
}
