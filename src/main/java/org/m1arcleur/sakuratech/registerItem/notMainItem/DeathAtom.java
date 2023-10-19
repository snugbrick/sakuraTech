package org.m1arcleur.sakuratech.registerItem.notMainItem;

import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.m1arcleur.sakuratech.registerItem.ItemSakura.sakuraAtom;
import org.m1arcleur.sakuratech.registerItem.ItemSakura.sakuraAtomIngot;

/**
 * @author MiracleUR
 * @version 1.0.0 2023.10.20 00:14
 * @website github.com/snugbrick;
 */
public class DeathAtom {
    public static ItemStack deathAtom = new CustomItemStack(
            Material.NETHERITE_INGOT, "凋亡粒子", ""
    );
    public static ItemStack[] recipes = {
            null, sakuraAtom.SAKURA_ATOM, null,
            sakuraAtom.SAKURA_ATOM, sakuraAtomIngot.SAKURA_ATOM_INGOT, sakuraAtom.SAKURA_ATOM,
            null, sakuraAtom.SAKURA_ATOM, null
    };
}
