
package lab7;


public class L7Q5_CyclicLinkedList<T> {

    public L7Q4_LinkedList<T> list = new L7Q4_LinkedList<>();
    
    public boolean hasCycle() {
        if (list.head == null)
            return false;
        L7_Node<T> slow = list.head;
        L7_Node<T> fast = list.head;
        while(true) {
            slow = slow.next;
            if(fast.next != null) {
                fast = fast.next.next;
            } else {
                return false;
            }
            
            if (slow == null || fast == null) {
                return false;
            }
            
            if (slow == fast) {
                System.out.println("Loop detected, removing the loop");
                removeLoop(slow);
                return true;
            }
        }
    }
    
    public void removeLoop(L7_Node node) {
        L7_Node ptr1, ptr2;
        ptr1 = list.head;
        while(true) {
            ptr2 = node;
            while(ptr2.next != node && ptr2.next != ptr1) {
                ptr2 = ptr2.next;
            }
            
            if(ptr2.next == ptr1) {
                break;
            }
            
            ptr1 = ptr1.next;
        }
        
        ptr2.next = null;
    }
    
    public void displayList() {
        list.displayList();
    }
    
    public static void main(String[] args) {
        L7Q5_CyclicLinkedList<Integer> cyclic = new L7Q5_CyclicLinkedList<>();
        cyclic.list.addLast(1);
        cyclic.list.addLast(2);
        cyclic.list.addLast(3);
        cyclic.list.addLast(4);
        cyclic.list.addLast(5);
        cyclic.list.addLast(1);
        cyclic.list.addLast(2);
        cyclic.list.addLast(3);
        cyclic.list.addLast(4);
        cyclic.list.addLast(5);
        cyclic.list.tail.next = cyclic.list.head.next.next.next;
        cyclic.hasCycle();
        System.out.println("List after removing cycle:");
        cyclic.displayList();
    }
    
}
