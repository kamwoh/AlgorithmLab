package lab7;

public class L7Q1_Queue<T> {

    private L7_Node<T> head, tail;
    private int size;

    public void enqueue(T item) {
        System.out.println("Enqueue: " + item);
        L7_Node<T> newNode = new L7_Node<>(item);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T dequeue() {
        if (!isEmpty()) {
            T item = head.data;
            head = head.next;
            size--;
            System.out.println("Dequeue: " + item);
            return item;
        }
        return null;
    }

    public T peek() {
        if (!isEmpty()) {
            T item = head.data;
            System.out.println("Peek: " + item);
            return item;
        }
        return null;
    }

    public void displayQueue() {
        System.out.println("In the queue:");
        L7_Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        L7Q1_Queue<Integer> queue = new L7Q1_Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.displayQueue();
        queue.dequeue();
        queue.dequeue();
        queue.displayQueue();
        queue.enqueue(6);
        queue.peek();
        queue.displayQueue();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(2);
        queue.displayQueue();
    }
}
