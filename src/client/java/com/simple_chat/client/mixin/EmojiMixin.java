package com.simple_chat.client.mixin;

import net.minecraft.client.gui.screens.ChatScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ChatScreen.class)
public class EmojiMixin {
    @ModifyVariable(method = "handleChatInput", at = @At("HEAD"), argsOnly = true)
    private String replaceEmojis(String message) {
        return message
            .replace(":smile:", "😊")
            .replace(":heart:", "❤")
            .replace(":fire:", "🔥");
    }
}
