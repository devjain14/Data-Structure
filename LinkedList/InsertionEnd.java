public class InsertionEnd
{
	Node head;
	static class Node{
		int data;
		Node next;
		Node (int d){
			data = d;
			next = null;
		}
	}
	public void insert(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = null;
		Node last = head;
		while(last.next!=null){
			last = last.next;
		}
		last.next = new_node;
		/*return;*/
	}
	public void printList(){
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
		InsertionEnd li = new InsertionEnd();
		li.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		li.head.next = second;
		second.next = third;
		li.insert(15);
		li.printList();

	}

}