package genericLinkedList;


public class LinkedList<T> implements List<T>{

	private Node<T> head;
	
	@Override
	public boolean add(T key) {
		
		//if head == null, nothing in the list
		//create a new node with the data
		//set that to head
		// return
		if(head == null) {
			head = new Node<T>(key);
			return true;
		}

		//else
		//set head to local Node current
		//step thru each element in the list, checking if the .next of this node is null
		//once found, create a new node out of incoming data & set that to current.next
		else {
			Node<T> current = head;
			while(current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(new Node<T>(key));
			return true;
		}
		
	}

	@Override
	public boolean delete(T key) {
		//if head == null, nothing in the list, return
		if(head == null) {
			return false;
		}
		//if head.data == incoming data
		// set head = the node head points to.  return.
		if(head.getData().equals(key)) {
			head = head.getNext();
			return true;
		}	
		//else
		//create a new local node with the head
		//step thru each element in the list.  if the next is non null
		//check if that data == the data we want to delete
		//if yes, this is the element to delete.  
		//do that by setting current.next = current.next.next
		else {
			Node<T> current = head;
			while(current.getNext() != null) {
				if(current.getNext().getData().equals(key)) {
					current.setNext(current.getNext().getNext());
					return true;
				}
				current = current.getNext();
			}
		}
		
		//remove this
		return false;
	}

	@Override
	public void display() {
		//iterate over the list, displaying the data for each node.
		Node<T> current = head;
		while(current != null) {
			System.out.println(current.getData());
			current = current.getNext();
		}
	}
	
	 
}
