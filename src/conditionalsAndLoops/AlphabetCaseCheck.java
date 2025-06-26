package conditionalsAndLoops;

import java.util.Scanner;

public class AlphabetCaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("It is a lowercase alphabet");
        } else {
            System.out.println("It is a uppercase alphabet");
        }
    }
}
