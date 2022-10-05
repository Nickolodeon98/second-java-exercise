package evenandodd;

import java.util.Scanner;

public class DistinguishMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(">>> ");
        int first = sc.nextInt();
        int second = sc.nextInt();

        Distinguish englishTest = new Distinguish(new EnglishResult());
        Distinguish koreanTest = new Distinguish(new KoreanResult());

        englishTest.distinguishNums(first, second);
        System.out.println();
        koreanTest.distinguishNums(first, second);

    }
}
