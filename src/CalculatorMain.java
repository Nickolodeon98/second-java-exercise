public class CalculatorMain{
    public static void main(String[] args) {
        Calculator calc = new Calculator(10, new SpecificNumberCalculator());
        calc.plus();
        calc.minus();
        calc.multiple();
        calc.divide();
        System.out.println();
        Calculator secCalc = new Calculator(20, new RandomNumberCalculator());
        secCalc.plus();
        secCalc.minus();
        secCalc.multiple();
        secCalc.divide();
    }
}
