package org.m1arcleur.sakuratech.Machine.MachineT;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.core.multiblocks.MultiBlockMachine;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import java.util.List;


/**
 * @author MiracleUR
 * @version 1.0.0 2023.10.20 20:02
 * @website github.com/snugbrick;
 */
public class SakuraAtomMachine extends MultiBlockMachine
        /*implements RecipeDisplayItem*/ {
    private static List<ItemStack> RecList;

    public SakuraAtomMachine(ItemGroup itemGroup, SlimefunItemStack item) {
        //   (itemGroup, item, recipe, machineRecipes, trigger)
        super(itemGroup, item, new ItemStack[]{
                new ItemStack(Material.CHERRY_LEAVES), new ItemStack(Material.CHERRY_LEAVES), new ItemStack(Material.CHERRY_LEAVES),
                null, new ItemStack(Material.CHERRY_WOOD), null,
                null, new ItemStack(Material.DISPENSER), null
        }, new ItemStack[]{
                new ItemStack(Material.CHERRY_LEAVES), null, null,
                null, null, null,
                null, null, null
        }, BlockFace.DOWN);
    }

    @Override
    public void onInteract(Player player, Block block) {

    }
/*
    @Nonnull
    public List<ItemStack> getDisplayRecipes() {
        return RecList;
    }
 */
}
