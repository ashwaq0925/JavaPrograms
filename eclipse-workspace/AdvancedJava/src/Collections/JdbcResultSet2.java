package Collections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcResultSet2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ashwaq", "root", "root123");
		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

		ResultSet rs = st.executeQuery("select * from emp3");
		System.out.println("Record before update");

		while (rs.next()) 
		{
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
		}

		System.out.println("Program is going in pause state to update DB");

		
		
		System.in.read();
		
		
		rs.beforeFirst();
		System.out.println("After updating the DB");
		
		while (rs.next())
		{
			rs.refreshRow();
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
		}

		con.close();
		rs.close();

	}

}
