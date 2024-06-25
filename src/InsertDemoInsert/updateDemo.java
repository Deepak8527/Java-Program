package InsertDemoInsert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class updateDemo{
	
 public static void main(String[] args) throws Exception
 {
	String station = "Narari";
	String name = "deepak";
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/family", "root", "root");
	PreparedStatement ps = cn.prepareStatement("update family_name set station=? where name=?");
	ps.setString(1, station);
	ps.setString(2, name);
	
	int i = ps.executeUpdate();
	if(i>0)
	{
		System.out.println("success update");
	}
	else
	{
		System.out.println("update fail");
	}
}
}
