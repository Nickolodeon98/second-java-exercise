package evenandodd;

public class DistinguishMain {
    public static void main(String[] args) {
        Distinguish evenTest = new Distinguish(new EvenNumber());
        Distinguish oddTest = new Distinguish(new OddNumber());

        if (evenTest.distinguishNum(20)) System.out.println("짝수");
        if (oddTest.distinguishNum(20)) System.out.println("홀수");
    }
}
