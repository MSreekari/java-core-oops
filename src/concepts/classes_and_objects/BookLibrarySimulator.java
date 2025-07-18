package concepts.classes_and_objects;

class Book{
    String title;
    String author;
    boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
    public void borrowBook(){
        if(this.isAvailable){
            this.isAvailable = false;
            System.out.println(this.title + " by " + this.author + " has been successfully borrowed");
        }else{
            System.out.println(this.title + " by" + this.author + " is not available");
        }
    }
    public void returnBook(){
        if(!this.isAvailable){
            this.isAvailable = true;
            System.out.println(this.title + " by " + this.author + " has been successfully returned");
        }else{
            System.out.println(this.title + " by " + this.author + " was not borrowed. It's already available.");
        }
    }
    public void getAvailability(String title, String author){
        System.out.println("Status of " + this.title + " : "+ (isAvailable ? "Book Available" : "Book Not Available"));
    }
    public void getDetails(){
        System.out.println("Title: " + this.title + ", Author: " + this.author);
        System.out.println(isAvailable ? "Book Available" : "Book Borrowed");
    }
}
public class BookLibrarySimulator {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book("Odyssey", "Homer");
        books[1] = new Book("Carrie", "Stephen King");
        books[2] = new Book("Hamlet", "William Shakespeare");
        books[3] = new Book("Dune", "Frank Herbert");
        books[4] = new Book("Moby Dick", "Herman Melville");
        for (int i = 0; i < books.length; i++) {
            books[i].getDetails();
        }
        books[0].borrowBook();
        books[1].returnBook();
        books[2].getAvailability(books[2].title, books[2].author);
    }
}
