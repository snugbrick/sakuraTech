package org.m1arcleur.sakuratech.Machine.abstractMachine;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.player.PlayerBackpack;
import io.github.thebusybiscuit.slimefun4.api.player.PlayerProfile;
import io.github.thebusybiscuit.slimefun4.core.multiblocks.MultiBlockMachine;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.implementation.items.backpacks.SlimefunBackpack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.common.ChatColors;
import io.github.thebusybiscuit.slimefun4.libraries.dough.common.CommonPatterns;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.ItemUtils;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * @author MiracleUR
 * @version 1.0.0 2023.10.22 02:49
 * @website github.com/snugbrick;
 */
public abstract class SakuraAbstractCrafting extends MultiBlockMachine {
    @ParametersAreNonnullByDefault
    protected SakuraAbstractCrafting(ItemGroup itemGroup, SlimefunItemStack item, ItemStack[] recipe, BlockFace trigger) {
        super(itemGroup, item, recipe, trigger);
    }

    @Nonnull
    protected Inventory createVirtualInventory(@Nonnull Inventory inv) {
        Inventory fakeInv = Bukkit.createInventory((InventoryHolder) null, 9, "Fake Inventory");

        for (int j = 0; j < inv.getContents().length; ++j) {
            ItemStack stack = inv.getContents()[j];
            if (stack != null) {
                stack = stack.clone();
                ItemUtils.consumeItem(stack, true);
            }

            fakeInv.setItem(j, stack);
        }

        return fakeInv;
    }

    @ParametersAreNonnullByDefault
    protected void upgradeBackpack(Player p, Inventory inv, SlimefunBackpack backpack, ItemStack output) {
        ItemStack input = null;

        int size;
        for (size = 0; size < 9; ++size) {
            if (inv.getContents()[size] != null && inv.getContents()[size].getType() != Material.AIR && SlimefunItem.getByItem(inv.getContents()[size]) instanceof SlimefunBackpack) {
                input = inv.getContents()[size];
                break;
            }
        }

        if (SlimefunUtils.isSoulbound(input)) {
            SlimefunUtils.setSoulbound(output, true);
        }

        size = backpack.getSize();
        Optional<String> id = this.retrieveID(input, size);
        int line;
        if (id.isPresent()) {
            for (line = 0; line < output.getItemMeta().getLore().size(); ++line) {
                if (((String) output.getItemMeta().getLore().get(line)).equals(ChatColors.color("&7ID: <ID>"))) {
                    ItemMeta im = output.getItemMeta();
                    List<String> lore = im.getLore();
                    lore.set(line, ((String) lore.get(line)).replace("<ID>", (CharSequence) id.get()));
                    im.setLore(lore);
                    output.setItemMeta(im);
                    break;
                }
            }
        } else {
            for (line = 0; line < output.getItemMeta().getLore().size(); ++line) {
                if (((String) output.getItemMeta().getLore().get(line)).equals(ChatColors.color("&7ID: <ID>"))) {
                    int finalSize = size;
                    int finalLine = line;
                    PlayerProfile.get(p, (profile) -> {
                        int backpackId = profile.createBackpack(finalSize).getId();
                        Slimefun.getBackpackListener().setBackpackId(p, output, finalLine, backpackId);
                    });
                    break;
                }
            }
        }

    }

    @Nonnull
    private Optional<String> retrieveID(@Nullable ItemStack backpack, int size) {
        if (backpack != null) {
            Iterator var3 = backpack.getItemMeta().getLore().iterator();

            while (var3.hasNext()) {
                String line = (String) var3.next();
                if (line.startsWith(ChatColors.color("&7ID: ")) && line.contains("#")) {
                    String id = line.replace(ChatColors.color("&7ID: "), "");
                    String[] idSplit = CommonPatterns.HASH.split(id);
                    PlayerProfile.fromUUID(UUID.fromString(idSplit[0]), (profile) -> {
                        Optional<PlayerBackpack> optional = profile.getBackpack(Integer.parseInt(idSplit[1]));
                        optional.ifPresent((playerBackpack) -> {
                            CompletableFuture<Void> future = playerBackpack.closeForAll();
                            future.thenRun(() -> {
                                playerBackpack.setSize(size);
                            });
                        });
                    });
                    return Optional.of(id);
                }
            }
        }

        return Optional.empty();
    }
}
