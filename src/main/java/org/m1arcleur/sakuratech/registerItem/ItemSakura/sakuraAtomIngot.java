package org.m1arcleur.sakuratech.registerItem.ItemSakura;

import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

/**
 * @author MiracleUR
 * @version 1.0.0 2023.10.19 23:43
 * @website github.com/snugbrick;
 */
public class sakuraAtomIngot  {
    public static ItemStack SAKURA_ATOM_INGOT = new CustomItemStack(
            Material.CHERRY_LEAVES, "§d樱花锭", "");
    public static ItemStack[] recipes = {
            sakuraAtom.SAKURA_ATOM, sakuraAtom.SAKURA_ATOM, sakuraAtom.SAKURA_ATOM,
            sakuraAtom.SAKURA_ATOM, new ItemStack(Material.GOLD_INGOT), sakuraAtom.SAKURA_ATOM,
            sakuraAtom.SAKURA_ATOM, sakuraAtom.SAKURA_ATOM, sakuraAtom.SAKURA_ATOM
    };

}
