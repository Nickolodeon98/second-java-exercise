package evenandodd;

public class EvenNumber implements NumberTypeFind{
    @Override
    public boolean findType(int num) {
        return num % 2 == 0;
    }
}
