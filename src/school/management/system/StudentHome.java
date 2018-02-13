
package school.management.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class StudentHome extends JFrame {
   
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
    JLabel h;
    JLabel i;
   
    JButton sb;
    JButton Em;
   
  public  StudentHome (String id){
        
        JLabel title = new JLabel("Home");
        add(title);
        title.setBounds(520,50,550,30);
        title.setForeground(Color.YELLOW);
        title.setBackground(Color.YELLOW);
        title.setFont(new Font("Tahoma",Font.BOLD,30));
    
       Name = new JLabel("STUDENT NAME:");
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
       
       
      
        Id = new JLabel("Student ID:");
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
       
       c= new JLabel("Phone_Number");
        c.setBounds(700,200,500,70);
        c.setForeground(Color.WHITE);
        c.setBackground(Color.WHITE);
        c.setFont(new Font("Tahoma",Font.BOLD,15));
       add( c);
       
       
       
     
       Cgpa = new JLabel("Cgpa:");
       Cgpa.setBounds(500,250,250,70);
       Cgpa.setForeground(Color.WHITE);
       Cgpa.setBackground(Color.WHITE);
       add(Cgpa);
       
       d= new JLabel("Cgpa");
        d.setBounds(700,250,250,70);
        d.setForeground(Color.WHITE);
        d.setBackground(Color.WHITE);
        d.setFont(new Font("Tahoma",Font.BOLD,15));
       add( d);
       
        fname = new JLabel("Father Name:");
       fname.setBounds(500,300,300,70);
       fname.setForeground(Color.WHITE);
       fname.setBackground(Color.WHITE);
       add(fname);
       
       e= new JLabel("Father_Name");
        e.setBounds(700,300,300,70);
        e.setForeground(Color.WHITE);
        e.setBackground(Color.WHITE);
        e.setFont(new Font("Tahoma",Font.BOLD,15));
       add( e);
        mname = new JLabel("Mother Name:");
       mname.setBounds(500,350,300,70);
       mname.setForeground(Color.WHITE);
       mname.setBackground(Color.WHITE);
       add(mname);
       
       f= new JLabel("Mother_Name");
        f.setBounds(700,350,300,70);
        f.setForeground(Color.WHITE);
        f.setBackground(Color.WHITE);
        f.setFont(new Font("Tahoma",Font.BOLD,15));
       add( f);
        Address = new JLabel("Address:");
       Address.setBounds(500,400,300,70);
       Address.setForeground(Color.WHITE);
       Address.setBackground(Color.WHITE);
       add(Address);
       
        g= new JLabel("Address");
        g.setBounds(700,400,300,70);
        g.setForeground(Color.WHITE);
        g.setBackground(Color.WHITE);
        g.setFont(new Font("Tahoma",Font.BOLD,15));
        add( g);
        
        this.setTitle("STUDENT INFORMATION ");
        setLayout(null);
        getContentPane().setBackground(Color.BLACK);
        this.setSize(1500,750);
        this.setLocation(0,0);
        
       
        
       sb=new JButton(" Logout");
       sb.setBounds(990,10,90,35);
       sb.setForeground(Color.WHITE);
       sb.setBackground(Color.RED);
       add(sb);
        String [] emailStrings= {"","Alom Ahmed","Marzia Bagom","Enayet Ullah"};
       JComboBox cmbEmailList= new JComboBox(emailStrings);
        h = new JLabel("");
        cmbEmailList.setSelectedIndex(0);
        cmbEmailList.setVisible(true);
        cmbEmailList.setBounds(900, 200, 200, 20);
        cmbEmailList.setForeground(Color.BLUE);
        cmbEmailList.setBackground(Color.GREEN);
        add(cmbEmailList);
        h.setForeground(Color.ORANGE);
        h.setBounds(900,220,300,70);
        h.setBackground(Color.WHITE);
        add(h);
        i= new JLabel("Email Id:");
        i.setBounds(900,150,300,70);
        i.setForeground(Color.BLUE);
        i.setBackground(Color.BLUE);
        i.setFont(new Font("Tahoma",Font.BOLD,15));
       add( i);
       
       
       
       
       sb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                new StudentLogin().setVisible(true);
            }
            
            
            
                });
       
        cmbEmailList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
            ResultSet rs = new Database().getTableData("SELECT * from TeacherEmail");
             
                while(rs.next()){
                if(cmbEmailList.getSelectedItem().equals(""))
                    
                {
                     h.setText("");
                }
                    else if(cmbEmailList.getSelectedItem().equals("Alom Ahmed"))
                    {
                        h.setText("aahmed@yahoo.com");
                    }
                else if(cmbEmailList.getSelectedItem().equals("Marzia Bagom"))
                    {
                        h.setText("marzia@gmail.com");
                    }
                else if(cmbEmailList.getSelectedItem().equals("Enayet Ullah"))
                    {
                    h.setText("ullahen@hotmail.com");
                    }
              
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error");
            System.out.println(e);
        
    }                                          
            }
            
            
            
                });
       
       
         try{
       
            ResultSet rs = new Database().getTableData("SELECT * FROM studentinfo WHERE id = "+id);
            if(rs.next()){
                    a.setText(rs.getString("NAME"));
                    b.setText(rs.getString("ID"));
                    c.setText(rs.getString("Phone_Number"));
                    d.setText(rs.getString("Cgpa"));
                    e.setText(rs.getString("Father_Name"));
                    f.setText(rs.getString("Mother_Name"));
                    g.setText(rs.getString("Address"));
                   
                   
                  
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
            
        }
        
          
             
            
        
    }
}
