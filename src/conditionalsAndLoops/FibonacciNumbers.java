package conditionalsAndLoops;

import java.util.Scanner;

/**
 * Find the nth fibonacci number
 * */

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("Which fibonacci number you want to find");

        int a = 0;
        int b = 1;

        /*
         * With for loop
         * */

        for (int i = 2; i <= n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        System.out.println(b);

        /*
         * With while loop
         * */

//        int count = 2;
//
//        while(count <= n) {
//            int temp = b;
//            b = a + b;
//            a = temp;
//            count++;
//        }
//
//        System.out.println(b);
    }
}
