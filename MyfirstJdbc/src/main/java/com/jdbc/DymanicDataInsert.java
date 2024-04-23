package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DymanicDataInsert {

	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee_Id ");
		int id=sc.nextInt();
		System.out.println("enter the Emp_name");
		String name=sc.next();
		System.out.println("enter the Salary");
		double sal=sc.nextDouble();
		System.out.println("Enter the Date of birth");
		int dob=sc.nextInt();
		System.out.println("enter the City_Name");
		String city=sc.next();
		
		
		// Lode and Register
	   Class.forName("com.mysql.cj.jdbc.Driver"); 
	   // create connection
	    String url="jdbc:mysql://localhost:3306/jdbc_tast1_1_first";
	    String user="root";
	    String password="root";
	 Connection con=   DriverManager.getConnection(url,user,password);
	    System.out.println("Register Succsfull");
	    //  create Satement means insert data into table
	   PreparedStatement ps=con.prepareStatement("insert into empyloyee values(?,?,?,?,?)");
	   ps.setInt(1, id);
	   ps.setString(2, name);
	   ps.setDouble(3,sal);
	   ps.setInt(4, dob);
	   ps.setString(5, city);
	   
//	   ps.executeUpdate();
	   
       int i= ps.executeUpdate();
       if(i>0)
       {
      	 System.out.println(" Insert data Succsfully");
       }
       else {
			System.out.println("fails ");
		}
	   
	   ps.close(); 
	    
	   
	}

}
