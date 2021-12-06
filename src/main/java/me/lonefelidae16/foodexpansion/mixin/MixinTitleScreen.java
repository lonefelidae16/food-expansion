package me.lonefelidae16.foodexpansion.mixin;

import me.lonefelidae16.foodexpansion.FoodExpansion;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import net.minecraft.util.Util;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


/**
 * TitleScreen.class mixin
 */
@Mixin(TitleScreen.class)
public abstract class MixinTitleScreen extends Screen {
    @Shadow @Final
    private boolean doBackgroundFade;

    @Shadow
    private long backgroundFadeStart;

    protected MixinTitleScreen(Text title) {
        super(null);
    }

    @Inject(method = "render", at = @At(value = "RETURN"))
    private void foodexpansion$render(MatrixStack matrices, int mouseX, int mouseY, float delta, CallbackInfo callbackInfo) {
        float fade = doBackgroundFade ? (float)(Util.getMeasuringTimeMs() - backgroundFadeStart) / 1000 : 1;
        float blendAmount = doBackgroundFade ? MathHelper.clamp(fade - 1, 0, 1) : 1;
        int alpha = MathHelper.ceil(blendAmount * 255) << 24;
        if ((alpha & -0x4000000) != 0) {
            drawStringWithShadow(matrices, textRenderer, FoodExpansion.getModString(), 2, 2, 0xffffff | alpha);
        }
    }
}
