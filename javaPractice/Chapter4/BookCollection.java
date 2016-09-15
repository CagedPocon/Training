import java.util.*;

public class BookCollection {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        book1.setTitle("magazine");
        book2.setTitle("dictionary");
        book1.setPublishDate(new Date(System.currentTimeMillis()));
        book2.setPublishDate(new Date(0));
        Book book3 = book1.clone();
        book3.setPublishDate(new Date(10));
        List<Book> bookShelf = new ArrayList<>();
        bookShelf.add(book1);
        bookShelf.add(book2);
        bookShelf.add(book3);
        Collections.sort(bookShelf);
        for (Book book : bookShelf) {
            final String FORMAT = "Title: %-20s PublishDate: %s";
            String output = String.format(FORMAT, book.getTitle(), book.getPublishDate());
            System.out.println(output);
        }
    }
}
