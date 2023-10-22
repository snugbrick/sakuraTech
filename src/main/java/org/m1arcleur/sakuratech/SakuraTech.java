package org.m1arcleur.sakuratech;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import org.bukkit.plugin.java.JavaPlugin;
import org.m1arcleur.sakuratech.item.mainRegister;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * 该插件的终极目标是实现：综合性樱花立场生成器
 * 1.樱核原子及其生产机器
 * 2.樱花原锭
 * 3.樱花核心
 */
public final class SakuraTech extends JavaPlugin implements SlimefunAddon {
    private static SakuraTech Instance;

    @Override
    public void onEnable() {
        // Plugin startup logic
        Instance = this;

        mainRegister.itemRegister();
        mainRegister.MultiMachineRegister();
        mainRegister.MachineRegister();
        mainRegister.ResourceRegister();

        /*
         * ItemStack IS = CustomItem(SkullItem.fromBase64(),"Name","Lore");
         * */

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Instance = null;
    }

    public static SakuraTech getInstance() {
        return Instance;
    }

    @Nonnull
    @Override
    public JavaPlugin getJavaPlugin() {
        return Instance;
    }

    @Nullable
    @Override
    public String getBugTrackerURL() {
        return null;
    }
}
