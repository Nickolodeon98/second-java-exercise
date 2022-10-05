public class RandomNumberCalculator extends NumberCalculator implements RandomNumber{
    @Override
    public int randomNumber() {
        return rand.nextInt(100);
    }
}
