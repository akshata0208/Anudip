import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Employee Name:");
        String name = s.nextLine();

        System.out.println("Enter Employee Age:");
        int age = s.nextInt();
        

        System.out.println("Enter Employee Salary:");
        double salary = s.nextDouble();
       
        System.out.println("Enter Employee Gender:");
        String gender = s.nextLine();

        System.out.println("Enter Employee Address:");
        String address = s.nextLine();

        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);

        s.close();
    }
}
