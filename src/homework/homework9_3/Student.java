package homework.homework9_3;

public class Student implements Comparable{
    private int idStudent;

    public Student(int idStudent) {
        this.idStudent = idStudent;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    @Override
    public int compareTo(Object o) {
        return this.idStudent - ((Student) o).idStudent;

    }
    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                '}';
    }
}
