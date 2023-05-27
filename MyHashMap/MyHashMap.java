package MyHashMap;

public class MyHashMap<K, V> {
    private Node<K, V>[] table;
    private int size;
    private Node<K, V> last;

    public MyHashMap() {
        table = new Node[16];
        size = 0;
    }

    public void put(K key, V value) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }

        int index = hash(key) % table.length;

        Node<K, V> newNode = new Node<>(key, value);
        Node<K, V> current = table[index];

        if (current == null) {
            table[index] = newNode;
            size++;
            last = newNode;
        } else {
            while (current != null) {
                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                if (current.next == null) {
                    current.next = newNode;
                    size++;
                    last = newNode;
                    return;
                }
                current = current.next;
            }
        }
    }

    public V remove(K key) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }

        int index = hash(key) % table.length;

        Node<K, V> current = table[index];
        Node<K, V> prev = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    table[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                return current.value;
            }
            prev = current;
            current = current.next;
        }

        return null;
    }

    public void clear() {
        for (int g = 0; g < table.length; g++) {
            table[g] = null;
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    public V get(K key) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }

        int index = hash(key) % table.length;

        Node<K, V> current = table[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }

        return null;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("{");

        for (int i = 0; i < table.length; i++) {
            Node<K, V> current = table[i];
            while (current != null) {
                res.append(current.key).append("=").append(current.value);
                if (current.next != null) {
                    res.append(", ");
                }
                current = current.next;
            }
        }

        res.append("}");
        return res.toString();
    }

    private int hash(K key) {
        return key.hashCode();
    }
    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
}
