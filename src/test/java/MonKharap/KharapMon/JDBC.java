package MonKharap.KharapMon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;

public class JDBC {
	@Test
	public static void jdbcConne() {
	try {
		 String url="jdbc:mysql://localhost:3306/abc?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		 String uname="root";
	     String pass= "nazrulchamok";
	     //get a connection
	      Connection con=DriverManager.getConnection(url,uname,pass);
	       
	      //create a statement object
	       Statement st=con.createStatement();
	       //execute query
	       ResultSet rs=st.executeQuery("select * from student");
	       //process the result set
	       while(rs.next()) {
	    	  System.out.println("student information :" +rs.getString("roll") + " " + rs.getString("sname"));
	      }
	      }catch(Exception e) {
	    	  System.out.println(e.getMessage());
	      }
	}

}
