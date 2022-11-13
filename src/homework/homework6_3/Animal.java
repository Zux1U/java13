package homework.homework6_3;

public class Animal implements Nameable {
    private String nickname;

    public Animal(String nickname) {
        this.nickname = nickname;
    }

    public String getName() {
        return nickname;
    }
}
