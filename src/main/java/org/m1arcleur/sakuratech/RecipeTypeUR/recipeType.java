package org.m1arcleur.sakuratech.RecipeTypeUR;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.NamespacedKey;
import org.m1arcleur.sakuratech.SakuraTech;
import org.m1arcleur.sakuratech.item.mainRegister;

/**
 * @author MiracleUR
 * @version 1.0.0 2023.10.19 21:46
 * @website github.com/snugbrick;
 */
public class recipeType {
    //SAKURA_CRAFTING_TABLE
    public static final RecipeType SAKURA_CRAFTING_TABLE = new RecipeType(
            new NamespacedKey(SakuraTech.getInstance(), "SAKURA_CRAFTING_TABLE"),
            new SlimefunItemStack("SAKURA_CRAFTING_TABLE", mainRegister.getSakuraCrafting()), "");
}
