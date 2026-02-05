package pst;
import java.util.Scanner;
public class Stringlength {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter a string:");

        String userInput = scanner.nextLine(); 


        int length = userInput.length();

        
        System.out.println("The entered string is: \"" + userInput + "\"");
        System.out.println("The length of the string is: " + length);
scanner.close();
    }
}

