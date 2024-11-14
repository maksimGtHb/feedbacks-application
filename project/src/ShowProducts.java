import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ShowProducts {

    public static void main (String[] args)
    {

        String query = "SELECT * from product;";
        ExecuteQuery(query);
        System.out.println();

    }
    public static void ExecuteQuery(String query){

        Connection conn = null;
        Statement stmt = null;

        try {
            conn = ConnectionData.getConnection();

            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("Here are all the products: ");

            while(rs.next()){
                int id = rs.getInt("ID");
                String title = rs.getString("title");
                System.out.println(title);
            }
            rs.close();
        }

        catch (SQLException se){
                se.printStackTrace();
        }
        finally {
            try{
                if (stmt!=null) stmt.close();
                if (conn!=null) conn.close();
            }

            catch (SQLException se)
            {
                se.printStackTrace();
            }
        }
    }
}
