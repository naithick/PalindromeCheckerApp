public class PalindromeCheckerApp {

    public static void main(String[] args) {
       String word = "radar";
       char[] charArray = word.toCharArray();

       int start = 0;
    int end = charArray.length - 1;
       boolean isPalindrome = true;
       while(start < end) {
           if(charArray[start] != charArray[end]) {
               isPalindrome = false;
               break;
           }
           start++;
           end--;
       }
       System.out.println("Input text: " + word);
       System.out.println("Is palindrome: " + isPalindrome);
    }
}
