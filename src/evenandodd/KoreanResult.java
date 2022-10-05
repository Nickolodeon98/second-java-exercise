package evenandodd;

public class KoreanResult implements NumberTypeFind{
    @Override
    public void findType(int num) {
        if (num % 2 == 0) System.out.print("짝수");
        else System.out.print("홀수");
    }
}
