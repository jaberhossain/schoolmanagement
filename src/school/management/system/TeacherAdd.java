package school.management.system;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TeacherAdd extends JFrame{
    JButton save,back;
    JLabel a,c,d,e,f,g;
    JTextField aTextField,bTextField,cTextField,dTextField,eTextField,fTextField,gTextField;
    
    
    
    
    public TeacherAdd(){
        
                 setLayout(null);
		setTitle("TEACHER ADD");
                getContentPane().setBackground(Color.BLACK);
                setSize(1500,750);
		setLocation(0,0);   
                JLabel title = new JLabel("TEACHER ADD");
                add(title);
                title.setBounds(520,50,550,30);
                title.setForeground(Color.YELLOW);
                title.setBackground(Color.YELLOW);
                title.setFont(new Font("Tahoma",Font.BOLD,30));
             
                c= new JLabel("Password:");
                c.setBounds(420,275,300,70);
                c.setForeground(Color.WHITE);
                c.setBackground(Color.WHITE);
               add( c);

               cTextField = new JTextField("");
                add(cTextField);
                cTextField.setBounds(520, 300, 200,20);
                cTextField.setVisible(true);

               a = new JLabel("Teacher Name:");
               a.setBounds(420,225,300,70);
               a.setForeground(Color.WHITE);
               a.setBackground(Color.WHITE);
               add(a);
                aTextField = new JTextField("");
                add(aTextField);
                aTextField.setBounds(520,250, 200, 20);
                aTextField.setVisible(true);
                
                    g = new JLabel("Address:");
               g.setBounds(460,475,300,70);
               g.setForeground(Color.WHITE);
               g.setBackground(Color.WHITE);
               add(g);
       
            gTextField = new JTextField("");
            add(gTextField);
            gTextField.setBounds(520,500,200,20);
            gTextField.setVisible(true);
            
              e = new JLabel("Department");
               e.setBounds(420,375,300,70);
               e.setForeground(Color.WHITE);
               e.setBackground(Color.WHITE);
               add(e);

               eTextField = new JTextField("");
                add(eTextField);
                eTextField.setBounds(520, 400, 200,20);
                eTextField.setVisible(true);

               d = new JLabel("Salary:");
               d.setBounds(470,325,250,70);
               d.setForeground(Color.WHITE);
               d.setBackground(Color.WHITE);
               add(d);

                dTextField = new JTextField("");
                add(dTextField);
                dTextField.setBounds(520, 350, 200,20);
                dTextField.setVisible(true);

              

                f = new JLabel("Mobile Number:");
               f.setBounds(420,425,300,70);
               f.setForeground(Color.WHITE);
               f.setBackground(Color.WHITE);
               add(f);

               fTextField = new JTextField("");
                add(fTextField);
                fTextField.setBounds(520,450, 200,20);
                fTextField.setVisible(true);

            
          
             save = new JButton ("save");
                save.setBounds(450,600,90,35);
                save.setForeground(Color.BLACK);
                save.setBackground(Color.GREEN);
                add(save); 
                
                back = new JButton ("Back");
                back.setBounds(600,600,90,35);
                back.setForeground(Color.BLACK);
                back.setBackground(Color.RED);
                add(back); 
                
 
         save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                new Database().theQuery("INSERT into teacherinfo (password,NAME,address,Department,salary,mobile_number) "
                + "VALUES('"+cTextField.getText()+"','"+aTextField.getText()+"','"+gTextField.getText()
                +"','"+eTextField.getText()+"','"+dTextField.getText()+"','"+fTextField.getText()+"');");
                setVisible(false);
                new TeacherList().setVisible(true);
             }
         });
         back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
              setVisible(false);
              new TeacherList().setVisible(true);
             }
         });
    
    
}
}

    

