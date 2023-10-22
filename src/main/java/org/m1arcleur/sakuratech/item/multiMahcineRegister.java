package org.m1arcleur.sakuratech.item;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.m1arcleur.sakuratech.Group.mainGroup;
import org.m1arcleur.sakuratech.Machine.MultiMachine.SakuraAtomMachine;
import org.m1arcleur.sakuratech.Machine.MultiMachine.SakuraCraftingtable;
import org.m1arcleur.sakuratech.SakuraTech;

/**
 * @author MiracleUR
 * @version 1.0.0 2023.10.23 00:01
 * @website github.com/snugbrick;
 */
public class multiMahcineRegister {
    public static void run() {
        SlimefunItemStack slimefunItemStack = new SlimefunItemStack("8005", new ItemStack(Material.CHERRY_LEAVES));
        new SakuraAtomMachine(mainGroup.MultiItemGroup, slimefunItemStack).register(SakuraTech.getInstance());

        SlimefunItemStack SakuraCrafting = new SlimefunItemStack("8006", new ItemStack(Material.CRAFTING_TABLE));
        new SakuraCraftingtable(mainGroup.MultiItemGroup, SakuraCrafting).register(SakuraTech.getInstance());
    }
}
