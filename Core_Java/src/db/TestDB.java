package db;	
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDB {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1. register drive
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2. getConnection(url,un,psw)
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
		
		//===============================insert sql================================
		/*
		 * 1. write sql
		 * 2. create statement/prepared statement
		 * 3. execute/execute query
		 * 4. close db (not necessarily needed)
		 */
		
//		String sql = "insert into user(username,password)values('nil','1234')";
//		Statement stm = con.createStatement();
//		stm.execute(sql);
//		con.close();
		
	//===================== delete sql ================================
		
//		String sql = "delete from user where id = 1";
//		Statement stm = con.createStatement();
//		stm.execute(sql);
//		System.out.println("delete sucess");
		
	//=================== update sql ==================================
		
//		String sql = "update user set password = 'test' where id = 2";
//		Statement stm = con.createStatement();
//		stm.execute(sql);
//		System.out.println("Update sucess");
		
		
	//===================== Select sql ===================================
		
		String sql = "select * from user";
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println("Id = "+rs.getInt("id"));
			System.out.println("UserName = "+rs.getString("username"));
			System.out.println("Password = "+rs.getString("password"));
			System.out.println("===================");
			
		}
		
		
	}
}
