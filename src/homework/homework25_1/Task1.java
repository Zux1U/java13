package homework.homework25_1;

import java.util.regex.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Pattern p3 = Pattern.compile(" ");
        String[] words = p3.split(sc1.nextLine());
        for(String word : words){
            System.out.println(word);
        }
    }
}
