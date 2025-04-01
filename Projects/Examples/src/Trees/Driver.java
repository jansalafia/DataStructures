package Trees;

public class Driver<T> 
{
	public static void main(String[] args) {

		
		//create some nodes
		Node rootNode = new Node("CEO");
	    Node vpNode = new Node("Vice President");
	    Node managerNode = new Node("Manager");
	    Node dev1Node = new Node("Developer 1");
	    Node dev2Node = new Node("Developer 2");
	    Node dev3Node = new Node("Developer 3");
	
	    
	    //build a tree
	    rootNode.addChild(vpNode);
	    vpNode.addChild(managerNode);
	    managerNode.addChild(dev1Node);
	    managerNode.addChild(dev2Node);
	    managerNode.addChild(dev3Node);

	    //display the tree
	    rootNode.display();
	    
	    System.out.println("--");
	    
	    //create & add a new node 
	    Node managerNode2 = new Node("Another Manager");
	    vpNode.addChild(managerNode2);
	    
	    //display the tree
	    rootNode.display();
	    
	  }

	
	/* 
			 ceo
			  |
			  vp
			  |
			 manager
 		    /   |   \
		dev1   dev2  dev3
		
		
		
			 	   ceo
			  		|
			  		vp
			  	  /	   \
			 manager     manager2
 		    /   |   \
		dev1   dev2  dev3
	
	*/
}	