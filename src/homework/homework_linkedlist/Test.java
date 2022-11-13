package homework.homework_linkedlist;

public class Test {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(1);
        list.add(1289);
        list.add(-12);
        list.add(54);
        list.add(213);
        list.add(-213);
        list.add(11);
        list.add(22);
        list.add(0);
        list.add(0);
        list.add(1);
        list.add(12);
        System.out.println("Before");
        list.print();
        list.bubbleSort();
        System.out.println();
        System.out.println("After");
        list.print();
    }
}
