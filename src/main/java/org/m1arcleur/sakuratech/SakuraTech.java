package org.m1arcleur.sakuratech;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.bukkit.plugin.java.JavaPlugin;
import org.m1arcleur.sakuratech.item.MainRegister;
import org.m1arcleur.sakuratech.listener.BowUnitListener;
import org.m1arcleur.sakuratech.listener.NotPlaceable;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;

/**
 * 该插件的终极目标是实现：综合性樱花立场生成器
 * 1.樱核原子及其生产机器
 * 2.樱花原锭
 * 3.樱花核心
 */
/*
 * 要接着做的:使樱花工作台返回的是SLimefunItemStack,
 * 
 * 处理构思：将第二个配方中的物品切换（我估计没用
 * 
 */
public final class SakuraTech extends JavaPlugin implements SlimefunAddon {
    private static SakuraTech Instance;

    @Override
    public void onEnable() {
        Instance = this;

        if (getServer().getPluginManager().getPlugin("sakuraTech") != null) {
            getLogger().info("### sakuraTch v1.0.0 ###");
            getLogger().info("=-----by:MiralceUR-----=");
        } else if (getServer().getPluginManager().getPlugin("Slimefun") == null) {
            getLogger().info("无法检测到Slimefun插件前置");
            if (getServer().getPluginManager().getPlugin("Slimefun").isEnabled()) {
                getLogger().info("Slimefun插件前置未加载完毕");
                getServer().getPluginManager().disablePlugin(this);
            }
            getServer().getPluginManager().disablePlugin(this);
        } else {
            getLogger().info("无法检测到sakuraTech插件");
            getServer().getPluginManager().disablePlugin(this);
        }

        MainRegister.multiMachineRegister();
        MainRegister.blockMachineRegister();
        MainRegister.itemRegister();

        listenerRgister();

        getLogger().info("插件已启用");

        /*
         * ItemStack IS = new CustomItemStack(SkullItem.fromURL(
         * "(http://textures.minecraft.net/texture/e424a686b1c248e71a39201322a70d42cf5edd1e3afe7cdc5f6fee085fb2bcc0"
         * ),
         * "Name","Lore");
         */
        /*
         * ItemStack IS = new CustomItem(SkullItem.fromBase64(),"Name","Lore");
         *
         * Player player = getServer().getPlayer("a");
         * player.getWorld().spawnParticle(Particle.ASH, player.getLocation(), 0, 0, 0,
         * 0,int speed);
         */
    }

    public void listenerRgister() {
        getServer().getPluginManager().registerEvents(new BowUnitListener(), this);
        getServer().getPluginManager().registerEvents(new NotPlaceable(), this);

        getLogger().info("监听器加载完毕");
    }

    @Override
    public void onDisable() {
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
