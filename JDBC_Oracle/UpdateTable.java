import java.sql.*;  

class UpdateTable
{  
	public static void main(String args[])
	{  
		try
		{ 	
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");  
  			Statement stmt=con.createStatement(); 
			stmt.executeUpdate("update tjdbc set id=100 where name='rohit'");
	 		con.close(); 
		}
		catch(Exception e)
		{ System.out.println(e);}  
  
	}  
} 