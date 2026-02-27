import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
       String word = "civic";
       Stack<Character> stack = new Stack<>();
       Queue<Character> queue = new LinkedList<>();

        for (char c : word.toCharArray()) {
              stack.push(c);
              queue.add(c);
         }
        boolean isPalindrome = true;
            while (!stack.isEmpty()) {
                if (stack.pop() != queue.remove()) {
                    isPalindrome = false;
                    break;
                }
            }



    System.out.println("Input text: " + word);
    System.out.println("Is palindrome: " + isPalindrome);
    }
}
