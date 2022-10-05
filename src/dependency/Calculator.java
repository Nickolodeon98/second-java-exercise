package dependency;

public class Calculator {
    NumberGenerator numberGenerator;

    Calculator(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public void plus() {
        System.out.println(10 + numberGenerator.generate(10));
    }
}
