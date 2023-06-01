package JDBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Flipkartinser
{
	public static void main(String[] args) throws SQLException 
	{
		Connection connection = null;
		try
		{
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
		 connection =DriverManager.getConnection("Jdbc:mysql://rmgtestingserver:3333/projects","root@%","root");
			Statement statement = connection.createStatement();
			String Query=" insert into project values('TY_PROJ_1428','jyothi','12/05/2023','Meesho','On Going',5)";
			int result = statement.executeUpdate(Query);
			if(result==1)
			{
				System.out.println("data is added");
			}
			else
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
