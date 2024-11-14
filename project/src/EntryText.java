import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class EntryText {

    public static String[] TextInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please provide your feedback about this product: ");
        String text = input.nextLine().trim().replace("'", "''");
        String currentDateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        return new String[]{text, currentDateTime};
    }

    public static void main(String[] args) {

        String[] result = EntryText.TextInput();
        CloudResult.getText(result[0], result[1]);
    }
}
