
public class Driver {

	public static void main(String args[]) {
		TEST_CITIES();
	}

	public static void TEST_CITIES() {
	
		//TODO: 
			//Create Vertices
			GraphNode <String> austinNode = new GraphNode<>("Austin");
			GraphNode <String> chicagoNode = new GraphNode<>("Chicago");
			GraphNode <String> denverNode = new GraphNode<>("Houston");
			GraphNode <String> houstonNode = new GraphNode<>("Denver");
			GraphNode <String> dallasNode = new GraphNode<>("Dallas");
			GraphNode <String> atlantaNode = new GraphNode<>("Atlanta");
			GraphNode <String> washingtonNode = new GraphNode<>("Washington");
			
		//TODO:
			//Create Edges
			//	hint - build the edge by adding a neighbor to a node
			austinNode.addneighbours(dallasNode);
			austinNode.addneighbours(houstonNode);

			chicagoNode.addneighbours(denverNode);

			denverNode.addneighbours(atlantaNode);
			denverNode.addneighbours(chicagoNode);

			houstonNode.addneighbours(atlantaNode);

			dallasNode.addneighbours(denverNode);
			dallasNode.addneighbours(austinNode);
			dallasNode.addneighbours(chicagoNode);

			atlantaNode.addneighbours(houstonNode);

			washingtonNode.addneighbours(atlantaNode);
			washingtonNode.addneighbours(dallasNode);

		//TODO:
			//Create an instance of a new GraphUtils<String>();
			GraphUtils<String> graphUtils = new GraphUtils<>();
			//invoke the pathExists method of your GraphUtils & print the result for each of the following routes:

			System.out.println("Austin -> Chicago: " + graphUtils.pathExists(austinNode, chicagoNode));
			System.out.println("Denver -> Austin: " + graphUtils.pathExists(denverNode, austinNode));
			System.out.println("Houston -> Dallas: " + graphUtils.pathExists(houstonNode, dallasNode));
			System.out.println("Austin -> Atlanta: " + graphUtils.pathExists(austinNode, atlantaNode));
			System.out.println("Denver -> Dallas: " + graphUtils.pathExists(denverNode, dallasNode));
			System.out.println("Washington -> Houston: " + graphUtils.pathExists(washingtonNode, houstonNode));

			//Austin -> Chicago
			//Denver -> Austin
			//Houston -> Dallas
			//Austin -> Atlanta
			//Denver -> Dallas
			//Washington -> Houston
		

	}
	
	/** Expected results:
	 
	 	Routes Available: 
		 -------------------------------- 
		 Austin -> Chicago:	 true
		 Denver -> Austin:	 false
		 Houston -> Dallas:	 false
		 Austin -> Atlanta:	 true
		 Denver -> Dallas:	 false
		 Washington -> Houston:	 true

	 */

}
