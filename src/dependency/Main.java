package dependency;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new RandomNumberGenerator();
        NumberGenerator sNumberGenerator = new SpecificNumberGenerator();

        Calculator calc = new Calculator(numberGenerator);
        Calculator sCalc = new Calculator(sNumberGenerator);

        calc.plus();
        calc.minus();
        calc.multiply();
        calc.divide();

        sCalc.plus();
        sCalc.minus();
        sCalc.multiply();
        sCalc.divide();
    }
}
