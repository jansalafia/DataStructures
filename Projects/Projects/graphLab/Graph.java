import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Graph {

	private List<GraphNode> nodeList = new ArrayList<>();

	public Boolean addNode(GraphNode node) {
		// if it doesn't exist in the of nodes already, the graph, create it
		if (getNode(node.getValue()) == null) {
			nodeList.add(node); 															//add the node to the list of nodes
			System.out.println("Node " + node.getValue() + " added to the graph.");
			return true; 																	//return true, we added a node
		}
		
		else if(getNode(node.getValue()) != null) {
			return false; 																	//return false, we did not add a node
		}

		// --> a node has been supplied, add it to the nodeList ( the graph!)
		
		//otherwise the node is there, and cannot be added.
		return false; 	
	
	}

	public Boolean addEdge(GraphNode fromNode, GraphNode toNode, Integer weight) {
		GraphNode sourceNode = getNode(fromNode.getValue());
		GraphNode targetNode = getNode(toNode.getValue());

		if (sourceNode == null) {
			System.out.println("The source node does not exist in the graph. Please add it first.");
			return false;
		} 
		
		else if (targetNode == null) {
			System.out.println("The target node does not exist in the graph. Please add it first.");
			return false;
		} 
		
		else {
			boolean addedEdge = sourceNode.addNeighbor(targetNode, weight);
			boolean addedReverseEdge = targetNode.addNeighbor(sourceNode, weight); 

			if (addedEdge || addedReverseEdge) {
				System.out.println("Edge between " + sourceNode.getValue() + " and " + targetNode.getValue() + " added with weight " + weight);
				return true;
			} else {
				System.out.println("Edge between " + sourceNode.getValue() + " and " + targetNode.getValue() + " already exists.");
				return false;
			}
		}
	}

	/**
	 * In my implementation of isReachable I put a Set of nodes to represent places
	 * already reached. Modifying that algorithm to use a map, and keep an
	 * ever incrementing number along with the number that says how far away is an
	 * approach.
	 * 
	 * All the nodes I can get to from the start are 1 away. All the nodes I can get
	 * to from N away are N+1 away If I find a node the second time, I dont add it;
	 * once I get there, the shortest path to the destination has X hops; if I got
	 * there in N and N+1 hops, N + X will be the smallest number of hops
	 * 
	 */
	
	public int fewestHops(GraphNode fromNode, GraphNode toNode) {
        if (fromNode == null || toNode == null) { 											//if either node is null, return -1
            System.out.println("One or both of the nodes are null."); 					//print error message
            return -1; 																		//return -1, invalid input
        }

        if (fromNode.equals(toNode)) { 														//if the nodes are the same
            return 0; 																		//return 0, no hops needed
        }

        Queue<GraphNode> queue = new LinkedList<>(); 										//queue for BFS
        Map<GraphNode, Integer> distanceMap = new HashMap<>(); 								//map to track distances from the start node

        queue.add(fromNode); 																//add the start node to the queue
        distanceMap.put(fromNode, 0); 												//start node is 0 hops away

        while (!queue.isEmpty()) { 															//while there are nodes to process
            GraphNode currentNode = queue.poll(); 											//get the next node from the queue
            int currentDistance = distanceMap.get(currentNode); 							//get the distance of the current node

            for (GraphNode neighbor : currentNode.getNeighbors()) { 						//iterate through neighbors
                System.out.println("Processing neighbor: " + neighbor.getValue());
                if (!distanceMap.containsKey(neighbor)) { 									//if the neighbor hasn't been visited
                    distanceMap.put(neighbor, currentDistance + 1); 						//update the distance for the neighbor
                    queue.add(neighbor); 													//add the neighbor to the queue

                    if (neighbor.equals(toNode)) { 											//if we found the target node
                        return currentDistance + 1; 										//return the distance to the target node
                    }
                }
            }
        }

        System.out.println("No path exists between the nodes."); 							//print message if no path exists
        return -1; 																			//return -1, no path found
    }

	public GraphNode getNode(String nodeValue) {
		for (GraphNode thisNode : nodeList) {
			if (thisNode.getValue().equals(nodeValue))
				return thisNode;
		}
		return null;
	}

	public List<GraphNode> getNodes() {
		return nodeList;
	}

}
