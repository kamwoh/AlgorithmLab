
package lab7;


public class L7Q3_QueueTwoStacks<T> {

    private L7Q2_Stack<T> inbox = new L7Q2_Stack<>();
    private L7Q2_Stack<T> outbox = new L7Q2_Stack<>();
    
    public void enqueue(T item) {
        System.out.println("Enqueue: "+item);
        inbox.push(item);
    }
    
    public T dequeue() {
        if(!inbox.isEmpty()) {
            System.out.println("Popping from inbox to outbox");
            while(!inbox.isEmpty()) {
                outbox.push(inbox.pop());
            }
        }
        T item = outbox.pop();
        if (item == null) {
            System.out.println("Nothing in the queue");
            return null;
        } else {
            System.out.println("Dequeue: "+item);
            return item;
        }
    }
    
    public T peek() {
        if(!inbox.isEmpty()) {
            System.out.println("Popping from inbox to outbox");
            while(!inbox.isEmpty()) {
                outbox.push(inbox.pop());
            }
        }
        T item = outbox.peek();
        if (item == null) {
            System.out.println("Nothing in the queue");
            return null;
        } else {
            System.out.println("Dequeue: "+item);
            return item;
        }
    }
    
    public void displayQueue() {
        if(!inbox.isEmpty()) {
            System.out.println("Popping from inbox to outbox");
            while(!inbox.isEmpty()) {
                outbox.push(inbox.pop());
            }
        }
        outbox.displayStack();
    }
    
    public static void main(String[] args) {
        L7Q3_QueueTwoStacks<Integer> queue = new L7Q3_QueueTwoStacks<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.displayQueue();
        queue.dequeue();
        queue.dequeue();
        queue.displayQueue();
    }
    
}
