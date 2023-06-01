package JDBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Insertdataintomysqldatabase 
{
	public static void main(String[] args) throws SQLException 
	{
		Connection connection=null;
		try 
		{
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			connection = DriverManager.getConnection("Jdbc:mysql://localhost:3306/Jyothi","root","root");//Jyothi dbname,username, password(root)
			Statement statement = connection.createStatement();
			String Query=" insert into jyothimb values(9,'Ritu',42000,10,012)";
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

