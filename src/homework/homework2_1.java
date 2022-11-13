package homework;

import java.util.Scanner;

class Shop{

//    private int price;
    private String brand;
//    private String gpu;

    public Shop(String brand) {
//        this.price = price;
        this.brand = brand;
//        this.gpu = gpu;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
    class Test{
        public static void main(String[] args) {

            Shop pc = new Shop("hp");
            System.out.println(pc);
        }
    }