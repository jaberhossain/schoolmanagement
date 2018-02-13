package school.management.system;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Database {

    static ResultSet ConnectDB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    Connection conn=null;
    Statement st=null;
    Database(){
        try{
        
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/sms","root","");
            st = (Statement) conn.createStatement();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    public ResultSet getTableData(String sql){
        ResultSet rs=null;
        try{
            rs = st.executeQuery(sql);
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
         return rs;
    }
    public void theQuery(String sql){
        try{
            st = (Statement) conn.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Congratulations!! The operation done successfully.");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    
}
