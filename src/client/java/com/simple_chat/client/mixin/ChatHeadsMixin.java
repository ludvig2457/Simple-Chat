package com.simple_chat.client.mixin;

import net.minecraft.client.gui.components.ChatComponent;
import org.spongepowered.asm.mixin.Mixin;
// TODO: implement player heads (1.21.9+ uses PlayerSprite text components)
@Mixin(ChatComponent.class)
public class ChatHeadsMixin {
    // Modify Component to include player sprite
}
