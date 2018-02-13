
package school.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

class StudentLogin extends JFrame{
   // Connection con=null;
    //PreparedStatement ps=null;
   // ResultSet rs=null;

    
    static boolean setVisible;
    JLabel UserId;
    JLabel UserPassword;
    JTextField UserIdTextField;
    JTextField UserPasswordField;
    JButton login;
    JButton back;


public StudentLogin(){
        this.setTitle(" LOGIN");
       
         UserId = new JLabel("ID ");
        UserIdTextField = new JTextField();
        UserPassword = new JLabel("Password ");
        UserPasswordField = new JPasswordField();
       
        login = new JButton("Login");
        back = new JButton ("Back"); 
        
        setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLACK);
        JLabel title = new JLabel("STUDENT LOGIN");
        add(title);
        title.setBounds(520,60,550,30);
        title.setForeground(Color.YELLOW);
        title.setBackground(Color.YELLOW);
        title.setFont(new Font("Tahoma",Font.BOLD,40));
        
        add(UserId);
        UserId.setBounds(520, 200, 200, 20);
        UserId.setForeground(Color.WHITE);
        UserId.setBackground(Color.WHITE);
        
        add(UserIdTextField);
        UserIdTextField.setBounds(600, 200, 200, 20);
        
        UserId.setVisible(true);
        UserIdTextField.setVisible(true);
        add(UserPassword);
        UserPassword.setBounds(520, 240, 200, 20);
        add(UserPasswordField);
        UserPasswordField.setBounds(600, 240, 200, 20);
        UserPassword.setForeground(Color.WHITE);
        UserPassword.setBackground(Color.WHITE);
        UserPassword.setVisible(true);
        UserPasswordField.setVisible(true);
    
        add(login);
        login.setBounds(500,300,150,40);
        login.setForeground(Color.WHITE);
        login.setBackground(Color.BLUE);
        login.setFont(new Font("Tahoma",Font.BOLD,12));
        login.setVisible(true);
        
        add(back);
        back.setBounds(700,300,150,40);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.RED);
        back.setFont(new Font("Tahoma",Font.BOLD,12));
        
         back.setVisible(true);
        
        this.setSize(1500,750);
        this.setLocation(0,0);
        
     
         
        
    
            login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                 Connection conn=null;
                Statement st=null;
                try{
        
                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/sms","root","");
                st = (Statement) conn.createStatement();
   		ResultSet rs = new Database().getTableData("SELECT * FROM studentinfo");
                int x=1;
                while(rs.next()){
                    if(UserIdTextField.getText().equals(rs.getString("ID")) && UserPasswordField.getText().equals(rs.getString("password")) ){
                    //JOptionPane.showMessageDialog(null, "Congratulations!! The operation done successfully.");
                    dispose();
                    StudentHome si = new StudentHome(UserIdTextField.getText());
                    si.setVisible(true);
                    x=0;
                    break;
                    }
                }

            
                   if(x !=0)
                    {
                        JOptionPane.showMessageDialog(null,"Id and password","Error",JOptionPane.ERROR_MESSAGE);
                    }
            
               
                    }
               catch(Exception e)
               {
                   JOptionPane.showMessageDialog(null,e.getMessage());
               }
}
            });
            
            back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                new Welcome().setVisible(true);
            }
            
            
            
                });
}
}