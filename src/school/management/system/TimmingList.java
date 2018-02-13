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


class TimmingList extends JFrame {

    JButton Back,E,D,U;
    JTable a;
    JScrollPane b;
 
 public TimmingList() {
        
             
      setLayout(null);
		 setTitle("Timming");
                getContentPane().setBackground(Color.BLACK);
                setSize(1500,700);
		setLocation(0,0);
                Back = new JButton ("Back");
                Back.setBounds(990,10,90,35);
                Back.setForeground(Color.BLACK);
                Back.setBackground(Color.RED);
                add(Back); 
        
                String [] clm = {"NAME","sunday", "wednesday","tuesday","monday"};
                        String [][] row ={{},{},{}};
                         a = new JTable(row,clm);
                         b = new JScrollPane(a);
                         b.setBounds(500,50,700,400);
                        add(b);


                try{
                     ResultSet rs= new Database().getTableData("SELECT * FROM timminglist");
                     DefaultTableModel model = new DefaultTableModel(new String[]{"NAME","sunday", "monday","tuesday","wednesday"}, 0);
                     while(rs.next())
                     {
                         String col1 = rs.getString("NAME");
                         String col2 = rs.getString("sunday");
                         String col3 = rs.getString("monday");                
                         String col4 = rs.getString("tuesday");
                        String col5 = rs.getString("wednesday");
                      
                         
                         model.addRow(new Object[]{col1, col2, col3, col4,col5});
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
                         new TeacherList().setVisible(true);
                 }

                 });
 }
}
