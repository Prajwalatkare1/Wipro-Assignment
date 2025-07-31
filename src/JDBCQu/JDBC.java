package JDBCQu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

    public static void main(String[] args) {
        // Load MySQL JDBC Driver (optional in modern JDBC)
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found: " + e.getMessage());
            e.printStackTrace();
            return; // stop if driver not found
        }

        // Connect to DB and query
        String url = "jdbc:mysql://localhost:3306/mydb?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "Mahadev@3";

        String query = "SELECT * FROM Student";

        try (
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query)
        ) {
            System.out.printf("%-5s %-15s %-5s %-15s %-7s%n", "ID", "Name", "Age", "Course", "Marks");
            System.out.println("-------------------------------------------------------------");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String course = rs.getString("course");
                double marks = rs.getDouble("marks");

                System.out.printf("%-5d %-15s %-5d %-15s %-7.2f%n", id, name, age, course, marks);
            }

        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
