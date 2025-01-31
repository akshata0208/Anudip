import java.util.Scanner;
public class Trade_Comissions {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Select City");
	    System.out.println("1.Sofia\n2.Varna\n3.Plodiv");
	    int choice_city = s.nextInt();
	    switch(choice_city) {
	    
	    case 1:
	    	System.out.println("Enter volume of your sale in city Sofia");
	    	double v_Sofia = s.nextDouble();  // volume of sales
	    	double comission_s = 0.00;
	    	if (v_Sofia >= 0 && v_Sofia <= 500) {
	    		comission_s = (5 * v_Sofia)/100 ;
	    		System.out.printf("Your Comssion is %.2f%n " , comission_s);
	    	}
	    	else if (v_Sofia > 500 && v_Sofia <= 1000) {
	    		comission_s = (7 * v_Sofia)/100;
	    		System.out.printf("Your Comssion is %.2f%n" , comission_s);
	    		
	    	}
	    	else if (v_Sofia > 1000 && v_Sofia <= 10000) {
	    		comission_s = (8 * v_Sofia)/100;
	    		System.out.printf("Your Comssion is %.2f%n" , comission_s);
	    		
	    	}
	    	else if (v_Sofia > 10000) {
	    		comission_s = (12 * v_Sofia)/100;
	    		System.out.printf("Your Comssion is %.2f%n" , comission_s);
	    		
	    	}
	    	else 
	    	{
	    		System.out.println("Enter VALID Data");
	    	}
	    	break;
	    case 2:
	    	System.out.println("Enter volume of your sale in city Varna");
	    	double v_Varna = s.nextDouble();  // volume of sales
	    	double comission_v = 0.00;
	    	if (v_Varna >= 0 && v_Varna <= 500) {
	    		comission_v = (4.5 * v_Varna)/100;
	    		System.out.printf("Your Comssion is %.2f%n " , comission_v);
	    	}
	    	else if (v_Varna > 500 && v_Varna <= 1000) {
	    		comission_v = (7.5 * v_Varna)/100;
	    		System.out.printf("Your Comssion is %.2f%n" , comission_v);
	    		
	    	}
	    	else if (v_Varna > 1000 && v_Varna <= 10000) {
	    		comission_v = (10 *v_Varna)/100;
	    		System.out.printf("Your Comssion is %.2f%n" , comission_v);
	    		
	    	}
	    	else if (v_Varna > 10000) {
	    		comission_v = (13 * v_Varna) /100;
	    		System.out.printf("Your Comssion is %.2f%n " , comission_v);
	    		
	    	}
	    	else 
	    	{
	    		System.out.print("Enter VALID Data");
	    	}
	    	break;
	    case 3:
	    	System.out.println("Enter volume of your sale in city Plodiv");
	    	double v_Plovdiv = s.nextDouble();
	    	double comission_p = 0.0;
	    	if (v_Plovdiv >= 0 && v_Plovdiv <= 500) {
	    		comission_p = (5.5 * v_Plovdiv)/100;
	    		System.out.printf("Your Comssion is %.2f%n" , comission_p);
	    	}
	    	else if (v_Plovdiv > 500 && v_Plovdiv <= 1000) {
	    		comission_p = (8* v_Plovdiv)/100;
	    		System.out.printf("Your Comssion is %.2f%n" , comission_p);
	    		
	    	}
	    	else if (v_Plovdiv > 1000 && v_Plovdiv <= 10000) {
	    		comission_p = (12 * v_Plovdiv)/100;
	    		System.out.printf("Your Comssion is %.2f%n" , comission_p);
	    		
	    	}
	    	else if (v_Plovdiv > 10000) {
	    		comission_p = (14.5 * v_Plovdiv)/100;
	    		System.out.printf("Your Comssion is %.2f%n " , comission_p);
	    	}
	    	else 
	    	{
	    		System.out.println("Enter VALID Data");
	    	}
	    	break;
	        default:
	        	System.out.println("ERROR");
	    }
	}
	}