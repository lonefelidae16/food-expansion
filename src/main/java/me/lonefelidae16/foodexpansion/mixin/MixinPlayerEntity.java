package me.lonefelidae16.foodexpansion.mixin;

import me.lonefelidae16.foodexpansion.sound.SoundEvents;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;


/**
 * PlayerEntity.class mixin
 */
@Mixin(PlayerEntity.class)
public abstract class MixinPlayerEntity {

    /**
     * Method invocation
     * @param soundEvent before invoke arg (SoundEvent.PLAYER_BURP)
     * @return SoundEvents.EV_SWALLOW
     */
    @ModifyArg(
            method = "eatFood(Lnet/minecraft/world/World;Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/ItemStack;",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/world/World;playSound(Lnet/minecraft/entity/player/PlayerEntity;DDDLnet/minecraft/sound/SoundEvent;Lnet/minecraft/sound/SoundCategory;FF)V"
            ),
            index = 4
    )
    private SoundEvent foodexpansion$eatFood_arg4(SoundEvent soundEvent) {
        return SoundEvents.SWALLOW;
    }
}
