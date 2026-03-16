import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

interface PalindromeStrategy {
    boolean check(String input);
}


class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
      
        Stack<Character> stack = new Stack<>();

  
        for (char c : input.toCharArray()) {
            stack.push(c);
        }


        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}


class DequeStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}


public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String testInput = "madam";
        
      
        PalindromeStrategy strategy = new StackStrategy();
        
        System.out.println("Using Stack Strategy:");
        System.out.println("Input: " + testInput + " | Result: " + strategy.check(testInput));
      
        strategy = new DequeStrategy();
        
        System.out.println("\nUsing Deque Strategy (Switched at runtime):");
        System.out.println("Input: " + testInput + " | Result: " + strategy.check(testInput));
    }
}