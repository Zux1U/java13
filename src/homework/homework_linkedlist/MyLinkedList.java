package homework.homework_linkedlist;

public class MyLinkedList {
    private Node head;
    private Node tail;

    public MyLinkedList() {
        head = null;
    }
    void add(int data)
    {
        Node a = new Node(data);
        a.data = data;
        if (head == null)
        {
            head = a;
            tail = a;
        } else {

            a.next = head;
            head = a;

        }
    }
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    private void swap(Node l1, Node l2) {
        int n = l1.data;
        l1.data = l2.data;
        l2.data = n;
    }
    public void bubbleSort() {
        boolean flag = true;

        while (flag) {
            Node le = head;
            flag = false;
            while (le != tail) {
                if (le.data < le.next.data) {
                    swap(le, le.next);
                    flag = true;
                }
                le = le.next;
            }
        }
    }
    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }
}
