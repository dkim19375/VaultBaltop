package me.dkim19375.vaultbaltop.api.impl;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

public interface VaultBaltopAPI {
    
    /**
     * @param spot the leaderboard spot. For example, 1 would get the player with the highest amount of money
     * @return the UUID of the player and their balance
     */
    Map<UUID, Double> getPlayer(int spot);

    /**
     * @return the balance leaderboard
     */
    LinkedHashMap<UUID, Double> getBaltop();

    /**
     * @return a UUID array of the leaderboard
     */
    UUID[] getUUIDLeaderboard();

    /**
     * @return a double (balance) array of the leaderboard
     */
    Double[] getBalanceLeaderboard();
}