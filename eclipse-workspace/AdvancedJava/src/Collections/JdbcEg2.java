package Collections;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcEg2 {

	private static final Scanner scanObj = new Scanner(System.in) ;
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection connection = connectWithDB();
		//insertRecord(connection);
		//readRecordByCarNum(connection);
		updateRecordByCarNum(connection);
		//deleteRecordByCarNum(connection);
	}

//	private static void deleteRecordByCarNum(Connection connection) throws SQLException {
//	final String deleteQuery = "DELETE FROM ashwaq.students1 WHERE id = ?";
//	System.out.println("ENter id you want to delete details...");
//	String carNumber = scanObj.next();
//	PreparedStatement preparedStmt = connection.prepareStatement(deleteQuery);
//	preparedStmt.setString(1, carNumber);
//	if(preparedStmt.executeUpdate() > 0) {
//		System.out.println("record deleted successfully");
//	}
//	connection.close();
//	}

	private static void updateRecordByCarNum(Connection connection) throws SQLException {
		final String updateQuery = "UPDATE ashwaq.students1 SET id = ? WHERE name = ?";
		System.out.println("ENter id you want to update details...");
		int id = scanObj.nextInt();
		System.out.println("enter the new name ");
		String name = scanObj.next();
		PreparedStatement preparedStmt = connection.prepareStatement(updateQuery);
		preparedStmt.setInt(1,id);
		preparedStmt.setString(2, name);
		if(preparedStmt.executeUpdate() > 0) {
			System.out.println("record updated successfully");
		}
		else {
			System.out.println("record is not updated...");
		}
		connection.close();
		
	}

	
	
//	
//	private static void readRecordByCarNum(Connection connection) throws SQLException {
//		System.out.println("ENter car number you want to see teh details...");
//		String carNumber = scanObj.next();
//		final String readQuery = "SELECT carNum, name FROM kholapurdb.carowner WHERE carNum = ?"; 
//		PreparedStatement preparedStmt = connection.prepareStatement(readQuery);
//		preparedStmt.setString(1, carNumber);
//		ResultSet resultsFromDb = preparedStmt.executeQuery();
//		for(; resultsFromDb.next();) {
//			System.out.println(resultsFromDb.getString(1)+" "+resultsFromDb.getString(2));
//		}
//		connection.close();
//	}
//
//	private static void insertRecord(Connection connection) throws SQLException {
//		final String insertQuery = "INSERT INTO kholapurdb.carowner VALUES(?,?)";
//		PreparedStatement preparedStmt = connection.prepareStatement(insertQuery);
//		System.out.println("ENter two values");
//		String value1 = scanObj.next();
//		String value2 = scanObj.next();
//		preparedStmt.setString(1, value1);
//		preparedStmt.setString(2, value2);
//		if(preparedStmt.executeUpdate() > 0) {
//			System.out.println("record inserted successfully");
//		}
//		connection.close();
//	}

	private static Connection connectWithDB() throws ClassNotFoundException, SQLException {
		final String userName = "root";
		final String password = "root123"; 
		final String connectionUrl = "jdbc:mysql://127.0.0.1:3306?user=root";
		Class.forName("com.mysql.jdbc.Driver");
		Connection establishConn = DriverManager.getConnection(connectionUrl, userName, password);
		return establishConn;
	}

}