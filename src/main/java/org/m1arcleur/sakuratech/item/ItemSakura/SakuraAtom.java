package org.m1arcleur.sakuratech.item.ItemSakura;

import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * @author MiracleUR
 * @version 1.0.0 2023.10.19 18:59
 * @website github.com/snugbrick;
 */
public class SakuraAtom {
    public static ItemStack SAKURA_ATOM = new CustomItemStack(
            Material.CHERRY_LEAVES, "§d樱核原子", "§5樱花科技道路的钥匙");
    public static ItemStack[] recipes = {
            new ItemStack(Material.CHERRY_LEAVES),new ItemStack(Material.CHERRY_LEAVES),new ItemStack(Material.CHERRY_LEAVES),
            new ItemStack(Material.CHERRY_LEAVES),new ItemStack(Material.CHERRY_LEAVES),new ItemStack(Material.CHERRY_LEAVES),
            new ItemStack(Material.CHERRY_LEAVES),new ItemStack(Material.CHERRY_LEAVES),new ItemStack(Material.CHERRY_LEAVES)
    };
}
