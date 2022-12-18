package homework.homework19_1;

public class InnNotCorrectException extends Exception{
    private int inn;

    public InnNotCorrectException(int inn){
        super("the inn number" + inn + "is invalid");
        this.inn = inn;
    }

    public int getInn() {
        return inn;
    }
}
