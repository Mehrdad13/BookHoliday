

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;





public class DoRentCar extends JFrame 
implements ActionListener{
	
	  private JComboBox day;
	  private JLabel name;
	  private JLabel price;
	  private JLabel finalPrice;
	  private JButton finish; 
	  private JButton back;
	  private String days[] 
	          = { "1" , "2" , "3" , "4" , "5" , 
	              "6" , "7" , "8" , "9" , "10" };
	
public DoRentCar(String Carname, String Price) {
		
		JFrame f = new JFrame("Rent Car"); 
		f.setSize(300, 400);  
    	f.setLayout( null ); 
        
		  name = new JLabel( Carname ); 
	      name.setFont( new Font( "Arial" , Font.PLAIN, 20 )); 
	      name.setSize( 100, 20 ); 
	      name.setLocation( 50 ,100 ); 
	      f.add(name); 
	      
	      price = new JLabel( Price ); 
	      price.setFont( new Font( "Arial" , Font.PLAIN, 20 )); 
	      price.setSize( 100, 20 ); 
	      price.setLocation( 200 ,100); 
	      f.add(price); 
		
	      
//	      day = new JComboBox(days); 
//          day.setFont( new Font( "Arial" , Font.PLAIN, 15 )); 
//          day.setSize( 50 , 20 ); 
//          day.setLocation( 130 , 150 ); 
//          f.add(day); 
          

          finish = new JButton( "Finish" ); 
          finish.setFont( new Font( "Arial" , Font.PLAIN, 15 )); 
          finish.setSize( 100 , 20 ); 
          finish.setLocation( 150 ,300); 
          finish.addActionListener( this ); 
          f.add(finish); 
         

         back = new JButton( "back" ); 
         back.setFont( new Font( "Arial" , Font.PLAIN, 15 )); 
         back.setSize( 100 , 20 ); 
         back.setLocation( 30 ,300 ); 
         back.addActionListener( this ); 
         f.add(back); 
         
		  f.setVisible(true); 
	}







public void actionPerformed(ActionEvent e){
	
	if(e.getSource() == finish) {
		 this.setVisible(false);
	}else if(e.getSource() == back) {
		 this.setVisible(false);
     	 new RentCar();
	}

 }	
}
