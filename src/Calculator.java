public class Calculator {
    public void plus(int a, int b) {
        // Data Access Object
        System.out.println(a + b);
    }

    public void minus(int a, int b) {
        System.out.println(a - b);
    }

    public void multiple(int a, int b) {
        System.out.println(a * b);
    }

    public void divide(int a, int b) {
       try {
           float result = (float)a / (float)b;
           System.out.println(result);
       } catch (ArithmeticException e) {
           System.out.println("Error: " + e.getMessage());
       }
    }
}
