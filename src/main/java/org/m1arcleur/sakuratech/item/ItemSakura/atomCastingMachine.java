package org.m1arcleur.sakuratech.item.ItemSakura;

import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * @author MiracleUR
 * @version 1.0.0 2023.10.23 00:18
 * @website github.com/snugbrick;
 */
//铸造机,使用原子和锭以及硬铝锭合成
public class atomCastingMachine {
    public static ItemStack itemStacks = new CustomItemStack(
            Material.CHERRY_LOG, "樱核原子铸造机", "可以将原子压缩为锭", "16J/s 256J可存储"
    );

    public static ItemStack[] itemRecipe() {
        return new ItemStack[]{
                null, sakuraAtom.SAKURA_ATOM, null,
                sakuraAtom.SAKURA_ATOM, sakuraAtomIngot.SAKURA_ATOM_INGOT, sakuraAtom.SAKURA_ATOM,
                null, null, null
        };
    }
}
