public class Calculator {
    private int num;
    private NumberCalculator randomNumberCalculator;
    public Calculator(int num, NumberCalculator numberCalculator) {
        this.num = num;
        this.randomNumberCalculator = numberCalculator;
    }

    public void plus() {
        // Data Access Object
        System.out.println(num + randomNumberCalculator.randomNumber());
    }

    public void minus() {
        System.out.println(num - randomNumberCalculator.randomNumber());
    }

    public void multiple() {
        System.out.println(num * randomNumberCalculator.randomNumber());
    }

    public void divide() {
       try {
           System.out.println((float) num / randomNumberCalculator.randomNumber());
       } catch (ArithmeticException e) {
           System.out.println("0으로 나눌 수 없습니다: " + e.getMessage());
       }
    }
}
