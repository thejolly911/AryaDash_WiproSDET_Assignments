package Day17_Class_Assignment;
import java.sql.*;

public class CRUDOperations {
    static Connection con;
    public static void main(String[] args) {

        try {
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/wiprodb","root","Shaurya@1234");

            insertEmployee();
            readEmployee();
            updateEmployee();
            deleteEmployee();

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    static void insertEmployee() throws Exception {

        String query =
                "INSERT INTO employee VALUES (10, 'Chris', 'IT', 60000)";

        Statement st = con.createStatement();

        st.executeUpdate(query);

        System.out.println("Employee Inserted");
    }
    
    static void readEmployee() throws Exception {

        String query = "SELECT * FROM employee";

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name"));
        }
    }

    static void updateEmployee() throws Exception {

        String query =
                "UPDATE employee SET salary=70000 WHERE id=10";

        Statement st = con.createStatement();

        st.executeUpdate(query);

        System.out.println("Employee Updated");
    }

    static void deleteEmployee() throws Exception {

        String query = "DELETE FROM employee WHERE id=10";

        Statement st = con.createStatement();

        st.executeUpdate(query);

        System.out.println("Employee Deleted");
    }
}