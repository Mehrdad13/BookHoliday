package Feature;
import java.util.Scanner;
public class SerachHotel {


    private static Scanner aScanner;
    public SerachHotel() {
		// TODO Auto-generated constructor stub
	
        System.out.println("SerachHotel");
        Scanner aScanner = new Scanner(System.in);
        System.out.println("To begin, please indicate how many people will be staying. ");
        int numberOfGuests = aScanner.nextInt();
        System.out.println("Thank you. Now please tell us how long you plan on staying at our fine resort. ");
        int numberOfNights = aScanner.nextInt();
        int singleRoom = numberOfGuests * 95 * numberOfNights;
        int doubleRoom = numberOfGuests * 80 * numberOfNights;
        int supplementalSingle = numberOfGuests * 65;
        int supplementalDouble = numberOfGuests * 50;
        if (numberOfNights <=2 && numberOfGuests == 1) {
                       System.out.println("For" + numberOfGuests + " guest staying for " +
                                          numberOfNights + " nights, it will cost " + "€" + singleRoom);
        } 
        else if (numberOfNights <=2 && numberOfGuests >1) { 
                       System.out.println("For " + numberOfGuests + " guests staying for " + 
                                          numberOfNights + " nights, it will cost " + "€" + doubleRoom);
        }
        else if (numberOfNights >2 && numberOfGuests == 1) {
                       System.out.println("For" + numberOfGuests + " guest staying for " + 
                                          numberOfNights + " nights, it will cost " + "€"   );
        }
        
        //#if ReserveRoom
        System.out.println("room has been booked.");
        //#elif !ReserveRoom
//@        System.out.println("no access to Book Room");
        //#endif
        
      
    }
 
 
}
