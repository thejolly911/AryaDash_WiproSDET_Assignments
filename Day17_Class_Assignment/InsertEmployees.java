package Day17_Class_Assignment;
import java.sql.*;

public class InsertEmployees {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/wiprodb", "root", "Shaurya@1234");

            String query = "INSERT INTO employee VALUES (?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query);

            Object[][] employees = {
                    {1, "John", "HR", 45000.0},
                    {2, "David", "IT", 65000.0},
                    {3, "Michael", "Finance", 55000.0},
                    {4, "Sophia", "Testing", 48000.0},
                    {5, "Emma", "IT", 72000.0}
            };

            for (Object[] emp : employees) {
                ps.setInt(1, (Integer) emp[0]);
                ps.setString(2, (String) emp[1]);
                ps.setString(3, (String) emp[2]);
                ps.setDouble(4, (Double) emp[3]);

                ps.executeUpdate();
            }

            System.out.println("5 Employee Records Inserted");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
