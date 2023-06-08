package me.lonefelidae16.foodexpansion.compat.extrasounds;

import dev.stashy.extrasounds.mapping.SoundDefinition;
import dev.stashy.extrasounds.mapping.SoundGenerator;
import dev.stashy.extrasounds.sounds.Categories;
import dev.stashy.extrasounds.sounds.Sounds;
import me.lonefelidae16.foodexpansion.FoodExpansion;
import me.lonefelidae16.foodexpansion.items.BreadItem;
import me.lonefelidae16.foodexpansion.items.CreamItem;
import me.lonefelidae16.foodexpansion.items.ItemsInitializer;
import me.lonefelidae16.foodexpansion.items.PieItem;
import net.minecraft.client.sound.Sound;
import net.minecraft.item.StewItem;
import net.minecraft.util.Identifier;

public class ExtraSoundsGenerator {
    public static SoundGenerator SOUND_GENERATOR = SoundGenerator.of(FoodExpansion.MOD_ID, FoodExpansion.MOD_ID, item -> {
        if (item instanceof BreadItem) {
            return SoundDefinition.of(Sounds.event(new Identifier("extrasounds", "item.pickup.minecraft.bread"), 1.f));
        } else if (item instanceof PieItem) {
            return SoundDefinition.of(Sounds.aliased(Categories.WET));
        } else if (item instanceof CreamItem) {
            return SoundDefinition.of(Sounds.aliased(Categories.WET));
        } else if (item instanceof StewItem) {
            return SoundDefinition.of(Sounds.event(new Identifier("extrasounds", "item.pickup.minecraft.rabbit_stew"), 1.f));
        } else if (item == ItemsInitializer.BAKED_APPLE) {
            return SoundDefinition.of(Sounds.event(new Identifier("extrasounds", "item.pickup.minecraft.apple"), 1.f));
        } else if (item == ItemsInitializer.BUCKET_CARAMEL_CUSTARD) {
            return SoundDefinition.of(Sounds.single(new Identifier("block.mud.step"), .45f, 1.9f, Sound.RegistrationType.SOUND_EVENT));
        }
        return SoundDefinition.of(Sounds.aliased(Sounds.ITEM_PICK));
    });
}
