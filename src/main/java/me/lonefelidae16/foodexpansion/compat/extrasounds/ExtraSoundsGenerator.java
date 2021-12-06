package me.lonefelidae16.foodexpansion.compat.extrasounds;

import dev.stashy.extrasounds.mapping.SoundGenerator;
import dev.stashy.extrasounds.sounds.Categories;
import dev.stashy.extrasounds.sounds.Sounds;
import me.lonefelidae16.foodexpansion.FoodExpansion;
import me.lonefelidae16.foodexpansion.items.BreadItem;
import me.lonefelidae16.foodexpansion.items.CreamItem;
import me.lonefelidae16.foodexpansion.items.PieItem;
import net.minecraft.client.sound.Sound;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ExtraSoundsGenerator {
    public static SoundGenerator SOUND_GENERATOR = SoundGenerator.of(FoodExpansion.MOD_ID, id -> {
        Item item = Registry.ITEM.get(id);
        if (item instanceof BreadItem) {
            return Sounds.single(new Identifier("minecraft", "block.wool.place"), 0.2f, 1.8f, Sound.RegistrationType.SOUND_EVENT);
        } else if (item instanceof PieItem) {
            return Sounds.aliased(Categories.WET);
        } else if (item instanceof CreamItem) {
            return Sounds.aliased(Categories.WET);
        }
        return Sounds.aliased(Sounds.ITEM_PICK);
    });
}
