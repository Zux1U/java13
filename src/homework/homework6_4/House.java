package homework.homework6_4;

public class House implements Priceable {
    private String typeHouse;
    private int price;

    public House(String typeHouse, int price) {
        this.typeHouse = typeHouse;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
