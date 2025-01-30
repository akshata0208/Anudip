import java.util.Scanner;
public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner s =new Scanner(System.in);
          System.out.println("Area and Perimeter of Circle");
          System.out.println("Enter Radius of Circle");
          float radius = s.nextFloat();
          float area =  3.14f * radius*radius;
          double perimeter = 2 * 3.14 * radius ;
          System.out.println("Area of Circle is " + area);
          System.out.println("Perimeter of Circle is " + perimeter);
	}

}
