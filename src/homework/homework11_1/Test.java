package homework.homework11_1;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        String family = "Fedotov";
        Date d = new Date();
        System.out.println("Getting a task for " + family + " " + d);

        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,2022);
        c.set(Calendar.MONTH,Calendar.NOVEMBER);
        c.set(Calendar.DAY_OF_MONTH,30);

        System.out.println("Submitting a task for " + family + " " + c.getTime());
    }
}
