import java.util.Scanner;
public class Operators {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
        System.out.println("Enter 1st Number");
        int operator1 = s.nextInt();
        
        System.out.println("Enter 2nd Number");
        int operator2 = s.nextInt();
        
        System.out.println("Arthmetic Operartor");
        int add = operator1 + operator2;
        int sub = operator1 - operator2;
        int mul = operator1 * operator2;
        float div  = (float)(operator1 / operator2);
        float mod  = (float)(operator1  % operator2);
        
        System.out.println("Addition " + add );
        System.out.println("Subtraction " + sub );
        System.out.println("Multiplication " + mul );
        System.out.println("Division " + div );
        System.out.println("Modulo " + mod );
        System.out.println(" ");
        
             System.out.println("Comparsion Operartor");
             
        	 boolean greater_than = operator1 > operator2;
        	 System.out.println("Greater than " + greater_than );
        	
        	 boolean less_than = operator1 < operator2;
        	 System.out.println("Less than " + less_than );
        	 
        	 boolean equal_to = operator1 == operator2;  	
        	 System.out.println("Equal to " + equal_to);
        	
        	 boolean greater_equal_to = operator1 >= operator2;
        	 System.out.println("Greater than equalto " + greater_equal_to);
        	 
        	 boolean less_equal_to = operator1 <= operator2;
        	 System.out.println("Less than equalto " + less_equal_to);
        	 
        	 boolean not_equal_to = operator1 != operator2;
        	 System.out.println("Lesss than equalto " + not_equal_to);
        	 System.out.println(" ");
        	 
        	 System.out.println("Logical Operator");
        	 
        	 if(operator1>5 && operator2< 50) {
        		 System.out.println("Logical And");
        	 }
        	 
        	 if(operator1>5 || operator2< 50)
        	 {
        		 System.out.println("Logical OR");
        	 }
        	 
        	 if(operator2 != 67)
        	 {
        		 System.out.println("Logical NOT");
        	 }
        	 
      
        	 System.out.println(" ");
        	 System.out.println("Binary Operator");
        	 
        	 System.out.println("BITWISE AND");
        	 System.out.println(operator1 & operator2);
        	 
        	 System.out.println("BITWISE OR");
        	 System.out.println(operator1 | operator2);
        	 
        	 System.out.println("BITWISE XOR");
        	 System.out.println(operator1 ^ operator2);
        	 
        	 System.out.println("BITWISE NOT");
        	 System.out.println( ~ operator2);
        	 
        	 
        	 System.out.println("");        	 
        	 System.out.println("Uniary Operations");
        	 System.out.println(operator1++);
        	 System.out.println(++operator2);
        	 
        	 System.out.println("");        	 
        	 System.out.println("Tertianary Operations");
        	 System.out.println(operator1);
        	 System.out.println(operator2);
        	 int result = operator1 % 2;
        	 System.out.println((result == 0) ? "Even":"Odd");
        	 
        }
        
	}


