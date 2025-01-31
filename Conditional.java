import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Conditional Statements");
		System.out.println("");
		System.out.println("1.Even or Odd test");
		System.out.println("2.Check for the vowel");
		System.out.println("3.5's Divisiblity test");
		System.out.println("4.Largest of Three");
		System.out.println("Enter Your operation");
		int choice = s.nextInt();
		switch(choice) {
		case 1:
			System.out.println("");
			System.out.println("Enter Number to check wether its even or odd");
			int number_1 = s.nextInt();
			if (number_1 % 2 == 0) {
				System.out.println("");
				System.out.println(number_1 + " Number is even");
			}
			else
			{
				System.out.println(number_1 + " Number is odd");
			}
			break;
		case 2:
			System.out.println("");
			System.out.println("Check for the vowel");
			char ch = s.next().toLowerCase().charAt(0);
	        if (ch == 'a' || ch == 'e' || ch =='i'|| ch == 'o' || ch =='u' ) {
	        	System.out.println(ch + " is vowel");
	        }
	        else {
	        	System.out.println(ch + " is not vowel");
	        }
			break;
		case 3:
			System.out.println("");
			System.out.println("Enter number to check wether its divisible by 5");
			int num_5 = s.nextInt();
			if (num_5 % 5 ==0) {
				System.out.println(num_5 +" Number is divisible by 5 ");
			}
			else
			{
				System.out.println(num_5 +" Number is not divisible by 5 ");
			}
			break;
		case 4:
			System.out.println("");
			System.out.println("Largest of 3 number");
			System.out.println("ENTER NUM 1");
			int num1 = s.nextInt();
			System.out.println("ENTER NUM 2");
			int num2 = s.nextInt();
			System.out.println("ENTER NUM 3");
			int num3 = s.nextInt();
			if(num1 > num2) {
				if (num1> num3)
				{
					System.out.println(num1 +"Number is greater than"+ num2 +""+num3);
				}	
			}
			
			if(num2 > num1) {
				if (num2> num3)
				{
					System.out.println(num2 +"Number is greater than"+ num2 +""+num3);
				}	
			}
			if(num3 > num1) {
				if (num3> num2)
				{
					System.out.println(num3 +"Number is greater than"+ num2 +""+num3);
				}	
			}
		default:
			System.out.println("Enter valid operation");
			
		}
		System.out.println("Reload again for next operation");
          
	}
	

}
