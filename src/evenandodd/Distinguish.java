package evenandodd;

public class Distinguish {
    private NumberTypeFind numberTypeFind;
    Distinguish(NumberTypeFind numberTypeFind) {
        this.numberTypeFind = numberTypeFind;
    }

    public void distinguishNums(int firstNum, int secondNum) {
        numberTypeFind.findType(firstNum);
        System.out.print("+");
        numberTypeFind.findType(secondNum);
        System.out.print("=");
        numberTypeFind.findType(firstNum + secondNum);
    }
}
