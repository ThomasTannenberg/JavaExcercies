import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Write a Java program to get a number from the user and print whether it is positive or negative.
        //Test Data
        //Input number: 35
        //Expected Output :
        //Number is positive

    Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("The number is negative");
        }
        else {
            System.out.println("The number is positive");
        }


    }
}