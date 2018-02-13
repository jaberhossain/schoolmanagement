package school.management.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Adminhome extends JFrame
{

  JButton Studentl,Teacherl,Staffl,logout;
  
    
    public Adminhome()
	{   
		setLayout(null);
		setTitle("Admin Home");
                getContentPane().setBackground(Color.BLACK);
                
                this.setBackground(Color.WHITE);
                JLabel title = new JLabel("HOME");
                add(title);
                title.setBounds(450,60,550,30);
                title.setForeground(Color.WHITE);
                title.setBackground(Color.WHITE);
                title.setFont(new Font("Tahoma",Font.BOLD,40));
		setSize(1500,750);
		setLocation(0,0);
              
              
               Studentl =new JButton("Student List");
		Studentl.setBounds(500,150,195,60);
                Studentl.setForeground(Color.BLACK);
                Studentl.setBackground(Color.GREEN);
                Studentl.setFont(new Font("Tahoma",Font.BOLD,12));
		add(Studentl);
                
                
               
                Teacherl=new JButton("Teacher List");
		Teacherl.setBounds(500,250,195,60);
                Teacherl.setForeground(Color.BLACK);
                Teacherl.setBackground(Color.ORANGE);
                Teacherl.setFont(new Font("Tahoma",Font.BOLD,12));
		add(Teacherl);
                
                Staffl=new JButton("Staff List");
		Staffl.setBounds(500,350,195,60);
                Staffl.setForeground(Color.BLACK);
                Staffl.setBackground(Color.cyan);
                Staffl.setFont(new Font("Tahoma",Font.BOLD,12));
		add(Staffl);
                
                logout=new JButton("Logout");
		logout.setBounds(990,100,150,50);
                logout.setForeground(Color.WHITE);
                logout.setBackground(Color.RED);
                logout.setFont(new Font("Tahoma",Font.BOLD,12));
		add(logout);
               
		Studentl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                
                setVisible(false);
                new StudentList().setVisible(true);
            }
            
            
            
                });
                
            Teacherl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
               new TeacherList().setVisible(true);
            }
            
            
            
                });
            


                 
            Staffl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                new StaffList().setVisible(true);
            }
            
            
            
                });
            
            
            
            
            logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               setVisible(false);
               AdminLogin aL= new AdminLogin();
               aL.setVisible(true);
            }
            
            
            
                });
            
            
            
            
            


        }
}
	