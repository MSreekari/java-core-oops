package concepts.encapsulation;

import java.util.Locale;

class Book{
    private String title;

    public void setTitle(String title) {
        this.title = title.toUpperCase();
    }

    public void getTitle() {
        System.out.println("Title is: " + this.title);
    }
}
public class BookAutoTitleFormatting {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("harry potter");
        book.getTitle();
    }
}
