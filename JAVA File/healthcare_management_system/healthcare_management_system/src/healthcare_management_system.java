import java.sql.*;

public class healthcare_management_system {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/healthcare_management_system";
            String username = "root";
            String password = ""; 
            conn = DriverManager.getConnection(url, username, password);
            
            if (conn != null) {
                System.out.println("Connected");
            } else {
                System.out.println("Not Connected");
            }

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM patient");

            while (rs.next()) {
                System.out.println(
                        "P_ID: " + rs.getInt("P_ID") +
                        ", Name: " + rs.getString("Name") +
                        ", DOB: " + rs.getString("DOB") +
                        ", AGE: " + rs.getInt("AGE") +
                        ", Gender: " + rs.getString("Gender") +
                        ", CONTACT_NUMBER: " + rs.getString("CONTACT_NUMBER") +
                        ", D_ID: " + rs.getInt("D_ID")
                );
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
        }
    }
}
