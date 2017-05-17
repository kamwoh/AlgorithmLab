package lab7;

import java.util.LinkedList;

public class L7Q2_Stack<T> {

    private L7_Node<T> head, tail;
    private int size;

    public void push(T item) {
        System.out.println("Push: " + item);
        L7_Node newNode = new L7_Node(item);
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

    public T peek() {
        if (!isEmpty()) {
            T item = tail.data;
            System.out.println("Peek: " + item);
            return item;
        }
        return null;
    }

    public T pop() {
        if (!isEmpty()) {
            L7_Node current = head;
            while(current.next != tail && current.next != null) {
                current = current.next;
            }
            T item = tail.data;
            if(current.next == null) { //if only one node
                head = tail = null;
            } else {
                tail = current;
                tail.next = null;
            }
            size--;
            System.out.println("Pop: " + item);
            return item;
        }
        return null;
    }

    public void displayStack() {
        System.out.println("In the stack:");
        L7_Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        L7Q2_Stack<Integer> stack = new L7Q2_Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.displayStack();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.displayStack();
    }

}
