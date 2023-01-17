import java.sql.*;  

class DeleteDataTable
{  
	public static void main(String args[])
	{  
		try
		{ 	
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");  
  			Statement stmt=con.createStatement(); 
			stmt.executeUpdate("delete from tjdbc where name='ashwin'");
                    
	 		con.close(); 
		}
		catch(Exception e)
		{ System.out.println(e);}  
  
	}  
} 