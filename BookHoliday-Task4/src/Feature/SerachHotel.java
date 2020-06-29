package Feature;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class SerachHotel   extends JFrame implements ActionListener  {

//	int numberOfGuests;
//	int numberOfNights;
//    private static Scanner aScanner;
	
	// Components of the Form 
    private Container c; 
    private JLabel title; 
    private JLabel where; 
    private JTextField twhere; 
    private JLabel mno; 
    private JTextField tmno; 
    private JLabel gender; 
    private JRadioButton male; 
    private JRadioButton female; 
    private ButtonGroup gengp; 
    private JLabel Checkin; 
    private JLabel Checkout;
    private JComboBox date; 
    private JComboBox month; 
    private JComboBox year; 
    private JComboBox date1; 
    private JComboBox month1; 
    private JComboBox year1; 
    private JLabel add; 
    private JTextArea tadd; 
    private JCheckBox term; 
    private JButton sub; 
    private JButton reset; 
    private JTextArea tout; 
    private JLabel res; 
    private JTextArea resadd; 
    private JButton ReserveRoom;

    private String dates[] 
        = { "1" , "2" , "3" , "4" , "5" , 
            "6" , "7" , "8" , "9" , "10" , 
            "11" , "12" , "13" , "14" , "15" , 
            "16" , "17" , "18" , "19" , "20" , 
            "21" , "22" , "23" , "24" , "25" , 
            "26" , "27" , "28" , "29" , "30" , 
            "31" }; 
    private String months[] 
        = { "Jan" , "feb" , "Mar" , "Apr" , 
            "May" , "Jun" , "July" , "Aug" , 
            "Sup" , "Oct" , "Nov" , "Dec" }; 
    private String years[] 
        = { "2020", "2021" }; 
    public SerachHotel() {
    	
    	  setTitle( "Search Hotel" ); 
          setBounds( 300 , 90 , 500 , 400 ); 
         setDefaultCloseOperation(EXIT_ON_CLOSE); 
          setResizable( false ); 
 
         c = getContentPane(); 
          c.setLayout( null ); 
 
          title = new JLabel( "Search Hotel" ); 
          title.setFont( new Font( "Arial" , Font.PLAIN, 30 )); 
          title.setSize( 300 , 30 ); 
          title.setLocation( 180 , 30 ); 
         c.add(title); 
 
          where = new JLabel( "Where" ); 
          where.setFont( new Font( "Arial" , Font.PLAIN, 20 )); 
          where.setSize( 100 , 20 ); 
          where.setLocation( 50 , 150 ); 
         c.add(where); 
 
          twhere = new JTextField(); 
          twhere.setFont( new Font( "Arial" , Font.PLAIN, 15 )); 
          twhere.setSize( 190 , 20 ); 
          twhere.setLocation( 200 , 150 ); 
         c.add(twhere); 
 
//          mno = new JLabel( "Mobile" ); 
//          mno.setFont( new Font( "Arial" , Font.PLAIN, 20 )); 
//          mno.setSize( 100 , 20 ); 
//          mno.setLocation( 100 , 150 ); 
//         c.add(mno); 
 
//          tmno = new JTextField(); 
//          tmno.setFont( new Font( "Arial" , Font.PLAIN, 15 )); 
//          tmno.setSize( 150 , 20 ); 
//          tmno.setLocation( 200 , 150 ); 
//         c.add(tmno); 
 
//          gender = new JLabel( "Gender" ); 
//          gender.setFont( new Font( "Arial" , Font.PLAIN, 20 )); 
//          gender.setSize( 100 , 20 ); 
//          gender.setLocation( 100 , 200 ); 
//         c.add(gender); 
// 
//          male = new JRadioButton( "Male" ); 
//          male.setFont( new Font( "Arial" , Font.PLAIN, 15 )); 
//          male.setSelected( true ); 
//          male.setSize( 75 , 20 ); 
//          male.setLocation( 200 , 200 ); 
//         c.add(male); 
 
//          female = new JRadioButton( "Female" ); 
//          female.setFont( new Font( "Arial" , Font.PLAIN, 15 )); 
//          female.setSelected( false ); 
//          female.setSize( 80 , 20 ); 
//          female.setLocation( 275 , 200 ); 
//         c.add(female); 
 
//          gengp = new ButtonGroup(); 
//         gengp.add(male); 
//         gengp.add(female); 
 
          Checkin = new JLabel( "Check in" ); 
          Checkin.setFont( new Font( "Arial" , Font.PLAIN, 20 )); 
          Checkin.setSize( 100 , 20 ); 
          Checkin.setLocation( 100 , 200 ); 
         c.add(Checkin); 
 
          date = new JComboBox(dates); 
          date.setFont( new Font( "Arial" , Font.PLAIN, 15 )); 
          date.setSize( 50 , 20 ); 
          date.setLocation( 200 ,200 ); 
         c.add(date); 
 
          month = new JComboBox(months); 
          month.setFont( new Font( "Arial" , Font.PLAIN, 15 )); 
          month.setSize( 60 , 20 ); 
          month.setLocation( 250 , 200 ); 
         c.add(month); 
 
          year = new JComboBox(years); 
          year.setFont( new Font( "Arial" , Font.PLAIN, 15 )); 
          year.setSize( 60 , 20 ); 
          year.setLocation( 320 ,200); 
         c.add(year); 
         
         Checkout = new JLabel( "Check Out" ); 
         Checkout.setFont( new Font( "Arial" , Font.PLAIN, 20 )); 
         Checkout.setSize( 100 , 20 ); 
         Checkout.setLocation( 100 , 250 ); 
        c.add(Checkout); 
        date1 = new JComboBox(dates); 
        date1.setFont( new Font( "Arial" , Font.PLAIN, 15 )); 
        date1.setSize( 50 , 20 ); 
        date1.setLocation( 200 , 250 ); 
       c.add(date1); 

        month1 = new JComboBox(months); 
        month1.setFont( new Font( "Arial" , Font.PLAIN, 15 )); 
        month1.setSize( 60 , 20 ); 
        month1.setLocation( 250 , 250 ); 
       c.add(month1); 

        year1 = new JComboBox(years); 
        year1.setFont( new Font( "Arial" , Font.PLAIN, 15 )); 
        year1.setSize( 60 , 20 ); 
        year1.setLocation( 320 , 250 ); 
       c.add(year1); 
 
//          add = new JLabel( "Address" ); 
//          add.setFont( new Font( "Arial" , Font.PLAIN, 20 )); 
//          add.setSize( 100 , 20 ); 
//          add.setLocation( 100 , 300 ); 
//         c.add(add); 
 
//          tadd = new JTextArea(); 
//          tadd.setFont( new Font( "Arial" , Font.PLAIN, 15 )); 
//          tadd.setSize( 200 , 75 ); 
//          tadd.setLocation( 200 , 300 ); 
//          tadd.setLineWrap( true ); 
//         c.add(tadd); 
 
//          term = new JCheckBox( "Accept Terms And Conditions." ); 
//          term.setFont( new Font( "Arial" , Font.PLAIN, 15 )); 
//          term.setSize( 250 , 20 ); 
//          term.setLocation( 150 , 400 ); 
//         c.add(term); 
// 
          sub = new JButton( "Search" ); 
          sub.setFont( new Font( "Arial" , Font.PLAIN, 15 )); 
          sub.setSize( 130 , 40); 
          sub.setLocation( 150 , 300 ); 
          sub.addActionListener( this ); 
         c.add(sub); 
 
          reset = new JButton( "Search Flight" ); 
          reset.setFont( new Font( "Arial" , Font.PLAIN, 15 )); 
          reset.setSize( 130 , 40 ); 
          reset.setLocation( 300 , 300 ); 
          reset.addActionListener( this ); 
         c.add(reset); 
 
//          tout = new JTextArea(); 
//          tout.setFont( new Font( "Arial" , Font.PLAIN, 15 )); 
//          tout.setSize( 300 , 400 ); 
//          tout.setLocation( 500 , 100 ); 
//          tout.setLineWrap( true ); 
//          tout.setEditable( false ); 
//         c.add(tout); 
 
          res = new JLabel( "" ); 
          res.setFont( new Font( "Arial" , Font.PLAIN, 20 )); 
          res.setSize( 500 , 25 ); 
          res.setLocation( 100 , 100); 
         c.add(res); 
 
//          resadd = new JTextArea(); 
//          resadd.setFont( new Font( "Arial" , Font.PLAIN, 15 )); 
//          resadd.setSize( 200 , 75 ); 
//          resadd.setLocation( 580 , 175 ); 
//          resadd.setLineWrap( true ); 
//         c.add(resadd); 
         
         ReserveRoom = new JButton("Reseve Room");
         ReserveRoom.setFont(new Font("Arial", Font.PLAIN, 15));
         ReserveRoom.setSize(140, 20);
         ReserveRoom.setLocation( 10 , 10);
         ReserveRoom.addActionListener(this);
 		c.add(ReserveRoom);
 
          setVisible( true ); 
//		// TODO Auto-generated constructor stub
//	
//        System.out.println("SerachHotel");
//        Scanner aScanner = new Scanner(System.in);
//        System.out.println("To begin, please indicate how many people will be staying. ");
//        numberOfGuests = aScanner.nextInt();
//        System.out.println("Thank you. Now please tell us how long you plan on staying at our fine resort. ");
//        numberOfNights = aScanner.nextInt();
//        int singleRoom = numberOfGuests * 95 * numberOfNights;
//        int doubleRoom = numberOfGuests * 80 * numberOfNights;
//        int supplementalSingle = numberOfGuests * 65;
//        int supplementalDouble = numberOfGuests * 50;
//        if (numberOfNights <=2 && numberOfGuests == 1) {
//                       System.out.println("For " + numberOfGuests + " guest staying for " +
//                                          numberOfNights + " nights, it will cost " + "?" + singleRoom);
//                      
//        } 
//        else if (numberOfNights <=2 && numberOfGuests >1) { 
//                       System.out.println("For " + numberOfGuests + " guests staying for " + 
//                                          numberOfNights + " nights, it will cost " + "?" + doubleRoom);
//        }
//        else if (numberOfNights >2 && numberOfGuests == 1) {
//                       System.out.println("For " + numberOfGuests + " guest staying for " + 
//                                          numberOfNights + " nights, it will cost " + "?"   );
//        }
//        
//        
//        
//        //#if ReserveRoom
//      
//        ReserveRoom rt=new ReserveRoom();
//   
//        
//        
//        //#elif !ReserveRoom
////@        System.out.println("no access to Book Room");
//        //#endif
//        
//      
    }
  
//    public int getNumberOfGuests() {
//		return numberOfGuests;
//	}
//public int getNumberOfNights() {
//	return numberOfNights;
//}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	if(e.getSource() == sub) {
		
		res.setText("No Connection To Data Base");
	}else if (e.getSource() == reset) { 
		this.setVisible(false);
			new SearchFlight();
      
   }else if (e.getSource() == ReserveRoom) { 
	 //#if ReserveRoom
//@	   res.setText("No Connection To Data Base");
//@	 //endif
//@	   
	 //#elif !ReserveRoom
	 			
	 		res.setText("no access to Reserve Room");
	 			
	 		   //#endif
   }
}
}
