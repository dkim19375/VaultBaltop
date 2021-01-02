package me.dkim19375.vaultbaltop.functions;

import me.dkim19375.vaultbaltop.Entry;
import me.dkim19375.vaultbaltop.VaultBaltop;
import me.dkim19375.vaultbaltop.api.impl.IBaltop;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;

import java.util.UUID;

public class GetPlayer {
    public static Entry<OfflinePlayer, Double> getPlayer(int spot, IBaltop plugin) {
        if (spot < 1) {
            return null;
        }
        if (Bukkit.getOfflinePlayers().length < spot) {
            return null;
        }
        Economy economy = VaultBaltop.getEconomy();
        UUID[] uuids = plugin.getUUIDLeaderboard();
        Entry<OfflinePlayer, Double> values = new Entry<>(null, null);
        values.setValues(Bukkit.getOfflinePlayer(uuids[spot - 1]), economy.getBalance(Bukkit.getOfflinePlayer(uuids[spot - 1])));
        return values;
    }
}
