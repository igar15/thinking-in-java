package ru.javaprojects.thinkinginjava.chapter17.exercise15;

import java.util.*;

public class SlowMap<K, V> extends AbstractMap<K, V> {
    private List<K> keys = new ArrayList<>();
    private List<V> values = new ArrayList<>();

    @Override
    public V get(Object key) {
        if (keys.contains(key)) {
            return values.get(keys.indexOf(key));
        }
        return null;
    }

    @Override
    public V put(K key, V value) {
        V result = get(key);
        if (result != null) {
            values.set(keys.indexOf(key), value);
        } else {
            keys.add(key);
            values.add(value);
        }
        return result;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return new EntrySet();
    }

    class EntrySet extends AbstractSet<Entry<K, V>> {

        @Override
        public Iterator<Entry<K, V>> iterator() {
            Set<Entry<K, V>> entries = new HashSet<>();
            for (int i = 0; i < keys.size(); i++) {
                entries.add(new MapEntry<>(keys.get(i), values.get(i)));
            }
            return entries.iterator();
        }

        @Override
        public int size() {
            return keys.size();
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            boolean result = false;
            for (Object o : c) {
                boolean remove = remove(o);
                if (remove) {
                    result = true;
                }
            }
            return result;
        }

        @Override
        public boolean remove(Object o) {
            MapEntry<K, V> mapEntry = (MapEntry<K, V>) o;
            int keyIndex = keys.indexOf(mapEntry.getKey());
            if (keyIndex >= 0) {
                keys.remove(keyIndex);
                values.remove(keyIndex);
                return true;
            }
            return false;
        }
    }

    @Override
    public V remove(Object key) {
        int keyIndex = keys.indexOf(key);
        if (keyIndex >= 0) {
            keys.remove(keyIndex);
            return values.remove(keyIndex);
        }
        return null;
    }
}
