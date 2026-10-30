package com.simple_chat.client.command;

import com.mojang.brigadier.CommandDispatcher;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandManager;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import net.minecraft.network.chat.Component;

public class ChatHiddenCommand {
    public static boolean chatHidden = false;

    public static void register() {
        ClientCommandRegistrationCallback.EVENT.register((dispatcher, registryAccess) -> {
            dispatcher.register(ClientCommandManager.literal("chathidden")
                .executes(context -> {
                    chatHidden = !chatHidden;
                    context.getSource().sendFeedback(
                        Component.literal("Chat " + (chatHidden ? "hidden" : "visible"))
                    );
                    return 1;
                })
            );
        });
    }
}
