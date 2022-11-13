package homework;

import java.util.Scanner;


public class homework2_9 {
        public static int getRandomDiceNumber(){
            {
                return(int)(Math.random()*50)+2;
            }
        }
        public static void main(String[] args) {
        int n;
        String[] deck = {"2-Clubs","3-Clubs","4-Clubs","5-Clubs","6-Clubs","7-Clubs","8-Clubs","9-Clubs","10-Clubs", "V-Clubs","Q-Clubs","K-Clubs","A-Clubs",
                "2-Hearts","3-Hearts","4-Hearts","5-Hearts","6-Hearts","7-Hearts","8-Hearts","9-Hearts","10-Hearts", "V-Hearts","Q-Hearts","K-Hearts","A-Hearts",
                "2-Spades","3-Spades","4-Spades","5-Spades","6-Spades","7-Spades","8-Spades","9-Spades","10-Spades", "V-Spades","Q-Spades","K-Spades","A-Spades",
                "2-Diamonds","3-Diamonds","4-Diamonds","5-Diamonds","6-Diamonds","7-Diamonds","8-Diamonds","9-Diamonds","10-Diamonds", "V-Diamonds","Q-Diamonds","K-Diamonds","A-Diamonds"};
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println();
            System.out.println(i+1 + " Player:");
            for (int j = 0; j < 5;j++){
                int c = getRandomDiceNumber();
                System.out.print(deck[c]+" ");
            }
        }
    }
}

