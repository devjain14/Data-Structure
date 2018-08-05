public class Dll{
	Node head;
	static class Node{
		int data;
		Node prev;
		Node next;
		//prev and next are by default null
		Node(int d){
			data = d;
		}
	}
	//Add to the front
	public void push(int new_data){
		Node n = new Node(new_data);
		 n.next = head;
		 n.prev = null;
		 // //change prev to new node
		 if(head!=null)
		 	head.prev = n; //doubt
		 head = n;

	}
	public void insert(Node prev_node,int new_data){
		Node n  = new Node(new_data);
		n.next = prev_node.next;
		prev_node.next = n;
		//change pre
		if(n.next!=null)
			n.next.prev = n;
	}
	//print the ll from given node
	public void printList(Node node){
		Node last = null;
		System.out.println("forward dir");
		while(node!=null){
			System.out.print(node.data+" --> ");
			last = node;
			node  = node.next;
		}
		System.out.println();
		System.out.println("backward dir");
		while(last!=null){
			System.out.print(last.data+" --> ");
			last = last.prev;
		}
	}
	public static void main(String arg[]){
		Dll doubly = new Dll();
		doubly.push(20);
		doubly.push(30);
		doubly.insert(doubly.head,14);
		doubly.push(15);
		doubly.printList(doubly.head);
	}
}