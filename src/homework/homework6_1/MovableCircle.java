package homework.homework6_1;

public class MovableCircle extends MovablePoint implements Movable{

    private int radius;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed,int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public void moveDown() {
        super.moveDown();
    }

    public void moveUp() {
        super.moveUp();
    }

    public void moveLeft() {
        super.moveLeft();
    }

    public void moveRight() {
        super.moveRight();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
