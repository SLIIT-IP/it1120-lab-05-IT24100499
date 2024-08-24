import java.util.Scanner;

public class IT24100499Lab5Q3 {
    public static final double ROOM_CHARGERS_FOR_A_DAY = 48000.00;
    public static final double DISCOUNT_3_4_DAYS = 0.10;
    public static final double DISCOUNT_5_OR_MORE = 0.20;

    public static void main(String[] args) {
        // Getting the inputs from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt to get the inputs from the user
        System.out.println("Enter the starting date: ");
        int startdate = scanner.nextInt();

        System.out.println("Enter the end date: ");
        int enddate = scanner.nextInt();

        // Validation of the entered dates by the user
        if (startdate < 1 || startdate > 31 || enddate < 1 || enddate > 31) {
            System.out.println("Error: Dates must be between 1 and 31.");
            return;
        }

        if (startdate >= enddate) {
            System.out.println("Error: The start date must be less than the end date.");
            return;
        }

        // Calculating the number of days reserved
        int numberofdates = enddate - startdate + 1;

        // Calculating the total amount without the discount
        double total = numberofdates * ROOM_CHARGERS_FOR_A_DAY;

        // Determine the discount rate
        double discount = 0.0;
        if (numberofdates >= 3 && numberofdates <= 4) {
            discount = DISCOUNT_3_4_DAYS;
        } else if (numberofdates >= 5) {
            discount = DISCOUNT_5_OR_MORE;
        }

        // Calculating the discount and the total amount with the discount
        double discountamount = total * discount;
        double finalamount = total - discountamount;

        // Print the final amount
        System.out.println("Total amount is, RS " + finalamount);

    }
}
