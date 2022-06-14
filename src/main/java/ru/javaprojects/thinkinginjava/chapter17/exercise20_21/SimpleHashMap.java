package ru.javaprojects.thinkinginjava.chapter17.exercise20_21;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class SimpleHashMap<K, V> extends AbstractMap<K, V> {
    private int size = 16;
    private LinkedList<MapEntry<K, V>>[] buckets = new LinkedList[size];

    @Override
    public V put(K key, V value) {
        int bucketIndex = calculateIndex(key);
        if (buckets[bucketIndex] == null) {
            buckets[bucketIndex] = new LinkedList<>();
        } else {
            System.out.println("Collision: key=" + key);
            System.out.println("Tries amount=" + buckets[bucketIndex].size());
            for (MapEntry<K, V> entry : buckets[bucketIndex]) {
                if (entry.getKey().equals(key)) {
                    V returnValue = entry.getValue();
                    entry.setValue(value);
                    return returnValue;
                }
            }
        }
        buckets[bucketIndex].add(new MapEntry<>(key, value));
        return null;
    }

    private int calculateIndex(Object key) {
        return Math.abs(key.hashCode() % size);
    }

    @Override
    public V get(Object key) {
        int bucketIndex = calculateIndex(key);
        if (buckets[bucketIndex] == null) {
            return null;
        }
        for (MapEntry<K, V> entry : buckets[bucketIndex]) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        return null;
    }


    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> entries = new HashSet<>();
        for (LinkedList<MapEntry<K, V>> bucket : buckets) {
            if (bucket != null) {
                entries.addAll(bucket);
            }
        }
        return entries;
    }
}
