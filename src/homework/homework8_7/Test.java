package homework.homework8_7;

public class Test {
    public static void factorize(int n) {
        int a = 2;
        while (a <= n) {
            if ((n % a) == 0) {
                if (a != n) {
                    System.out.print(a + " ");
                    factorize(n / a);
                } else {
                    System.out.print(a);
                }
                return;
            }
            a++;
        }
    }

    public static void main(String[] args) {
        factorize(60);
    }
}
