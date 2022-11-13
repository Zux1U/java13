package homework.homework9_1;

public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student(12), new Student(16),
                new Student(3), new Student(28)
        };
        selectionSort(students);
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public static void selectionSort(Comparable[] list) {
        int min;
        Comparable temp;
        for (int index = 0; index < list.length - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < list.length; scan++) {
                if (list[scan].compareTo(list[min]) < 0) {
                    min = scan;
                    temp = list[min];
                    list[min] = list[index];
                    list[index] = temp;
                }
            }
        }
    }
}
