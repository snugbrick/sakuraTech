package org.m1arcleur.sakuratech.Machine.abstractMachine;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.EnergyNetComponent;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineProcessHolder;
import io.github.thebusybiscuit.slimefun4.core.machines.MachineProcessor;
import io.github.thebusybiscuit.slimefun4.core.networks.energy.EnergyNetComponentType;
import io.github.thebusybiscuit.slimefun4.implementation.operations.CraftingOperation;
import me.mrCookieSlime.CSCoreLibPlugin.cscorelib2.item.CustomItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.interfaces.InventoryBlock;
import org.bukkit.Material;
import org.bukkit.block.Block;
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
public class SaAtomMachineAB  extends SlimefunItem implements InventoryBlock, EnergyNetComponent, MachineProcessHolder<CraftingOperation> {
    public final static int[] inputSlots = new int[]{20, 21, 22, 23, 24};
    public final static int[] outputSlots = new int[]{40};
    public static final Map<Block, MachineRecipe> processing = new HashMap<>();
    public static final Map<Block, Integer> progress = new HashMap<>();
    private static final int[] BORDER_A = {0, 1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 25, 26,
            27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 44, 45, 46, 47, 48, 49, 50, 51, 41, 52, 53};
    private static final int[] BORDER_B = {37, 38, 39, 41, 42, 43};
    private static final ItemStack FREE_STATE_ITEM = new CustomItem(Material.BLACK_STAINED_GLASS_PANE,""
            );
    private static final ItemStack BORDER_A_ITEM = new CustomItem(Material.LIGHT_BLUE_STAINED_GLASS_PANE,""
            );
    private static final ItemStack BORDER_B_ITEM = new CustomItem(Material.LIME_STAINED_GLASS_PANE,""
            );
    protected final List<MachineRecipe> recipes = new ArrayList<>();
    private final MachineProcessor<CraftingOperation> processor = new MachineProcessor<>(this);
    public SaAtomMachineAB(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);

        processor.setProgressBar(new ItemStack(Material.DIAMOND_AXE));
    }

    @Nonnull
    @Override
    public EnergyNetComponentType getEnergyComponentType() {
        return null;
    }

    @Override
    public int getCapacity() {
        return 0;
    }

    @Nonnull
    @Override
    public MachineProcessor<CraftingOperation> getMachineProcessor() {
        return null;
    }

    @Override
    public int[] getInputSlots() {
        return new int[0];
    }

    @Override
    public int[] getOutputSlots() {
        return new int[0];
    }
}
