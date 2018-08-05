public class InsertionMiddle
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
	public void insertAfter(Node prev, int new_data){
		Node new_node = new Node(new_data);
		new_node.next = prev.next;
		prev.next = new_node;
	}
	// public void printList(){
	// 	if(head == null){
	// 		return;
	// 	}
	// 	Node n =head;
	// 	while(n!=null){
	// 		System.out.print(n.data+" --> ");
	// 		//Move current node to gthe next node
	// 		n = n.next;
	// 	}
	// 	System.out.print(n); //here current will be null
	// }
	public static void main(String arg[]){
		InsertionMiddle li = new InsertionMiddle();
		li.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		li.head.next = second;
		second.next = third;
		li.insertAfter(second, 15);
		// li.printList();

	}

}