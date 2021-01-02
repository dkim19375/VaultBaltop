package me.dkim19375.vaultbaltop.functions.leaderboard;

import me.dkim19375.vaultbaltop.VaultBaltop;
import me.dkim19375.vaultbaltop.functions.SortMap;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;

import java.util.*;

public class GetLeaderboards {
    public static UUID[] getUUIDLeaderboard() {
        Economy economy = VaultBaltop.getEconomy();
        Map<UUID, Double> allPlayers = new HashMap<>();
        for (OfflinePlayer player : Bukkit.getOfflinePlayers()) {
            allPlayers.put(player.getUniqueId(), economy.getBalance(player));
        }
        LinkedHashMap<UUID, Double> sorted = SortMap.sortMapUUID(allPlayers);
        Set<UUID> uuidSet = sorted.keySet();
        return uuidSet.toArray(new UUID[1]);
    }

    public static OfflinePlayer[] getPlayerLeaderboard() {
        Economy economy = VaultBaltop.getEconomy();
        Map<OfflinePlayer, Double> allPlayers = new HashMap<>();
        for (OfflinePlayer player : Bukkit.getOfflinePlayers()) {
            allPlayers.put(player, economy.getBalance(player));
        }
        LinkedHashMap<OfflinePlayer, Double> sorted = SortMap.sortMapOfflinePlayer(allPlayers);
        Set<OfflinePlayer> uuidSet = sorted.keySet();
        return uuidSet.toArray(new OfflinePlayer[1]);
    }

    public static Double[] getBalanceLeaderboard() {
        Economy economy = VaultBaltop.getEconomy();
        Double[] array = new Double[getUUIDLeaderboard().length];
        short i = 0;
        for (UUID uuid : getUUIDLeaderboard()) {
            array[i] = economy.getBalance(Bukkit.getOfflinePlayer(uuid));
            i =+ 1;
        }
        return array;
    }
}
