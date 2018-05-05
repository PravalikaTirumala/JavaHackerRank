

/**
 * "The purpose of this class is..."
 *
 * 
 */
class Node {

    int data;
    Node next;

    public Node() {
        this.data = 0;
        this.next = null;
    }
}

public class LinkedList1{
	static Node head=null;
	public static void main(String args[]){
		
		head=createList(6);
		printNode(head);
		
	}

	private static void printNode(Node head) {
		// TODO Auto-generated method stub
		if(head==null)
			System.out.println("empty");
		else{
			Node temp =head;
			while(temp != null){
				System.out.println(temp.data);
				temp = temp .next;
			}
		}
	}

	private static Node createList(int i) {
		// TODO Auto-generated method stub
		 if(head == null){
		       head.data = i;
		       head.next =null;
		       return head;
		    }
		    else{
		       Node nn =new Node();
		        nn.data =i;
		        nn.next = head;
		        head =nn;
		        // Node temp = head;
		        
		        }
		        return head;
	}
}
