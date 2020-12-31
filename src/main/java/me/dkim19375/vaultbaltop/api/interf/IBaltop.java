package me.dkim19375.vaultbaltop.api.interf;

import me.dkim19375.vaultbaltop.VaultBaltop;
import me.dkim19375.vaultbaltop.api.impl.VaultBaltopAPI;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;

import java.util.*;

public class IBaltop implements VaultBaltopAPI {

    @Override
    public Map<UUID, Double> getPlayer(int spot) {
        if (spot < 1) {
            return null;
        }
        if (Bukkit.getOfflinePlayers().length < spot) {
            return null;
        }
        Economy economy = VaultBaltop.getEconomy();
        LinkedHashMap<OfflinePlayer, Double> beforeMap = new LinkedHashMap<>();

        for (OfflinePlayer player : Bukkit.getOfflinePlayers()) {
            beforeMap.put(player, economy.getBalance(player));
        }

        LinkedHashMap<OfflinePlayer, Double> sortedMap = new LinkedHashMap<>();

        beforeMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
        Set<OfflinePlayer> ofSet = sortedMap.keySet();
        OfflinePlayer[] array = ofSet.toArray(new OfflinePlayer[1]);
        OfflinePlayer key = array[spot - 1];
        Map<UUID, Double> returnMap = new HashMap<>();
        returnMap.put(key.getUniqueId(), sortedMap.get(key));
        return returnMap;
    }

    @Override
    public LinkedHashMap<UUID, Double> getBaltop() {
        Economy economy = VaultBaltop.getEconomy();
        LinkedHashMap<UUID, Double> beforeMap = new LinkedHashMap<>();

        for (OfflinePlayer player : Bukkit.getOfflinePlayers()) {
            beforeMap.put(player.getUniqueId(), economy.getBalance(player));
        }

        LinkedHashMap<UUID, Double> sortedMap = new LinkedHashMap<>();

        beforeMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
        return sortedMap;
    }

    @Override
    public UUID[] getUUIDLeaderboard() {
        Economy economy = VaultBaltop.getEconomy();
        LinkedHashMap<UUID, Double> map = getBaltop();
        Set<Map.Entry<UUID, Double>> set = map.entrySet();
        UUID[] returnArray = new UUID[set.size()];
        short i = 1;
        for (Map.Entry<UUID, Double> m : set) {
            returnArray[i] = m.getKey();
            i =+ 1;
        }
        return returnArray;
    }

    @Override
    public Double[] getBalanceLeaderboard() {
        Economy economy = VaultBaltop.getEconomy();
        LinkedHashMap<UUID, Double> map = getBaltop();
        Set<Map.Entry<UUID, Double>> set = map.entrySet();
        Double[] returnArray = new Double[set.size()];
        short i = 1;
        for (Map.Entry<UUID, Double> m : set) {
            returnArray[i] = m.getValue();
            i =+ 1;
        }
        return returnArray;
    }
}
