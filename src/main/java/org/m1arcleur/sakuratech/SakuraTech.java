package org.m1arcleur.sakuratech;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import org.bukkit.plugin.java.JavaPlugin;
import org.m1arcleur.sakuratech.item.*;

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

        if(getServer().getPluginManager().getPlugin("sakuraTech")!=null){
            getLogger().info("===sakuraTch===");
        } else {
            getLogger().info("无法检测到sakuraTech插件");
            return;
        }

        mainRegister.itemRegister();
        mainRegister.multiMahcineRegister();
        mainRegister.resourceRegister();
        mainRegister.blockMachineRegister();

        /*
         * ItemStack IS = CustomItem(SkullItem.fromBase64(),"Name","Lore");
         *
         * Player player = getServer().getPlayer("a");
         * player.getWorld().spawnParticle(Particle.ASH, player.getLocation(), 0, 0, 0, 0,int speed);
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
