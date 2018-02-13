package school.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DeleteStudent extends JFrame {
 JButton delete,back;
 JLabel a;
 JTextField aTextField;
 public DeleteStudent(){
     
     
     
         
            setLayout(null);
            setTitle("Delete");
            getContentPane().setBackground(Color.BLACK);
            setSize(1500,750);
            setLocation(0,0); 
            
            JLabel title = new JLabel("DELETE");
                add(title);
            title.setBounds(520,50,550,30);
            title.setForeground(Color.YELLOW);
            title.setBackground(Color.YELLOW);
            title.setFont(new Font("Tahoma",Font.BOLD,30));
            a = new JLabel("Student Id:");
            add(a);
            a.setBounds(440,325,250,70);
             a.setForeground(Color.WHITE);
            a.setBackground(Color.WHITE);
            a.setVisible(true);
        
            aTextField = new JTextField("");
            add(aTextField);
            aTextField.setBounds(520, 350, 200,20);
            
            aTextField.setVisible(true);
        
        
         
            delete = new JButton ("Delete");
            add(delete);
            delete.setBounds(450,600,90,35);
            delete.setForeground(Color.BLACK);
            delete.setBackground(Color.RED);
            delete.setVisible(true);


            back = new JButton ("Back");
            add(back);
            back.setBounds(600,600,90,35);
            back.setForeground(Color.BLACK);
            back.setBackground(Color.BLUE);
            back.setVisible(true);
        
             delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                new Database().theQuery("Delete From studentinfo WHERE Id = '"+aTextField.getText()+"'");
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
