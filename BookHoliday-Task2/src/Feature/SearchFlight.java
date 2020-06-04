package Feature;
import java.util.Scanner;



public class SearchFlight {



	public SearchFlight() {
		// TODO Auto-generated constructor stub
		
	
		 Scanner in = new Scanner(System.in);
		
		  
		System.out.println("SearchFlight");
		
		
		System.out.println("Von:");
		String Von=in.nextLine();
		System.out.println("Nach:");
		String Nach=in.nextLine();
		System.out.println("Hinreise: dd-MMM-yyyy");
		String Hinreise=in.nextLine();
		System.out.println("Rückreise: dd-MMM-yyyy");
		String Reuckreise= in.nextLine();
		
		System.out.println("Reisende:");
		String Reisende= in.nextLine();
	
		
		
		Serach(Von,Nach,Hinreise,Reuckreise,Reisende);
		
	}
	
	private  void Serach (String von, String nach, String hinreise, String reuckreise, String reisende){
		
		System.out.println("Wegen Pandemie gibt es Kein Flüg von " + von + " Nach " + nach);
	}
	
}
