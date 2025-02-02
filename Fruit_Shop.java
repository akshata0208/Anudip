import java.util.Scanner;
public class Fruit_Shop {

	public static void main(String[] args) {
		 Scanner s =  new Scanner(System.in);
		 
		 System.out.println("Enter the Fruit You want");
		 String fruit = s.nextLine().toLowerCase();
		 
		 System.out.println("Enter the Day You want");
		 String day = s.nextLine().toLowerCase();
		 
		 if (day.equals("monday") || day.equals("tuseday") || day.equals("wednesday") || day.equals("thrusday") || day.equals("friday"))
		 {
		 switch (fruit) {
		 
		 case ("banana"):
		 case ("bananas"):
			 System.out.println("Enter the Quantity of banana You want");
		     double quantity_b = s.nextDouble();
		     System.out.printf("Price of Banana %.2f%n " , 2.50 *quantity_b);
		     break;
		     
		 case ("apple"):
		 case ("apples"):
			 System.out.println("Enter the Quantity of apple You want");
		     double quantity_a = s.nextDouble();
		     System.out.printf("Price of Apple %.2f%n" ,1.20 *quantity_a);
		     break;
		     
		 case ("orange"):
		 case ("oranges"):
			 System.out.println("Enter the Quantity of banana You want");
		     double quantity_o = s.nextDouble();
		     System.out.printf("Price of Orange  %.2f%n" , 0.85 *quantity_o);
		     break;
		     
		 case ("grapefruit"):
			 System.out.println("Enter the Quantity of banana You want");
		     double quantity_g = s.nextDouble();
		     System.out.printf("Price of grapefruit  %.2f%n" ,1.45 *quantity_g);
		     break;
		     
		 case ("kiwi"):
		 case("kiwis"):
			 System.out.println("Enter the Quantity of kiwi You want");
		     double quantity_k = s.nextDouble();
		     System.out.printf("Price of kiwi %.2f%n " , 2.70 *quantity_k);
		     break;
		     
		 case ("pineapples"):
		 case ("pineapple"):
			 System.out.println("Enter the Quantity of pineapples You want");
		     double quantity_p = s.nextDouble();
		     System.out.printf("Price of pineapples %.2f%n " , 5.50 *quantity_p);
		     break;
		     
		 case ("grapes"):
		 case("grape"):
			 System.out.println("Enter the Quantity of grapes You want");
		     double quantity_grapes = s.nextDouble();	
		     System.out.printf("Price of Banana %.2f%n " ,3.85 *quantity_grapes);
		     break;
		 default:
			 System.out.println("Fruit Unavialable");

		 }
		 }
		 
		 else {
			 
			 if ( day.equals("sunday") || day.equals("saturday"))
			 {
				 switch (fruit) {
					 
				 case ("banana"):
				 case ("bananas"):
					 System.out.println("Enter the Quantity of banana You want");
				     double quantity_b_w = s.nextDouble();
				     System.out.printf("Price of Banana %.2f% " ,2.70 *quantity_b_w);
				     break;
				     
				 case ("apple"):
				 case ("apples"):
					 System.out.println("Enter the Quantity of apple You want");
				     double quantity_a_w = s.nextDouble();
				     System.out.printf("Price of Apple %.2f%n" ,1.25 *quantity_a_w);
				     break;
				     
				 case ("orange"):
				 case ("oranges"):
					 System.out.println("Enter the Quantity of orange You want");
				     double quantity_o_w = s.nextDouble();
				     System.out.printf("Price of Orange  %.2f%n" , 0.90 *quantity_o_w);
				     break;
				     
				 case ("grapefruit"):
					 System.out.println("Enter the Quantity of Grapefruit You want");
				     double quantity_g_w = s.nextDouble();
				     System.out.printf("Price of grapefruit  %.2f%n" , 1.60 *quantity_g_w);
				     break;
				     
				 case ("kiwi"):
				 case ("kiwis"):
					 System.out.println("Enter the Quantity of kiwi You want");
				     double quantity_k_w = s.nextDouble();
				     System.out.printf("Price of kiwi %.2f%n " , 3.00 *quantity_k_w);
				     break;
				     
				 case ("pineapples"):
				 case ("pineapple"):
					 System.out.println("Enter the Quantity of pineapples You want");
				     double quantity_p_w = s.nextDouble();
				     System.out.printf("Price of pineapples %.2f%n " , 5.00 *quantity_p_w);
				     break;
				     
				 case ("grapes"):
				 case ("grape"):
					 System.out.println("Enter the Quantity of grapes You want");
				     double quantity_grapes_w = s.nextDouble();	
				     System.out.printf("Price of Banana %.2f%n " ,4.20 *quantity_grapes_w);
				     break;
				 default:
					 System.out.println("Fruit Unavilable");
				 }
			 }
		 }
	}
}
		 