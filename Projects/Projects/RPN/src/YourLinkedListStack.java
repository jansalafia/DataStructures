public class YourLinkedListStack implements YourStack {
    // YOU MUST USE THIS IMPLEMENTATION - just code the methods
    private YourStackNode head = null;
    private Integer size = 0;

    @Override
    public void push(Integer i) {
        if (head == null) {
            head = new YourStackNode();
            head.setItem(i);
            size++;
        } else {
            YourStackNode newNode = new YourStackNode();
            newNode.setItem(i);
            newNode.setNext(head);
            head = newNode;
            size++;
        }
    }

    @Override
    public Integer pop() {
        if (head == null) {
            return null;
        } else {
            Integer temp = head.getItem();
            head = head.getNext();
            size--;
            return temp;
        }
    }

    @Override
    public Integer size() {
        return size;
    }
}
