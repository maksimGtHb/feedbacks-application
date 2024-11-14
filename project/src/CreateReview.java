import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateReview {


    public static void main (String[] args)
    {
        GettingIDProduct.main(new String[]{});

        String query = "INSERT INTO feedback " +
                "(author, users_text, " +
                "rating, date_time, id_product) " +
                "VALUES ("
                + "'" + CloudResult.author + "'" +  ", "
                + "'" + CloudResult.users_text + "'" + ", "
                + CloudResult.rating + ", "
                + "'" + CloudResult.date + "'" + ", "
                + CloudResult.id_product
                + ");";
        ExecuteCreation(query);

    }
    public static void ExecuteCreation (String query)
    {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = ConnectionData.getConnection();
            stmt = conn.createStatement();

            stmt.executeUpdate(query);

            System.out.println("Feedback recorded successfully.");
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        finally {
            try {
                // Close the statement
                if (stmt != null) stmt.close();

                // Close the connection
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
