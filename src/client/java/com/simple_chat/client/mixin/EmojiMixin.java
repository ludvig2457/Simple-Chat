package com.simple_chat.client.mixin;

import net.minecraft.client.gui.screens.ChatScreen;
import org.spongepowered.asm.mixin.Mixin;
// TODO: implement emoji replacement on Tab key
@Mixin(ChatScreen.class)
public class EmojiMixin {
    // Intercept keyPressed for Tab
}
