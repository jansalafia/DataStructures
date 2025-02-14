

public class ListImpl<T extends Comparable<T>> implements List<T> {

	private ListNode<T> head;

	public ListImpl() {
		head = null;
	}

	// insert adds a node into the list in key order
        @Override
    public boolean insert(T key) {
        if (head == null) {
            head = new ListNode<>(key, null);
            return true;
        }

        ListNode<T> prev = search(key);
        
        if (prev != null) {
            ListNode<T> nextOfPrev = prev.getNext();
            prev.setNext(new ListNode<>(key, nextOfPrev));
        } else {
            head = new ListNode<>(key, head);
        }
        
        return true;
    }

	// Search is looking for value Key in the list
	// It will return the pointer to the previous node where key is (or should be)
	// // or null if key is or should be in the first node
	private ListNode<T> search(T key) {
		ListNode<T> prev = null, curr = head;
		boolean done = false;
		while (curr != null && !done) {
			if (curr.getData().compareTo(key) < 0) {
				prev = curr;
				curr = curr.getNext();
			} else // key <= curr.getData()
				done = true;

		}
		return prev;
	} // search

        @Override
	public boolean remove(T key) {

		ListNode<T> prev = search(key);

		if (head == null) {
			return false;
		}

		if (head.getData().equals(key)) {
			head = head.getNext();
			return true;
		}

		if (prev == null) {
			return false;
		}
		
		if (prev.getNext() == null) {
			return false;
		}

		if (prev.getNext().getData().equals(key)) {

			ListNode<T> toDelete = prev.getNext();
			prev.setNext(toDelete.getNext());

			return true;

		}

		return false;

	}

	// TODO
	// displays prints the list content in [ ]'s separated by commas

        @Override
	public void display() {

		ListNode<T> curr = head;

		System.out.print("[");

		while (curr != null) {
			System.out.print(curr.getData());
			curr = curr.getNext();

			if (curr != null) {
				System.out.print(", ");
			}
		}

		System.out.println("]");

	}
} // end of the class
