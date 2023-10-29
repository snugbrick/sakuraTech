package org.m1arcleur.sakuratech.item.ItemSakura;

import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * @author MiracleUR
 * @version 1.0.0 2023.10.29 18:41
 * @website github.com/snugbrick;
 */
//各种各样的核心，暂时还未开放获取，因为头颅网站无法访问
public class forceCore {
    public static ItemStack creatureCore = new CustomItemStack(Material.CHERRY_BOAT,
            "生物力场核心", "");
    public static ItemStack[] creatureRecipes = {
            null, null, null,
            null, null, null,
            sakuraAtom.SAKURA_ATOM, null, null
    };
    public static ItemStack abowForceCore = new CustomItemStack(Material.CHERRY_BOAT,
            "弓箭力场核心", "");
    public static ItemStack[] bowRecipes = {
            null, null, null,
            sakuraAtom.SAKURA_ATOM, null, null,
            null, null, null
    };
    public static ItemStack synthesisForceCore = new CustomItemStack(Material.CHERRY_BOAT,
            "综合力场核心", "");
    public static ItemStack[] synthesisRecipes = {
            null, null, null,
            null, null, null,
            null, sakuraAtom.SAKURA_ATOM, null
    };
}
