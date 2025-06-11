package com.r3signed.template.client;

import com.r3signed.template.ModuleHandler;
import net.fabricmc.api.ClientModInitializer;

public class ExampleClientMod implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ModuleHandler.register(new CommonClientMod());
    }
}
