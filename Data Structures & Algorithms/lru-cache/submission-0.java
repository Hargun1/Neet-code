class LRUCache {
    class Node{
        int val,key;
        Node prev , next;

        Node(int key , int val){
            this.val = val;
            this.key = key;
        }
    }
    HashMap<Integer, Node> map;
    Node head , tail;
    int capacity;
    public LRUCache(int capacity) {
        map = new HashMap<>();
        this.capacity = capacity;

        head = new Node(0, 0); 
        tail = new Node(0, 0); 

        head.next = tail;
        tail.prev = head; 
    }
    private void remove(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insert(Node node){
        node.prev = tail.prev;
        node.next = tail;

        tail.prev.next = node;
        tail.prev  = node;
    }
    
    public int get(int key) {
        if (!map.containsKey(key)){
            return -1;
        }
        Node node =map.get(key);

        remove(node);
        insert(node);
        return node.val;
    }
    
    public void put(int key, int value) {

        if(map.get(key)!=null){
            remove(map.get(key));
        }

        Node node = new Node(key, value);
        insert(node);
        map.put(key, node);

        if(map.size() > capacity){
            Node lru = head.next;  
            remove(lru);
            map.remove(lru.key);
        }
    }
}
