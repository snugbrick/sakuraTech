package org.m1arcleur.sakuratech.item.ItemSakura;

import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * @author MiracleUR
 * @version 1.0.0 2023.10.23 22:21
 * @website github.com/snugbrick;
 */
//力场外壳，使用原子加上锭可以在铸造机中获得
public class ForceFieldShell {
    public static ItemStack FFS = new CustomItemStack(Material.CHERRY_LOG,
            "力场外壳", "与力场核心一起组成各种各样的力场装置");
    public static ItemStack[] recipes = {
            null, SakuraAtom.SAKURA_ATOM, null,
            null, SakuraAtom.SAKURA_ATOM, null,
            null, SakuraAtom.SAKURA_ATOM, null
    };
}