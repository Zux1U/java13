package homework.homework2_7;

public class Book {
    private String Author;
    private String Name;
    private int Year;

    public Book(String author, String name, int year) {
        Author = author;
        Name = name;
        Year = year;
    }

    public String getAuthor() {
        return Author;
    }

    public String getName() {
        return Name;
    }

    public int getYear() {
        return Year;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setYear(int year) {
        Year = year;
    }

    @Override
    public String toString() {
        return "Bookshelf{" +
                "Author='" + Author + '\'' +
                ", Name='" + Name + '\'' +
                ", Year=" + Year +
                '}';
    }
}
