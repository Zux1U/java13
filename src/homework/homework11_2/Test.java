package homework.homework11_2;

import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;

public class Test {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = new Date();
        Date d1 = new Date();
        String s = reader.readLine();
        d = sdf.parse(s);
        System.out.println(d);
        System.out.println(d1);
        int result = d.compareTo(d1);

        if(result == 0)
            System.out.println("Both dates are equal");
        else if (result < 0)
            System.out.println("input date is before pc date");
        else
            System.out.println("input date is after pc date");
    }
}
