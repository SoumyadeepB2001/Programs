import java.sql.*;  

class DeleteTable
{  
	public static void main(String args[])
	{  
		try
		{ 	
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");  
  			Statement stmt=con.createStatement(); 
			stmt.executeUpdate("drop table newtablejdbc");
                    
	 		con.close(); 
		}
		catch(Exception e)
		{ System.out.println(e);}  
  
	}  
} 