public class InsertionFront
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
	public void push(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	// public void printList(){
	// 	if(head == null){
	// 		return;
	// 	}
	// 	Node current =head;
	// 	while(current!=null){
	// 		System.out.print(current.data+" --> ");
	// 		//Move current node to gthe next node
	// 		current = current.next;
	// 	}
	// 	System.out.print(current); //here current will be null
	// }
	public static void main(String arg[]){
		InsertionFront li = new InsertionFront();
		li.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		li.head.next = second;
		second.next = third;
		li.push(15);
		// li.printList();

	}

}