package homework.homework25_7;

import java.util.regex.*;

public class Task7 {
    public static void main(String[] args) {
        System.out.println(checkPass("F032_Password"));
        System.out.println(checkPass("smart_pass"));
    }

    public static boolean checkPass(String s){
        return Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z_]{8,}").matcher(s).find();
    }
}
