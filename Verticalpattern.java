package pst;
import java.util.Scanner;

public class Verticalpattern {

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        patterngenerator.printVertical(n);
        patterngenerator.printHorizontal(n);
        sc.close();
    }
}


class patterngenerator {

    public static void printVertical(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }

    public static void printHorizontal(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }
}