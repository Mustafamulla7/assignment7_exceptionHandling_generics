import java.util.Scanner;

public class ExceptionHandling {

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is less than 18, not allowed to vote.");
        } else {
            System.out.println("Eligible to vote.");
        }
    }

    public static void main(String[] args) {
        try {
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter your age: ");
            int age=scan.nextInt();
            checkAge(age); 
            scan.close();
        } catch (InvalidAgeException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }
    }
}
