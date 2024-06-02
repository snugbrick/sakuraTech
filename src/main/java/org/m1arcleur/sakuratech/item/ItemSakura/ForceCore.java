package org.m1arcleur.sakuratech.item.ItemSakura;

import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.mrCookieSlime.CSCoreLibPlugin.cscorelib2.skull.SkullItem;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * @author MiracleUR
 * @version 1.0.0 2023.10.29 18:41
 * @website github.com/snugbrick;
 */
//各种各样的核心，暂时还未开放获取，因为头颅网站无法访问
public class ForceCore {
    public static ItemStack creatureCore = new CustomItemStack(SkullItem.fromBase64("77d8e759e839a17aff5f6986e4cd722b88e39ce5f7d23be9c723e88c1ea43b4f"), "生物力场核心", "");
    public static ItemStack[] creatureRecipes = {
            null, null, null,
            null, null, null,
            SakuraAtom.SAKURA_ATOM, null, null
    };
    public static ItemStack abowForceCore = new CustomItemStack(Material.CHERRY_BOAT, "弓箭力场核心", "");
    public static ItemStack[] bowRecipes = {
            null, null, null,
            SakuraAtom.SAKURA_ATOM, null, null,
            null, null, null
    };
    public static ItemStack synthesisForceCore = new CustomItemStack(Material.CHERRY_BOAT, "综合力场核心", "");
    public static ItemStack[] synthesisRecipes = {
            null, null, null,
            null, null, null,
            null, SakuraAtom.SAKURA_ATOM, null
    };
    public static ItemStack reflectForceCore = new CustomItemStack(Material.CHERRY_BOAT, "反射立场核心", "");
    public static ItemStack[] reflectRecipes = {
            null, null, null,
            null, null, null,
            null, null, SakuraAtom.SAKURA_ATOM
    };
}
