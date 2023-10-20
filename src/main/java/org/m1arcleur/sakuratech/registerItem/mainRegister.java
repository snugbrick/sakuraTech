package org.m1arcleur.sakuratech.registerItem;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.api.researches.Research;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import org.bukkit.Location;
import org.bukkit.NamespacedKey;
import org.m1arcleur.sakuratech.SakuraTech;
import org.m1arcleur.sakuratech.registerGroup.mainGroup;
import org.m1arcleur.sakuratech.registerItem.ItemSakura.sakuraAtom;
import org.m1arcleur.sakuratech.registerItem.ItemSakura.sakuraAtomIngot;
import org.m1arcleur.sakuratech.registerItem.notMainItem.DeathAtom;

/**
 * @author MiracleUR
 * @version 1.0.0 2023.10.19 21:33
 * @website github.com/snugbrick;
 */
public class mainRegister {
    public static void itemRegister() {
        URregister.registerItem("SAKURA_ATOM", sakuraAtom.SAKURA_ATOM, mainGroup.itemGroup,
                RecipeType.COMPRESSOR, sakuraAtom.recipes);

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
        URregister.registerItem("DEATH_ATOM", DeathAtom.deathAtom, mainGroup.itemGroup,
                RecipeType.ENHANCED_CRAFTING_TABLE, DeathAtom.recipes, (ItemUseHandler) playerRightClickEvent -> {
                    if (playerRightClickEvent.getItem().equals(DeathAtom.deathAtom)) {
                        Location location = playerRightClickEvent.getPlayer().getLocation();
                    }
                });
        Research research3 = new Research(new NamespacedKey(SakuraTech.getInstance(), "DEATH_ATOM"), 8003,
                "凋亡粒子", 15);
        research3.addItems(SlimefunItem.getByItem(DeathAtom.deathAtom));
        research3.register();
    }
    public static void MultiMachineRegister(){

    }
    public static void MachineRegister(){

    }
    public static void ResourceRegister(){

    }
}
