package net.caffeinemc.caffeineconfig.examplemod;

import net.caffeinemc.caffeineconfig.AbstractCaffeineConfigMixinPlugin;
import net.caffeinemc.caffeineconfig.CaffeineConfig;
import net.minecraftforge.fml.loading.FMLPaths;
//import net.fabricmc.loader.api.FabricLoader;

public class ExampleModMixinConfigPlugin extends AbstractCaffeineConfigMixinPlugin {

    @Override
    protected CaffeineConfig createConfig() {
        return CaffeineConfig.builder("ExampleMod")
                .addMixinOption("ai", true)
                .addMixinOption("ai.brain", true)
                .addMixinOption("ai.goal", true)
                .addMixinOption("block.hopper", true)
                .addOptionDependency("block.hopper", "ai", true)
                .withInfoUrl("https://example.org")
                .build(FMLPaths.CONFIGDIR.get().resolve("examplemod.properties"));
                //.build(FabricLoader.getInstance().getConfigDir().resolve("examplemod.properties"));
    }

    @Override
    protected String mixinPackageRoot() {
        return "org.example.mod.mixins.";
    }
}
