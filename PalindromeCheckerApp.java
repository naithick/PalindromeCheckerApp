import java.util.*;

public class PalindromeCheckerApp {


    public static void main(String[] args) {
        
        String input = "level";
        boolean isPalindrome = true;

        LinkedList<Character> charList = new LinkedList<>();

        for (char c : input.toCharArray()) {
            charList.add(c);
        }
        while (charList.size() > 1) {
            char first = charList.removeFirst();
            char last = charList.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input text: " + input);
        System.out.println("Is palindrome: " + isPalindrome);
    }
}


