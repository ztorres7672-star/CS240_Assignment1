/**
 * Program: Numberbase Converter
 * Description: 2. Build a number-base converter supporting binary, decimal, octal, and hexadecimal.
 * Section: CS 240
 * Date: August 27, 2026
 * @author Student Name: Ziahn Torres
 */
import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Numberbase_Converter {
    public static void main(String[] args) {
        //User input
        Scanner scan1 = new Scanner(System.in);
        System.out.println("What base is your number?: ");
        String s1 = scan1.nextLine();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter Your Number: ");

        //Printing out the 3 other bases
        if (s1.equals("Decimal") || s1.equals("decimal")){
            Integer s2 = scan2.nextInt();
            System.out.println("Binary: " + Integer.toBinaryString(s2));
            System.out.println("Hex: " + Integer.toHexString(s2));
            System.out.println("Octal: " + Integer.toOctalString(s2));
        }

        if (s1.equals("Binary") || s1.equals("binary")){
            String s2 = scan2.next();
            // checking if it is in Base-2
            if(s2.chars().allMatch(c -> c == '0' || c == '1')){
                int binaryNum = Integer.parseInt(s2, 2);
                System.out.println("Decimal: " + binaryNum);
                System.out.println("Hex: " + Integer.toHexString(binaryNum));
                System.out.println("Octal: " + Integer.toOctalString(binaryNum));
            } else{System.out.println("N/A");}
        }

        if (s1.equals("Hex") || s1.equals("hex")){
            String s2 = scan2.next();
            // checking if it is in Base-16
            if(s2.chars().allMatch(c -> c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6'
                    || c == '7' || c == '8' || c == '9' || c == 'a' || c == 'A' || c == 'b' || c == 'B' || c == 'c' || c == 'C'
                    || c == 'd' || c == 'D' || c == 'e' || c == 'E' || c == 'f' || c == 'F' || c == '-')){
                int hexNum = Integer.parseInt(s2, 16);
                System.out.println("Decimal: " + hexNum);
                System.out.println("Binary: " + Integer.toBinaryString(hexNum));
                System.out.println("Octal: " + Integer.toOctalString(hexNum));
            }
            else{System.out.println("N/A");}
        }

        if (s1.equals("Octal") || s1.equals("octal")){
            String s2 = scan2.next();
            // checking if it is in Base-8
            if(!(s2.contains("8") || s2.contains("9"))){
                int octalNum = Integer.parseInt(s2, 8);
                System.out.println("Decimal: " + octalNum);
                System.out.println("Binary: " + Integer.toBinaryString(octalNum));
                System.out.println("Hex: " + Integer.toHexString(octalNum));}
            else{System.out.println("N/A");}
        }

        //recursion
        main(new String[]{});
    }
}
