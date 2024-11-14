
public class ShowCurrentReview {
    public static void main(String[] args) {


        System.out.println(" ");
        System.out.print(CloudResult.author + " ");
        System.out.println("about the "
                + CloudResult.str_product.toLowerCase()
                + " product:");
        System.out.println(CloudResult.users_text);
        System.out.println("Rating ⭐: " + CloudResult.rating + ". ");
        System.out.println("Time of writing: " + CloudResult.date);
        System.out.println(" ");

    }
}

