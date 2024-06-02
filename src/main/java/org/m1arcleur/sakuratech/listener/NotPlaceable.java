package org.m1arcleur.sakuratech.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

/**
 * @author MiracleUR
 * @version 1.0.0 2023.10.26 02:06
 * @website github.com/snugbrick;
 */
public class NotPlaceable implements Listener {
    @EventHandler(priority = EventPriority.HIGHEST)
    public static void notPlaceableItem(BlockPlaceEvent event) {
        //if(BlockStorage.checkID(event.getBlock()).equals("SAKURA_ATOM")){
            //event.setCancelled(true);
        //}
    }
}
