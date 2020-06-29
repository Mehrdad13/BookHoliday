package Feature.ReserveRoom.src;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Feature.SearchHotel.src.SerachHotel;

public class ReserveRoom extends JFrame 
implements ActionListener {
	
	  private JComboBox day;
	  private JLabel name;
	  private JLabel from;
	  private JLabel to;
	  private JLabel finalPrice;
	  private JButton finish; 
	  private JButton back;
	 
	
public ReserveRoom(String Where, String From, String To) {
		
		JFrame f = new JFrame("Rent Car"); 
		f.setSize(300, 350);  
    	f.setLayout( null ); 
        
		  name = new JLabel( Where ); 
	      name.setFont( new Font( "Arial" , Font.PLAIN, 25)); 
	      name.setSize( 150, 20 ); 
	      name.setLocation( 10 ,50); 
	      f.add(name); 
	      
from = new JLabel( From ); 
from.setFont( new Font( "Arial" , Font.PLAIN, 20 )); 
from.setSize( 200, 20 ); 
from.setLocation( 100,50); 
	      f.add(from); 
		
	      to = new JLabel( To ); 
	      to.setFont( new Font( "Arial" , Font.PLAIN, 20 )); 
	      to.setSize( 200, 20 ); 
	      to.setLocation( 100 ,100); 
	      	      f.add(to); 
//	      day = new JComboBox(days); 
//          day.setFont( new Font( "Arial" , Font.PLAIN, 15 )); 
//          day.setSize( 50 , 20 ); 
//          day.setLocation( 130 , 150 ); 
//          f.add(day); 
          

          finish = new JButton( "Finish" ); 
          finish.setFont( new Font( "Arial" , Font.PLAIN, 15 )); 
          finish.setSize( 100 , 20 ); 
          finish.setLocation( 150 ,200); 
          finish.addActionListener( this ); 
          f.add(finish); 
         

         back = new JButton( "back" ); 
         back.setFont( new Font( "Arial" , Font.PLAIN, 15 )); 
         back.setSize( 100 , 20 ); 
         back.setLocation( 30 ,200 ); 
         back.addActionListener( this ); 
         f.add(back); 
         
		  f.setVisible(true); 
	}







public void actionPerformed(ActionEvent e){
	
	if(e.getSource() == finish) {
		 this.setVisible(false);
		 this.dispose();
	}else if(e.getSource() == back) {
		 this.setVisible(false);
		 new SerachHotel();
	}

 }	
}