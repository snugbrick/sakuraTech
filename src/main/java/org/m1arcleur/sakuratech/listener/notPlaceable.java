package org.m1arcleur.sakuratech.listener;

import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import org.m1arcleur.sakuratech.item.ItemSakura.sakuraAtom;

/**
 * @author MiracleUR
 * @version 1.0.0 2023.10.26 02:06
 * @website github.com/snugbrick;
 */
public class notPlaceable implements Listener {
    @EventHandler(priority = EventPriority.HIGHEST)
    public static void notPlaceableItem(BlockPlaceEvent event) {
        Material material = event.getBlock().getType();
        ItemStack itemStack = new ItemStack(material);
        if(itemStack.equals(sakuraAtom.SAKURA_ATOM)){
            event.setCancelled(true);
        }
    }
}
