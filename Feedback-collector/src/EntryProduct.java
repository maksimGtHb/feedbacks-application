import java.util.Scanner;


public class EntryProduct {
    public static String ProductInput(){
        Scanner input = new Scanner(System.in);
        System.out.print("Write the exact name of the your product: ");
        return input.nextLine().trim();
    }

    public static void main(String[] args) {
        String receivedProduct = EntryProduct.ProductInput();
        CloudResult.getProduct(receivedProduct);
    }
}

