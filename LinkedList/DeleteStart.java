public class DeleteStart
{
	Node head;
	// Inner class is static so that main can access it.
	static class Node{
		int data;
		Node next;
		Node (int d){
			data = d;
			next = null;
		}
	}
	public void delete(int x){
		Node temp = head, prev = null;
		if(temp!=null && temp.data==x){
			head = temp.next;
			return;
		}
		while(temp!=null && temp.data!=x){
			prev = temp;
			temp = temp.next;
		}
		if(temp==null)return;
		prev.next = temp.next;
	}
	public void printList(){e
		if(head == null){
			return;
		}
		Node n =head;
		while(n!=null){
			System.out.print(n.data+" --> ");
			//Move current node to gthe next node
			n = n.next;
		}
		System.out.print(n); //here current will be null
	}
	public static void main(String arg[]){
		DeleteStart li = new DeleteStart();
		li.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		li.head.next = second;
		second.next = third;
		li.delete(2);
		li.printList();
	}

}