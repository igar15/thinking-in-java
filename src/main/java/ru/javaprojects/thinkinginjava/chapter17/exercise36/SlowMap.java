package ru.javaprojects.thinkinginjava.chapter17.exercise36;

import java.util.*;

public class SlowMap<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private List<MapEntry<K, V>> storage = new ArrayList<>();

    @Override
    public V get(Object key) {
        for (Entry<K, V> mapEntry : storage) {
            if (mapEntry.getKey().equals(key)) {
                return mapEntry.getValue();
            }
        }
        return null;
    }

    @Override
    public V put(K key, V value) {
        for (Entry<K, V> mapEntry : storage) {
            if (mapEntry.getKey().equals(key)) {
                V oldValue = mapEntry.getValue();
                mapEntry.setValue(value);
                return oldValue;
            }
        }
        storage.add(new MapEntry<>(key, value));
        storage.sort(Entry.comparingByKey());
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return new EntrySet();
    }

    class EntrySet extends AbstractSet<Entry<K, V>> {

        @Override
        public Iterator<Entry<K, V>> iterator() {
            Set<Entry<K, V>> set = new HashSet<>(storage);
            return set.iterator();
        }

        @Override
        public int size() {
            return storage.size();
        }


    }

    @Override
    public V remove(Object key) {
        for (int i = 0; i < storage.size(); i++) {
            Entry<K, V> entry = storage.get(i);
            if (entry.getKey().equals(key)) {
                storage.remove(entry);
                return entry.getValue();
            }
        }
        return null;
    }
}
