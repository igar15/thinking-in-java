package ru.javaprojects.thinkinginjava.chapter17.exercise39;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Set;

public class SimpleHashMap<K, V> extends AbstractMap<K, V> {
    private int capacity = 16;
    private int size;
    private MapEntry<K, V>[] buckets = new MapEntry[capacity];

    @Override
    public void clear() {
        buckets = new MapEntry[capacity];
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
                    size--;
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
            if ((double) size / capacity > 0.75) {
                rehash();
            }
            buckets[bucketIndex] = new MapEntry<>(key, value);
            size++;
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
                    if ((double) size / capacity > 0.75) {
                        rehash();
                    }
                    size++;
                    return null;
                }
                entry = entry.getNext();
            }
        }
    }

    private int calculateIndex(Object key) {
        return Math.abs(key.hashCode() % capacity);
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

    private void rehash() {
        capacity = capacity * 2;
        Set<Entry<K, V>> entries = entrySet();
        buckets = new MapEntry[capacity];
        for (Entry<K, V> entry :entries) {
            put(entry.getKey(), entry.getValue());
        }
    }
}
