package Traverser;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstTraversal {
	
	// Prints the n-ary tree level wise
	static void LevelOrderTraversal(TreeNode root) {
		if (root == null)
			return;

		// Standard level order traversal code
		// using queue

		// Create a queue
		Queue<TreeNode> q = new LinkedList<>();

		// Enqueue root
		q.add(root);
		while (!q.isEmpty()) {
			int n = q.size();

			// If this node has children
			while (n > 0) {
				// Dequeue an item from queue and print it
				TreeNode p = q.peek();
				q.remove();
				System.out.print(p.key + " ");

				// Enqueue all children of the dequeued item
				for (int i = 0; i < p.child.size(); i++)
					q.add(p.child.get(i));
				n--;
			}

			// Print new line between two levels
			System.out.println();
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
	 
	    System.out.println("Level order traversal " );
	    
	    LevelOrderTraversal(root);
	}
	
	

}
