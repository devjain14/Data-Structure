class BSTdel{
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
	void delete(int key){
		root = deletekey(root, key);
	}
	Node deletekey(Node root, int key){
		if(root==null)
			return root;
		if(key>root.key)
			root.right = deletekey(root.right, key);
		else if(key<root.key)
			root.left = deletekey(root.left, key);
		else{
			//node with one or no child
			if(root.left==null)
				return root.right;
			else if(root.right==null)
				return root.left;
			//node with two children, get the inorder successor
			root.key = minvalue(root.right);
			root.right = deletekey(root.right, root.key);

		}
		return root;
	}
	int minvalue(Node root){
		int minv = root.key;
		while(root.left!=null){
			minv = root.left.key;
			root = root.left;
		}
		return minv;
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
		BSTdel tree = new BSTdel();
		tree.insert(10);
		tree.insert(12);
		tree.insert(14);
		tree.insert(9);
		tree.insert(5);
		tree.insert(20);
		tree.traverseIn();
		System.out.println();
		tree.delete(14);
		tree.traverseIn();
	}
}