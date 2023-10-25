package org.m1arcleur.sakuratech.Machine;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.services.sounds.SoundEffect;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.implementation.items.backpacks.SlimefunBackpack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.ItemUtils;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.Dispenser;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.m1arcleur.sakuratech.api.abstractMachine.SakuraAbstractCrafting;
import org.m1arcleur.sakuratech.item.ItemSakura.sakuraAtom;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author MiracleUR
 * @version 1.0.0 2023.10.22 02:46
 * @website github.com/snugbrick;
 */
public class SakuraCraftingtable extends SakuraAbstractCrafting {
    private static List<ItemStack[]> recipes = new ArrayList<>();

    public SakuraCraftingtable(ItemGroup itemGroup, SlimefunItemStack item) {
        super(itemGroup, item, new ItemStack[]{
                null, new ItemStack(Material.CHERRY_LEAVES), null,
                null, new ItemStack(Material.CRAFTING_TABLE), null,
                null, new CustomItemStack(Material.DISPENSER, "Dispenser (Facing up)"), null
        }, BlockFace.SELF);
    }

    @Nonnull
    @Override
    public List<ItemStack[]> getRecipes() {

        ItemStack[] recipe1 = new ItemStack[]{
                new ItemStack(Material.CHERRY_LEAVES), new ItemStack(Material.CHERRY_LEAVES), new ItemStack(Material.CHERRY_LEAVES),
                new ItemStack(Material.CHERRY_LEAVES), new ItemStack(Material.CHERRY_LEAVES), new ItemStack(Material.CHERRY_LEAVES),
                new ItemStack(Material.CHERRY_LEAVES), new ItemStack(Material.CHERRY_LEAVES), new ItemStack(Material.CHERRY_LEAVES)
        };

        ItemStack[] recipe2 = new ItemStack[]{
                sakuraAtom.SAKURA_ATOM, null, null,
                null, null, null,
                null, null, null
        };

        recipes.add(recipe1);
        recipes.add(recipe2);
        return recipes;
    }

    @Override
    public void onInteract(Player player, Block block) {
        Block possibleDes = block.getRelative(BlockFace.DOWN);
        Material material = possibleDes.getType();
        if (material.equals(Material.DISPENSER)) {
            Dispenser dispenser = (Dispenser) possibleDes.getState();
            Inventory inventory = dispenser.getInventory();
            List<ItemStack[]> inputs = RecipeType.getRecipeInputList(this);
            Iterator<ItemStack[]> iterator = inputs.iterator();

            while (iterator.hasNext()) {
                ItemStack[] input = iterator.next();
                if (this.isCraftable(inventory, input)) {
                    ItemStack output = RecipeType.getRecipeOutputList(this, input).clone();
                    if (SlimefunUtils.canPlayerUseItem(player, output, true)) {
                        this.craft(inventory, possibleDes, player, block, output);
                    }
                    return;
                } else {
                    player.sendMessage("无法合成，请保证配方正确");
                    return;
                }
            }
        }
    }

    private void craft(Inventory inv, Block dispenser, Player p, Block b, ItemStack output) {
        Inventory fakeInv = this.createVirtualInventory(inv);
        Inventory outputInv = this.findOutputInventory(output, dispenser, inv, fakeInv);
        if (outputInv != null) {
            SlimefunItem sfItem = SlimefunItem.getByItem(output);
            if (sfItem instanceof SlimefunBackpack) {
                SlimefunBackpack backpack = (SlimefunBackpack) sfItem;
                this.upgradeBackpack(p, inv, backpack, output);
            }

            for (int j = 0; j < 9; ++j) {
                ItemStack item = inv.getContents()[j];
                if (item != null && item.getType() != Material.AIR) {
                    ItemUtils.consumeItem(item, true);
                }
            }

            SoundEffect.ENHANCED_CRAFTING_TABLE_CRAFT_SOUND.playAt(b);
            outputInv.addItem(output);
        } else {
            Slimefun.getLocalization().sendMessage(p, "machines.full-inventory", true);
        }

    }

    private boolean isCraftable(Inventory inv, ItemStack[] recipe) {
        for (int j = 0; j < inv.getContents().length; ++j) {
            if (!SlimefunUtils.isItemSimilar(inv.getContents()[j], recipe[j], true, true, false)) {
                if (!(SlimefunItem.getByItem(recipe[j]) instanceof SlimefunBackpack)) {
                    return false;
                }

                if (!SlimefunUtils.isItemSimilar(inv.getContents()[j], recipe[j], false, true, false)) {
                    return false;
                }
            }
        }

        return true;
    }
}