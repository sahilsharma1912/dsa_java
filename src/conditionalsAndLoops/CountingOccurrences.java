package conditionalsAndLoops;

import java.util.Scanner;


/*
* n % 10 will give us the last digit
* */

public class CountingOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find the occurrences : ");
        long number = sc.nextLong();

        System.out.print("Find occurrences of : ");
        int n =  sc.nextInt();
        int count = 0;

        while(number > 0) {
            long rem = number % 10;
            if (rem == n) {
                count++;
            }

            number /= 10;
        }
        System.out.println(count);

    }
}
