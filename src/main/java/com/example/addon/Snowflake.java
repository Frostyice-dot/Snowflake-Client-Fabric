
package com.example.addon;

import com.example.addon.commands.CommandExample;
import com.example.addon.hud.HudExample;
import com.example.addon.modules.ModuleExample;
import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.commands.Commands;
import meteordevelopment.meteorclient.systems.hud.Hud;
import meteordevelopment.meteorclient.systems.hud.HudGroup;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;

public class Snowflake extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();
    public static final HudGroup HUD_GROUP = new HudGroup("Snowflake");

    public static final Category COMBAT = new Category("Combat");
    public static final Category PLAYER = new Category("Player");
    public static final Category MOVEMENT = new Category("Movement");
    public static final Category VISUALS = new Category("Visuals");
    public static final Category WORLD = new Category("World");
    public static final Category MISC = new Category("Misc");

    @Override
    public void onInitialize() {
        LOG.info("Initializing Snowflake Client");

        Modules.get().add(new ModuleExample());
        Commands.add(new CommandExample());
        Hud.get().register(HudExample.INFO);
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(COMBAT);
        Modules.registerCategory(PLAYER);
        Modules.registerCategory(MOVEMENT);
        Modules.registerCategory(VISUALS);
        Modules.registerCategory(WORLD);
        Modules.registerCategory(MISC);
    }

    @Override
    public String getPackage() {
        return "com.example.addon";
    }
}
