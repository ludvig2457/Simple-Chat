package com.simple_chat.client;

import com.simple_chat.client.command.ChatHiddenCommand;
import net.fabricmc.api.ClientModInitializer;

public class SimpleChatClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ChatHiddenCommand.register();
    }
}
