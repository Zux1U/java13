package homework.homework6_2;

import homework.homework6_1.Movable;


public class MovableRectangle extends MovablePoint implements Movable {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private int xSpeed;
    private int ySpeed;

    public MovableRectangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void checkSpeed(int xSpeed, int ySpeed){
        if (xSpeed == ySpeed){
            System.out.println("Speed equals");
        }
        else{
            System.out.println("Speed not equals");
        }
    }
    public void moveUp() {

    }

    public void moveDown() {

    }

    public void moveLeft() {

    }

    public void moveRight() {

    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "x1=" + x1 +
                ", x2=" + x2 +
                ", y1=" + y1 +
                ", y2=" + y2 +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
