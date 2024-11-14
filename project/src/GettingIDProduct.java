import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GettingIDProduct {

    public static void main(String[] args) {

        String getProduct = CloudResult.str_product;
        String query = "SELECT \"ID\" FROM product WHERE LOWER(title) = LOWER(?)";

        // Call the method to get the ID
        GettingID(query, getProduct);
    }

    public static void GettingID(String query, String title) {

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // Get database connection
            conn = ConnectionData.getConnection();

            // Prepare the statement to prevent SQL injection
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, title); // Set the title parameter

            // Execute the query
            rs = pstmt.executeQuery();

            // Iterate through the result set
            while (rs.next()) {
                int id = rs.getInt("ID");
                CloudResult.get_id_product(id);
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            // Close the ResultSet, PreparedStatement, and Connection
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
