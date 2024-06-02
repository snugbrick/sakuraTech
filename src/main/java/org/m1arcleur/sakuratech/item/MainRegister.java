package org.m1arcleur.sakuratech.item;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.researches.Research;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.m1arcleur.sakuratech.Group.MainGroup;
import org.m1arcleur.sakuratech.Machine.AtomIngotCastingMachine;
import org.m1arcleur.sakuratech.Machine.MultiAtomMachine;
import org.m1arcleur.sakuratech.Machine.MultiCraftingtable;
import org.m1arcleur.sakuratech.RecipeTypeUR.RecipeType;
import org.m1arcleur.sakuratech.SakuraTech;
import org.m1arcleur.sakuratech.item.ItemSakura.*;
import org.m1arcleur.sakuratech.item.machineItem.AtomCastingMachine;

/**
 * @author MiracleUR
 * @version 1.0.0 2023.10.23 00:57
 * @website github.com/snugbrick;
 */
public class MainRegister {
    private static final SlimefunItemStack SakuraCrafting = new SlimefunItemStack("樱花合成台",
            new ItemStack(Material.CRAFTING_TABLE), "樱花合成台");
    private static final SlimefunItemStack SAKURA_TREE_MACHINE = new SlimefunItemStack("樱花创造机",
            new ItemStack(Material.CHERRY_LEAVES), "樱花创造机");


    public static void blockMachineRegister() {
        new AtomIngotCastingMachine(MainGroup.MachineGroup, "樱核原子铸造机", AtomCastingMachine.itemStacks,
                io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType.ENHANCED_CRAFTING_TABLE, AtomCastingMachine.itemRecipe()).register(SakuraTech.getInstance());

        Bukkit.getLogger().info("[sakuraTech] 方块机器加载完毕");
    }

    public static void itemRegister() {
        URregister.registerItem("SAKURA_ATOM", SakuraAtom.SAKURA_ATOM, MainGroup.itemGroup,
                RecipeType.SAKURA_CRAFTING_TABLE, SakuraAtom.recipes);
        Research research = new Research(new NamespacedKey(SakuraTech.getInstance(), "SAKURA_ATOM"), 8001,
                "樱核原子", 10);
        research.addItems(SlimefunItem.getByItem(SakuraAtom.SAKURA_ATOM));
        research.register();
        //==============================================================================================================
        URregister.registerItem("SAKURA_ATOM_INGOT", SakuraAtomIngot.SAKURA_ATOM_INGOT, MainGroup.itemGroup,
                RecipeType.SAKURA_CRAFTING_TABLE, SakuraAtomIngot.recipes);
        Research research2 = new Research(new NamespacedKey(SakuraTech.getInstance(), "SAKURA_ATOM_INGOT"), 8002,
                "樱花锭", 20);
        research2.addItems(SlimefunItem.getByItem(SakuraAtomIngot.SAKURA_ATOM_INGOT));
        research2.register();
        //==============================================================================================================
        URregister.registerItem("DEATH_ATOM", DeathAtom.deathAtom, MainGroup.itemGroup,
                io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType.ENHANCED_CRAFTING_TABLE, DeathAtom.recipes, (ItemUseHandler) playerRightClickEvent -> {
                    if (playerRightClickEvent.getItem().equals(DeathAtom.deathAtom)) {
                        playerRightClickEvent.getPlayer().setHealth(0);
                        //XD
                    }
                });
        Research research3 = new Research(new NamespacedKey(SakuraTech.getInstance(), "DEATH_ATOM"), 8003,
                "凋亡粒子", 15);
        research3.addItems(SlimefunItem.getByItem(DeathAtom.deathAtom));
        research3.register();
        //==============================================================================================================
        URregister.registerItem("POSITION_SHELL", ForceFieldShell.FFS, MainGroup.itemGroup, RecipeType.SAKURA_CRAFTING_TABLE,
                ForceFieldShell.recipes);
        Research research1 = new Research(new NamespacedKey(SakuraTech.getInstance(), "POSITION_SHELL"), 8004,
                "力场外壳", 15);
        research1.addItems(SlimefunItem.getByItem(ForceFieldShell.FFS));
        research1.register();
        //==============================================================================================================
        URregister.registerItem("FORCE_CORE", MultiForceCore.multiForceCore, MainGroup.itemGroup, RecipeType.SAKURA_CRAFTING_TABLE,
                MultiForceCore.recipes);
        Research research4 = new Research(new NamespacedKey(SakuraTech.getInstance(), "FORCE_CORE"), 8005,
                "力场核心样板", 20);
        research4.addItems(SlimefunItem.getByItem(MultiForceCore.multiForceCore));
        research4.register();
        //==============================================================================================================
        URregister.registerItem("bowForceCore", ForceCore.abowForceCore, MainGroup.itemGroup, RecipeType.SAKURA_CRAFTING_TABLE,
                ForceCore.bowRecipes);//弓箭力场核心
        URregister.registerItem("creatureCore", ForceCore.creatureCore, MainGroup.itemGroup, RecipeType.SAKURA_CRAFTING_TABLE,
                ForceCore.creatureRecipes);//生物力场核心
        URregister.registerItem("synthesisForceCore", ForceCore.synthesisForceCore, MainGroup.itemGroup, RecipeType.SAKURA_CRAFTING_TABLE,
                ForceCore.synthesisRecipes);//综合力场核心;
        URregister.registerItem("reflectForceCore", ForceCore.reflectForceCore, MainGroup.itemGroup, RecipeType.SAKURA_CRAFTING_TABLE,
                ForceCore.reflectRecipes);//反射立场核心

        Bukkit.getLogger().info("[sakuraTech] 物品加载完毕");
    }

    public static void multiMachineRegister() {
        new MultiAtomMachine(MainGroup.MultiItemGroup, SAKURA_TREE_MACHINE).register(SakuraTech.getInstance());

        new MultiCraftingtable(MainGroup.MultiItemGroup, SakuraCrafting).register(SakuraTech.getInstance());

        Bukkit.getLogger().info("[sakuraTech] 多方块机器加载完毕");
    }

    public static SlimefunItemStack getSakuraCrafting() {
        return SakuraCrafting;
    }

    public static SlimefunItemStack getSlimefunItemStack() {
        return SAKURA_TREE_MACHINE;
    }
}
