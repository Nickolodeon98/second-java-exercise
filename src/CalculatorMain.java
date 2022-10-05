public class CalculatorMain {
    public static void main(String[] args) {
        NumberCalculator numberCalculator = new NumberCalculator();
        Calculator calc = new Calculator(10, numberCalculator);
        calc.plus();
        calc.minus();
        calc.multiple();
        calc.divide();
    }
}
