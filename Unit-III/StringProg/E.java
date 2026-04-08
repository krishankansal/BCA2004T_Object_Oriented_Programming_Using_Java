// To check if a given string is a palindrome or not, 
// we can reverse the string and compare it with the original string. 
// If both are the same, then the string is a palindrome. 
// Here is a simple Java program that implements this logic:

class E {
    public static void main(String[] args) {
        String s = "madam";
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        if (s.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
