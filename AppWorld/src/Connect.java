

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Connect {
	
	public static void main(String [] args) throws Exception{
		
		getConnection();
//		createTable();
	}
//	
//	public static void createTable() throws Exception {
//		
//		try{
//			Connection con = getConnection();
//			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS tablename(username varchar(255), password varchar(255)");
//			create.executeUpdate();
//			
//		} catch (Exception e ){ System.out.println(e);}
//		finally {System.out.println("Table has been created");}
//	}

	public static Connection getConnection() throws Exception {
		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/User";
			String username = "root";
			String password = "root";
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url,username,password);
			System.out.println("You good so far");
			return conn;
		} catch (Exception e ){System.out.println(e);}
		
		
		
		return null;
	}
}