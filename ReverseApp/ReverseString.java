import java.util.Scanner;

public class ReverseString {

//this is a method to reverse the string
    public static String reverse(String str) {
        StringBuilder reversedStr = new StringBuilder(str);
        return reversedStr.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to be reversed:");
        String input = scanner.nextLine();
        String reversed = reverse(input);
        System.out.println(reversed);
        scanner.close();
    }

}
