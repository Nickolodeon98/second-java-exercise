public class NumberCalculator implements RandomNumber{

    @Override
    public int randomNumber() {
        return rand.nextInt(10);
    }

    public static void main(String[] args) {
        NumberCalculator test = new NumberCalculator();

        test.randomNumber();
    }
}
