package Week_1;

/* Prob 1 : Write a program that takes an integer, then a string, then a char from the user and prints them in the screen.

 Input:  2 Name y

 Expected Output:

 2
 Name
 y

*/

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String str = scan.next();
        char ch = scan.next().charAt(0);
        System.out.println(num);
        System.out.println(str);
        System.out.println(ch);
    }
}
