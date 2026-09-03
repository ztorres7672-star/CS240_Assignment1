/**
 * Program: ASCII to Decimal
 * Description: 1. Build an ASCII-to-decimal converter.
 * Section: CS 240
 * Date: August 26, 2026
 * @author Student Name: Ziahn Torres
 */
import java.util.Scanner;

public class ASCII_Decimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your String: ");
        String s = scan.nextLine();
        for (Character c : s.toCharArray()){
            System.out.println(c.hashCode());
        }
        //recursion
        main(new String[]{});
    }
}