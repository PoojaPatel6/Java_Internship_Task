package javajdbc;
import java.sql.*;

public class Conn {
	public static void main(String[]args) throws ClassNotFoundException  {
		
		Class.forName("com.mysql.jdbc.Driver");
		String user = "root";
		String pass = "";
		
		try {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");

		
		
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
		
		
		//		Statement st = conn.createStatement();
		
		System.out.println("Connected");
		
	}

}
