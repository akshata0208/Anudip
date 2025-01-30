import java.util.Scanner;

public class rectangle {
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println(" Program for Area and Perimeter of rectangle");
		
		System.out.println("Enter Length of Rectangle");
		float l = s.nextInt();
		
		System.out.println("Enter Breadth of Rectangle");
		float b = s.nextInt();
		
		float area = l * b;
		float perimeter = 2 * l *b;
		
		System.out.println("Area of rectangle:" + area); 
		System.out.println("Perimeter of Rectangle:" + perimeter);
		
	}

}
