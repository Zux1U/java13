package homework.homework4_1_7;

class Learner {
    private String name;
    private String second_name;

    public Learner(String name, String second_name) {
        this.name = name;
        this.second_name = second_name;
    }

    public String getName() {
        return name;
    }

    public String getSecond_name() {
        return second_name;
    }
}

class Schoolboy extends Learner {
    public Schoolboy(String name, String second_name){
        super(name,second_name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getSecond_name() {
        return super.getSecond_name();
    }
}

class Student extends Learner {
    public Student(String name, String second_name) {
        super(name, second_name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getSecond_name() {
        return super.getSecond_name();
    }
}

class Test {
    public static void main(String[] args) {
        Learner[] l1 = new Learner[3];
        l1[0] = new Schoolboy("Iya","Fedotov");
        l1[1] = new Schoolboy("Artur","Petrov");
        l1[2] = new Student("Petya","Ivanov");
        for (int i = 0; i < l1.length; i++) {
            if (l1[i] instanceof Schoolboy) {
                System.out.println("SchoolBoy:");
                System.out.println(l1[i].getName() + " " + l1[i].getSecond_name());
            }
            else if(l1[i] instanceof Student) {
                System.out.println("Student:");
                System.out.println(l1[i].getName() + " " + l1[i].getSecond_name());
            }
        }
    }
}

