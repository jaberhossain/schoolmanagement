package school.management.system;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class StudentAdd extends JFrame{
    JButton save,back;
    JLabel a,c,d,e,f,g,h;
    JTextField aTextField,bTextField,cTextField,dTextField,eTextField,fTextField,gTextField,hTextField;
    
    
    
    
    public StudentAdd(){
        
                 setLayout(null);
		setTitle("ADD");
                getContentPane().setBackground(Color.BLACK);
                setSize(1500,750);
		setLocation(0,0);   
                JLabel title = new JLabel("ADD");
                add(title);
                title.setBounds(520,50,550,30);
                title.setForeground(Color.YELLOW);
                title.setBackground(Color.YELLOW);
                title.setFont(new Font("Tahoma",Font.BOLD,30));

               a = new JLabel("STUDENT NAME");
               a.setBounds(420,225,300,70);
               a.setForeground(Color.WHITE);
               a.setBackground(Color.WHITE);
               add(a);
                aTextField = new JTextField("");
                add(aTextField);
                aTextField.setBounds(520,250, 200, 20);
                aTextField.setVisible(true);
                
                 h = new JLabel("password");
            add(h);
            h.setBounds(450,525,300,70);
            h.setForeground(Color.WHITE);
            h.setBackground(Color.WHITE);
            h.setVisible(true);
        
            hTextField = new JTextField("");
            add(hTextField);
            hTextField.setBounds(520,550, 200,20);
            hTextField.setVisible(true);

              c= new JLabel("Phone Number");
                c.setBounds(420,275,300,70);
                c.setForeground(Color.WHITE);
                c.setBackground(Color.WHITE);
               add( c);

               cTextField = new JTextField("");
                add(cTextField);
                cTextField.setBounds(520, 300, 200,20);
                cTextField.setVisible(true);


               d = new JLabel("Cgpa:");
               d.setBounds(470,325,250,70);
               d.setForeground(Color.WHITE);
               d.setBackground(Color.WHITE);
               add(d);

                dTextField = new JTextField("");
                add(dTextField);
                dTextField.setBounds(520, 350, 200,20);
                dTextField.setVisible(true);

                e = new JLabel("Father Name");
               e.setBounds(420,375,300,70);
               e.setForeground(Color.WHITE);
               e.setBackground(Color.WHITE);
               add(e);

               eTextField = new JTextField("");
                add(eTextField);
                eTextField.setBounds(520, 400, 200,20);
                eTextField.setVisible(true);

                f = new JLabel("Mother Name");
               f.setBounds(420,425,300,70);
               f.setForeground(Color.WHITE);
               f.setBackground(Color.WHITE);
               add(f);

               fTextField = new JTextField("");
                add(fTextField);
                fTextField.setBounds(520,450, 200,20);
                fTextField.setVisible(true);

                g = new JLabel("Address");
               g.setBounds(460,475,300,70);
               g.setForeground(Color.WHITE);
               g.setBackground(Color.WHITE);
               add(g);
       
            gTextField = new JTextField("");
            add(gTextField);
            gTextField.setBounds(520,500,200,20);
            gTextField.setVisible(true);
            
           
        
        
        
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
                new Database().theQuery("INSERT into studentinfo (NAME,password,phone_number,cgpa,father_name,mother_name,address) "
                + "VALUES('"+aTextField.getText()+"','"
                +hTextField.getText()+"','"+cTextField.getText()+"','"+dTextField.getText()
                +"','"+eTextField.getText()+"','"+fTextField.getText()+"','"+gTextField.getText()+"');");
                setVisible(false);
                new StudentList().setVisible(true);
             
                 
            }
                 
         });
         back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
               setVisible(false);
               new StudentList().setVisible(true);
             }
         });
    
    
}
}

    

