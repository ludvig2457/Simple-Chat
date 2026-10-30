package com.simple_chat.client.mixin;

import net.minecraft.client.gui.components.ChatComponent;
import org.spongepowered.asm.mixin.Mixin;

// TODO: verify exact method signature in 1.21.11 via mappings.dev
// Current stub does not inject anything, so it will not break the build.
@Mixin(ChatComponent.class)
public class ChatAnimationMixin {
    // Placeholder for smooth chat animation logic.
    // Once the correct method signature is confirmed, add:
    // @Inject(method = "...", at = @At("HEAD"))
}
