public class PalindromeCheckerApp {

    public static void main(String[] args) {
       String word = "madam";
       boolean isPalindrome = true;

       for(int i = 0; i < word.length() / 2; i++) {
           if(word.charAt(i) != word.charAt(word.length() - 1 - i)) {
               isPalindrome = false;
               break;
           }
       }
       System.out.println("Input text: " + word);
       System.out.println("Is palindrome: " + isPalindrome);
    }
}
