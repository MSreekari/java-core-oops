package concepts.scenarios;

import java.util.Scanner;

class Movie{
    private String title;
    private int totalSeats;
    private int bookedSeats;

    public Movie(String title, int totalSeats) {
        this.title = title;
        this.totalSeats = totalSeats;
    }

    public String getTitle() {
        return title;
    }
    public int getTotalSeats() {
        return totalSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        if(bookedSeats > 0){
            this.bookedSeats = bookedSeats;
        }else{
            System.out.println("Cannot set booked seats!");
        }
    }

    public int getBookedSeats() {
        return bookedSeats;
    }
}
class TicketBooking extends Movie{

    public TicketBooking(String title, int totalSeats) {
        super(title, totalSeats);
    }

    public int getAvailableSeats(){
        return getTotalSeats() - getBookedSeats();
    }

    public void bookTickets(int n){
        if (n> 0 && n <= getAvailableSeats()){
            int newBookedSeats = getBookedSeats() + n;
            setBookedSeats(newBookedSeats);
            System.out.println(n + " tickets booked for " + getTitle() + " successfully.");
        }else{
            System.out.println("Booking failed. Not enough available seats.");
        }
    }
}
public class MovieBookTicketing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TicketBooking ticketBooking = new TicketBooking("F1: The Movie", 50);
        System.out.println("Movie booking tickets for " + ticketBooking.getTitle());
        System.out.println("Total Seats: " + ticketBooking.getTotalSeats());
        System.out.println("---------------------------------");
        System.out.print("No. of tickets to be booked: ");
        int seats = input.nextInt();
        ticketBooking.bookTickets(seats);
        System.out.println("Total Seats: " + ticketBooking.getAvailableSeats());
        input.close();
    }
}
