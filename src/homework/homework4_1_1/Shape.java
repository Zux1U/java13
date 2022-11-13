package homework.homework4_1_1;

class Shape {

    private double length;
    private double width;
    private String type;

    public Shape(double length, double width,String type) {
        this.length = length;
        this.width = width;
        this.type = type;
    }

    public double getArea(){
        return length*width;
    }

    public double getPerimeter(){
        return (2*length + 2*width);
    }
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "length=" + length +
                ", width=" + width +
                ", type='" + type + '\''
                ;
    }
}

class Rectangle extends Shape{

    public Rectangle(double length, double width,String type) {
        super(length,width,type);
    }

    @Override
    public double getArea() {
        System.out.print("Rectangle area: ");
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        System.out.print("Rectangle perimeter: ");
        return super.getPerimeter();
    }

    @Override
    public String getType() {
        System.out.print("Rectangle type: ");
        return super.getType();
    }

    @Override
    public String toString() {
        return "Rectangle have: " + super.toString();
    }
}

class Square extends Shape{

    public Square(double length, double width,String type) {
        super(length,width,type);
    }

    @Override
    public double getArea() {
        System.out.print("Square area: ");
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        System.out.print("Square perimeter: ");
        return super.getPerimeter();
    }

    @Override
    public String getType() {
        System.out.print("Square type: ");
        return super.getType();
    }

    @Override
    public String toString() {
        return "Square have: " + super.toString();
    }
}

class Tester{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(6.3,7,"rectangle");
        Square s1 = new Square(4,6.3,"square");
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println(r1.toString());
        System.out.println();
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.toString());

    }
}
