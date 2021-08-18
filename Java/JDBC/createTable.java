import java.sql.*;
class createTable
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			String CREATE_TABLE_SQL="CREATE TABLE Employee(eid number, ename varchar2(30), salary number, city varchar2(30), 				department varchar2(30))";
			
			Statement stmt=con.createStatement();
			
			stmt.executeUpdate(CREATE_TABLE_SQL);
			System.out.println("Table Created");
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

