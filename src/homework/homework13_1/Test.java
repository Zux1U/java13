package homework.homework13_1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        System.out.println(s1);
        System.out.println(s1.charAt(s1.length()-1));
        System.out.println(s1.endsWith("!!!"));
        System.out.println(s1.startsWith("I like"));
        System.out.println(s1.contains("Java"));
        System.out.println(s1.indexOf("Java"));
        System.out.println(s1.replace('a','o'));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.substring(s1.indexOf("Java"),s1.indexOf('!')));
        System.out.println(s1.lastIndexOf("Java"));
    }
}

