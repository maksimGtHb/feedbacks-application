import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Greeting
        System.out.println();
        System.out.println("Welcome.");
        System.out.println("Press enter if you want to leave a review about your purchased product.");


        System.out.println("Okay!");

        System.out.println();

        ShowProducts.main(new String[]{});
        CheckingProduct.main(new String[]{});
        EntryName.main(new String []{});
        EntryText.main(new String [] {});
        EntryRating.main(new String[] {});
        ShowCurrentReview.main(new String[] {});

        System.out.println("Send your feedback? Write \"yes\". Or write \"no\" to delete it.");
        System.out.println("Yes/No: ");
        boolean bool = false;


        while (!bool) {

            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("yes")) {

                bool = true;
                System.out.println("You entered yes");
                CreateReview.main(new String[]{});

            } else if (input.equals("no")) {
                bool = true;
                System.out.println("You entered no");
                //return menu

            } else {
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            }
        }


    }
}


