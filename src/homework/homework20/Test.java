package homework.homework20;

public class Test {
    public static void main(String[] args) {
        ThreeGen<String , Cat, Integer> threeGen = new ThreeGen<>("dfgdfg", new Cat(), 2);
        threeGen.showTypes();
    }
}
