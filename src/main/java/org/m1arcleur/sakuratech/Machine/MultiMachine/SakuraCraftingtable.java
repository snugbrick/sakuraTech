package org.m1arcleur.sakuratech.Machine.MultiMachine;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.m1arcleur.sakuratech.api.AbstractSakuraCrafting.SakuraAbstractCrafting;

/**
 * @author MiracleUR
 * @version 1.0.0 2023.10.22 02:46
 * @website github.com/snugbrick;
 */
public class SakuraCraftingtable extends SakuraAbstractCrafting {
    public SakuraCraftingtable(ItemGroup itemGroup, SlimefunItemStack item) {
        super(itemGroup, item, new ItemStack[]{
                null, new ItemStack(Material.CHERRY_LEAVES), null,
                null, new ItemStack(Material.CRAFTING_TABLE), null,
                null, new CustomItemStack(Material.DISPENSER, "Dispenser (Facing up)"), null
        }, BlockFace.SELF);
    }

    @Override
    public void onInteract(Player player, Block block) {
        Block possibleDes = block.getRelative(BlockFace.DOWN);
    }
}
