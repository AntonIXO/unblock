package org.minebit.unblock.client;

import net.fabricmc.api.ClientModInitializer;

public class UnblockClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("Unblock init");
    }
}
