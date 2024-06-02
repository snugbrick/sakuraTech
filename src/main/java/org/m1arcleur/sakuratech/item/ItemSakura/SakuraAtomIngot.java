package org.m1arcleur.sakuratech.item.ItemSakura;

import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * @author MiracleUR
 * @version 1.0.0 2023.10.19 23:43
 * @website github.com/snugbrick;
 */
public class SakuraAtomIngot {
    public static ItemStack SAKURA_ATOM_INGOT = new CustomItemStack(
            Material.CHERRY_WOOD, "§d樱花锭", "");
    public static ItemStack[] recipes = {
            SakuraAtom.SAKURA_ATOM, SakuraAtom.SAKURA_ATOM, SakuraAtom.SAKURA_ATOM,
            SakuraAtom.SAKURA_ATOM, new ItemStack(Material.GOLD_INGOT), SakuraAtom.SAKURA_ATOM,
            SakuraAtom.SAKURA_ATOM, SakuraAtom.SAKURA_ATOM, SakuraAtom.SAKURA_ATOM
    };
}
