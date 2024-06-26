package org.m1arcleur.sakuratech.Machine;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.m1arcleur.sakuratech.api.Interface.TimeChangeable;
import org.m1arcleur.sakuratech.item.ItemSakura.SakuraAtom;
import org.m1arcleur.sakuratech.item.ItemSakura.SakuraAtomIngot;

import javax.annotation.Nonnull;

/**
 * @author MiracleUR
 * @version 1.0.0 2023.10.22 23:17
 * @website github.com/snugbrick;
 */
public class AtomIngotCastingMachine extends AContainer implements TimeChangeable {
    private static int speed = 5;

    public AtomIngotCastingMachine(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }

    public AtomIngotCastingMachine(ItemGroup itemGroup, String id, ItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        this(itemGroup, new SlimefunItemStack(id, item), recipeType, recipe);
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
        this.registerRecipe(5, SakuraAtom.SAKURA_ATOM, SakuraAtomIngot.SAKURA_ATOM_INGOT);
    }

    @Override
    public int getSpeed() {
        return speed;
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

    @Override
    public void setTime(int time) {
        //可以设置时间
        speed = time;
    }

    @Override
    public int getTime() {
        return speed;
    }
}
