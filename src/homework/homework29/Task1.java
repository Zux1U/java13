package homework.homework29;

import java.util.Scanner;
import java.util.Stack;

public class Task1 {
    public static void main(String[] args) {
        int N;
        int sum = 0;
        Scanner in = new Scanner(System.in);
        N = in.nextInt();

        int[][] arr = new int[N][N];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }

        System.out.println("The number of roads on the planet \"Neptune\":" + " " + sum);
    }
}
