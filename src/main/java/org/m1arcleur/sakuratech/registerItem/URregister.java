package org.m1arcleur.sakuratech.registerItem;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.inventory.ItemStack;
import org.m1arcleur.sakuratech.SakuraTech;

/**
 * @author MiracleUR
 * @version 1.0.0 2023.10.19 21:27
 * @website github.com/snugbrick;
 */
public class URregister {
    public static void registerItem(String id, ItemStack itemStack, ItemGroup itemGroup, RecipeType recipeType, ItemStack[] recipe) {
        SlimefunItemStack slimefunItemStack = new SlimefunItemStack(id, itemStack);
        SlimefunItem sli = new SlimefunItem(itemGroup, slimefunItemStack, recipeType, recipe);
        sli.register(SakuraTech.getInstance());
    }
}
