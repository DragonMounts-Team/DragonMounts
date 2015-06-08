/*
 ** 2012 August 27
 **
 ** The author disclaims copyright to this source code.  In place of
 ** a legal notice, here is a blessing:
 **    May you do good and not evil.
 **    May you find forgiveness for yourself and forgive others.
 **    May you share freely, never taking more than you give.
 */
package info.ata4.minecraft.dragon.client;

import info.ata4.minecraft.dragon.DragonMounts;
import info.ata4.minecraft.dragon.DragonMountsConfig;
import info.ata4.minecraft.dragon.client.gui.GuiDragonDebug;
import info.ata4.minecraft.dragon.server.CommonProxy;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

/**
 *
 * @author Nico Bergemann <barracuda415 at yahoo.de>
 */
public class ClientProxy extends CommonProxy {
    
    @Override
    public void onInit(FMLInitializationEvent evt) {
        super.onInit(evt);
    }

    @Override
    public void onPostInit(FMLPostInitializationEvent event)
    {
      if (DragonMounts.instance.getConfig().isDebug()) {
        MinecraftForge.EVENT_BUS.register(new GuiDragonDebug());
      }
    }
}
