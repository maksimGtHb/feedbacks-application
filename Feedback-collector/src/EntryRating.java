import java.util.Scanner;

public class EntryRating {

    public static int RatingInput() {
        Scanner input = new Scanner(System.in);
        int inRate;

        while (true) {
            System.out.print("Please provide your rating ⭐ (1 to 5): ");
            inRate = input.nextInt();

            if (inRate >= 1 && inRate <= 5) {
                break;
            } else {
                System.out.println("Invalid input. Rating must be between 1 and 5.");
            }
        }
        return inRate;
    }

    public static void main(String[] args) {
        int receivedRating = RatingInput();
        CloudResult.getRating(receivedRating);
    }
}

