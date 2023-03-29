import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
        //Test Data:
        //Input first number: 125
        //Input second number: 24
        //Expected Output :
        //125 + 24 = 149
        //125 - 24 = 101
        //125 x 24 = 3000
        //125 / 24 = 5
        //125 mod 24 = 5

        Scanner scan = new Scanner(System.in);

        System.out.println("Give the first number:");
        int n1 = scan.nextInt();

        System.out.println("Give the second number:");
        int n2 = scan.nextInt();

        System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
        System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
        System.out.println(n1 + " x " + n2 + " = " + (n1*n2));
        System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
        System.out.println(n1 + " mod " + n2 + " = " + (n1%n2));

    }
}