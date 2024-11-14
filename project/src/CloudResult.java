public class CloudResult {

    public static String author;
    public static String str_product;
    public static String users_text;
    public static int rating;
    public static String date;
    public static int id_product;


    public static void getText(String receivedText, String receivedDateTime) {
        users_text = receivedText;
        date = receivedDateTime;
    }

    public static void getName(String receivedName){
        author = receivedName;
    }

   public static void getProduct(String receivedProduct){
        str_product = receivedProduct;
    }

    public static void getRating(int receivedRating) {
        rating = receivedRating;
    }

    public static void get_id_product(int received_id_product){
        id_product = received_id_product;
    }
}



