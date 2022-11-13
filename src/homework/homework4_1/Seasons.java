package homework.homework4_1;

public enum Seasons {
    WINTER(-15),
    SPRING(5),
    SUMMER(20)
            { @Override public String getDescription(){
                return "warm season";
        }
    },
    AUTUMN(7);

    private int AverageTemp;
    Seasons(int AverageTemp){
        this.AverageTemp = AverageTemp;
    }

    public int getAverageTemp() {
        return AverageTemp;
    }

    public String getDescription(){
        return "cold season";
    }
}
