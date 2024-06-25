package InsertDemoInsert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertDemo {
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("Enter your district");
		String district = sc.next();
		System.out.println("Enter your station name ");
		String station = sc.next();
		System.out.println("Please enter your state");
		String state = sc.next();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/family", "root", "root");
		PreparedStatement ps = con.prepareStatement("insert into family_name values(?,?,?,?)");
		
		ps.setString(1,name);
		ps.setString(2,district);
		ps.setString(3,station);
		ps.setString(4,state);
		
		int i = ps.executeUpdate();
		if(i>0)
		{
			System.out.println("insert successfully");
		}
		else
		{
			System.out.println("fail");
		}
	}
}
