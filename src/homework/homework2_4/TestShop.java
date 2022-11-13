package homework.homework2_4;

import java.util.ArrayList;
import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        int index;
        Scanner sc = new Scanner(System.in);
        ArrayList<Shop> arrayOfPC = new ArrayList<>();
        System.out.println("Add PC");
        arrayOfPC.add(new Shop(sc.nextLine()));
        arrayOfPC.add(new Shop(sc.nextLine()));
        arrayOfPC.add(new Shop(sc.nextLine()));
        arrayOfPC.add(new Shop(sc.nextLine()));
        System.out.println(arrayOfPC);
        System.out.println("input index for Delete PC");
        index = sc.nextInt();
        arrayOfPC.remove(index);
        System.out.println(arrayOfPC);
    }
}