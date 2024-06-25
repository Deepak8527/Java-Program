package InsertDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Demo {
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root", "root");
		PreparedStatement ps = con.prepareStatement("insert into register values('Naj','naj@gmail.com','naj123','female','Faridabad')");
		int i = ps.executeUpdate();
		
		if(i>0)
		{
			System.out.println("success");
		}else {
			System.out.println("fail");
		}
	}
}
