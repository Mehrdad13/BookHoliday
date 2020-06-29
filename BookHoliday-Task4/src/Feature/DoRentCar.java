package Feature;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class DoRentCar extends JFrame 
implements ActionListener {
	
	JFrame f = new JFrame("Rent Car"); 
	RentCar rc= new RentCar();
	
	  private JLabel name;
	
	public DoRentCar() {
		
		  f.setSize(500, 300);  
		  f.setVisible(true); 
		  String CarName=rc.CarID;
		
		  name = new JLabel( CarName ); 
	      name.setFont( new Font( "Arial" , Font.PLAIN, 20 )); 
	      name.setSize( 50 , 20 ); 
	      name.setLocation( 150 , 150 ); 
	      f.add(name); 
		
		
	}
	
	
}
