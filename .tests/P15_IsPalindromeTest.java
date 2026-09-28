public class P15_IsPalindromeTest {
    public static void main(String[] args) {
        String[] yes = {"racecar", "civic", "abba", "a", ""};
        String[] no = {"abca", "razecar", "ab", "palindrome"};
        for (String s : yes) {
            T.check("isPalindrome(\"" + s + "\")", true, () -> P15_IsPalindrome.isPalindrome(s));
        }
        for (String s : no) {
            T.check("isPalindrome(\"" + s + "\")", false, () -> P15_IsPalindrome.isPalindrome(s));
        }
        T.done();
    }
}
