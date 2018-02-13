
package school.management.system;
import java.awt.Color;
import java.awt.Font;
//import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
//import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
//import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
//import javax.swing.JPasswordField;

public class Staffhome extends JFrame {
   
    static boolean setVisible;
    JLabel Name;
    JLabel Id;
    JLabel Phonenumber;
    JLabel Address;
    JLabel fname;
    JLabel mname;
    JLabel Cgpa;
    
    JLabel a;
    JLabel b;
    JLabel c;
    JLabel d;
    JLabel e;
    JLabel f;
    JLabel g;
    
    JButton back;

 public  Staffhome (String id){
        
        JLabel title = new JLabel("Home");
        add(title);
        title.setBounds(520,50,550,30);
        title.setForeground(Color.YELLOW);
        title.setBackground(Color.YELLOW);
        title.setFont(new Font("Tahoma",Font.BOLD,30));
    
       Name = new JLabel("NAME:");
       Name.setBounds(500,100,300,70);
       Name.setForeground(Color.WHITE);
       Name.setBackground(Color.WHITE);
       add(Name);
       
       a= new JLabel("name");
        a.setBounds(700,100,300,70);
        a.setForeground(Color.WHITE);
        a.setBackground(Color.WHITE);
        a.setFont(new Font("Tahoma",Font.BOLD,15));
       add( a);
       
       
      
        Id = new JLabel("ID:");
       Id.setBounds(500,150,300,70);
       Id.setForeground(Color.WHITE);
       Id.setBackground(Color.WHITE);
       add(Id);
       
       b= new JLabel("id");
        b.setBounds(700,150,300,70);
        b.setForeground(Color.WHITE);
        b.setBackground(Color.WHITE);
        b.setFont(new Font("Tahoma",Font.BOLD,15));
       add( b);
       
      
      
       
       
       Phonenumber= new JLabel("Phone Number:");
        Phonenumber.setBounds(500,200,300,70);
        Phonenumber.setForeground(Color.WHITE);
        Phonenumber.setBackground(Color.WHITE);
       add( Phonenumber);
       
       c= new JLabel("mobile");
        c.setBounds(700,200,500,70);
        c.setForeground(Color.WHITE);
        c.setBackground(Color.WHITE);
        c.setFont(new Font("Tahoma",Font.BOLD,15));
       add( c);
       
       
       
     
       Cgpa = new JLabel("Time:");
       Cgpa.setBounds(500,250,250,70);
       Cgpa.setForeground(Color.WHITE);
       Cgpa.setBackground(Color.WHITE);
       add(Cgpa);
       
       d= new JLabel("timming");
        d.setBounds(700,250,250,70);
        d.setForeground(Color.WHITE);
        d.setBackground(Color.WHITE);
        d.setFont(new Font("Tahoma",Font.BOLD,15));
       add( d);
       
        fname = new JLabel("Place:");
       fname.setBounds(500,300,300,70);
       fname.setForeground(Color.WHITE);
       fname.setBackground(Color.WHITE);
       add(fname);
       
       e= new JLabel("place");
        e.setBounds(700,300,300,70);
        e.setForeground(Color.WHITE);
        e.setBackground(Color.WHITE);
        e.setFont(new Font("Tahoma",Font.BOLD,15));
       add( e);
        mname = new JLabel("Salary:");
       mname.setBounds(500,350,300,70);
       mname.setForeground(Color.WHITE);
       mname.setBackground(Color.WHITE);
       add(mname);
       
       f= new JLabel("Salary");
        f.setBounds(700,350,300,70);
        f.setForeground(Color.WHITE);
        f.setBackground(Color.WHITE);
        f.setFont(new Font("Tahoma",Font.BOLD,15));
       add( f);
        Address = new JLabel("Position:");
       Address.setBounds(500,400,300,70);
       Address.setForeground(Color.WHITE);
       Address.setBackground(Color.WHITE);
       add(Address);
       
        g= new JLabel("position");
        g.setBounds(700,400,300,70);
        g.setForeground(Color.WHITE);
        g.setBackground(Color.WHITE);
        g.setFont(new Font("Tahoma",Font.BOLD,15));
        add( g);
        
        this.setTitle(" Home");
        setLayout(null);
        getContentPane().setBackground(Color.BLACK);
        this.setSize(1500,750);
        this.setLocation(0,0);
        
        back=new JButton(" Logout");
       back.setBounds(990,10,90,35);
       back.setForeground(Color.WHITE);
       back.setBackground(Color.RED);
       add(back);
        
       back.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                new StaffLogin().setVisible(true);
            }
       });
          
    try{
       
            ResultSet rs = new Database().getTableData("SELECT * FROM staffinfo WHERE id = "+id);
            if(rs.next()){
                    a.setText(rs.getString("NAME"));
                    b.setText(rs.getString("ID"));
                    c.setText(rs.getString("Mobile"));
                    d.setText(rs.getString("timming"));
                    e.setText(rs.getString("place"));
                    f.setText(rs.getString("Salary"));
                    g.setText(rs.getString("position"));
                   
                   
                  
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
            
        }
          
 }
}
