package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteQuery {

	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the empId that row you want to delete");
		int EmpId=sc.nextInt();
		
//		int EmpId=175;
		// register
		Class.forName("com.mysql.cj.jdbc.Driver");
       
		// create con
	 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_tast1_1_first","root","root");
		PreparedStatement ps=  con.prepareStatement("delete from empyloyee where EmpId=?");
		ps.setInt(1,EmpId);
	 int i=	ps.executeUpdate();
		if(i>0)
		{
			System.out.println("Delete data Succsfully");
		}
		else {
			System.out.println("delete failed");
		}
		con.close();
	}

}
