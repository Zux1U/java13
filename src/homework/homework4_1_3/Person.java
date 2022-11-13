package homework.homework4_1_3;

class Person {

    private String fullName;
    private int age;

    public void talk(){
        System.out.println("Speaking " + fullName);
    }
    public void move(){
        System.out.println("Moving");
    }

    public Person(){

    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
}

class Test{
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 =new Person("Ilya Fedotov",19);
        person2.talk();
        person1.talk();
    }
}
