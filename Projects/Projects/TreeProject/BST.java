public class BST<T extends Comparable<T>> implements iBST<T> {

	private BSTNode<T> root;

	public BST() {
		root = null;
	}
	@Override
	public void inOrder() {
		System.out.print("[ ");
		inOrder(root);
		System.out.print("]");
		System.out.print("\n");
		
	}

	private void inOrder(BSTNode<T> cur) {
		if (cur != null) {
			inOrder(cur.left);									//Recursivley access left side of subtree
			System.out.print(cur.data + " ");					//Print the current node data
			inOrder(cur.right);									//Recursivley access right side of subtree
		}
	}

	@Override
	public boolean insert(T data) {
		// nothing in the tree add new node and connect it to the root

			if (root == null) {
				root = new BSTNode<T>(data);
				return true;
			}
		
		// tree not empty, search for a parent to connect to
			BSTNode<T> cur = root;
			BSTNode<T> parent = null;

			if (root != null) {
				while (cur != null) {
					if (data.compareTo(cur.data) < 0) {
						parent = cur;
						cur = cur.left;
					} else if (data.compareTo(cur.data) > 0) {
						parent = cur;
						cur = cur.right;
					} else {
						return false;
					}
				}
			}
		
		// there is a root node, so parent cannot be null
		// when parent is null return false meaning failure to insert
		if (parent == null) {
			return false;
		}


		// determine if the new value is going as left or right child
		if (data.compareTo(parent.data) < 0) {					//If the new value is less than the parent
			parent.left = new BSTNode<T>(data);					//Create a new node and assign it to the left child of the parent
		} 

		else if (data.compareTo(parent.data) > 0) {			//If the new value is greater than the parent
			parent.right = new BSTNode<T>(data);				//Create a new node and assign it to the right child of the parent
		} 
		
		else if (data.compareTo(parent.data) == 0) {			//If the new value is equal to the parent
			System.out.println("Duplicate Data: " + data);		//Indicate a duplicate value
		} 
		
		else {													//If the new value is invalid
			System.out.println("Invalid Data: " + data);		//Indicate a invalid value
			return false;
		}

		return false; // because found duplicate
	}

	// Search success when cur.data is not <, not >, 
	// As it then must be EQUAL 
	// in this case return parent to the matched cur

	// gurgle thru the tree & find the parent node of this T.  
	// return it
	@Override
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
	@Override
    public BSTNode<T> inOrderSuccessor(BSTNode<T> cur) {
        if (cur == null) {
			return null;
		}
		BSTNode<T> current = cur.right; 											//Start with the right child of the node
		
		while (current != null && current.left != null) {							//Find the leftmost node in the right subtree
			current = current.left;	
		}	
		return current; 															//Return the leftmost node
    }

	@Override
	public boolean remove(T key) {
	    // Check if the tree is empty
	    if (root == null) {
	        return false;
	    }

	    // Initialize variables to find the node to be removed and its parent
	    BSTNode<T> cur = root;
	    BSTNode<T> parent = null;

	    while (cur != null && !cur.data.equals(key)) {								//Search for the node to be removed
	        parent = cur;
	        if (key.compareTo(cur.data) < 0) {										//If the key is less than the current node's data
	            cur = cur.left;														//Navigate to the left child
	        } else {
	            cur = cur.right;													//Navigate to the right child					
	        }
	    }

	    
	    if (cur.left == null && cur.right == null) {								//Case 1: Node to be removed is a leaf node
	        if (cur == root) {														//If the node is the root and has no children
	            root = null; 														//Set the root to null
	        } else if (parent.left == cur) {										//If the node is the left child of its parent
	            parent.left = null;													//Set the left child of the parent to null
	        } else {
	            parent.right = null;
	        }
	    }
	    
	    else if (cur.left == null) {
	        if (cur == root) {														//Case 2: Node to be removed has one child on the right
	            root = cur.right; 													//If the node is the root, update the root
	        } else if (parent.left == cur) {
	            parent.left = cur.right;
	        } else {
	            parent.right = cur.right;
	        }
	    }
	    
	    else if (cur.right == null) {												//Case 3: Node to be removed has one child on the left
	        if (cur == root) {
	            root = cur.left; 													//If the node is the root, update the root
	        } else if (parent.left == cur) {
	            parent.left = cur.left;
	        } else {
	            parent.right = cur.left;
	        }
	    }
	    
	    else {																		//Case 4: Node to be removed has two children
	        BSTNode<T> successor = inOrderSuccessor(cur);
	        T temp = successor.data;
	        remove(successor.data); 												//Recursively remove the successor
	        cur.data = temp; 														//Replace the data of the current node with the successor's data
	    }

	    return true;
	}

	@Override
	public boolean searchForKey(T key) {
		BSTNode<T> cur = root;

		if(root == null) {
			return false;
		}
		while (cur != null) {														//Search for the key
			if (key.compareTo(cur.data) < 0) {										//If the key is less than the current node's data	
				cur = cur.left;
			} else if (key.compareTo(cur.data) > 0) {								//If the key is greater than the current node's data
				cur = cur.right;
			} else {
				System.out.println("Found: " + key);								//If the key is equal to the current node's data, it is found
				return true;
			}
		}
		
		System.out.println("Not Found: " + key);
		return false;
	}	
}








