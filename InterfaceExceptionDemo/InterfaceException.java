package InterfaceExceptionDemo;
import java.util.Scanner;
interface Calculator {
    void divide();
}

class Division implements Calculator {
    @Override
    public void divide() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = a / b;

            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }
        catch (Exception e) {
            System.out.println("Invalid input!");
        }
        finally {
            sc.close();
            System.out.println("Program ended.");
        }
    }
}

// Main class
public class InterfaceException {
    public static void main(String[] args) {
        Division obj = new Division();
        obj.divide();
    }
}