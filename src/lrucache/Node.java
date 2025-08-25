package lrucache;

public class Node<K, V> {
    private K key;
    private V value;
    private Node<K, V> prev, next;

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
