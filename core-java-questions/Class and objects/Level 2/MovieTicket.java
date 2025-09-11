import java.util.Scanner;

class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    MovieTicket(String movie) {
        movieName = movie;
        seatNumber = -1;  // not booked yet
        price = 0;
    }

    void bookTicket(int seat, double p) {
        seatNumber = seat;
        price = p;
        System.out.println("Ticket booked successfully!");
    }

    void displayTicket() {
        if (seatNumber == -1) {
            System.out.println("No ticket booked yet.");
        } else {
            System.out.println("Movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: " + price);
        }
    }
}

public class MovieTicketDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Movie Name: ");
        String movie = sc.nextLine();

        MovieTicket ticket = new MovieTicket(movie);

        System.out.print("Enter Seat Number: ");
        int seat = sc.nextInt();

        System.out.print("Enter Ticket Price: ");
        double price = sc.nextDouble();

        ticket.bookTicket(seat, price);
        ticket.displayTicket();

        sc.close();
    }
}
