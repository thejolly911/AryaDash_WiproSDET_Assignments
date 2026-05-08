package Interface;

public class InterfaceMain {
    public static void main(String[] args) {

        CalculatorImpl obj = new CalculatorImpl();

        obj.divide(10, 2);
        obj.divide(10, 0); // exception case
    }
}