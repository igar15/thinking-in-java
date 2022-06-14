package ru.javaprojects.thinkinginjava.chapter17.exercise25;

import java.util.*;

public class SimpleHashMap<K, V> extends AbstractMap<K, V> {
    private int size = 16;
    private MapEntry<K, V>[] buckets = new MapEntry[size];

    @Override
    public void clear() {
        buckets = new MapEntry[size];
    }

    @Override
    public V remove(Object key) {
        int bucketIndex = calculateIndex(key);
        if (buckets[bucketIndex] == null) {
            return null;
        }
        for (int i = 0; i < buckets.length; i++) {
            MapEntry<K, V> previous = null;
            MapEntry<K, V> bucket = buckets[i];
            while (bucket != null) {
                if (bucket.getKey().equals(key)) {
                    if (previous == null) {
                        buckets[i] = bucket.getNext();
                    } else {
                        previous.setNext(bucket.getNext());
                    }
                    return bucket.getValue();
                }
                previous = bucket;
                bucket = bucket.getNext();
            }
        }
        return null;
    }

    @Override
    public V put(K key, V value) {
        int bucketIndex = calculateIndex(key);
        if (buckets[bucketIndex] == null) {
            buckets[bucketIndex] = new MapEntry<>(key, value);
            return null;
        } else {
            MapEntry<K, V> entry = buckets[bucketIndex];
            while (true) {
                if (entry.getKey().equals(key)) {
                    V returnValue = entry.getValue();
                    entry.setValue(value);
                    return returnValue;
                }
                if (entry.getNext() == null) {
                    entry.setNext(new MapEntry<>(key, value));
                    return null;
                }
                entry = entry.getNext();
            }
        }
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
        MapEntry<K, V> entry = buckets[bucketIndex];
        while (entry != null) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
            entry = entry.getNext();
        }
        return null;
    }


    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> entries = new HashSet<>();
        for (MapEntry<K, V> bucket : buckets) {
            while (bucket != null) {
                entries.add(bucket);
                bucket = bucket.getNext();
            }
        }
        return entries;
    }
}
