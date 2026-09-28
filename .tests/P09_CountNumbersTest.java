public class P09_CountNumbersTest {
    public static void main(String[] args) {
        T.check("countNumbers({\"12\", \"abc\", \"-5\", \"3.5\"})", 2, () -> P09_CountNumbers.countNumbers(new String[] {"12", "abc", "-5", "3.5"}));
        T.check("countNumbers({\"1\", \"2\", \"3\"})", 3, () -> P09_CountNumbers.countNumbers(new String[] {"1", "2", "3"}));
        T.check("countNumbers({\"one\", \"\", \" 7\"})", 0, () -> P09_CountNumbers.countNumbers(new String[] {"one", "", " 7"}));
        T.check("countNumbers({})", 0, () -> P09_CountNumbers.countNumbers(new String[] {}));
        T.done();
    }
}
