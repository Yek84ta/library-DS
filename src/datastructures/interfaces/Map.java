package datastructures.interfaces;

public interface Map<K, V> {
    V put(K key, V value);
    V get(Object key);
    boolean containsKey(Object key);
    int size();
    boolean isEmpty();
}