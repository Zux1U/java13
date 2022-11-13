package homework.homework8_6;



public class Test {
    public static String isPrime(int n,int i){
        if (n < 2){
            return"No prime";
        }
        else if (n==2){
           return "Prime number";
        }
        else if (n % i == 0){
            return "No prime";
        }
        else if (i < Math.sqrt(n)){
            return isPrime(n,i + 1);
        }
        else{
            return "Prime number";
        }
    }
    public static void main(String[] args) {
        System.out.println(isPrime(359,2));
    }
}
