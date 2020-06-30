

import java.awt.Font;
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
import java.awt.event.*; 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.*;

//import Feature.DoRentCar.src.DoRentCar;
//import Feature.RegisterUser.src.MyFrame;  


public class RentCar 
extends JFrame 
implements ActionListener, interfaces.IRentCar {
	
	
	 
String CarID;
String price;
JFrame f = new JFrame("Select Car");  
private JLabel name; 
private JTextField tname; 
private JButton DoRentCar;
private JButton Register;

public RentCar() {
	
	  name = new JLabel( "selected Car:" ); 
      name.setFont( new Font( "Arial" , Font.PLAIN, 20 )); 
      name.setSize( 200 , 20 ); 
      name.setLocation( 70 , 100 ); 
      f.add(name); 

      tname = new JTextField(); 
      tname.setFont( new Font( "Arial" , Font.PLAIN, 15 )); 
      tname.setSize( 190 , 20 ); 
      tname.setLocation( 200 , 100 ); 
      f.add(tname); 
      
      DoRentCar = new JButton( "DoRentCar" ); 
      DoRentCar.setFont( new Font( "Arial" , Font.PLAIN, 15 )); 
      DoRentCar.setSize( 150 , 20 ); 
      DoRentCar.setLocation( 250 , 200 ); 
      DoRentCar.addActionListener( this );
      f.add(DoRentCar);
    
      Register = new JButton( "Register" ); 
      Register.setFont( new Font( "Arial" , Font.PLAIN, 15 )); 
      Register.setSize( 150 , 20 ); 
      Register.setLocation( 70 , 200 ); 
      Register.addActionListener( this ); 
      f.add(Register);
    

		String data[][]={ {"101","BENZ C200","80"},    
                {"102","BMW X3","78"},    
                {"103","Reno Clio","70"}};    
String column[]={"ID","Car","$ per Day"};         
final JTable jt=new JTable(data,column);    
jt.setCellSelectionEnabled(true);  
ListSelectionModel select= jt.getSelectionModel();  
select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 


select.addListSelectionListener(new ListSelectionListener() {  
public void valueChanged(ListSelectionEvent e) {  
  

int column = 1;
int row = jt.getSelectedRow();
CarID = jt.getModel().getValueAt(row, column).toString();
price=jt.getModel().getValueAt(row, 2).toString();
tname.setText(CarID);

}       
});  
JScrollPane sp=new JScrollPane(jt);    
f.add(sp);  
f.setSize(500, 300);  
f.setVisible(true);  
}  
     
	
public void actionPerformed(ActionEvent e){
	if(e.getSource() == DoRentCar) {
		this.setVisible(false);
//			new DoRentCar(CarID,price);

		
			
}else if(e.getSource() == Register) {
		
	
//		new MyFrame();
		
	}
}




 
		
}





