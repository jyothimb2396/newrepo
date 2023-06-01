package JDBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import com.mysql.jdbc.Driver;

public class Flipkartfetch
{
	public static void main(String[] args) throws SQLException
	{
		Connection connection = null;
		String  project_name="Amazon";
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			connection = DriverManager.getConnection("Jdbc:mysql://rmgtestingserver:3333/projects","root@%","root");
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery("select * from Project");
		boolean flag =false;
		while(result.next())
		{
			String data = result.getString(2);
			System.out.println(data);
			if(data.contains(project_name))
			{
				System.out.println("data is present");
				flag=true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println("data is absent");
		}
		}
		finally
		{
			connection.close();
			
		}
		
	}

}
