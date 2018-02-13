package school.management.system;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


class StudentDetails extends JFrame {

    JButton Back,E,D,U;
    JTable a;
    JScrollPane b;
 
 public StudentDetails() {
        
             
      setLayout(null);
		 setTitle("Student Details");
                getContentPane().setBackground(Color.BLACK);
                setSize(1500,700);
		setLocation(0,0);
                Back = new JButton ("Back");
                Back.setBounds(990,10,90,35);
                Back.setForeground(Color.BLACK);
                Back.setBackground(Color.RED);
                add(Back); 
        
                String [] clm = {"NAME","id", "phone_number","cgpa","father_name","mother_name","Address"};
                        String [][] row ={{},{},{}};
                         a = new JTable(row,clm);
                         b = new JScrollPane(a);
                         b.setBounds(500,50,700,400);
                        add(b);


                try{
                     ResultSet rs= new Database().getTableData("SELECT * FROM studentinfo");
                     DefaultTableModel model = new DefaultTableModel(new String[]{"NAME","id", "cgpa","father_name","mother_name", "phone_number","Address"}, 0);
                     while(rs.next())
                     {
                         String col1 = rs.getString("NAME");
                         String col2 = rs.getString("id");
                         String col3 = rs.getString("cgpa");                
                         String col4 = rs.getString("father_name");
                         String col5 = rs.getString("mother_name");
                        String col6 = rs.getString("phone_number");
                        String col7 = rs.getString("Address");
                      
                         
                         model.addRow(new Object[]{col1, col2, col3, col4,col5,col6,col7});
                     }
                     a.setModel(model);
                 }
                 catch(Exception ex){
                     JOptionPane.showMessageDialog(null, ex.getMessage());
                 }   

                  Back.addActionListener(new ActionListener() {
                     @Override
                     public void actionPerformed(ActionEvent ae) 
                     {
                          setVisible(false);
                         new Teacher().setVisible(true);
                 }
                  });
            }
}


 