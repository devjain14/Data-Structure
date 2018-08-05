public class LinkedList
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
	// To define 3 nodes
	public static void main(String arg[]){
		LinkedList li = new LinkedList();
		li.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		li.head.next = second;
		second.next = third;
		// System.out.println("1:"+li.head);
		// System.out.println("2:"+second);
		System.out.println("hello"+third);
	}

}