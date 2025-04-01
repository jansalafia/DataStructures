package Traverser;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class DepthFirstTraversal {

	// Perform iterative DFS on node starting from root
	// continue examining children 
	public static void iterativeDFS(TreeNode node) {

		// create a stack used to do iterative DFS
		Stack<TreeNode> stack = new Stack<>();

		// push the root into the stack
		stack.push(node);

		// loop till stack is empty
		while (!stack.empty()) {
			// Pop a node from the stack
			TreeNode currentNode = stack.pop();

			Vector<TreeNode> nodes = currentNode.child;   //poor name - this is all children of the currentNode

			// Visit node
			// Push the children of node
			// onto queue

			Queue<Integer> q = null;

			// start at the 'rightmost' node.  after 1st level i goes from 3 to 2
			for (int i = nodes.size() - 1; i >= 0; i--) {
				
				// Create (or clear) a queue
				q = new LinkedList<>();

				// add the root
				q.add(node.key);
				
				//the i-th child
				int val = nodes.get(i).key;

				q.add(val);

				Vector<TreeNode> c = nodes.get(i).child;

				if (c.size() != 0) { // does the node have children
					
					for (int j = 0; j < c.size(); j++) { // for each child / could start at rightmost if you switch j = max-1

						if (!q.contains(nodes.get(i).child.get(j).key)) { // typically a search vs. a traversal so skip
																			// dups
							q.add(nodes.get(i).child.get(j).key); // add the val of the child
						}
						c = nodes.get(i).child;
					}
				}
				for (Integer x : q)
					System.out.println("Current: " + x);
				System.out.println("--- ");

			}

		}

	}
	
	
	// kick off the recursive run from the root node
		public static void showOrgChartDepthFirstRecursive(TreeNode node) {
			showOrgChartDepthFirstRecursive(node, 0);
		}

		/*  use pre-order - generic algorithm
			
		*/
		public static void showOrgChartDepthFirstRecursive(TreeNode node, int index) {
	
			System.out.println(node.key);

	        for (TreeNode child : node.child) {
	        	showOrgChartDepthFirstRecursive(child, index + 1); // Recursively call dfs for each child
	        }
			
		}
	
		
	 
	
	 
	// Driver Code
	public static void main(String[] args)
	{
	     
	    /* Let us create below tree
	    *          10
	    *       / /   \   \
	    *     2  34    56  100
	    *    / \        |    / | \
	    *   77 88       1   7  8  9
	    */
		
		TreeNode root = new TreeNode(10);
	    
	    (root.child).add(new TreeNode(2));
	    (root.child).add(new TreeNode(34));
	    (root.child).add(new TreeNode(56));
	    (root.child).add(new TreeNode(100));
	    
	    (root.child.get(0).child).add(new TreeNode(77));    //node 0 off root is 2
	    (root.child.get(0).child).add(new TreeNode(88));	// node 0 off root is 2
	    
	    (root.child.get(2).child).add(new TreeNode(1));	    //node 2 off root is 56
	    
	    (root.child.get(3).child).add(new TreeNode(7));		//node 3 off root is  100
	    (root.child.get(3).child).add(new TreeNode(8));		//node 3 off root is  100
	    (root.child.get(3).child).add(new TreeNode(9));		//node 3 off root is  100
	 
	    System.out.println("depth first  traversal ");
	    iterativeDFS(root);
	    
	    
	    showOrgChartDepthFirstRecursive(root,0);
	   
	}
	
	

}
