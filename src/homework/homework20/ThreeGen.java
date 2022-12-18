package homework.homework20;

public class ThreeGen<T extends String, V extends Animal, K> {

    private T example1;
    private V example2;
    private K example3;

    public ThreeGen(T example1, V example2, K example3) {
        this.example1 = example1;
        this.example2 = example2;
        this.example3 = example3;
    }

    public T getExample1() {
        return example1;
    }

    public V getExample2() {
        return example2;
    }

    public K getExample3() {
        return example3;
    }

    public void showTypes(){
        System.out.println("example1: "+ example1.getClass().getName());
        System.out.println("example2: "+ example2.getClass().getName());
        System.out.println("example3: "+ example3.getClass().getName());
    }
}
