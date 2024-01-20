package Collections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ResultQueryJdbc 
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException 
    {
        int n=0;
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ashwaq", "root", "root123");
        Statement st = con.createStatement();

        System.out.println("Please enter your Query : ");
        Scanner sc = new Scanner(System.in);
        String sql = sc.nextLine();
        System.out.println("You have Entered " + sql);

        boolean b = st.execute(sql);

        if (b)
        {
            ResultSet rs = st.getResultSet();
            while (rs.next()) 
            {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }
        } 
        
        else 
        	
        {
            n = st.getUpdateCount();
            System.out.println(n + " Record(s) is updated");
        }
        con.close();
    }
}
