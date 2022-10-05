package pojo;

public class Calculator {
    private NumberCreator numberCreator;
    private int baseNum;
    public Calculator(NumberCreator numberCreator) {
        this.numberCreator = numberCreator;
        this.baseNum= 10;
    }

    public Calculator(NumberCreator numberCreator, int baseNum) {
        this.numberCreator = numberCreator;
        this.baseNum= baseNum;
    }

    public void plus(int num) {
        System.out.println(baseNum + numberCreator.numberReturn(num));
    }

}