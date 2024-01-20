package Collections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExctiveEx {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ashwaq", "root", "root123");
            Statement st = con.createStatement();

            st.addBatch("insert into emp3 values(1,'ashuu',12000)");
            st.addBatch("insert into emp3 values(2,'ironman',32000)");
            st.addBatch("insert into emp3 values(3,'hulk',22000)");

            int[] updateCounts = st.executeBatch();

            for (int updateCount : updateCounts) {
                System.out.println("Rows Affected: " + updateCount);
            }

            // Close the statement and connection
            st.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
