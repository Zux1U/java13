package homework.homework18_5;

public class ThrowsDemo {
    public void getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        }
         catch (NullPointerException e) {
            System.out.println("Exception was processed. Program continues");
        }
    }
}

