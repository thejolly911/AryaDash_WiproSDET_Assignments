package Day17_Class_Assignment;
import java.sql.*;

public class CallProcedure {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/wiprodb", "root", "Shaurya@1234");

            CallableStatement cs =
                    con.prepareCall("{call SearchEmployee(?)}");

            cs.setInt(1, 2);

            ResultSet rs = cs.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
