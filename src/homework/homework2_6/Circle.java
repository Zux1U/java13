package homework.homework2_6;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double LengthCirlce(){
        System.out.print("Length circle = ");
        return (this.radius * Math.PI * 2);
    }

    public double SquareCirlce(){
        System.out.print("Square circle = ");
        return (Math.pow(this.radius,2) * Math.PI);
    }

}
