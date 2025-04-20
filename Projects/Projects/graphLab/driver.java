
public class driver {
	private static Graph graph;

	public static void main(String[] args) {

		TESTbuildGraph();
		
		TESTdescribeGraph();

		System.out.println("\n--- PART 1 --- \n");
		
		TESTfewestHops("Washington", "Atlanta");

		System.out.println("\n--- PART 2 --- \n");

		TESTupdateGraph();

		TESTdescribeGraph();

		TESTfewestHops("Washington", "Atlanta");

	} 
	
	public static void TESTbuildGraph() {
		graph = new Graph();

		TESTaddNode("Austin");
		TESTaddNode("Houston");
		TESTaddNode("Dallas");
		TESTaddNode("Atlanta");
		TESTaddNode("Washington");
		TESTaddNode("Denver");
		TESTaddNode("Chicago");

		TESTaddEdge("Austin", "Dallas", 200);
		TESTaddEdge("Dallas", "Austin", 200);
		TESTaddEdge("Austin", "Houston", 160);
		TESTaddEdge("Houston", "Atlanta", 800);
		TESTaddEdge("Atlanta", "Houston", 800);
		TESTaddEdge("Washington", "Dallas", 1300);
		TESTaddEdge("Dallas", "Denver", 780);
		TESTaddEdge("Denver", "Chicago", 1000);
	}
	
	public static void TESTupdateGraph() {

		TESTaddEdge("Dallas", "Houston", 550);
		TESTfewestHops("Washington", "Atlanta");

	}
	
	public static void TESTfewestHops(String nodeFrom, String nodeTo) {
		System.out.println("Fewest hops in the graph from " + nodeFrom + " to " + nodeTo + " is "
				+ graph.fewestHops(new GraphNode(nodeFrom), new GraphNode(nodeTo)) + " hops");

	}

	public static void TESTdescribeGraph() {
		for (GraphNode thisNode : graph.getNodes()) {
			System.out.print("Node [" + thisNode.getValue() + "] ");
			if (thisNode.getNeighbors().isEmpty()) {
				System.out.print("has no outgoing connections");
			} else {
				System.out.print("is connected to ");
				for (GraphNode neighbor : thisNode.getNeighbors()) {
					System.out.print("[" + neighbor.getValue() + "] by "
							+ thisNode.getDistanceToNeighbor(neighbor).toString() + " ");
				}
			}
			System.out.println();
		}
	}

	public static void TESTaddEdge(String from, String to, Integer weight) {
		say("Attempting to addEdge from [" + from + "] to [" + to + "] with weight [" + weight.toString() + "]");
		say(graph.addEdge(new GraphNode(from), new GraphNode(to), weight) ? "SUCCESS" : "FAIL");
	}

	public static void TESTaddNode(String value) {
		say("Attempting to addNode [" + value + "]");
		say(graph.addNode(new GraphNode(value)) ? "SUCCESS" : "FAIL");
	}

	public static void say(String s) {
		System.out.println(s);
	}

}
