// To count the number of vowels in a given string, 
// we can iterate through each character of the string and check if it is a vowel
//  (a, e, i, o, u). If it is a vowel, we can increment a counter variable.
class F {
    public static void main(String[] args) {
        String s = "hello";
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}
