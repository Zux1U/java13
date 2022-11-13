package homework.homework6_4;

public class Test {
    public static void main(String[] args) {
        Priceable car1 = new Car("Tesla",150000);
        Priceable hse1 = new House("Big",1000000);
        System.out.println(car1.getPrice());
        System.out.println(hse1.getPrice());
    }
}
