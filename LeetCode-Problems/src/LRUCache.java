import java.util.*;

public class LRUCache {
    int cap;
    HashMap<Integer, Node> map;
    DoublyLinkedList list;
    
    public LRUCache(int capacity) {
        cap = capacity;
        map = new HashMap<Integer, Node>();
        list = new DoublyLinkedList(capacity);
    }
    
    public int get(int key) {
        
    }
    
    public void set(int key, int value) {
        if(map.size() == cap)
        {
            map.remove(list.getTail());
            list.removeTail();
        }
    
        Node n = new Node(value);
        map.put(key, n);
        list.addNode(n);
    }
}

