import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    // Either use URL with embedded credentials:
    private static final String URL = "postgresql://postgres.jxahlvgkxxmwnwoxaxja:[Ganesh123@]@aws-0-ap-south-1.pooler.supabase.com:6543/postgres";
    private static final String USER = "postgres.jxahlvgkxxmwnwoxaxja";
    private static final String PASSWORD = "Ganesh123@";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}