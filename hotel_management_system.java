import java.util.Scanner;
public class hotel_management_system {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("WELCOME TO THE HOTEL!!!");
		int cost =0;
		char answer_courses ;
		
		do {
		
		System.out.println(" Please select the Course \n 1.Starters \n 2.Main Course \n 3.Drinks \n 4.Dessert");
		int choice_course = s.nextInt();
		
		char ans_starter;
		char ans_Maincourse;
		char ans_Dessert;
		char ans_Drinks;
		
		int cost_starters =0;
		int cost_MainCourse =0;
		int cost_Drinks =0;
		int cost_Dessert =0;
		
		
		switch(choice_course) {
		
		case 1:
			
			do {
				
			System.out.println("Select the Starters");
			System.out.println("1.item 1 : 120 \n 2.item 2 : 140 \n 3.item 3 : 130 \n 4.item 4 : 160");
			
			int choice_starter = s.nextInt();
			
			switch(choice_starter) {
			
			case 1:
				
				System.out.print("Enter quantity of item 1 ");
				int item1_quantity = s.nextInt();
				cost_starters += item1_quantity * 120;
				break;
				
			case 2:
				
				System.out.print("Enter quantity of item 2 ");
				int item2_quantity = s.nextInt();
				cost_starters  += item2_quantity * 140;
				break;
				
			case 3:
				
			      System.out.print("Enter quantity of item 3 ");
			      int item3_quantity = s.nextInt();
			      cost_starters += item3_quantity * 130;
			      break;
			      
			case 4:
				
				  System.out.print("Enter quantity of item 4 ");
			      int item4_quantity = s.nextInt();
			      cost_starters += item4_quantity * 160;
			      break;
			      
			default:
				System.out.print("Enter valid choice");
			}
		
		System.out.println("Total cost of Starters "+cost_starters); 
		
		System.out.print("Do you want anything into starters ? Y/N ");
	    ans_starter = s.next().toLowerCase().charAt(0);
		
		}while(ans_starter == 'y');
		
			cost += cost_starters;
		
		break;
			
		case 2:
			
			do {
				
				System.out.println("Select the Maincourse");
				System.out.println("1.item 1 : 200 \n 2.item 2 : 300 \n 3.item 3 : 400 \n 4.item 4 : 600");
				
				int choice_MainCourse = s.nextInt();
			
				switch(choice_MainCourse) {
				
				case 1:
					
					System.out.print("Enter quantity of item 1 ");
					int item1_quantity = s.nextInt();
					cost_MainCourse += item1_quantity * 200;
					break;
					
				case 2:
					
					System.out.print("Enter quantity of item 2 ");
					int item2_quantity = s.nextInt();
					cost_MainCourse  += item2_quantity * 300;
					break;
					
				case 3:
					
				      System.out.print("Enter quantity of item 3 ");
				      int item3_quantity = s.nextInt();
				      cost_MainCourse += item3_quantity * 400;
				      break;
				      
				case 4:
					
					  System.out.print("Enter quantity of item 4 ");
				      int item4_quantity = s.nextInt();
				      cost_MainCourse += item4_quantity * 600;
				      break;
				      
				default:
					System.out.print("Enter valid choice");
				}
			
			System.out.println("Total cost of MainCourse "+cost_MainCourse); 
			System.out.print("Do you want anything into Maincourse ? Y/N ");
			ans_Maincourse = s.next().toLowerCase().charAt(0);
			
			}while(ans_Maincourse == 'y');
			cost += cost_MainCourse;
			
			break;
			
		case 3:
			
			
			do {
				System.out.println("Select the Drinks	");
				System.out.println("1.item 1 : 20 \n 2.item 2 : 30 \n 3.item 3 : 40 \n 4.item 4 : 60");
				
				int choice_Drinks = s.nextInt();
				
				
				switch(choice_Drinks) {
				
				case 1:
					System.out.print("Enter quantity of item 1 ");
					int item1_quantity = s.nextInt();
					cost_Drinks += item1_quantity * 20;
					break;
				case 2:
					System.out.print("Enter quantity of item 2 ");
					int item2_quantity = s.nextInt();
					cost_Drinks  += item2_quantity * 30;
					break;
				case 3:
				      System.out.print("Enter quantity of item 3 ");
				      int item3_quantity = s.nextInt();
				      cost_Drinks+= item3_quantity * 40;
				      break;
				case 4:
					  System.out.print("Enter quantity of item 4 ");
				      int item4_quantity = s.nextInt();
				      cost_Drinks += item4_quantity * 60;
				      break;
				default:
					System.out.print("Enter valid choice");
				}
			
				System.out.println("Total cost of Drinks "+cost_Drinks); 
				
			System.out.print("Do you want anything into Drinks ? Y/N ");
		    ans_Drinks = s.next().toLowerCase().charAt(0);
			
			}while(ans_Drinks == 'y');
			
            cost += cost_Drinks;
            
			break;
			
		case 4:
			
			do {
				System.out.println("Select the Dessert");
				System.out.println("1.item 1 : 200 \n 2.item 2 : 300 ");
				
				int choice_Dessert = s.nextInt();
				
				
				switch(choice_Dessert) {
				
				case 1:
					
					System.out.print("Enter quantity of item 1 ");
					int item1_quantity = s.nextInt();
					cost_Dessert += item1_quantity * 200;
					break;
					
				case 2:
					
					System.out.print("Enter quantity of item 2 ");
					int item2_quantity = s.nextInt();
					cost_Dessert += item2_quantity * 300;
					break;
	
				default:
					System.out.print("Enter valid choice");
				}
			
			System.out.println("Total cost of Deserts "+cost_Dessert); 
				
			System.out.print("Do you want anything into Desserts? Y/N ");
		    ans_Dessert = s.next().toLowerCase().charAt(0);
			
			}while(ans_Dessert == 'y');
			cost += cost_Dessert;
			
			break;
				
			default :
				System.out.println("Please select valid option");	
		}
		
		
		System.out.print("Do you want anything else ?? Y/N ");
		answer_courses = s.next().toLowerCase().charAt(0);
		}while(answer_courses == 'y');
		
		
		System.out.println("Your total bill is " + cost);
		System.out.println("Thankyou visit again !!!!");
	}
	

}
