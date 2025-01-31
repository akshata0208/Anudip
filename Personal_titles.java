import java.util.Scanner;

public class Personal_titles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner s = new Scanner(System.in);
            System.out.println("Enter your Age");
            double age = s.nextDouble();
            System.out.println("Enter your Gender");
            char gender = s.next().toLowerCase().charAt(0);
            System.out.println("");
            if (age > 16 && gender == 'm') {
            	System.out.println("Mr");
            }
            if (age < 16 && gender == 'm') {
            	System.out.println("Master");
            }
            if (age > 16 && gender == 'f') {
            	System.out.println("Ms");
            } 
            if (age < 16 && gender == 'f') {
            	System.out.println("Miss1");
            }
            
            
	}

}
