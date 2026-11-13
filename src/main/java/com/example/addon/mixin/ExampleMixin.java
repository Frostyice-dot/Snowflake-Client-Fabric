
package com.example.addon.mixin;

import com.example.addon.Snowflake;
import net.minecraft.client.Minecraft;
import net.minecraft.client.main.GameConfig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public abstract class ExampleMixin {

    @Inject(method = "<init>", at = @At("TAIL"))
    private void onGameLoaded(GameConfig gameConfig, CallbackInfo ci) {
        Snowflake.LOG.info("Hello from Snowflake Client!");
    }
}
