package Arithmetic;
import java.util.ArrayList;

public class MyMap<K, V> {
    private final ArrayList<K> keys;
    private final ArrayList<V> values;

    public MyMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    public void put(K key, V value) {
        int index = keys.indexOf(key);
        if (index != -1) {
            values.set(index, value);
        } else {
            keys.add(key);
            values.add(value);
        }
    }

    public V get(K key) {
        int index = keys.indexOf(key);
        if (index != -1) {
            return values.get(index);
        } else {
            return null;
        }
    }

    public V remove(K key) {
        int index = keys.indexOf(key);
        if (index != -1) {
            V value = values.get(index);
            keys.remove(index);
            values.remove(index);
            return value;
        }
        return null;
    }
}
