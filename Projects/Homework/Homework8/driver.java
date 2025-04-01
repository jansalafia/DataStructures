

public class driver {
	
	 public static void main(String args[])
     
	    {
	        
	    
	        TreeNode root2 = new TreeNode(5);
	        root2.left = new TreeNode(1);
	        root2.right = new TreeNode(6);
	        root2.left.left = new TreeNode(0);
	        root2.left.right = new TreeNode(3);
	        root2.right.right = new TreeNode(8);
	        root2.left.right.left = new TreeNode (2);
	        root2.left.right.right = new TreeNode (4);
	        root2.right.right.left = new TreeNode (7);
	        

	        //        5
	        //     /    \ 
	        //	  1       6
	        //   / \       \
	        //  0   3       8
	        //     / \ 	   /	
	        //    2   4   7
	        
	        
	        TreeTraversal traversaler = new TreeTraversal();
	        
	        System.out.println("Inorder traversal");
	        traversaler.inorder(root2);

	        System.out.println("\nPreorder traversal ");
	        traversaler.preorder(root2);

	        System.out.println("\nPostorder traversal");
	        traversaler.postorder(root2);

	        System.out.println("\nLevelorder traversal");
	        traversaler.printLevelOrder(root2);
	        

	    
	    }

	 /*
	    Results:
	   
	    Inorder traversal
		0 1 2 3 4 5 6 7 8 

		Preorder traversal 
		5 1 0 3 2 4 6 8 7 
		
		Postorder traversal
		0 2 4 3 1 7 8 6 5 
		
		Levelorder traversal
		5 1 6 0 3 8 2 4 7 
	   
	  */

}
