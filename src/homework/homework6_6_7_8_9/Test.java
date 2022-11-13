package homework.homework6_6_7_8_9;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Book b1 = new Book("Uraa");
        Book b2 = new Book("Cheah");
        Magazines m1 = new Magazines("Monopoly");
        Magazines m2 = new Magazines("Chuma");
        Printable[] printables = {b1,b2,m1,m2};
        for (int i = 0;i < printables.length; i++) {
            printables[i].print();
        }
    }
}
