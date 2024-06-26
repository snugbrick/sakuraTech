package org.m1arcleur.sakuratech.item.ItemSakura;

import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

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
            null, SakuraAtom.SAKURA_ATOM, null,
            SakuraAtom.SAKURA_ATOM, SakuraAtomIngot.SAKURA_ATOM_INGOT, SakuraAtom.SAKURA_ATOM,
            null, SakuraAtom.SAKURA_ATOM, null
    };
}
