package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.a.result.ResultsetRowsStatic;

public class FetchDataFromDataBase {

	public static void main(String[] args) throws Exception
	{
	
		Class.forName("com.mysql.cj.jdbc.Driver");
	       Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_tast1_1_first","root","root");
		   PreparedStatement ps =con.prepareStatement("select * from register");
		     ResultSet rs=ps.executeQuery();   
		     
		     int count=1;
		     System.out.println("Display all Data from Data base");
		     while(rs.next())
		     {
		    	 System.out.println("          "+count+"  Record Data Display           ");
		    	 System.out.println("=================================================");
		    	 int reg1=rs.getInt("RegId");
		    	 System.out.println("Register Id : "+reg1);
		    	 System.out.println( "Name : "+rs.getString("name"));
		    	 System.out.println( "Email Id : "+rs.getString("email"));
		    	 System.out.println( "Password  : "+rs.getString("password"));
		    	 System.out.println("Gender : "+rs.getString("gen"));
		    	 System.out.println("-----------'''''''''''''''''---------");
		    	 System.out.println("==========================================");
		    	 count ++;
		     }
		     
		     con.close();

	}

}
