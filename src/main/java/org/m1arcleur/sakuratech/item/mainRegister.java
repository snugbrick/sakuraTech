package org.m1arcleur.sakuratech.item;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.api.researches.Research;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.m1arcleur.sakuratech.Group.mainGroup;
import org.m1arcleur.sakuratech.Machine.SakuraAtomMachine;
import org.m1arcleur.sakuratech.Machine.SakuraCraftingtable;
import org.m1arcleur.sakuratech.Machine.atomingotAlternator;
import org.m1arcleur.sakuratech.SakuraTech;
import org.m1arcleur.sakuratech.item.ItemSakura.*;

/**
 * @author MiracleUR
 * @version 1.0.0 2023.10.23 00:57
 * @website github.com/snugbrick;
 */
public class mainRegister {
    public static void blockMachineRegister() {
        assert Slimefun.instance() != null;
        new atomingotAlternator(mainGroup.itemGroup, "樱核原子铸造机", atomCastingMachine.itemStacks,
                RecipeType.ENHANCED_CRAFTING_TABLE, atomCastingMachine.itemRecipe()).register(Slimefun.instance());
    }

    public static void itemRegister() {
        URregister.registerItem("SAKURA_ATOM", sakuraAtom.SAKURA_ATOM, mainGroup.itemGroup,
                RecipeType.ENHANCED_CRAFTING_TABLE, sakuraAtom.recipes);

        Research research = new Research(new NamespacedKey(SakuraTech.getInstance(), "SAKURA_ATOM"), 8001,
                "樱核原子", 10);
        research.addItems(SlimefunItem.getByItem(sakuraAtom.SAKURA_ATOM));
        research.register();
        //==============================================================================================================
        URregister.registerItem("SAKURA_ATOM_INGOT", sakuraAtomIngot.SAKURA_ATOM_INGOT, mainGroup.itemGroup,
                RecipeType.ENHANCED_CRAFTING_TABLE, sakuraAtomIngot.recipes);
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
/*        URregister.registerItem("POSITION_SHELL", positionShell.IS, mainGroup.itemGroup, RecipeType.ENHANCED_CRAFTING_TABLE,
                positionShell.recipes);
        Research research1 = new Research(new NamespacedKey(SakuraTech.getInstance(), "POSITION_SHELL"), 8004,
                "立场核心", 15);
        research1.addItems(SlimefunItem.getByItem(positionShell.IS));
        research1.register();
*/
    }

    public static void multiMahcineRegister() {
        SlimefunItemStack slimefunItemStack = new SlimefunItemStack("樱花创造机", new ItemStack(Material.CHERRY_LEAVES));
        new SakuraAtomMachine(mainGroup.MultiItemGroup, slimefunItemStack).register(SakuraTech.getInstance());

        SlimefunItemStack SakuraCrafting = new SlimefunItemStack("樱花合成台", new ItemStack(Material.CRAFTING_TABLE));
        new SakuraCraftingtable(mainGroup.MultiItemGroup, SakuraCrafting).register(SakuraTech.getInstance());
    }

    public static void resourceRegister() {

    }
}
