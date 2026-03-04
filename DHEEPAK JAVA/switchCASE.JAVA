import java.util.*;
public class switchCASE{
	public static void main(String args[]){
		//Weight classification program for airplanes
		/*0-20 	-	 A
		  21-30 - 	 B
		  31-40 - 	 C
		  41-50 -        D
		*/	
		Scanner newScanner = new Scanner(System.in);	
		System.out.printf("Enter a code to check information about baggage:");
		char code = newScanner.next().charAt(0);
		switch(code){
			case 'A'->System.out.println("\nLight Baggage:0-20kg");
			case 'B'->System.out.println("\nStandard Check-In:21-30kg");
			case 'C'->System.out.println("\nHeavy Baggage:31-40kg");
			case 'D'->System.out.println("\nOversized Baggage:41-50kg");
		}
		
	}
}