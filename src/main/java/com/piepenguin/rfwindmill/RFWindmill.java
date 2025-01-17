package com.piepenguin.rfwindmill;

import com.piepenguin.rfwindmill.blocks.ModBlocks;
import com.piepenguin.rfwindmill.items.ModItems;
import com.piepenguin.rfwindmill.lib.Constants;
import com.piepenguin.rfwindmill.lib.ModConfiguration;
import com.piepenguin.rfwindmill.proxy.CommonProxy;
import com.piepenguin.rfwindmill.recipes.ModRecipes;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Constants.MODID, name = Constants.NAME, version = Constants.VERSION)
public class RFWindmill {

    @SidedProxy(clientSide = Constants.CLIENT_PROXY_CLASS, serverSide = Constants.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent pEvent) {
        ModConfiguration.init(pEvent.getSuggestedConfigurationFile());
        ModBlocks.init();
        ModItems.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent pEvent) {
        proxy.registerTileEntities();
        ModRecipes.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent pEvent) {

    }
}
