
 

public class BST<T extends Comparable<T>> implements iBST<T> {

	private BSTNode<T> root;

	public BST() {
		root = null;
	}

	public void inOrder() {
		System.out.print("[ ");
		inOrder(root);
		System.out.println("]");
		System.out.println();
	}
	
	private void inOrder(BSTNode<T> cur) {
		if (cur != null) {
			//TODO:
			//Recursively traverse the current node's left subtree.
			//print the current node data
			//Recursively traverse the current node's right subtree.
			inOrder(cur.left);
			System.out.print(cur.data + " ");
			inOrder(cur.right);
			System.out.println(cur.data + " ");
		}
	}

	public boolean insert(T data) {
		// nothing in the tree add new node and connect it to the root
			if (root == null) {
				root = new BSTNode<T>(data);
				return true;
			}
		
		// tree not empty, search for a parent to connect to
			if (root != null) {
				
			}
		//TODO
		
		// there is a root node, so parent cannot be null
		// when parent is null return false meaning failure to insert

		//TODO

		// determine if the new value is going as left or right child
		
		//TODO

		return false; // because found duplicate
	}

	// Search success when cur.data is not <, not >, 
	// As it then must be EQUAL 
	// in this case return parent to the matched cur

	// gurgle thru the tree & find the parent node of this T.  
	// return it
	
	public BSTNode<T> search(T data) {
		BSTNode<T> cur = root;
		BSTNode<T> parent = null;

		while (cur != null) { 
			if (data.compareTo(cur.data) < 0) {
				parent = cur;
				cur = cur.left;
			} else if (data.compareTo(cur.data) > 0) {
				parent = cur;
				cur = cur.right;
			} else  
				return parent; 
		}

		return parent;
	} 
	
	
	 // Helper function to find minimum value node in the subtree rooted at `cur`
    public BSTNode<T> inOrderSuccessor(BSTNode<T> cur)
    {
        //TODO - update
    	return null;
    }
	
	public boolean remove(T key) {
		
		return false;
	}

	
	
	
	
	
	
	
}  








