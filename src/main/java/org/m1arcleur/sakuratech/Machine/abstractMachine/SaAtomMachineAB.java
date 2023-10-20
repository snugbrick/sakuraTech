package org.m1arcleur.sakuratech.Machine.abstractMachine;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.EnergyNetComponent;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineProcessHolder;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.core.machines.MachineProcessor;
import io.github.thebusybiscuit.slimefun4.core.multiblocks.MultiBlockMachine;
import io.github.thebusybiscuit.slimefun4.core.networks.energy.EnergyNetComponentType;
import io.github.thebusybiscuit.slimefun4.implementation.operations.CraftingOperation;
import me.mrCookieSlime.CSCoreLibPlugin.cscorelib2.item.CustomItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.interfaces.InventoryBlock;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author MiracleUR
 * @version 1.0.0 2023.10.20 17:29
 * @website github.com/snugbrick;
 */
public abstract class SaAtomMachineAB extends MultiBlockMachine implements RecipeDisplayItem {

    private static List<ItemStack> itemStackList;


    protected SaAtomMachineAB(ItemGroup itemGroup, SlimefunItemStack item, ItemStack[] recipe, ItemStack[] machineRecipes, BlockFace trigger) {
        super(itemGroup, item, recipe, machineRecipes, trigger);
    }

    @Nonnull
    public List<ItemStack> getDisplayRecipes() {
        return itemStackList;
    }

}
