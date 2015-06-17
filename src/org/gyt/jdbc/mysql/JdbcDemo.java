package org.gyt.jdbc.mysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JdbcDemo {


	public static void main(String[] args) {
		Connection connection =null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "mysql");
			if(connection!=null){
				System.out.println("Connection successfull");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
			System.out.println("Exception in creating connection.");
		}
		Statement statement = null;
		try {
			statement = connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet rs=null;
		try {
			rs = statement.executeQuery("select * from person");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println("| _id | name    | address | addmission_date |");
			while(rs.next()){
				
				System.out.println(rs.getString("_id")+" "+rs.getString("name")+" "+rs.getString("address")+" "+rs.getString("addmission_date")+"\n");
				
			}
			rs.updateString("name", "sandeep singh");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}
}
