package dependency;

public class Calculator {
    NumberGenerator numberGenerator;

    Calculator(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public void plus() {
        System.out.println(10 + numberGenerator.generate(10));
    }

    public void minus() {
        System.out.println(10 - numberGenerator.generate(10));
    }

    public void multiply() {
        System.out.println(10 * numberGenerator.generate(10));
    }

    public void divide() {
        float generated = numberGenerator.generate(10);
        if (generated == 0) System.out.println("0으로 나눌 수 없습니다.");
        else {
            try {
                System.out.println((float) 10 / generated);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
