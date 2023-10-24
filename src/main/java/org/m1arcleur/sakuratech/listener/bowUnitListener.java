package org.m1arcleur.sakuratech.listener;

import org.bukkit.Bukkit;
import org.bukkit.block.Block;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import org.m1arcleur.sakuratech.api.events.bowForcePutEvent;
import org.m1arcleur.sakuratech.item.forceUnit.bowForceUnit;

/**
 * @author MiracleUR
 * @version 1.0.0 2023.10.24 23:14
 * @website github.com/snugbrick;
 */
public class bowUnitListener implements Listener {
    @EventHandler(priority = EventPriority.HIGH)
    public void PlayerPutListener(BlockPlaceEvent e) {
        if (!e.isCancelled()) {
            Player player = e.getPlayer();
            String playerName = player.getName();
            ItemStack block = (ItemStack) e.getBlock();
            if (block.equals(bowForceUnit.bowForceCore)) {
                player.sendMessage("§a§l[SAKURA] " + playerName + " 已放置了弓箭力场护盾");
                Event event = new bowForcePutEvent(player, block);
                Bukkit.getPluginManager().callEvent(event);
            }
        }
    }
}
