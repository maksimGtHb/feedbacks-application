import java.util.Scanner;

public class EntryName {

    public static String NameInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Now your name is: ");
        return input.nextLine().trim().replace("'", "''");
    }

    public static void main(String[] args) {
        String receivedName = EntryName.NameInput();
        CloudResult.getName(receivedName);
    }
}

