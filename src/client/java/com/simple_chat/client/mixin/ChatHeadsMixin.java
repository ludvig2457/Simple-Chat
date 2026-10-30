package com.simple_chat.client.mixin;

import net.minecraft.client.gui.components.ChatComponent;
import net.minecraft.network.chat.Component;
import org.spongepowered.asm.mixin.Mixin;

// TODO: implement player heads via PlayerSprite (1.21.9+)
// Target: ChatComponent.addMessage(Component, MessageSignature, GuiMessageTag)
// Once signature is confirmed, add @Inject and wrap Component with PlayerSprite.
@Mixin(ChatComponent.class)
public class ChatHeadsMixin {
    // Placeholder. Does not inject yet.
}
