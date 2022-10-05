package pojo;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new ByPassNumberCreator(), 40);

        calculator.plus(200);
    }
}
