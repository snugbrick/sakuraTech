package org.m1arcleur.sakuratech;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.mrCookieSlime.CSCoreLibPlugin.cscorelib2.skull.SkullItem;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.m1arcleur.sakuratech.item.*;
import org.m1arcleur.sakuratech.listener.bowUnitListener;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * 该插件的终极目标是实现：综合性樱花立场生成器
 * 1.樱核原子及其生产机器
 * 2.樱花原锭
 * 3.樱花核心
 */
//要接着做的:将樱核原子装配到樱花工作台上,并且把头颅皮肤从base64改成url
public final class SakuraTech extends JavaPlugin implements SlimefunAddon {
    private static SakuraTech Instance;

    @Override
    public void onEnable() {
        Instance = this;

        if (getServer().getPluginManager().getPlugin("sakuraTech") != null) {
            getLogger().info("### sakuraTch v1.0.0 ###");
            getLogger().info("=     by:MiralceUR     =");
        } else {
            getLogger().info("无法检测到sakuraTech插件");
            return;
        }

        mainRegister.multiMahcineRegister();
        mainRegister.blockMachineRegister();
        mainRegister.itemRegister();
/*
        ItemStack IS = new CustomItemStack(SkullItem.fromURL("(http://textures.minecraft.net/texture/e424a686b1c248e71a39201322a70d42cf5edd1e3afe7cdc5f6fee085fb2bcc0"),
                "Name","Lore");
 */
        /*
         * ItemStack IS = new CustomItem(SkullItem.fromBase64(),"Name","Lore");
         *
         * Player player = getServer().getPlayer("a");
         * player.getWorld().spawnParticle(Particle.ASH, player.getLocation(), 0, 0, 0, 0,int speed);
         * */
    }

    public void listenerRgister() {
        getServer().getPluginManager().registerEvents(new bowUnitListener(), this);
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
