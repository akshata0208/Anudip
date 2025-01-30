import java.util.Scanner;

public class intrest {
	
	public static void main(String[] args) {
		
	    Scanner s = new Scanner(System.in);
	    System.out.println("SIMPLE INTEREST");
	    System.out.println("Enter Principle Amount");
	    int principle = s.nextInt();
	    System.out.println("Enter Rate Of Intrest");
	    int interest = s.nextInt();
	    System.out.println("Enter Number of Years");
	    int period= s.nextInt();
	    float simple_interest= principle*interest*period/100;
	    System.out.println("Simple Intrest is  " + simple_interest );
	    		
	}

}
