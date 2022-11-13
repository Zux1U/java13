package homework.homework9_3;


public class Test {
    public static void main(String[] args) {
        Student[] students1 = new Student[]{
                new Student(12), new Student(16),
                new Student(3), new Student(28)
        };
        Student[] students2 = new Student[]{
                new Student(17), new Student(11),
                new Student(14), new Student(9)
        };
        Student[] allStudents = new Student[students1.length + students2.length];
        System.arraycopy(students1, 0, allStudents, 0, students1.length);
        System.arraycopy(students2, 0, allStudents, students1.length, students2.length);
        mergeSort(allStudents, allStudents.length);
        for (Student s : allStudents) {
            System.out.println(s);
        }
    }
        public static void mergeSort(Student[] a, int n) {
            if (n < 2) {
                return;
            }
            int mid = n / 2;
            Student[] l = new Student[mid];
            Student[] r = new Student[n - mid];

            System.arraycopy(a, 0, l, 0, mid);
            System.arraycopy(a, mid, r, 0, n - mid);
            mergeSort(l, mid);
            mergeSort(r, n - mid);

            merge(a, l, r, mid, n - mid);
        }
        public static void merge(
                Student[] a, Student[] l, Student[] r, int left, int right) {

            int i = 0, j = 0, k = 0;
            while (i < left && j < right) {
                if (l[i].compareTo(r[j]) <= 0) {
                    a[k++] = l[i++];
                }
                else {
                    a[k++] = r[j++];
                }
            }
            while (i < left) {
                a[k++] = l[i++];
            }
            while (j < right) {
                a[k++] = r[j++];
            }
        }
    }
