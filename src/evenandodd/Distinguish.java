package evenandodd;

public class Distinguish {
    private NumberTypeFind numberTypeFind;
    Distinguish(NumberTypeFind numberTypeFind) {
        this.numberTypeFind = numberTypeFind;
    }

    public boolean distinguishNum(int num) {
        return numberTypeFind.findType(num);
    }
}
