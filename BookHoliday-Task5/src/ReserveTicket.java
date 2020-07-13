import java.awt.Container;   
import java.awt.Font;   
import java.awt.event.ActionEvent;   
import java.awt.event.ActionListener;   

import javax.swing.JButton;   
import javax.swing.JFrame;   
import javax.swing.JLabel;   

public    class    ReserveTicket     extends JFrame    implements ActionListener {
	
	
	
	
	private Container f;

	

	

	
	private JLabel wh;

	

	

	
	private JLabel in1;

	

	

	
	private JLabel out1;

	

	

	
	private JButton sub;

	

	

	
	private JButton cancel;

	

	

	
	
	String where1;

	

	

	
	String CheckIn;

	

	

	
	String CheckOut;

	

	

	
	
	
	public ReserveTicket(String where, String in, String out) {
		
		 
		  setTitle( "ReserveRoom" ); 
          setBounds( 300 , 90 , 400 , 200 ); 
         setDefaultCloseOperation(EXIT_ON_CLOSE); 
          setResizable( false ); 
 
         f = getContentPane(); 
         f.setLayout( null ); 
		
		
		wh = new JLabel( where ); 
		wh.setFont( new Font( "Arial" , Font.PLAIN, 20 )); 
		wh.setSize( 200 , 20 ); 
		wh.setLocation(20, 20 ); 
	    f.add(wh); 
	    
	    in1 = new JLabel( in ); 
	    in1.setFont( new Font( "Arial" , Font.PLAIN, 20 )); 
	    in1.setSize( 200 , 20 ); 
	    in1.setLocation( 20 , 70 ); 
	    f.add(in1);
	    
	    out1 = new JLabel( out ); 
	    out1.setFont( new Font( "Arial" , Font.PLAIN, 20 )); 
	    out1.setSize( 200 , 50 ); 
	    out1.setLocation( 20 ,110); 
	    f.add(out1);
	    
	    
	    sub = new JButton( "Submit" ); 
        sub.setFont( new Font( "Arial" , Font.PLAIN, 15 )); 
        sub.setSize( 100 , 50 ); 
        sub.setLocation( 200 , 30 ); 
        sub.addActionListener( this ); 
        f.add(sub); 
       
        cancel = new JButton( "Cancel" ); 
        cancel.setFont( new Font( "Arial" , Font.PLAIN, 15 )); 
        cancel.setSize( 100 , 50 ); 
        cancel.setLocation( 200 , 100 ); 
        cancel.addActionListener( this ); 
        f.add(cancel); 
	    
	    setVisible( true ); 
	
	}

	

	

	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == sub) {
			where1=wh.getText();
			CheckIn=in1.getText();
			CheckOut=out1.getText();
			this.setVisible(false);
		}else if (e.getSource() == cancel) {
			this.setVisible(false);
		}
		
		
		
	}

	

	

	
	
	
public String getCheckIn() {
	return CheckIn;
}

	

	

	
public String getCheckOut() {
	return CheckOut;
}

	

	

	
public String getWhere1() {
	return where1;
}


}
