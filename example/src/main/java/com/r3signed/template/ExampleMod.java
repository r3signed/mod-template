package com.r3signed.template;

import net.fabricmc.api.ModInitializer;

public class ExampleMod implements ModInitializer {

    @Override
    public void onInitialize() {
        ModuleHandler.register(new CommonMod());
        System.out.println("Initializing ExampleMod");
    }
}
