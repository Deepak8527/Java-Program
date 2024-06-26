package UpdateCreateDelete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpateDemo {
	public static void main(String[] args) throws Exception
	{
		
		String city = "Mumbai";
		String email = "deepak@gmail.com";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "root");
		PreparedStatement ps = con.prepareStatement("update register set city=? where email=?");
		ps.setString(1, city);
		ps.setString(2, email);
		
		int count = ps.executeUpdate();
		if(count > 0)
		{
			System.out.println("update successfully");
		}
		else
		{
			System.out.println("fail");
		}
	}
}
