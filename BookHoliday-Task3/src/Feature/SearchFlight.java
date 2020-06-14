package Feature;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import properties.PropertyManager;

public class SearchFlight extends JFrame implements ActionListener {

	private Container c;
	private JLabel title;
	private JLabel from;
	private JTextField tfrom;
	private JLabel to;
	private JTextField tto;
	// private JLabel gender;
//    private JRadioButton male; 
//    private JRadioButton female; 
//    private ButtonGroup gengp; 
	private JLabel Depart;
	private JLabel passengerLabel;
	private JComboBox passenger;
	private JComboBox date;
	private JComboBox month;
	private JComboBox year;

	// private JLabel add;
	// private JTextArea tpassenger;
	private JCheckBox term;
	private JButton sub;
	private JButton reset;
	private JButton RegisterUser;
	private JButton SHotel;
	private JTextArea tout;
	private JLabel res;
	private JTextArea resadd;

	private String passengers[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };

	private String dates[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
			"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
	private String months[] = { "Jan", "feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sup", "Oct", "Nov", "Dec" };
	private String years[] = { "2020", "2021", "2022" };

	// constructor, to initialize the components
	// with default values.
	public SearchFlight() {
		setTitle("Search Flight");
		setBounds(300, 90, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		c = getContentPane();
		c.setLayout(null);

		title = new JLabel("Search Flight");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		title.setSize(300, 30);
		title.setLocation(300, 30);
		c.add(title);

		from = new JLabel("From");
		from.setFont(new Font("Arial", Font.PLAIN, 20));
		from.setSize(100, 20);
		from.setLocation(100, 100);
		c.add(from);

		tfrom = new JTextField();
		tfrom.setFont(new Font("Arial", Font.PLAIN, 15));
		tfrom.setSize(190, 20);
		tfrom.setLocation(200, 100);
		c.add(tfrom);

		to = new JLabel("To");
		to.setFont(new Font("Arial", Font.PLAIN, 20));
		to.setSize(100, 20);
		to.setLocation(100, 150);
		c.add(to);

		tto = new JTextField();
		tto.setFont(new Font("Arial", Font.PLAIN, 15));
		tto.setSize(150, 20);
		tto.setLocation(200, 150);
		c.add(tto);

//         gender = new JLabel( "Gender" ); 
//         gender.setFont( new Font( "Arial" , Font.PLAIN, 20 )); 
//         gender.setSize( 100 , 20 ); 
//         gender.setLocation( 100 , 200 ); 
//        c.add(gender); 

//         male = new JRadioButton( "Male" ); 
//         male.setFont( new Font( "Arial" , Font.PLAIN, 15 )); 
//         male.setSelected( true ); 
//         male.setSize( 75 , 20 ); 
//         male.setLocation( 200 , 200 ); 
//        c.add(male); 
//
//         female = new JRadioButton( "Female" ); 
//         female.setFont( new Font( "Arial" , Font.PLAIN, 15 )); 
//         female.setSelected( false ); 
//         female.setSize( 80 , 20 ); 
//         female.setLocation( 275 , 200 ); 
//        c.add(female); 
//
//         gengp = new ButtonGroup(); 
//        gengp.add(male); 
//        gengp.add(female); 

		Depart = new JLabel("Depart");
		Depart.setFont(new Font("Arial", Font.PLAIN, 20));
		Depart.setSize(100, 20);
		Depart.setLocation(100, 250);

		c.add(Depart);

		date = new JComboBox(dates);
		date.setFont(new Font("Arial", Font.PLAIN, 15));
		date.setSize(50, 20);
		date.setLocation(200, 250);
		c.add(date);

		month = new JComboBox(months);
		month.setFont(new Font("Arial", Font.PLAIN, 15));
		month.setSize(60, 20);
		month.setLocation(250, 250);
		c.add(month);

		year = new JComboBox(years);
		year.setFont(new Font("Arial", Font.PLAIN, 15));
		year.setSize(60, 20);
		year.setLocation(320, 250);
		c.add(year);

       
	
		passengerLabel = new JLabel( "Passenger" ); 
        passengerLabel.setFont( new Font( "Arial" , Font.PLAIN, 20 )); 
        passengerLabel.setSize( 100 , 20 ); 
        passengerLabel.setLocation( 100 , 300 ); 
                
       c.add(passengerLabel); 

		passenger = new JComboBox(passengers);
		passenger.setFont(new Font("Arial", Font.PLAIN, 15));
		passenger.setSize(50, 20);
		passenger.setLocation(250,300);
		c.add(passenger);

//        tpassenger = new JTextArea(); 
//        tpassenger.setFont( new Font( "Arial" , Font.PLAIN, 15 )); 
//        tpassenger.setSize( 200 , 75 ); 
//        tpassenger.setLocation( 200 , 300 ); 
//        tpassenger.setLineWrap( true ); 
//        c.add(tpassenger); 

		term = new JCheckBox("Accept Terms And Conditions.");
		term.setFont(new Font("Arial", Font.PLAIN, 15));
		term.setSize(250, 20);
		term.setLocation(150, 400);
		c.add(term);

		sub = new JButton("Search");
		sub.setFont(new Font("Arial", Font.PLAIN, 15));
		sub.setSize(100, 20);
		sub.setLocation(150, 450);
		sub.addActionListener(this);
		c.add(sub);

		reset = new JButton("Reset");
		reset.setFont(new Font("Arial", Font.PLAIN, 15));
		reset.setSize(100, 20);
		reset.setLocation(270, 450);
		reset.addActionListener(this);
		c.add(reset);
		
		RegisterUser = new JButton("Register");
		RegisterUser.setFont(new Font("Arial", Font.PLAIN, 15));
		RegisterUser.setSize(120, 20);
		RegisterUser.setLocation(650, 50);
		RegisterUser.addActionListener(this);
		c.add(RegisterUser);
		
		SHotel = new JButton("Serach Hotel");
		SHotel.setFont(new Font("Arial", Font.PLAIN, 15));
		SHotel.setSize(120, 20);
		SHotel.setLocation(500, 50);
		SHotel.addActionListener(this);
		c.add(SHotel);

		tout = new JTextArea();
		tout.setFont(new Font("Arial", Font.PLAIN, 15));
		tout.setSize(300, 400);
		tout.setLocation(500, 100);
		tout.setLineWrap(true);
		tout.setEditable(false);
		c.add(tout);

		res = new JLabel("");
		res.setFont(new Font("Arial", Font.PLAIN, 20));
		res.setSize(500, 25);
		res.setLocation(100, 500);
		c.add(res);

		resadd = new JTextArea();
		resadd.setFont(new Font("Arial", Font.PLAIN, 15));
		resadd.setSize(200, 75);
		resadd.setLocation(580, 175);
		resadd.setLineWrap(true);
		c.add(resadd);

		setVisible(true);
	}

	// method actionPerformed()
	// to get the action performed
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == sub) {
			if (term.isSelected()) {
				// String data1;
				String data = "from : " + tfrom.getText() + "\n" + "To : " + tto.getText() + "\n";
//                 if (male.isSelected()) 
//                     data1 = "Gender : Male" 
//                             + "\n" ; 
//                else 
//                     data1 = "Gender : Female" 
//                             + "\n" ; 
				String data2 = "Depart : " + (String) date.getSelectedItem() + "/" + (String) month.getSelectedItem()
						+ "/" + (String) year.getSelectedItem() + "\n";
                  
			
				 String data3 = "Passemgers : " + passenger.getSelectedItem();
				tout.setText(data + data2 + data3);
				tout.setEditable(false);
				res.setText("Due to pandemic, there is no flight From" + tfrom.getText() + " To " + tto.getText());
			} else {
				tout.setText("");
				resadd.setText("");
				res.setText("Please accept the" + " terms & conditions..");
			}
		}

		else if (e.getSource() == reset) {
			String def = "";
			tfrom.setText(def);
//            tpassenger.setText(def); 
			tto.setText(def);
			res.setText(def);
			tout.setText(def);
			term.setSelected(false);
			date.setSelectedIndex(0);
			month.setSelectedIndex(0);
			year.setSelectedIndex(0);
			resadd.setText(def);
		} else if(e.getSource()==RegisterUser) {
			
			
			this.setVisible(false);
				new MyFrame();
				
			
			
		} else if(e.getSource()==SHotel) {
			
			
			
			//#if SearchHotel
			this.setVisible(false);
			dispose();
			new SerachHotel();
	 
		   //#elif !SearchHotel
//@			
//@			res.setText("no access to Search Hotel");
//@			
		   //#endif
		}
		
	}

//
//	public SearchFlight() {
//		// TODO Auto-generated constructor stub
//		
//	
//		 Scanner in = new Scanner(System.in);
//		
//		  
//		System.out.println("SearchFlight");
//		
//		
//		System.out.println("Von:");
//		String Von=in.nextLine();
//		System.out.println("Nach:");
//		String Nach=in.nextLine();
//		System.out.println("Hinreise: dd-MMM-yyyy");
//		String Hinreise=in.nextLine();
//		System.out.println("R�ckreise: dd-MMM-yyyy");
//		String Reuckreise= in.nextLine();
//		
//		System.out.println("Reisende:");
//		String Reisende= in.nextLine();
//	
//		
//		
//		Serach(Von,Nach,Hinreise,Reuckreise,Reisende);
//		
//	}

	private void Serach(String von, String nach, String hinreise, String reuckreise, String reisende) {

		System.out.println("Wegen Pandemie gibt es Kein Fl�g von " + von + " Nach " + nach);
	}

}
