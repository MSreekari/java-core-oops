package concepts.inheritance;

class Book{
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(this.title == null) {
            System.out.println("Title is null");
        }else{
            this.title = title;
        }
    }

    public String getAuthor() {
        return author;
    }

    public void getBook(){
        System.out.println("Book title: " + title);
        System.out.println("Book author: " + author);
    }
}
class EBook extends Book{
    private int fileSize;

    public EBook(String title, String author, int fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    public int getFileSize() {
        return fileSize;
    }

    @Override
    public void getBook() {
        super.getBook();
        System.out.println("File size: " + fileSize);
    }
}
public class EBookSimulator {
    public static void main(String[] args) {
        Book book = new Book("Harry Potter", "JK Rowling");
        book.getBook();
        EBook eBook = new EBook("Moby Dick", "Herman Melville", 500);
        eBook.getBook();
    }
}
