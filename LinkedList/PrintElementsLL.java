public class PrintElementsLL
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
		PrintElementsLL li = new PrintElementsLL();
		li.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		li.head.next = second;
		second.next = third;
		li.printList();
	}

}