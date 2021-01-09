package wallSprint.mixin;

import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import wallSprint.ClientInit;

@Mixin(ClientPlayerEntity.class)
public class ClientPlayerMixin {

    @Redirect(method = "tickMovement", at = @At(value = "FIELD", target = "Lnet/minecraft/client/network/ClientPlayerEntity;horizontalCollision:Z"))
    private boolean returnFalse(ClientPlayerEntity clientPlayerEntity){
        return clientPlayerEntity.horizontalCollision && !ClientInit.config.enabled();
    }
}
