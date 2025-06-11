package com.r3signed.template;

import net.fabricmc.api.EnvType;
import net.fabricmc.loader.api.FabricLoader;

public class ModuleHandler {
    public static void register(Module module) {
        if (module instanceof DedicatedServerModule) {
            if (FabricLoader.getInstance().getEnvironmentType() == EnvType.SERVER) {
                module.onInitialize();
            }
        } else {
            module.onInitialize();
        }
    }

    public static void register(ClientModule module) {
        if (FabricLoader.getInstance().getEnvironmentType() == EnvType.CLIENT) {
            module.onInitializeClient();
        }
    }
}
