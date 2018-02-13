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


class TeacherList extends JFrame {

    JButton Back;
    JButton E,D,U,time; 
    JTable a;
    JScrollPane b;
 
 public TeacherList() {
        
             
      setLayout(null);
		 setTitle("Teacher List");
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

                  time=new JButton("Class Time");
                time.setBounds(300,300,100,45);
                time.setForeground(Color.BLACK);
                time.setBackground(Color.WHITE);
                add(time);



                String [] clm = {"NAME","id", "Address","Department","Salary","mobile_number","password"};
                        String [][] row ={{},{},{}};
                         a = new JTable(row,clm);
                         b = new JScrollPane(a);
                         b.setBounds(500,50,700,400);
                        add(b);


                try{
                     ResultSet rs= new Database().getTableData("SELECT * FROM teacherinfo");
                     DefaultTableModel model = new DefaultTableModel(new String[]{"NAME","id", "Address","Department","Salary","mobile_number","password"}, 0);
                     while(rs.next())
                     {
                         String col1 = rs.getString("NAME");
                         String col2 = rs.getString("id");
                         String col3 = rs.getString("Department");                
                         String col4 = rs.getString("mobile_number");
                         String col5 = rs.getString("Salary");
                         String col6 = rs.getString("Address");
                          String col7 = rs.getString("password");
                         
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
                         new Adminhome().setVisible(true);
                 }

                 });

                     E.addActionListener(new ActionListener() {
                    @Override
                     public void actionPerformed(ActionEvent ae) {
                         setVisible(false);
                         new TeacherAdd().setVisible(true);
                     }
                });
                      U.addActionListener(new ActionListener() {
                    @Override
                     public void actionPerformed(ActionEvent ae) {
                         setVisible(false);
                         new TeacherUpdate().setVisible(true);
                     }
                });
                       D.addActionListener(new ActionListener() {
                    @Override
                     public void actionPerformed(ActionEvent ae) {
                         setVisible(false);
                         new DeleteTeacher().setVisible(true);
                     }
                });
                        time.addActionListener(new ActionListener() {
                     @Override
                     public void actionPerformed(ActionEvent ae) 
                     {
                          setVisible(false);
                         new TimmingList().setVisible(true);
                 }

                 });

          }

         }