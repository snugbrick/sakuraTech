package org.m1arcleur.sakuratech.Machine;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.m1arcleur.sakuratech.RecipeTypeUR.recipeType;
import org.m1arcleur.sakuratech.item.ItemSakura.sakuraAtom;
import org.m1arcleur.sakuratech.item.ItemSakura.sakuraAtomIngot;

import javax.annotation.Nonnull;

/**
 * @author MiracleUR
 * @version 1.0.0 2023.10.22 23:17
 * @website github.com/snugbrick;
 */
public class atomingotAlternator extends AContainer {

    public atomingotAlternator(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }

    public atomingotAlternator(ItemGroup itemGroup, String id, ItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, item), recipeType, recipe);
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.REDSTONE_TORCH);
    }

    @Nonnull
    @Override
    public String getMachineIdentifier() {
        return "ATOM_ALTERNATOR";
    }

    @Override
    public void registerDefaultRecipes() {
        //默认配方
        this.registerRecipe(5, sakuraAtom.SAKURA_ATOM, sakuraAtomIngot.SAKURA_ATOM_INGOT);
    }

    @Override
    public int getSpeed() {
        return 5;
    }

    @Override
    public int getEnergyConsumption() {
        return 16;
    }

    @Override
    public int getCapacity() {
        //可储存能量
        return 256;
    }
}
