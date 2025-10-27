// Time Complexity:
// O(n) → Linear time in terms of num.
// Space Complexity: O(1)

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false; // numbers <= 1 are not prime

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false; // divisible by i → not prime
            }
        }
        return true;
    }
}
