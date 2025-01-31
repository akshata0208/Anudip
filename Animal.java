import java.util.Scanner;
public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
         System.out.println("Enter Animal");
         String animal = s.nextLine().toLowerCase();
         if(animal.equals("dog")) {
        	 System.out.println("Mammal");
         }
         else if(animal.equals("crocodile") || animal.equals("tortoise")|| animal.equals("snake")) {
        	 System.out.println("The type is");
        	 System.out.println("Reptile");
         }
         else {
        	 System.out.println("Unknown");
         }
	}

}
