package homework.homework6_6_7_8_9;

public class Book implements Printable{
    private String nameBook;

    public Book(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public void print() {
        System.out.println("Book is "+ getNameBook());
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                '}';
    }
}
