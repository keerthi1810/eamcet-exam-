package keerthi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class connection {
      public static Connection connect(){
    	  Connection con = null;
    	  try{
    		  Class.forName("org.sqlite.JDBC");
    		  con = DriverManager.getConnection("jdbc:sqlite:studentlogin.db");
    		  System.out.print("Connected");
    	  }catch(ClassNotFoundException | SQLException e){
    		  System.out.print(e+"");
    	  }
    	  return con;
      }

	public static void connect() {
		// TODO Auto-generated method stub
		
	}

	public static PreparedStatement prepareStatement(String journalquery) {
		// TODO Auto-generated method stub
		return null;
	}
}
