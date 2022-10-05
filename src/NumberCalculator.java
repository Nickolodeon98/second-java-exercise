public class NumberCalculator implements RandomNumber{

    @Override
    public int randomNumber() {
        return rand.nextInt(10);
    }
}
