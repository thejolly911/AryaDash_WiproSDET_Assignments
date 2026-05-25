package Day17_Class_Assignment;
import java.sql.*;

public class FetchSalary {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/wiprodb", "root", "Shaurya@1234");

            String query = "SELECT * FROM employee WHERE salary > 50000";

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                        rs.getString("name") + " " +
                        rs.getDouble("salary"));
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
