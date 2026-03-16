public class PalindromeCheckerApp {

    public static void main(String[] args) {
        
        String original = "A man a plan a canal Panama";
        String normalized = original.replaceAll("[^a-zA-Z]", "").toLowerCase();
        
   
        boolean isPalindrome = isPalindromeRecursive(normalized);


        System.out.println("Input String  : " + original);
        System.out.println("Normalized    : " + normalized);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }

 
    public static boolean isPalindromeRecursive(String str) {
       
        if (str.length() <= 1) {
            return true;
        }

        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }


        return isPalindromeRecursive(str.substring(1, str.length() - 1));
    }
}