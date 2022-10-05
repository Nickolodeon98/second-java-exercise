public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void plus() {
        // Data Access Object
        System.out.println(a + b);
    }

    public void minus() {
        System.out.println(a - b);
    }

    public void multiple() {
        System.out.println(a * b);
    }

    public void divide() {
       try {
           System.out.println(a / b);
       } catch (ArithmeticException e) {
           System.out.println("Error: " + e.getMessage());
       }
    }
}
