package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateQuery {

	public static void main(String[] args) throws Exception
	{
	String email="simaBharti@gmail.com";
    int RegId=101;
  
		
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  String url="jdbc:mysql://localhost:3306/jdbc_tast1_1_first";
		  String user="root";
		  String password="root";
	      Connection con =	DriverManager.getConnection(url,user, password);
         PreparedStatement ps=con.prepareStatement("update register set email=? where RegId=?");
        
	       
      ps.setString(1, email);
	    	 ps.setInt(2, RegId);
		
		 ps.executeUpdate();
		 con.close();

	}

}
