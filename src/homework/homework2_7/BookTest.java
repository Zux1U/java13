package homework.homework2_7;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("Gogol","Dead soul",1835);
        Book book2 = new Book("Dostoevskiy","Idiot",1868);
        Book book3 = new Book("Bulgakov","The master and margarita",1940);
        Bookshelf bookshelf = new Bookshelf();
        bookshelf.addBook(book1);
        bookshelf.addBook(book2);
        bookshelf.addBook(book3);
        System.out.println(bookshelf);
        System.out.println(bookshelf.getCountBook());
    }
}
