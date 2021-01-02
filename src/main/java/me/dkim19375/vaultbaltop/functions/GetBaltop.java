package me.dkim19375.vaultbaltop.functions;

import me.dkim19375.vaultbaltop.VaultBaltop;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;

import java.util.LinkedHashMap;

public class GetBaltop {
    public static LinkedHashMap<OfflinePlayer, Double> getBaltop() {
        Economy economy = VaultBaltop.getEconomy();
        LinkedHashMap<OfflinePlayer, Double> beforeMap = new LinkedHashMap<>();

        for (OfflinePlayer player : Bukkit.getOfflinePlayers()) {
            beforeMap.put(player, economy.getBalance(player));
        }

        return SortMap.sortMapOfflinePlayer(beforeMap);
    }
}
