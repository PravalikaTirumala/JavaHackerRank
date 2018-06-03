/**
 * HAcer rank Code interview Challenge
 * @author Pravalika Tirumala
 * refer code interview questions - Linked-list-cycle.pdf
 *
 */

class Node {
        int data;
        Node next;
}

public class LinkedListCycle{
boolean hasCycle(Node head) {
if(head == null)
    return false;

else{
   Node t1 = head;
   Node t2 = head.next;
    
    while(t1 != t2){
    if(t2.next == null)
        return false;
        t1 = t1.next;
        t2 = t2.next.next;
    }
   return true;
}
}
}