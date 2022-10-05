package evenandodd;

public class EnglishResult implements NumberTypeFind{
    @Override
    public void findType(int num) {
        if (num % 2 == 0) System.out.print("Even");
        else System.out.print("Odd");
    }
}
