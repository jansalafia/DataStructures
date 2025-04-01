package Trees;

import java.util.LinkedList;
import java.util.List;

public class Node {

  private String value;
  private List<Node> childNodes;

  public Node(String value) {
    this.value = value;
    this.childNodes = new LinkedList<>();
  }

  public void addChild(Node childNode) {
    this.childNodes.add(childNode);
  }
 
  public String getValue() {
    return value;
  }

  public List<Node> getChildNodes() {
    return childNodes;
  }
  
  
  public void display() {

	  BFSPrinter.printNodes(this);
  }
  
  
  
}