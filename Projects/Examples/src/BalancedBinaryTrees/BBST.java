package BalancedBinaryTrees;

//convert a left unbalanced BST to a balanced BST

import java.util.*;


class BBST {
	
	Node root;

	// (2)
	 /* traverse the skewed binary tree and store its nodes pointers in an array of nodes */
	 //Traverse the BST in-order and move each element into a Array 
	void storeBSTNodes(Node root, ArrayList<Node> nodes) {
		// Base case 
		if (root == null)
			return;

		// Store nodes in inorder (which is sorted order for BST)
		storeBSTNodes(root.left, nodes);
		nodes.add(root);
		storeBSTNodes(root.right, nodes);
	}

	// (3)
	/* recursively construct balanced binary tree */
	Node buildTreeUtil(ArrayList<Node> nodes, int start, int end) {
		// base case
		if (start > end)
			return null;

		/* Get the middle element and make it root */
		int mid = (start + end) / 2;
		Node node = nodes.get(mid);

		
		/* Using index in inorder traversal, left | root | right
		 * construct left and right subtrees */
		 
		//(4)
		node.left = buildTreeUtil(nodes, start, mid - 1);
		node.right = buildTreeUtil(nodes, mid + 1, end);
			
		return node;
	}

	//(1)
	//convert an unbalanced BST to a balanced BST
	Node buildBalancedTree(Node root) {

		ArrayList<Node> nodes = new ArrayList<Node>();


		// Store nodes of given BST in sorted order
		storeBSTNodes(root, nodes);

		// As we know Java passes object references by value, 
		// meaning the method receives a reference to the same 
		// ArrayList object so after storeBSTNodes(root, nodes) returns, 
		// 'nodes' is populated with in sorted order.
		
		// Constuct BST from nodes[]
		int n = nodes.size();
		Node newRoot = buildTreeUtil(nodes, 0, n - 1);
		return newRoot;
	}

	/* display via preOrder: Visit the root, visit the left subtree, visit the right subtree  */	
	void preOrder(Node node) {
		if (node == null)
			return;
		System.out.print(node.data + " ");
		preOrder(node.left);
		preOrder(node.right);
	}

	
	// Driver program to test the above functions
	public static void main(String[] args) {
		
		/*
		 * 			Construct skewed binary tree 
		 * 
		 * 											10
		 * 										    /
		 * 										   8
		 * 										  /
		 * 										 7
		 * 										/
		 * 									   6
		 * 									  /
		 * 									 5
		 */


		//note left unbalanced:
		
		BBST tree = new BBST();
		tree.root = new Node(10);
		tree.root.left = new Node(8);
		tree.root.left.left = new Node(7);
		tree.root.left.left.left = new Node(6);
		tree.root.left.left.left.left = new Node(5);
 

		System.out.println("\nPreorder traversal of UNbalanced BST is :");
		tree.preOrder(tree.root);
		
		tree.root = tree.buildBalancedTree(tree.root);
		System.out.println("\nPreorder traversal of balanced BST is :");
		tree.preOrder(tree.root);
		System.out.println("\n");
		
		
		//					 7
		//					 |
		//				   5   8
		//			        \	\ 
		//			         6    10
	}
}
