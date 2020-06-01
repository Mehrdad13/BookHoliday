package properties;
import Feature.SearchFlight;
import Feature.MyFrame;
import properties.PropertyManager;
import java.io.IOException;

public class main {

	public static void main(String[] args)  throws IOException {
	 
		System.out.println("Welcome to Book Holiday System");
		
		if(PropertyManager.getProperty("RegisterUser")){
			
			MyFrame registerUser= new MyFrame();
			
		}
		if (PropertyManager.getProperty("BookFlight")) {
			
			SearchFlight sf= new SearchFlight();
			
											
		}

	

	
		
		

	}

}
