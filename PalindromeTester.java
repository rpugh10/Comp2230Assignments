import java.util.Scanner;

public class PalindromeTester {
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PalindromeEvaluator evaluator = new PalindromeEvaluator();

        System.out.println("Enter a string: ");
        String input = scan.nextLine();

        String reversedString = evaluator.reverseString(input);

        boolean palindrome = evaluator.isPalindrome(reversedString);

        if(palindrome == true){
            System.out.println("The string " + input + " is a palindrome");
        }
        else{
            System.out.println("That string is not a palindrome");
        }
    }
}
