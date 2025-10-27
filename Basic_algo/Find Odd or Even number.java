// Time Complexity:
//  O(1) — Constant Time
// Space Complexity:
//  O(1) — Constant Space

import java.util.*;
import java.util.Scanner;

public class OddEven {
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           System.out.print("Enter any number: ");
           int number = scanner.nextInt();
           if (number % 2 == 0) {
              System.out.println(number + " is even.");
           } else {
                System.out.println(number + " is odd.");
          }
       }
   }
