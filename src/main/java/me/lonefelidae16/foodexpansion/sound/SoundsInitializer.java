package me.lonefelidae16.foodexpansion.sound;

import net.minecraft.util.registry.Registry;

public class SoundsInitializer {

    /**
     * register all sound assets
     */
    public static void init() {
        Registry.register(Registry.SOUND_EVENT, SoundEvents.SWALLOW.getId(), SoundEvents.SWALLOW);
    }
}
