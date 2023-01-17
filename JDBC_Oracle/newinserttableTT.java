import java.sql.*;  
class newinserttableTT{  
public static void main(String args[]){  
try{  
//step1 load the driver class  
Class.forName("oracle.jdbc.driver.OracleDriver");  
  
//step2 create  the connection object  
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:xe","system","manager");  
//String CREATE_TABLE_SQL="CREATE TABLE TT (id number ,TNAME VARCHAR2(45) )";
  
//step3 create the statement object  
Statement stmt=con.createStatement();  
  
//stmt.executeUpdate(CREATE_TABLE_SQL);
//System.out.println("Table created");

//step4 execute query  
stmt.execute("INSERT INTO TT VALUES (1,'xx')");
  
//step5 close the connection object  
con.close();  
  
}catch(Exception e){ System.out.println(e);}  
  
}  
} 