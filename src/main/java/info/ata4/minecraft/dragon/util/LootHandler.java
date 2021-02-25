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
		if (evt.getName().equals(LootTableList.CHESTS_DESERT_PYRAMID)) {
			evt.getTable().addPool(new LootPool(new LootEntry[]{new LootEntryTable(new ResourceLocation(DragonMounts.AID, "chests/air_egg"), 5, 0, new LootCondition[0], "air_egg")}, new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0, 1), "air_egg"));
		}
		if (evt.getName().equals(LootTableList.CHESTS_END_CITY_TREASURE)) {
			evt.getTable().addPool(new LootPool(new LootEntry[]{new LootEntryTable(new ResourceLocation(DragonMounts.AID, "chests/ender_egg"), 5, 0, new LootCondition[0], "ender_egg")}, new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0, 1), "ender_egg"));
		}
		if (evt.getName().equals(LootTableList.CHESTS_IGLOO_CHEST)) {
			evt.getTable().addPool(new LootPool(new LootEntry[]{new LootEntryTable(new ResourceLocation(DragonMounts.AID, "chests/ice_egg"), 5, 0, new LootCondition[0], "ice_egg")}, new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0, 1), "ice_egg"));
		}
		if (evt.getName().equals(LootTableList.CHESTS_JUNGLE_TEMPLE)) {
			evt.getTable().addPool(new LootPool(new LootEntry[]{new LootEntryTable(new ResourceLocation(DragonMounts.AID, "chests/forest_egg"), 5, 0, new LootCondition[0], "forest_egg")}, new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0, 1), "forest_egg"));
		}
		if (evt.getName().equals(LootTableList.CHESTS_ABANDONED_MINESHAFT)) {
			evt.getTable().addPool(new LootPool(new LootEntry[]{new LootEntryTable(new ResourceLocation(DragonMounts.AID, "chests/ghost_egg"), 5, 0, new LootCondition[0], "ghost_egg")}, new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0, 1), "ghost_egg"));
		}
		if (evt.getName().equals(LootTableList.CHESTS_STRONGHOLD_CORRIDOR)) {
			evt.getTable().addPool(new LootPool(new LootEntry[]{new LootEntryTable(new ResourceLocation(DragonMounts.AID, "chests/fire_egg"), 5, 0, new LootCondition[0], "fire_egg")}, new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0, 1), "fire_egg"));
		}
		if (evt.getName().equals(LootTableList.CHESTS_STRONGHOLD_CROSSING)) {
			evt.getTable().addPool(new LootPool(new LootEntry[]{new LootEntryTable(new ResourceLocation(DragonMounts.AID, "chests/fire_egg"), 5, 0, new LootCondition[0], "fire_egg")}, new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0, 1), "fire_egg"));
		}
		if (evt.getName().equals(LootTableList.CHESTS_STRONGHOLD_LIBRARY)) {
			evt.getTable().addPool(new LootPool(new LootEntry[]{new LootEntryTable(new ResourceLocation(DragonMounts.AID, "chests/fire_egg"), 5, 0, new LootCondition[0], "fire_egg")}, new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0, 1), "fire_egg"));
		}
		if (evt.getName().equals(LootTableList.CHESTS_WOODLAND_MANSION)) {
			evt.getTable().addPool(new LootPool(new LootEntry[]{new LootEntryTable(new ResourceLocation(DragonMounts.AID, "chests/ghost_egg"), 5, 0, new LootCondition[0], "ghost_egg")}, new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0, 1), "ghost_egg"));
		}
		if (evt.getName().equals(LootTableList.CHESTS_SIMPLE_DUNGEON)) {
			evt.getTable().addPool(new LootPool(new LootEntry[]{new LootEntryTable(new ResourceLocation(DragonMounts.AID, "chests/fire_egg"), 5, 0, new LootCondition[0], "fire_egg")}, new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0, 1), "fire_egg"));
		}
		if (evt.getName().equals(LootTableList.ENTITIES_ELDER_GUARDIAN)) {
			evt.getTable().addPool(new LootPool(new LootEntry[]{new LootEntryTable(new ResourceLocation(DragonMounts.AID, "chests/water_egg"), 5, 0, new LootCondition[0], "water_egg")}, new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0, 1), "water_egg"));
		}
	}
}
