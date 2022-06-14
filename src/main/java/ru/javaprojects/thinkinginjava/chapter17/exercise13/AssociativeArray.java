package ru.javaprojects.thinkinginjava.chapter17.exercise13;

public class AssociativeArray<K, V> {
    private Object[][] storage = new Object[10][];
    private int storageIndex;

    public void put(K key, V value) {
        V v = get(key);
        if (v == null) {
            storage[storageIndex++] = new Object[]{key, value};
        } else {
            int index = getIndex(key);
            storage[index][1] = value;
        }
    }

    @SuppressWarnings("unchecked")
    public V get(K key) {
        for (int i = 0; i < storageIndex; i++) {
            if (storage[i][0].equals(key)) {
                return (V) storage[i][1];
            }
        }
        return null;
    }

    private int getIndex(K key) {
        for (int i = 0; i < storageIndex; i++) {
            if (storage[i][0].equals(key)) {
                return i;
            }
        }
        throw new RuntimeException();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        for (int i = 0; i < storageIndex; i++) {
            stringBuilder.append(storage[i][0]);
            stringBuilder.append("=");
            stringBuilder.append(storage[i][1]);
            if (i < storageIndex - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
