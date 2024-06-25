package InsertDemoInsert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class getdata
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
		PreparedStatement ps = con.prepareStatement("select * from register");
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			String name = rs.getString("name");
			System.out.println(name);
			
			String email = rs.getString("email");
			System.out.println(email);
			
			String password = rs.getString("password");
			System.out.println(password);
			
			String Gender = rs.getString("Gender");
			System.out.println(Gender);
			
			String city = rs.getString("city");
			System.out.println("-------------------------");
		}
		con.close();
	}
}
