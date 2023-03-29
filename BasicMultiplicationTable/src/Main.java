import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
        //Test Data:
        //Input a number: 8
        //Expected Output :
        //8 x 1 = 8
        //8 x 2 = 16
        //8 x 3 = 24
        //...
        //8 x 10 = 80

        Scanner scan = new Scanner(System.in);

        System.out.println("Input a number:");
        int number = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

    }
}