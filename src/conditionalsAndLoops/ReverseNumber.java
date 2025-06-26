package conditionalsAndLoops;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        long n = sc.nextInt();

        long reverse = 0;

        while (n > 0) {
            long rem = n % 10;
            reverse = reverse * 10 + rem;
            n /= 10;
        }

        System.out.println(reverse);
    }
}
