package me.dkim19375.vaultbaltop.functions;

import org.bukkit.OfflinePlayer;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

public class SortMap {
    public static LinkedHashMap<UUID, Double> sortMapUUID(Map<UUID, Double> sort) {
        System.out.println("Unsorted Map : " + sort);

//LinkedHashMap preserve the ordering of elements in which they are inserted
        LinkedHashMap<UUID, Double> reverseSortedMap = new LinkedHashMap<>();

//Use Comparator.reverseOrder() for reverse ordering
        sort.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
        return reverseSortedMap;
    }

    public static LinkedHashMap<String, Double> sortMapString(Map<String, Double> sort) {
        System.out.println("Unsorted Map : " + sort);

//LinkedHashMap preserve the ordering of elements in which they are inserted
        LinkedHashMap<String, Double> reverseSortedMap = new LinkedHashMap<>();

//Use Comparator.reverseOrder() for reverse ordering
        sort.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
        return reverseSortedMap;
    }

    public static LinkedHashMap<OfflinePlayer, Double> sortMapOfflinePlayer(Map<OfflinePlayer, Double> sort) {
        System.out.println("Unsorted Map : " + sort);

//LinkedHashMap preserve the ordering of elements in which they are inserted
        LinkedHashMap<OfflinePlayer, Double> reverseSortedMap = new LinkedHashMap<>();

//Use Comparator.reverseOrder() for reverse ordering
        sort.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
        return reverseSortedMap;
    }
}
