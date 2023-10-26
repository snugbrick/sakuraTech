package org.m1arcleur.sakuratech.item.ItemSakura;

import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * @author MiracleUR
 * @version 1.0.0 2023.10.24 19:35
 * @website github.com/snugbrick;
 */
//力场核心
public class multiForceCore {
    public static ItemStack multiForceCore = new CustomItemStack(Material.CHERRY_LEAVES, "力场核心",
            "用这个可以合成各种各样的力场装置哦");
    public static ItemStack[] recipes = {
            SlimefunItems.STEEL_INGOT,sakuraAtom.SAKURA_ATOM,SlimefunItems.STEEL_INGOT,
            sakuraAtomIngot.SAKURA_ATOM_INGOT,forceFieldShell.FFS,sakuraAtomIngot.SAKURA_ATOM_INGOT,
            SlimefunItems.STEEL_INGOT,sakuraAtom.SAKURA_ATOM,SlimefunItems.STEEL_INGOT
    };
}
