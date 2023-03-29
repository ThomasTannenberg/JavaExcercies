import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Geben sie eine Zahl ein!");
        int x = Integer.valueOf(scan.nextLine());

        System.out.println("Geben Sie eine zweite Zahl ein:");
        int y = Integer.valueOf(scan.nextLine());

        System.out.println("Erste Zahl hat den Wert: " + x);
        System.out.println("Zweite Zahl hat den Wert: " + y);
        System.out.println("Starte tausch");

        x = x + y;
        y = x - y;
        x = x - y;


        System.out.println("Erste Zahl hat den Wert: " + x);
        System.out.println("Zweite Zahl hat den Wert: " + y);





    }
}