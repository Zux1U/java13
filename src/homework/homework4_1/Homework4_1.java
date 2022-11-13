package homework.homework4_1;

public class Homework4_1 {
    public static void main(String[] args) {

        Seasons season = Seasons.SUMMER;
        System.out.println(season);
        FavSeason(Seasons.AUTUMN);
        System.out.println(season.getAverageTemp());
        System.out.println(season.getDescription());
        for (Seasons season1 : Seasons.values()){
            System.out.println(season1 + " " + season1.getDescription() + " " + season1.getAverageTemp());
        }
    }

    public static void FavSeason(Seasons season) {
        switch (season) {
            case WINTER:
                System.out.println("I love winter");
                break;
            case SPRING:
                System.out.println("I love spring");
                break;
            case SUMMER:
                System.out.println("I love summer");
                break;
            case AUTUMN:
                System.out.println("I love autumn");
                break;
        }
    }
}