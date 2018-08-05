import java.util.*;
class BT{
	static class Node{
		int key;
		Node left, right;
		Node(int k){
			key = k;
			left = right = null;
		}

	}
	static void traverseIn(Node temp){
		if(temp==null)
			return;
		traverseIn(temp.left);
		System.out.print(temp.key+" ");
		traverseIn(temp.right);
	}
	static void insert(Node temp, int key){
		Queue<Node> q = new LinkedList<Node>();
		q.add(temp);
		while(!q.isEmpty()){
			temp=q.peek();
			q.remove();
			if(temp.left==null){
				temp.left = new Node(key);
				break;
			}	
			else
				q.add(temp.left);
			if (temp.right == null) {
                temp.right = new Node(key);
                break;
            } else
                q.add(temp.right);
		}
	}
	public static void main(String args[]){
		Node root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);
        traverseIn(root);
        System.out.println();
        insert(root,12);
		traverseIn(root);
	}
}