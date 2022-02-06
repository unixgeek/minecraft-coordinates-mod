
package net.mcreator.coordinates.client.gui;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.client.Minecraft;

import net.mcreator.coordinates.network.CoordinatesModVariables;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class CoordinatesOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGameOverlayEvent.Pre event) {
		if (event.getType() == RenderGameOverlayEvent.ElementType.ALL) {
			int x = 0;
			int y = 0;
			int z = 0;
			Player entity = Minecraft.getInstance().player;
			if (entity != null) {
				x = Double.valueOf(Math.floor(entity.getX())).intValue();
				y = Double.valueOf(Math.floor(entity.getY())).intValue();
				z = Double.valueOf(Math.floor(entity.getZ())).intValue();
			}
			if (true) {
				Minecraft.getInstance().font.draw(event.getMatrixStack(), x + ", " + y + ", " + z, 10, 40, -1);
			}
		}
	}
}
