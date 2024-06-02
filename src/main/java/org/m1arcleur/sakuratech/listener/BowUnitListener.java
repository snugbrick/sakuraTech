package org.m1arcleur.sakuratech.listener;

import me.mrCookieSlime.Slimefun.api.BlockStorage;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import org.m1arcleur.sakuratech.api.events.BowForcePutEvent;

/**
 * @author MiracleUR
 * @version 1.0.0 2023.10.24 23:14
 * @website github.com/snugbrick;
 */
public class BowUnitListener implements Listener {
    @EventHandler(priority = EventPriority.HIGH)
    public void PlayerPutListener(BlockPlaceEvent e) {
        if (!e.isCancelled()) {
            Player player = e.getPlayer();
            String playerName = player.getName();
            Material block = e.getBlock().getType();
            ItemStack itemStack = new ItemStack(block);
            if (BlockStorage.checkID(e.getBlock()) != null
                    && BlockStorage.checkID(e.getBlock()).equals("樱核原子铸造机")) {
                player.sendMessage("§a§l[SAKURA] %playerName%已放置了弓箭力场护盾".replace("%playerName%", playerName));
                Event event = new BowForcePutEvent(player, itemStack);
                Bukkit.getPluginManager().callEvent(event);
            }
        }
    }
}
