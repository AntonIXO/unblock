package org.minebit.unblock.mixin;

import com.mojang.patchy.BlockedServers;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlockedServers.class)
public class SwitchMixin {
    @Inject(method = "test*", at = @At("RETURN"), cancellable = true, remap = false)
    public void test(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }
}
