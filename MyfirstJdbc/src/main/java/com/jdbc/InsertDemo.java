package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertDemo {

	public static void main(String[] args) throws Exception
	{
		
		// dynamic
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the RegId");
		String RegId=sc.next();
		System.out.println("enter the Name");
		String name=sc.next();
		System.out.println("Enter the Gmail");
		String email=sc.next();
		System.out.println("Enter the password");
		String password1=sc.next();
		System.out.println("Enter the gender");
		String Gender=sc.next();
		
//		user data=====================================
//	    String id1="104";
//		String name1="Sudhir";
//		String email1="Sudhir@gmail.com";
//		String pass1="32457";
//		String gender="Male";
//		
		 String url="jdbc:mysql://localhost:3306/jdbc_tast1_1_first";
		 String user="root";
		 String password="root";
		
		   Class.forName("com.mysql.cj.jdbc.Driver");
           System.out.println("Lode nd register sussfully");
           Connection con =DriverManager.getConnection(url,user,password);
           System.out.println("Create connection");
          PreparedStatement ps= con.prepareStatement("insert into register values(?,?,?,?,?)");
          
          ps.setString(1, RegId);
          ps.setString(2, name);
          ps.setString(3, email);
          ps.setString(4, password1);
          ps.setString(5, Gender);
          
         int i= ps.executeUpdate();
         if(i>0)
         {
        	 System.out.println("Succsfull");
         }
         else {
			System.out.println("fails ");
		}
          ps.close();
	}

}
