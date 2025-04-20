import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;


public class GraphUtils<T> {

	public Boolean pathExists(GraphNode<T> targetFromNode, GraphNode<T> targetToNode) {

		// create queue to manage nodes
		Queue<GraphNode<T>> queue = new LinkedList<>();

		// create set to manage visitedNodes
		Set<GraphNode<T>> visitedNodes = new HashSet<>();

		//start from the targetFromNode
			for (GraphNode<T> node : targetFromNode.getNeighbours()) {
				//add the node to the queue
				queue.add(node);
			}
			//for all neighbors:
				//check if visited.  If not, add to the queue.  
				//if targetToNode has been visited, return true
			while (queue.isEmpty() == false) {									//While the queue is not empty
				GraphNode<T> currentNode = queue.poll();						//Get the first node int the queue
				if (currentNode == targetToNode) {								//If the current node is the target node
					return true;
				}
				if (!visitedNodes.contains(currentNode)) {						//If the node has not been visited
					visitedNodes.add(currentNode);								//Add it to Set of visited nodes	
					for (GraphNode<T> node : currentNode.getNeighbours()) {		//For each neighbor of the current node
						queue.add(node);										//Add the neighbor to the queue
					}
				}
			}
		//if u get here
		return false;
	}

}
