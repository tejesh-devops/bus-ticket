import java.util.Scanner;

public class BusTicketBooking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Fixed bus details
        String busName = "KSRTC Express";
        int ticketPrice = 500;

        System.out.println("===== BUS TICKET BOOKING =====");
        System.out.println("Bus Name      : " + busName);
        System.out.println("Ticket Price  : ₹" + ticketPrice);
        System.out.println("------------------------------");

        // Passenger details
        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Number of Seats: ");
        int seats = sc.nextInt();

        // Fare calculation
        int totalAmount = seats * ticketPrice;

        // Booking confirmation
        System.out.println("\n===== BOOKING CONFIRMED =====");
        System.out.println("Passenger Name : " + name);
        System.out.println("Bus Name       : " + busName);
        System.out.println("Seats Booked   : " + seats);
        System.out.println("Total Amount   : ₹" + totalAmount);
        System.out.println("Status         : CONFIRMED");

        sc.close();
    }
}

