import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class databaseConnection {
    public static Connection con(){
        Connection con =null;
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/final","root","");
      } catch (Exception e) {
          
      }
      
      return con;
      
        
    }
}
