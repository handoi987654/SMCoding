package object;

public class List {

    private Node head;
    private Node tail;
    private int size;

    public List() {
        head = null;
        tail = null;
        size = 0;
    }

    public void pushBack(int n) {
        if (isEmpty()) {
            head = new Node();
            head.setValue(n);
            tail = head;
        } else {
            Node node = new Node();
            node.setValue(n);
            node.setPreviousNode(tail);
            tail.setNextNode(node);
            tail = node;
        }

        size++;
    }

    public void pushFront(int n) {
        if (isEmpty()) {
            head = new Node();
            head.setValue(n);
            tail = head;
        } else {
            Node node = new Node();
            node.setValue(n);
            node.setNextNode(head);
            head.setPreviousNode(node);
            head = node;
        }

        size++;
    }

    public int popBack() throws Exception {
        if (isEmpty()) {
            throw new Exception("List is empty");
        } else {
            Node node = tail.getPreviousNode();
            int value = tail.getValue();
            if (node == null) {
                head = tail = null;
            } else {
                tail = node;
                tail.setNextNode(null);
            }

            size--;
            return value;
        }
    }

    public int popFront() throws Exception {
        if (isEmpty()) {
            throw new Exception("List is empty");
        } else {
            Node node = head.getNextNode();
            int value = head.getValue();
            if (node == null) {
                head = tail = null;
            } else {
                head = node;
                head.setPreviousNode(null);
            }

            size--;
            return value;
        }
    }

    private boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        Node node = head;
        while (node != null) {
            builder.append(node.getValue());
            if (node != tail) builder.append(", ");
            node = node.getNextNode();
        }
        return builder.append("]").toString();
    }
}
