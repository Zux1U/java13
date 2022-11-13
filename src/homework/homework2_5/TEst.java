package homework.homework2_5;

import java.util.*;

public class TEst {
    public static void main(String[] args) {
        Dog bobik = new Dog("Bobik", 5);
        Dog kenny = new Dog("Kenny", 4);
        Dog sharik = new Dog("Sharik", 2);
        bobik.setAge(6);
        System.out.println(bobik);
        System.out.println(bobik.to_human_age());

        DogKennel dog_kennel = new DogKennel();
        Dog dogs[] = {new Dog("Chy",13), new Dog("Pik",5)};
        dog_kennel.add_dogs(dogs);
        System.out.println(dog_kennel);
    }
}
class Dog {
    private String nickname;
    private int age;

    public Dog(String nickname, Integer age) {
        this.nickname = nickname;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public int to_human_age() {
        System.out.print("Dog the human age of the dog: ");
        return this.age * 7;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                '}';
    }
}
class DogKennel {
    private List<Dog> dog_kennel_array = new ArrayList<Dog>();
    public void add_dogs(Dog dogs[]) {
     this.dog_kennel_array.addAll(new ArrayList<Dog>(Arrays.asList(dogs)));
}

    @Override
    public String toString() {
        return "DogKennel{" +
                "dog_kennel_array=" + dog_kennel_array +
                '}';
    }
}
