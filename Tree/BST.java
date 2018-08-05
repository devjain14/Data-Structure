class BST{
	class Node{
		int key;
		Node left, right;
		Node(int k){
			key = k;
			left = right = null;
		}
	}
	 Node root = null;
	void insert(int key){
		root = insertkey(root, key);
	}
	Node insertkey(Node root, int key){
		if(root == null){
			root = new Node(key);
			return root;
		}
		if(key>root.key){
			root.right = insertkey(root.right, key);
		}
		else if(key<root.key)
			root.left = insertkey(root.left, key);
		return root;


	}
	//We used this becuz we dont know the root of the tree
	void traverseIn()  {
       inorderRec(root);
    }
 
    // A utility function to do inorder traversal of BST
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key+" ");
            inorderRec(root.right);
        }
    }
	public static void main(String args[]){
		BST tree = new BST();
		tree.insert(10);
		tree.insert(12);
		tree.insert(14);
		tree.insert(9);
		tree.insert(5);
		tree.insert(20);
		tree.traverseIn();
	}
}