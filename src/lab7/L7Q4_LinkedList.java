package lab7;

public class L7Q4_LinkedList<T> {
    
    public L7_Node<T> head, tail;
    private int size = 0;
    
    public void addFirst(T item) {
        L7_Node<T> newNode = new L7_Node<>(item);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
        System.out.println("Add First: " + item);
    }
    
    public void addLast(T item) {
        L7_Node<T> newNode = new L7_Node<>(item);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        System.out.println("Add Last: " + item);
    }
    
    public T removeFirst() {
        if (!isEmpty()) {
            T item = head.data;
            head = head.next;
            size--;
            System.out.println("Remove First: " + item);
            return item;
        } else {
            System.out.println("Nothing in the list");
            return null;
        }
    }
    
    public T removeLast() {
        if (!isEmpty()) {
            L7_Node current = head;
            while (current.next != null && current.next != tail) {
                current = current.next;
            }
            T item = tail.data;
            if (current.next == null) {
                head = tail = null;
            } else {
                tail = current;
                tail.next = null;
            }
            size--;
            System.out.println("Remove Last: " + item);
            return item;
        } else {
            System.out.println("Nothing in the list");
            return null;
        }
    }
    
    public void removeItem(T item) {
        if (!isEmpty()) {
            L7_Node current = head;
            L7_Node prev = null;
            while (current != null) {
                if (current.data.equals(item)) {
                    System.out.println("Found item: " + item);
                    if (prev == null) { //head
                        head = head.next;
                    } else {
                        prev.next = current.next;
                    }
                    size--;
                    return;
                }
                prev = current;
                current = current.next;
            }
            System.out.println("Item not found");
        }
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public void displayList() {
        System.out.println("In the list:");
        L7_Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        L7Q4_LinkedList<Integer> list = new L7Q4_LinkedList<>();
        list.addFirst(0);
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.displayList();
        list.removeFirst();
        list.displayList();
        list.removeLast();
        list.displayList();
        list.removeItem(3);
        list.displayList();
    }
    
}
