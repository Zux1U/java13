package homework.homework2_6;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(12);
        Circle circle2 = new Circle(30);
        System.out.println(circle2.LengthCirlce());
        System.out.println(circle1.SquareCirlce());
        System.out.println(CompareCircle(circle1.getRadius(),circle2.getRadius()));
    }
    public static String CompareCircle(double radius1,double radius2) {

        if (radius1 > radius2) {
            return "Circle 1 is bigger";
        } else {
            return "Circle 2 is bigger";
        }
    }
}
