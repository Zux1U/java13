package homework.homework13_4;

public class Number {
    private String country_kod;
    private String three_digits_1;
    private String three_digits_2;
    private String four_digits;

    public String correct_number(String s1){
        if (s1.charAt(0) == '+') {
            country_kod = String.valueOf(s1.charAt(1));
            three_digits_1 = s1.substring(2, 5);
            three_digits_2 = s1.substring(5, 8);
            four_digits = s1.substring(8, 12);
            return "+" + country_kod + three_digits_1+ "-" + three_digits_2 + "-" + four_digits;
        }
        else{
            country_kod = String.valueOf(s1.charAt(0));
            three_digits_1 = s1.substring(1, 4);
            three_digits_2 = s1.substring(4, 7);
            four_digits = s1.substring(7, 11);
            return  "+" + country_kod + three_digits_1 + "-" + three_digits_2 + "-" + four_digits;
        }
    }
}
