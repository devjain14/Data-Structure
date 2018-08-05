import java.util.*;
class BTDel{
	static class Node{
		int key;
		Node right,left;
		Node(int k){
			key=k;
			left=right=null;
		}
	}
	static void traverseIn(Node temp,Node d){
		if((temp==null) || (temp ==d))
			return;
		traverseIn(temp.left,d);
		System.out.print(temp.key+" ");
		traverseIn(temp.right,d);
	}
	//delete the current node and replece it with the rightmost(deepest) node
	static void delete(Node root, int k){
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		Node temp = null;
		Node delnode = null;
		while(!q.isEmpty()){
			temp = q.peek();
			q.remove();
			if(temp.key == k)
				delnode =temp;
			if(temp.left!=null)
				q.add(temp.left);
			if(temp.right!=null)
				q.add(temp.right);					
		}
		delnode.key = temp.key;
		traverseIn(root, temp);
	}
	public static void main(String args[]){
		Node root = new Node(13);
		root.left =  new Node(12);
		root.left.left =  new Node(4);
		root.left.right =  new Node(19);
		root.right =  new Node(10);
		root.right.left =  new Node(16);
		root.right.right =  new Node(9);
		traverseIn(root, null);
		System.out.println();
		delete(root, 12);
	   }
}