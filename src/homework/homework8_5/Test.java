package homework.homework8_5;

public class Test {
    public static int SumDigits(int n){
        if (n==0){
            return 0;
        }
        return SumDigits(n / 10) + n % 10;
    }

    public static void main(String[] args) {
        System.out.println(SumDigits(256));
    }
}
