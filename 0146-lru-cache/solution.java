class LRUCache {

    private class Node {
        int key;
        int val;
        Node prev;
        Node next;
        Node (int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    private HashMap<Integer, Node> map;
    private int capacity;
    private Node head;
    private Node tail;

    public void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev; 
    }
    public void addToFront(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)) {
            remove(map.get(key));
            addToFront(map.get(key));
            return map.get(key).val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)) {
            Node element = new Node(key, value);
            remove(map.get(key));
            addToFront(element);
            map.remove(key);
            map.put(key, element);
        }
        else {
            if(map.size() >= capacity) {
                map.remove(tail.prev.key);
                remove(tail.prev);
            }
            Node element = new Node(key, value);
            addToFront(element);
            map.put(key, element);
        }

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
