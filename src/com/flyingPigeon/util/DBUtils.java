package com.flyingPigeon.util;
import java.sql.*;

public class DBUtils {
  public static String USER = "root";
  public static String PWD = "123" ; 
  public static String URL="jdbc:MySQL://localhost:3306/" ; 

  public static	Connection getConnection()
  {
	  
	  Connection conn = null; 
	  
	  try {
		  
		  Class.forName("com.mysql.jdbc.Driver");
		  conn = DriverManager.getConnection(URL,USER,PWD);
		      
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("数据库连接失败！");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("com.mysql.jdbc.Driver 类没找到");
	}
	return conn;	  
	  
  }
	
	
}
