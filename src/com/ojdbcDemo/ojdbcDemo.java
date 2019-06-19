package com.ojdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ojdbcDemo {
public static void main(String[] args){
	
	try{DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.99.100:32769:xe","SYSTEM","oracle");
	Statement statement = conn.createStatement();
	int update = statement.executeUpdate(" insert into test values(1,'aysegul','karahancer') ");
	System.out.println(update + "row(s) updated/inserted");
	
	}
	catch(SQLException e){
		
		e.printStackTrace();
		
	}
	
}
}
