
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Graph {

	private List<GraphNode> nodeList = new ArrayList<>();

	public Boolean addNode(GraphNode node) {
		// if it doesn't exist in the of nodes already, the graph, create it
		if (getNode(node.getValue()) == null) {
			nodeList.add(node); 																//add the node to the list of nodes
			System.out.println("Node " + node.getValue() + " added to the graph.");
			return true; 																		//return true, we added a node
		}
		
		else if(getNode(node.getValue()) != null) {
			return false; 																		//return false, we did not add a node
		}

		// --> a node has been supplied, add it to the nodeList ( the graph!)
		
		//otherwise the node is there, and cannot be added.
		return false; 	
	
	}

	public Boolean addEdge(GraphNode fromNode, GraphNode toNode, Integer weight) {
		//get the source and target nodes from the existing graph
		
		GraphNode sourceNode = getNode(fromNode.getValue()); 								//get the source node from the graph
		GraphNode targetNode = getNode(toNode.getValue()); 									//get the target node from the graph
		//if either dont exist, cant make the edge
		if (sourceNode == null) { 															//if either node is null, return false
			System.out.println("The source node does not exist in the graph. Please add it first.");
			return false; 																	//return false
		}
		else if (targetNode == null) { 														//if either node is null, return false
			System.out.println("The target node does not exist in the graph. Please add it first.");
			return false; 																	//return false
		}
		
		else {
			//if the source node exists, and the target node exists, add the edge
			if (sourceNode.addNeighbor(targetNode, weight)) { 								//if the source node can add the target node as a neighbor
				System.out.println("Edge from " + sourceNode.getValue() + " to " + targetNode.getValue() + " added with weight " + weight);
				return true; 																//return true, we added an edge
			} else {
				System.out.println("Edge from " + sourceNode.getValue() + " to " + targetNode.getValue() + " already exists.");
				return false; 																//return false, we did not add an edge
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
		//TODO
		
		return -1;

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
