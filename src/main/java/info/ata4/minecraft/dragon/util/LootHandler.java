package info.ata4.minecraft.dragon.util;

import info.ata4.minecraft.dragon.DragonMounts;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.*;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class LootHandler {
	@SubscribeEvent
	public void lootLoad(LootTableLoadEvent evt) {
		if (evt.getName().equals(LootTableList.CHESTS_NETHER_BRIDGE)) {
			evt.getTable().addPool(new LootPool(new LootEntry[]{new LootEntryTable(new ResourceLocation(DragonMounts.AID, "chests/nether_egg"), 5, 0, new LootCondition[0], "nether_egg")}, new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0, 1), "nether_egg"));
		}
	}
}
