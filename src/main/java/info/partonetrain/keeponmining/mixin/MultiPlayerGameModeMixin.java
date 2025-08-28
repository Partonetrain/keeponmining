package info.partonetrain.keeponmining.mixin;

import info.partonetrain.keeponmining.Config;
import net.minecraft.client.multiplayer.MultiPlayerGameMode;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(MultiPlayerGameMode.class)
public class MultiPlayerGameModeMixin {

    @Shadow
    private int destroyDelay;

    @ModifyConstant(method = "continueDestroyBlock", constant = @Constant(intValue = 5))
    private int keeponmining$continueDestroyBlock1(int value) {
        return Config.MINING_TICK_DELAY.getAsInt();
    }


    /*
    //the idea here is to set it back to a reasonable value if they set the config higher previously than what it is now
    //(since it will still be that higher value until you start breaking a block)
    //it crashes though, idk why I can never get INVOKE_ASSIGN to work
    @Inject(at = @At(value = "INVOKE_ASSIGN", target = "Lnet/minecraft/client/multiplayer/MultiPlayerGameMode;ensureHasSentCarriedItem()V", ordinal = 0), method = "continueDestroyBlock",
            locals = LocalCapture.CAPTURE_FAILHARD)
    public void keeponmining$continueDestroyBlock2(BlockPos posBlock, Direction directionFacing, CallbackInfoReturnable<Boolean> cir){
        if(destroyDelay > Config.MINING_TICK_DELAY.getAsInt()){
            destroyDelay = Config.MINING_TICK_DELAY.getAsInt();
        }
    }
    */
}
