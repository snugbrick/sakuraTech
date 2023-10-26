package org.m1arcleur.sakuratech.item;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.api.researches.Research;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.m1arcleur.sakuratech.Group.mainGroup;
import org.m1arcleur.sakuratech.Machine.atomIngotCastingMachine;
import org.m1arcleur.sakuratech.Machine.multiAtomMachine;
import org.m1arcleur.sakuratech.Machine.multiCraftingtable;
import org.m1arcleur.sakuratech.RecipeTypeUR.recipeType;
import org.m1arcleur.sakuratech.SakuraTech;
import org.m1arcleur.sakuratech.item.ItemSakura.*;
import org.m1arcleur.sakuratech.item.machineItem.atomCastingMachine;

/**
 * @author MiracleUR
 * @version 1.0.0 2023.10.23 00:57
 * @website github.com/snugbrick;
 */
public class mainRegister {
    private static final SlimefunItemStack SakuraCrafting = new SlimefunItemStack("樱花合成台",
            new ItemStack(Material.CRAFTING_TABLE), "樱花合成台");
    private static final SlimefunItemStack SAKURA_TREE_MACHINE = new SlimefunItemStack("樱花创造机",
            new ItemStack(Material.CHERRY_LEAVES), "樱花创造机");


    public static void blockMachineRegister() {
        new atomIngotCastingMachine(mainGroup.MachineGroup, "樱核原子铸造机", atomCastingMachine.itemStacks,
                RecipeType.ENHANCED_CRAFTING_TABLE, atomCastingMachine.itemRecipe()).register(SakuraTech.getInstance());

        Bukkit.getLogger().info("方块机器加载完毕");
    }

    public static void itemRegister() {
        URregister.registerItem("SAKURA_ATOM", sakuraAtom.SAKURA_ATOM, mainGroup.itemGroup,
                recipeType.SAKURA_CRAFTING_TABLE, sakuraAtom.recipes);
        Research research = new Research(new NamespacedKey(SakuraTech.getInstance(), "SAKURA_ATOM"), 8001,
                "樱核原子", 10);
        research.addItems(SlimefunItem.getByItem(sakuraAtom.SAKURA_ATOM));
        research.register();
        //==============================================================================================================
        URregister.registerItem("SAKURA_ATOM_INGOT", sakuraAtomIngot.SAKURA_ATOM_INGOT, mainGroup.itemGroup,
                recipeType.SAKURA_CRAFTING_TABLE, sakuraAtomIngot.recipes);
        Research research2 = new Research(new NamespacedKey(SakuraTech.getInstance(), "SAKURA_ATOM_INGOT"), 8002,
                "樱花锭", 20);
        research2.addItems(SlimefunItem.getByItem(sakuraAtomIngot.SAKURA_ATOM_INGOT));
        research2.register();
        //==============================================================================================================
        URregister.registerItem("DEATH_ATOM", deathAtom.deathAtom, mainGroup.itemGroup,
                RecipeType.ENHANCED_CRAFTING_TABLE, deathAtom.recipes, (ItemUseHandler) playerRightClickEvent -> {
                    if (playerRightClickEvent.getItem().equals(deathAtom.deathAtom)) {
                        playerRightClickEvent.getPlayer().setHealth(0);
                        //XD
                    }
                });
        Research research3 = new Research(new NamespacedKey(SakuraTech.getInstance(), "DEATH_ATOM"), 8003,
                "凋亡粒子", 15);
        research3.addItems(SlimefunItem.getByItem(deathAtom.deathAtom));
        research3.register();
        //==============================================================================================================
        URregister.registerItem("POSITION_SHELL", forceFieldShell.FFS, mainGroup.itemGroup, recipeType.SAKURA_CRAFTING_TABLE,
                forceFieldShell.recipes);
        Research research1 = new Research(new NamespacedKey(SakuraTech.getInstance(), "POSITION_SHELL"), 8004,
                "力场外壳", 15);
        research1.addItems(SlimefunItem.getByItem(forceFieldShell.FFS));
        research1.register();
        //==============================================================================================================
        URregister.registerItem("FORCE_CORE", multiForceCore.multiForceCore, mainGroup.itemGroup, recipeType.SAKURA_CRAFTING_TABLE,
                multiForceCore.recipes);
        Research research4 = new Research(new NamespacedKey(SakuraTech.getInstance(), "FORCE_CORE"), 8005,
                "力场核心", 20);
        research4.addItems(SlimefunItem.getByItem(multiForceCore.multiForceCore));
        research4.register();

        Bukkit.getLogger().info("物品加载完毕");
    }

    public static void multiMahcineRegister() {
        new multiAtomMachine(mainGroup.MultiItemGroup, SAKURA_TREE_MACHINE).register(SakuraTech.getInstance());

        new multiCraftingtable(mainGroup.MultiItemGroup, SakuraCrafting).register(SakuraTech.getInstance());

        Bukkit.getLogger().info("多方块机器加载完毕");
    }

    public static SlimefunItemStack getSakuraCrafting() {
        return SakuraCrafting;
    }

    public static SlimefunItemStack getSlimefunItemStack() {
        return SAKURA_TREE_MACHINE;
    }
}
