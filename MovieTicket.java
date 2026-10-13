import java.util.Scanner;
class MovieTicket {
    private String movieName;
    private double ticketPrice;
    private int numberOfTickets;
    private double totalAmount;
    private double discount;
    private double finalAmount;
    public MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }
    public void calculateTotal() {
        this.totalAmount = this.ticketPrice * this.numberOfTickets;
    }
    public void calculateDiscount() {
        if (this.numberOfTickets >= 5) {
            this.discount = this.totalAmount * 0.10;
        } else {
            this.discount = 0.0;
        }
    }
    public void calculateFinalAmount() {
        this.finalAmount = this.totalAmount - this.discount;
    }
    public void displayBill() {
        System.out.println("\n----- BOOKING BILL -----");
        System.out.println("Movie Name: " + this.movieName);
        System.out.printf("Ticket Price: %.2f\n", this.ticketPrice);
        System.out.println("Number of Tickets: " + this.numberOfTickets);
        System.out.printf("Total Amount: %.2f\n", this.totalAmount);
        System.out.printf("Discount Offered: %.2f\n", this.discount);
        System.out.printf("Final Amount to Pay: %.2f\n", this.finalAmount);
        System.out.println("------------------------");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Reading input values from the user
        System.out.print("Enter Movie Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Ticket Price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter Number of Tickets: ");
        int tickets = scanner.nextInt();
        // Creating the MovieTicket object using the parameterized constructor
        MovieTicket booking = new MovieTicket(name, price, tickets);
        // Invoking required calculation and display methods
        booking.calculateTotal();
        booking.calculateDiscount();
        booking.calculateFinalAmount();
        booking.displayBill();
        scanner.close();
    }
}