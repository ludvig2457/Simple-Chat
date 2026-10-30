package com.simple_chat.client.mixin;

import net.minecraft.client.gui.Gui;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import com.simple_chat.client.command.ChatHiddenCommand;

// TODO: verify target class in 1.21.11 (Gui or Hud)
@Mixin(Gui.class)
public class ChatHiddenMixin {
    @Inject(method = "renderChat", at = @At("HEAD"), cancellable = true)
    private void hideChat(CallbackInfo ci) {
        if (ChatHiddenCommand.chatHidden) {
            ci.cancel();
        }
    }
}
