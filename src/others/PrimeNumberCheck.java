package others;

/**
 * Check whether a number is Prime or not
 * */

public class PrimeNumberCheck {
    public static void main(String[] args) {
        int num = 35;
        System.out.println(isPrime(num));
    }

    public static boolean isPrime(int num) {

        if (num <= 1) return false;
        if (num == 2 || num == 3) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }

        return true;

    }
}
