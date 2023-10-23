package org.m1arcleur.sakuratech.item.ItemSakura;

import me.mrCookieSlime.CSCoreLibPlugin.cscorelib2.item.CustomItem;
import me.mrCookieSlime.CSCoreLibPlugin.cscorelib2.skull.SkullItem;
import org.bukkit.inventory.ItemStack;

/**
 * @author MiracleUR
 * @version 1.0.0 2023.10.23 22:21
 * @website github.com/snugbrick;
 */
//立场外壳，使用原子加上锭可以在铸造机中获得
public class positionShell {
    public static ItemStack IS = new CustomItem(SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTAyY2M2YWJmNzc5ZGYxYzc5MGJlMWNhNzE1YTcxNjMxM2MxNzk0NWJhZGMyMzY5ZDBjZjA3OTMzNmE1MjQyMSJ9fX0="),
            "立场外壳", " ");
    public static ItemStack[] recipes = {
            null, sakuraAtom.SAKURA_ATOM, null,
            null, sakuraAtom.SAKURA_ATOM, null,
            null, sakuraAtom.SAKURA_ATOM, null
    };

}