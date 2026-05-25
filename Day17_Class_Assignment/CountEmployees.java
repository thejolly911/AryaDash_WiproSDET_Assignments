package Day17_Class_Assignment;
import java.sql.*;

public class CountEmployees {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/wiprodb", "root", "Shaurya@1234");

            String query = "SELECT COUNT(*) AS total FROM employee";

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

            if (rs.next()) {
                System.out.println("Total Employees: " +
                        rs.getInt("total"));
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}