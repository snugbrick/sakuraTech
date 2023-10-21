package org.m1arcleur.sakuratech.api.event;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import javax.annotation.Nonnull;

/**
 * @author MiracleUR
 * @version 1.0.0 2023.10.21 18:37
 * @website github.com/snugbrick;
 */
public class playerPutEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    @Nonnull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}
