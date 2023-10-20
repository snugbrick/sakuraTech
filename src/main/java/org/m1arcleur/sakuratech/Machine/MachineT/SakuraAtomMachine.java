package org.m1arcleur.sakuratech.Machine.MachineT;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.core.multiblocks.MultiBlockMachine;
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
public class SakuraAtomMachine extends MultiBlockMachine implements RecipeDisplayItem {
    private static List<ItemStack> itemStackList;

    protected SakuraAtomMachine(ItemGroup itemGroup, SlimefunItemStack item, ItemStack[] recipe, ItemStack[] machineRecipes, BlockFace trigger) {
        super(itemGroup, item, recipe, machineRecipes, trigger);
    }

    @Nonnull
    public List<ItemStack> getDisplayRecipes() {

        return itemStackList;
    }

    @Override
    public void onInteract(Player player, Block block) {

    }
}
