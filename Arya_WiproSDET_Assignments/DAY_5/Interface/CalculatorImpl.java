package Interface;

class CalculatorImpl implements Operation {

    public void divide(int a, int b) {

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }
    }
}