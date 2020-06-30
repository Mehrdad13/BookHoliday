import loader.PluginLoader;
import interfaces.ISearchFlight;
//import interfaces.ISearchHotel;
//import interfaces.IRegisterUser;
//import interfaces.IRentCar;
//import interfaces.IDoRentCar;
//import interfaces.IReserveRoom;

import java.util.List;


public class main {

	public static void main(String[] args) {
		
		List<ISearchFlight> isf = PluginLoader.load(ISearchFlight.class);
		
		
//		for (ISearchFlight isf1 : isf) {
//			try {
//			System.out.println("ISearchFlight");
//			IReserveRoom rr=new ReserveRoom("whr", "from", "to"); 
//				IDoRentCar drc=new DoRentCar("", "");
//				
//				
//				
//			IRegisterUser ru=new MyFrame();
//						
//			}catch(Exception e){
//				System.out.println("pronlem");
//			}
//		}
		
   }
}
