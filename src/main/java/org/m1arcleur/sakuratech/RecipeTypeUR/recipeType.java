package org.m1arcleur.sakuratech.RecipeTypeUR;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

import java.util.Locale;

/**
 * @author MiracleUR
 * @version 1.0.0 2023.10.19 21:46
 * @website github.com/snugbrick;
 */
public class recipeType extends RecipeType {
    public static final RecipeType SAKURA_CRAFTING_TABLE;
    private final ItemStack item;
    private NamespacedKey key;
    private final String machine;


    public recipeType(ItemStack item, String machine) {
        super(item, machine);
        this.item = item;
        this.machine = machine;
        if (!machine.isEmpty()) {
            if (Slimefun.instance() != null) {
                this.key = new NamespacedKey(Slimefun.instance(), machine.toLowerCase(Locale.ROOT));
            }
        } else {
            if (Slimefun.instance() != null) {
                this.key = new NamespacedKey(Slimefun.instance(), "unknown");
            }
        }
    }

    static {
        SlimefunItemStack slimefunItemStack = new SlimefunItemStack("sakura_crafting_table", Material.CRAFTING_TABLE, "樱花合成台", "可以合成樱花科技物品");
        SAKURA_CRAFTING_TABLE = new RecipeType(new NamespacedKey(Slimefun.instance(), "sakura_crafting_table"),
                slimefunItemStack, "", "&a&o是樱花科技的合成台", "&a&o拥有这个就拥有了樱花科技?");
    }


    public RecipeType getSakuraCraftingTable() {
        return SAKURA_CRAFTING_TABLE;
    }

    public ItemStack getItem() {
        return item;
    }

    public NamespacedKey getNameKey() {
        return key;
    }

    public String getCraftingMachine() {
        return machine;
    }
}
