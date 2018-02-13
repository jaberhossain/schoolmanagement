package school.management.system;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


class StudentList extends JFrame {

    JButton Back;
    JButton E,D,U; 
    JTable a;
    JScrollPane b;
 
 public StudentList() {
        
             
      setLayout(null);
		 setTitle("Student List");
                getContentPane().setBackground(Color.BLACK);
                setSize(1500,700);
		setLocation(0,0);
                Back = new JButton ("Back");
                Back.setBounds(990,10,90,35);
                Back.setForeground(Color.BLACK);
                Back.setBackground(Color.RED);
                add(Back); 
        
                E=new JButton(" ADD");
                E.setBounds(600,500,100,45);
                E.setForeground(Color.BLACK);
                E.setBackground(Color.GREEN);
                add(E);

                  U=new JButton(" UPDATE");
                U.setBounds(750,500,100,45);
                U.setForeground(Color.BLACK);
                U.setBackground(Color.BLUE);
                add(U);

                  D=new JButton("DELETE");
                D.setBounds(900,500,100,45);
                D.setForeground(Color.BLACK);
                D.setBackground(Color.RED);
                add(D);





                String [] clm = {"NAME","id", "phone_number","cgpa","father_name","mother_name","Address","password"};
                        String [][] row ={{},{},{}};
                         a = new JTable(row,clm);
                         b = new JScrollPane(a);
                         b.setBounds(500,50,700,400);
                        add(b);


                try{
                     ResultSet rs= new Database().getTableData("SELECT * FROM studentinfo");
                     DefaultTableModel model = new DefaultTableModel(new String[]{"NAME","id", "cgpa","father_name","mother_name", "phone_number","Address","password"}, 0);
                     while(rs.next())
                     {
                         String col1 = rs.getString("NAME");
                         String col2 = rs.getString("id");
                         String col3 = rs.getString("cgpa");                
                         String col4 = rs.getString("father_name");
                         String col5 = rs.getString("mother_name");
                        String col6 = rs.getString("phone_number");
                        String col7 = rs.getString("Address");
                        String col8 = rs.getString("password");
                      
                         
                         model.addRow(new Object[]{col1, col2, col3, col4,col5,col6,col7,col8});
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
                         new Adminhome().setVisible(true);
                 }

                 });

                     E.addActionListener(new ActionListener() {
                    @Override
                     public void actionPerformed(ActionEvent ae) {
                         setVisible(false);
                         new StudentAdd().setVisible(true);
                     }
                });
                      U.addActionListener(new ActionListener() {
                    @Override
                     public void actionPerformed(ActionEvent ae) {
                         setVisible(false);
                         new StudentUpdate().setVisible(true);
                     }
                });
                       D.addActionListener(new ActionListener() {
                    @Override
                     public void actionPerformed(ActionEvent ae) {
                         setVisible(false);
                         new DeleteStudent().setVisible(true);
                     }
                });

          }

         }