package org.m1arcleur.sakuratech.item.machineItem;

import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.m1arcleur.sakuratech.item.ItemSakura.SakuraAtom;
import org.m1arcleur.sakuratech.item.ItemSakura.SakuraAtomIngot;

/**
 * @author MiracleUR
 * @version 1.0.0 2023.10.23 00:18
 * @website github.com/snugbrick;
 */
//铸造机,使用原子和锭以及硬铝锭合成
public class AtomCastingMachine {
    public static ItemStack itemStacks = new CustomItemStack(
            Material.PINK_STAINED_GLASS, "樱核原子铸造机", "可以将原子压缩为锭", "16J/s 256J可存储"
    );

    public static ItemStack[] itemRecipe() {
        return new ItemStack[]{
                null, SakuraAtom.SAKURA_ATOM, null,
                SakuraAtom.SAKURA_ATOM, SakuraAtomIngot.SAKURA_ATOM_INGOT, SakuraAtom.SAKURA_ATOM,
                null, null, null
        };
    }
}
