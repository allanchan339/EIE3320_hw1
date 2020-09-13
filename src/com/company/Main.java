// 17067305d CHAN CHEUK YIU
// JDK 14
// MacOS
// hw1


package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("Enter a number of lines: ");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int k = 0, count= 0, count1 = 0;

        for(int i = 1; i <= rows; ++i) {
            for(int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
                ++count;
            }
            //this part is used to calculate space, and print

            while(k != 2 * i - 1) {
                if (count <= rows - 1) {
                    System.out.print((i - k) + " ");
                    ++count;
                }
                else {
                    ++count1;
                    System.out.print(-(i - k) + 2 + " ");
                }

                ++k;
            }
            count1 = count = k = 0;

            System.out.println();
        }
    }
}
