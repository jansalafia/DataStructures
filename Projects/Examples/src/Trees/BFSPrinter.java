package Trees;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BFSPrinter {
	
	
/*
Push the root node into the queue
For each level, Push the next-level nodes into the queue.
Add the nodes in the queue to a temp list at that particular level.
At the end of each traversal add the temp list to the result list
*/
	
	public static void printNodes(Node node) {
        Queue<Node> queue = new LinkedList<>();		//linked list can implement queue
        queue.add(node);

        Node currentNode;
        Set<Node> alreadyVisited = new HashSet<>();
        System.out.print("Visited nodes: ");
   
        while (!queue.isEmpty()) {
            currentNode = queue.remove();
            System.out.print(currentNode.getValue() + " | ");

            alreadyVisited.add(currentNode);
            queue.addAll(currentNode.getChildNodes());
            queue.removeAll(alreadyVisited);
        }
    }

}
