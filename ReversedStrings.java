import java.util.Scanner;

public class ReversedStrings {
    public static void main(String[] args) {
        // Prompt the user to enter a string
        System.out.print("Enter a word or sentence: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        // Reverse the string
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        
        // Display the reversed string
        System.out.println("Reversed string: " + reversed);
    }
}
