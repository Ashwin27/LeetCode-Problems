public class DoublyLinkedList{
    Node head;
    Node tail;
    int capacity;
    int size;
    
    public DoublyLinkedList(int cap){
        head = null;
        tail = null;
        capacity = cap;
    }
    
    public void moveToHead(Node n){
        n.prev = n.next;
        n.next = n.prev;
        
        head = n;
        head.prev = n;
        n = head;
    }
    
    public void addNode(Node n){
        if(capacity > size){
            if(head == null){
                head = n;
                tail = n;
                return;
            }
            
            n.next = head;
            head.prev = n;
            n = head;
        }
    }
    
    public void removeTail(){
        
        if(tail.prev != null){
            tail.prev.next = null;
            tail = tail.prev;
        }else{
            head = null;
            tail = null;
        }
    }
    
    public Node getTail(){
        return tail;
    }
    
    public Node getHead(){
        return head;
    }
    
}
