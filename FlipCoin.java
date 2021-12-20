import java.util.Scanner;
public class FlipCoin {
public static void main(String[] Args) {
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter number ");
		int toss = ab.nextInt();
		int Heads=0 , Tails=0 ;
		for (int i=0; i<toss; i++) {
		double flipcoin = Math.random();
		if (flipcoin < 0.5) {
			Heads++;
		System.out.println("Heads");
		} 
	    else {
			Tails++;
		System.out.println("Tails");
		
			}
		}
	int Head = (Heads*100)/toss;
	int Tail = (Tails*100)/toss;
	System.out.println("Percentage Head:" +Head);
	System.out.println("Percentage Tail:" +Tail);	
	}
}