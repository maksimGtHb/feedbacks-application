import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionData {

    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String user = "postgres";
    private static final String password= "2512";

    public static Connection getConnection() throws SQLException
    {
        return DriverManager.getConnection(URL, user, password);
    }
}
