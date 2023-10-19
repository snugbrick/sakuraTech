package org.m1arcleur.sakuratech.RecipeTypeUR;

import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

/**
 * @author MiracleUR
 * @version 1.0.0 2023.10.19 21:46
 * @website github.com/snugbrick;
 */
public class recipeType extends RecipeType {
    //private static final RecipeType SAKURA_MACHINE;
    public recipeType(ItemStack item, String machine) {
        super(item, machine);
    }//制作好樱花核心机器后编写此处
    static {
        //SAKURA_MACHINE=new recipeType(new NamespacedKey());
    }
}
