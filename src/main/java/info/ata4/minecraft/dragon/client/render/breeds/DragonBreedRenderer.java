/*
 ** 2016 March 07
 **
 ** The author disclaims copyright to this source code. In place of
 ** a legal notice, here is a blessing:
 **    May you do good and not evil.
 **    May you find forgiveness for yourself and forgive others.
 **    May you share freely, never taking more than you give.
 */
package info.ata4.minecraft.dragon.client.render.breeds;

import info.ata4.minecraft.dragon.client.model.DragonModel;
import info.ata4.minecraft.dragon.client.render.DragonRenderer;
import info.ata4.minecraft.dragon.server.entity.EntityTameableDragon;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

import java.util.List;

/**
 * @author Nico Bergemann <barracuda415 at yahoo.de>
 */
public interface DragonBreedRenderer {

	ResourceLocation getBodyTexture();

	ResourceLocation getDissolveTexture();

	ResourceLocation getEggTexture();

	ResourceLocation getGlowTexture();

	ResourceLocation getGlowAnimTexture();

	List<LayerRenderer<EntityTameableDragon>> getLayers();

	DragonModel getModel();

	DragonRenderer getRenderer();

	ResourceLocation getSaddleTexture();

}
