package school.management.system;
 
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Teacher extends JFrame
{

  JButton Sinfo,logout;
  
    
    public Teacher()
	{   
		setLayout(null);
		setTitle("Teacher HOME");
                getContentPane().setBackground(Color.BLACK);
                
                this.setBackground(Color.YELLOW);
                JLabel title = new JLabel("Home");
                add(title);
                title.setBounds(450,60,550,30);
                title.setForeground(Color.WHITE);
                title.setBackground(Color.WHITE);
                title.setFont(new Font("Tahoma",Font.BOLD,40));
		setSize(1500,750);
		setLocation(0,0);
              
              
               Sinfo =new JButton("Student Information");
		Sinfo.setBounds(500,150,195,60);
                Sinfo.setForeground(Color.BLACK);
                Sinfo.setBackground(Color.YELLOW);
                Sinfo.setFont(new Font("Tahoma",Font.BOLD,12));
		add(Sinfo);
                
               
                
                logout=new JButton("Logout");
		logout.setBounds(900,100,150,40);
                logout.setForeground(Color.WHITE);
                logout.setBackground(Color.RED);
                logout.setFont(new Font("Tahoma",Font.BOLD,12));
		add(logout);
               
		Sinfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                
                setVisible(false);
                new StudentDetails().setVisible(true);
            }
            
          });
                
         logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                new TeacherLogin().setVisible(true);
            }
           });
     
        }
}
	