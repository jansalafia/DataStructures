
import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal implements iTreeTraversal{
    
    // Preorder traversal
    public void preorder(TreeNode TreeNode) {               
        if (TreeNode == null)                                   //Base case
            return;
        System.out.print(TreeNode.data + " ");                  //Print the data
        preorder(TreeNode.left);                                //Recursive function on left child
        preorder(TreeNode.right);                               //Recursive function on right child
    }
    

    // Inorder traversal
    public void inorder(TreeNode TreeNode) {    
        if (TreeNode == null)                                   //Base case
            return;
        inorder(TreeNode.left);                                 //Recursive function on left child
        System.out.print(TreeNode.data + " ");                  //Print the data
        inorder(TreeNode.right);                                //Recursive function on right child
    }
    

    // Postorder traversal
    public void postorder(TreeNode TreeNode) {
        if (TreeNode == null)                                   //Base case
            return;
        postorder(TreeNode.left);                               //Recursive function on left child
        postorder(TreeNode.right);                              //Recursive function on right child
        System.out.print(TreeNode.data + " ");                  //Print the data
    }


    @Override
    public void printLevelOrder(TreeNode root) {
        if (root == null) {
            return;
        }
    
        Queue<TreeNode> queue = new LinkedList<>();             //Create a queue
        queue.add(root);                                        //Enqueue root
    
        while (!queue.isEmpty()) {                              //While the queue is not empty
            TreeNode current = queue.poll();                    //Dequeue the front node
            System.out.print(current.data + " ");               //Print
    
            if (current.left != null) {                         //Enqueue the left child if it exists
                queue.add(current.left);                        
            }

            if (current.right != null) {                        //Enqueue the right child if it exists
                queue.add(current.right);                   
            }
        }
    }
}