import java.sql.*;
class displayData
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
			
			stmt.execute("INSERT INTO Employee VALUES(1, 'Raj', 20000, 'Kolkata', 'IT')");
			stmt.execute("INSERT INTO Employee VALUES(2, 'Raja', 30000, 'Goa', 'IT')");
			stmt.execute("INSERT INTO Employee VALUES(3, 'Raju', 40000, 'UP', 'Finance')");
			stmt.execute("INSERT INTO Employee VALUES(1, 'Rani', 50000, 'MP', 'IT')");
			
			ResultSet rs=stmt.executeQuery("select * from Employee");
			while(rs.next())
			System.out.println(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5));
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

