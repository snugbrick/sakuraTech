package org.m1arcleur.sakuratech.Machine;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.multiblocks.MultiBlockMachine;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;


/**
 * @author MiracleUR
 * @version 1.0.0 2023.10.20 20:02
 * @website github.com/snugbrick;
 */
public class SakuraAtomMachine extends MultiBlockMachine {
    public SakuraAtomMachine(ItemGroup itemGroup, SlimefunItemStack item) {
        super(itemGroup, item, new ItemStack[]{
                new ItemStack(Material.CHERRY_LEAVES), new ItemStack(Material.CHERRY_LEAVES), new ItemStack(Material.CHERRY_LEAVES),
                null, new ItemStack(Material.CHERRY_WOOD), null,
                null, new CustomItemStack(Material.DISPENSER, "Dispenser (Facing up)"), null
        }, BlockFace.SELF);
    }
    @Override
    public void onInteract(Player player, Block block) {
        Block possibleDes = block.getRelative(BlockFace.DOWN);
    }
    /*
    @Nonnull
    public List<ItemStack> getDisplayRecipes() {

        return this.recipes.stream().map((items) -> {
            return items[0];
        }).collect(Collectors.toList());
    }
    */
}
