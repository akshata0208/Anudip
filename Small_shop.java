import java.util.Scanner;
public class Small_shop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Select City");
	    System.out.println("1.Sofia\n2.Varna\n3.Plodiv");
	    int choice_city = s.nextInt();
	    
	    System.out.println("");
	    
	    System.out.println("Selected City is " + choice_city);
	    
	    switch(choice_city)
	    {
	    
	    case 1:
	    	System.out.println("Sofia");
	    	System.out.println("Enter the product you want in city Sofia \n1.coffee\n2.water\n3.beer\n4.sweets\n5.peanuts");
	    	int choice_product_s = s.nextInt();
	    	
	    	switch (choice_product_s)
	    	{
	    	case 1:
	    		System.out.println("Enter the Quantity of coffee");
	    		int choice_quantity_s_c = s.nextInt();
	    		double price_coffee_s = 0.50 * choice_quantity_s_c;
	    		System.out.println("");
	    		System.out.printf("%.2f%n",price_coffee_s);
	    		break;
	    		
	    	case 2:
	    		System.out.println("Enter the Quantity of water");
	    		int choice_quantity_s_w = s.nextInt();
	    		double price_water_s = 0.80 * choice_quantity_s_w;
	    		System.out.println("");
	    		System.out.printf("%.2f%n",price_water_s);
	    		break;
	    		
	    	case 3:
	    		System.out.println("Enter the Quantity of beer");
	    		int choice_quantity_s_b = s.nextInt();
	    		double price_bear_s = 1.20 * choice_quantity_s_b;
	    		System.out.println("");
	    		System.out.printf("%.2f%n",price_bear_s);
	    		break;
	    		
	    	case 4:
	    		System.out.println("Enter the Quantity of sweets");
	    		int choice_quantity_s_s = s.nextInt();
	    		double price_sweets_s = 1.45 * choice_quantity_s_s;
	    		System.out.println("");
	    		System.out.printf("%.2f%n",price_sweets_s);
	    		break;
	    		
	    	case 5:
	    		System.out.println("Enter the Quantity of peanuts");
	    		int choice_quantity_s_p = s.nextInt();
	    		double price_peanuts_s = 1.45 * choice_quantity_s_p;
	    		System.out.println("");
	    		System.out.printf("%.2f%n",price_peanuts_s);
	    		break;
	    		
	    	default:
	    		System.out.println("Enter valid choice");
	    	}
	    	
	    	break;
	    case 2:
	    	System.out.println("Varna");
	    	System.out.println("Enter the product you want in city Varna \n1.coffee\n2.water\n3.beer\n4.sweets\n5.peanuts");
	    	int choice_product_v = s.nextInt();
	    	switch (choice_product_v)
	    	{
	    	case 1:
	    		System.out.println("Enter the Quantity of coffee");
	    		int choice_quantity_v_c = s.nextInt();
	    		double price_coffee_v = 0.45 * choice_quantity_v_c;
	    		System.out.println("");
	    		System.out.printf("%.2f%n",price_coffee_v);
	    		break;
	    		
	    	case 2:
	    		System.out.println("Enter the Quantity of water");
	    		int choice_quantity_v_w = s.nextInt();
	    		double price_water_v = 0.70 * choice_quantity_v_w;
	    		System.out.println("");
	    		System.out.printf("%.2f%n",price_water_v);
	    		break;
	    		
	    	case 3:
	    		System.out.println("Enter the Quantity of beer");
	    		int choice_quantity_v_b = s.nextInt();
	    		double price_bear_v = 1.10 * choice_quantity_v_b;
	    		System.out.println("");
	    		System.out.printf("%.2f%n",price_bear_v);
	    		break;
	    		
	    	case 4:
	    		System.out.println("Enter the Quantity of sweets");
	    		int choice_quantity_v_s = s.nextInt();
	    		double price_sweets_v = 1.35 * choice_quantity_v_s;
	    		System.out.println("");
	    		System.out.printf("%.2f%n",price_sweets_v);
	    		break;
	    		
	    	case 5:
	    		System.out.println("Enter the Quantity of peanuts");
	    		int choice_quantity_v_p = s.nextInt();
	    		double price_peanuts_v = 1.55 * choice_quantity_v_p;
	    		System.out.println("");
	    		System.out.printf("%.2f%",price_peanuts_v);
	    		break;
	    		
	    	default:
	    		System.out.println("Enter valid choice");
	    	}
	    	break;
	    case 3:
	    	System.out.println("Plodiv");
	    	System.out.println("Enter the product you want in city Plovdiv \n1.coffee\n2.water\n3.beer\n4.sweets\n5.peanuts");
	    	int choice_product_p = s.nextInt();
	    	
	    	switch (choice_product_p)
	    	{
	    	
	    	case 1:
	    		
	    		System.out.println("Enter the Quantity of coffee");
	    		int choice_quantity_p_c = s.nextInt();
	    		double price_coffee_p = 0.45 * choice_quantity_p_c;
	    		System.out.println("");
	    		System.out.printf("%.2f%n",price_coffee_p);
	    		break;
	    		
	    	case 2:
	    		System.out.println("Enter the Quantity of water");
	    		int choice_quantity_p_w = s.nextInt();
	    		double price_water_p= 0.70 * choice_quantity_p_w;
	    		System.out.println("");
	    		System.out.printf("%.2f%n",price_water_p);
	    		break;
	    		
	    	case 3:
	    		System.out.println("Enter the Quantity of beer");
	    		int choice_quantity_p_b = s.nextInt();
	    		double price_bear_p = 1.10 * choice_quantity_p_b;
	    		System.out.println("");
	    		System.out.printf("%.2f%n",price_bear_p);
	    		break;
	    		
	    	case 4:
	    		System.out.println("Enter the Quantity of sweets");
	    		int choice_quantity_p_s = s.nextInt();
	    		double price_sweets_p = 1.35 * choice_quantity_p_s;
	    		System.out.println("");
	    		System.out.printf("%.2f%n",price_sweets_p);
	    		break;
	    		
	    	case 5:
	    		System.out.println("Enter the Quantity of peanuts");
	    		int choice_quantity_p_p = s.nextInt();
	    		double price_peanuts_p = 1.55 * choice_quantity_p_p;
	    		System.out.println("");
	    		System.out.printf("%.2f%n",price_peanuts_p);
	    		break;
	    		
	    	default:
	    		System.out.println("Enter valid choice");
	    	}
	    break;
	    default:
	    	System.out.println("Erroronus Entery");   	
	    }
	    
	    System.out.println("Thankyou !");	    
	}
}   
	    
	    
	    
	    
	    
