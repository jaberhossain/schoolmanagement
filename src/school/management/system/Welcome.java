package school.management.system;
 
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Welcome extends JFrame
{

  JButton Teacher,Student,Staff,Admin;
  
    
    public Welcome()
	{   
		setLayout(null);
		setTitle("WELCOME IN OUR SCHOOL");
                getContentPane().setBackground(Color.BLACK);
                
                this.setBackground(Color.YELLOW);
                JLabel title = new JLabel("Welcome In Our School");
                add(title);
                title.setBounds(450,60,550,30);
                title.setForeground(Color.YELLOW);
                title.setBackground(Color.YELLOW);
                title.setFont(new Font("Tahoma",Font.BOLD,40));
		setSize(1500,750);
		setLocation(0,0);
                Teacher=new JButton("TEACHER");
		Teacher.setBounds(500,150,195,60);
                Teacher.setForeground(Color.WHITE);
                Teacher.setBackground(Color.GRAY);
                Teacher.setFont(new Font("Tahoma",Font.BOLD,12));
		add(Teacher);
                
                Student =new JButton("STUDENT");
		Student.setBounds(500,250,195,60);
                Student.setForeground(Color.WHITE);
                Student.setBackground(Color.GRAY);
                Student.setFont(new Font("Tahoma",Font.BOLD,12));
		add(Student);
                
                
                Staff=new JButton("STAFF");
		Staff.setBounds(500,350,195,60);
                Staff.setForeground(Color.WHITE);
                Staff.setBackground(Color.GRAY);
                Staff.setFont(new Font("Tahoma",Font.BOLD,12));
		add(Staff);
                
                Admin=new JButton("ADMIN");
		Admin.setBounds(500,450,190,60);
                Admin.setForeground(Color.WHITE);
                Admin.setBackground(Color.GRAY);
                Admin.setFont(new Font("Tahoma",Font.BOLD,12));
		add(Admin);
               
		Student.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                
                setVisible(false);
                new StudentLogin().setVisible(true);
            }
            });
              
            Teacher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                setVisible(false);
              TeacherLogin tl= new TeacherLogin();
                        tl.setVisible(true);
            }
       });

            Staff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                new StaffLogin().setVisible(true);
            }
         });
            
         Admin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               setVisible(false);
               AdminLogin aL= new AdminLogin();
               aL.setVisible(true);
            }
         });

        }
}
	