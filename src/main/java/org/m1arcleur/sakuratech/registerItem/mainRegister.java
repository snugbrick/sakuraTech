package org.m1arcleur.sakuratech.registerItem;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.api.researches.Research;
import org.bukkit.NamespacedKey;
import org.m1arcleur.sakuratech.SakuraTech;
import org.m1arcleur.sakuratech.regiaterGroup.mainGroup;
import org.m1arcleur.sakuratech.registerItem.ItemSakura.sakuraAtom;

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
    }
}
