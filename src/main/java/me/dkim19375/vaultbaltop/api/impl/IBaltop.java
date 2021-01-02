package me.dkim19375.vaultbaltop.api.impl;

import me.dkim19375.vaultbaltop.Entry;
import me.dkim19375.vaultbaltop.api.BaltopAPIProvider;
import me.dkim19375.vaultbaltop.api.interf.VaultBaltopAPI;
import me.dkim19375.vaultbaltop.functions.GetBaltop;
import me.dkim19375.vaultbaltop.functions.GetPlayer;
import me.dkim19375.vaultbaltop.functions.leaderboard.GetLeaderboards;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.OfflinePlayer;

import java.util.LinkedHashMap;
import java.util.UUID;

public class IBaltop implements VaultBaltopAPI {

    @Override
    public Entry<OfflinePlayer, Double> getPlayer(int spot) {
        return GetPlayer.getPlayer(spot, this);
    }

    @Override
    public LinkedHashMap<OfflinePlayer, Double> getBaltop() {
        return GetBaltop.getBaltop();
    }

    @Override
    public UUID[] getUUIDLeaderboard() {
        return GetLeaderboards.getUUIDLeaderboard();
    }

    @Override
    public OfflinePlayer[] getPlayerLeaderboard() {
        return GetLeaderboards.getPlayerLeaderboard();
    }

    @Override
    public Double[] getBalanceLeaderboard() {
        return GetLeaderboards.getBalanceLeaderboard();
    }

    @Override
    public Economy getEconomy() {
        return BaltopAPIProvider.getEconomy();
    }
}
