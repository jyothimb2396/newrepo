package JDBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class insertdata
{
	public static void main(String[] args) throws SQLException 
	{
		
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			Connection connection=DriverManager.getConnection("Jdbc:mysql://localhost:3306/Jyothi","root","root");
			Statement statement = connection.createStatement();
			String Query=" insert into jyothimb values(5,'lakshmi',42000,8,012)";
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
	}

