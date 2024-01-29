import java.util.Scanner;

public class MadnessWithMethods {
    public static void main(String[] args) {
        int num1 = getAnIntFromTheUser();
        int num2 = getAnIntFromTheUser();
        
        int largerNum = compareTwoInts(num1, num2);
        int sum = sumTwoInts(num1, num2);
        
        System.out.println("Larger number: " + largerNum);
        System.out.println("Sum: " + sum);
    }
    
    public static int getAnIntFromTheUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        return num;
    }
    
    public static int compareTwoInts(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
    
    public static int sumTwoInts(int num1, int num2) {
        return num1 + num2;
    }
}
