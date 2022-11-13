package homework.homework6_4;

public class Car implements Priceable{
    private String Model;
    private int price;

    public Car(String model, int price) {
        Model = model;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
