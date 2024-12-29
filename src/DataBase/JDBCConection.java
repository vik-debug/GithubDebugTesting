package DataBase;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JDBCConection {

	public static void main(String[] args) throws SQLException {
        //here we retrive data from database
		//adding jar mysql-connector-java-5.1.21
		String host="localhost";
	    String port="3306";
	    
	    Connection con = DriverManager.getConnection("jdbc:msql://"+host+":"+port+"/qadbt", "root", "Viki@123");
	    Statement a = con.createStatement();
	    ResultSet rs = a.executeQuery("select * from Employeeinfo where name='sam'");
	   
	    while(rs.next()) {
	    	
	    System.out.println(rs.getString("location"));
	    }
	}

}
