package org.m1arcleur.sakuratech.registerGroup;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.m1arcleur.sakuratech.SakuraTech;

/**
 * @author MiracleUR
 * @version 1.0.0 2023.10.19 18:15
 * @website github.com/snugbrick;
 */
public class mainGroup {
    public static ItemGroup
            itemGroup = new ItemGroup(new NamespacedKey(
            SakuraTech.getInstance(), "SakuraTech"), new CustomItemStack(Material.CHERRY_LEAVES, "樱花科技"));
    public static ItemGroup
            MultiItemGroup = new ItemGroup(new NamespacedKey(
            SakuraTech.getInstance(), "MultiSakuraTech"), new CustomItemStack(Material.CHERRY_WOOD, "多方块结构樱花科技机器"));
}
