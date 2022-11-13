package homework.homework9_2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        SortingStudentsByGPA[] students = new SortingStudentsByGPA[]{
                new SortingStudentsByGPA(12), new SortingStudentsByGPA(16),
                new SortingStudentsByGPA(3), new SortingStudentsByGPA(28)
        };
        quickSort(students,0, students.length-1);
        for (SortingStudentsByGPA s : students) {
            System.out.println(s);
        }
    }

    public static void quickSort(Comparable[] a, int left, int right) {
        if (left < right) {
            int p = partition(a, left, right);
            quickSort(a, left, p-1);
            quickSort(a, p+1, right);
        }
    }
    public static int partition(Comparable[] a, int left, int right) {
        Comparable pivot = a[left];
        int p = left;
        for (int r = left+1; r <= right; r++) {
            int comp = a[r].compareTo(pivot);
            if (comp < 0) {
                a[p] = a[r];  a[r] = a[p+1];
                a[p+1] = pivot;  p++;
            }
        }
        return p;
    }
}
