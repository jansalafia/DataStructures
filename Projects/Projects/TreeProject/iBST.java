

public interface iBST<T extends Comparable<T>> {

	public void inOrder();

	public boolean insert(T data);

	public BSTNode<T> search(T data);

	public BSTNode<T> inOrderSuccessor(BSTNode<T> cur);

	public boolean remove(T key);

	public boolean searchForKey(T key);

}
