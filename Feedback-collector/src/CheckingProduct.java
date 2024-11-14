import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CheckingProduct {
    public static void main(String[] args) {

        String receivedProduct = EntryProduct.ProductInput();
        boolean exists = CheckQuery(receivedProduct);

        while (!exists) {
            System.out.println("There is no such product, please enter the exact name of the product.");
            receivedProduct = EntryProduct.ProductInput();
            exists = CheckQuery(receivedProduct);
        }

        System.out.println("You have chosen: " + receivedProduct);
        CloudResult.getProduct(receivedProduct);
    }

    public static boolean CheckQuery(String product) {
        String query = "SELECT EXISTS (SELECT 1 FROM product WHERE title = ?);";

        try (
                Connection conn = ConnectionData.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(query)
        ) {
            pstmt.setString(1, product.trim());
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                return rs.getBoolean(1);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}




