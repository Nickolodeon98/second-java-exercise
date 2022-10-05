package evenandodd;

public class OddNumber implements NumberTypeFind{
    @Override
    public boolean findType(int num) {
        return num % 2 == 1;
    }
}
