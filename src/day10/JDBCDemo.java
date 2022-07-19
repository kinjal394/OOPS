package day10;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub DESKTOP-8SAJSVG\\SQLEXPRESS2019
		//create connection
		Connection con= DriverManager.getConnection("jdbc:sqlserver:thin:@DESKTOP-8SAJSVG\\\\SQLEXPRESS2019:1433;databaseName=SkyBaseDB;user=sa;password=Kinjal@123");
		
		//create a query
		Statement stmt=con.createStatement();
		String insert="insert into countryMaster values('citymaster',1)";
		//String update="update countryMaster set countryName='philipins' where countryID=1";
		//String delete="delete from countryMaster where countryID=5";
		String select="select * from countryMaster";
		
		//execute query
		stmt.executeQuery(insert);
		//connection close
		
		//execute select query
		ResultSet st= stmt.executeQuery(select);	
		
		while(st.next()) {
			int cid=st.getInt("countryID");
			String Cname=st.getString("countryName");
			System.out.println(cid + "         "+Cname);
		}
		
		con.close();
		
		System.out.println("Program completed");
	}

}
