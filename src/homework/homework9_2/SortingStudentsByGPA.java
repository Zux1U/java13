package homework.homework9_2;


public class SortingStudentsByGPA implements Comparable{
    private int GPA;

    public SortingStudentsByGPA(int GPA) {
        this.GPA = GPA;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    @Override
    public int compareTo(Object o) {
        return this.GPA - ((SortingStudentsByGPA) o).GPA;

    }

    @Override
    public String toString() {
        return "SortingStudentsByGPA{" +
                "GPA=" + GPA +
                '}';
    }
}
