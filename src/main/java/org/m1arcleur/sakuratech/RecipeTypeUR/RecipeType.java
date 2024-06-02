package org.m1arcleur.sakuratech.RecipeTypeUR;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.NamespacedKey;
import org.m1arcleur.sakuratech.SakuraTech;
import org.m1arcleur.sakuratech.item.MainRegister;

/**
 * @author MiracleUR
 * @version 1.0.0 2023.10.19 21:46
 * @website github.com/snugbrick;
 */
public class RecipeType {
    //SAKURA_CRAFTING_TABLE
    public static final io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType SAKURA_CRAFTING_TABLE = new io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType(
            new NamespacedKey(SakuraTech.getInstance(), "SAKURA_CRAFTING_TABLE"),
            new SlimefunItemStack("SAKURA_CRAFTING_TABLE", MainRegister.getSakuraCrafting()), "");
}
