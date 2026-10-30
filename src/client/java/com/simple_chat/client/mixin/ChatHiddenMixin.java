package com.simple_chat.client.mixin;

import com.simple_chat.client.command.ChatHiddenCommand;
import net.minecraft.client.gui.components.ChatComponent;
import net.minecraft.client.gui.GuiGraphics;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ChatComponent.class)
public class ChatHiddenMixin {
    @Inject(method = "render", at = @At("HEAD"), cancellable = true)
    private void hideChat(GuiGraphics graphics, int tickCount, int mouseX, int mouseY, boolean focused, CallbackInfo ci) {
        if (ChatHiddenCommand.chatHidden) {
            ci.cancel();
        }
    }
}
