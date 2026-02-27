public class PalindromeCheckerApp {

    public static void main(String[] args) {
       String word = "madam";
       String reversedWord = "";

       for(int i = word.length() - 1; i >= 0; i--) {
           reversedWord = reversedWord + word.charAt(i);
       }
       boolean isPalindrome = word.equals(reversedWord);
       System.out.println("Input text: " + word);
       System.out.println("Reversed text: " + reversedWord);
       System.out.println("Is palindrome: " + isPalindrome);
    }
}
