public class P14_ReverseTest {
    public static void main(String[] args) {
        String[][] cases = {{"cat", "tac"}, {"straw", "warts"}, {"a", "a"}, {"", ""}, {"Hello, World", "dlroW ,olleH"}};
        for (String[] c : cases) {
            T.check("reverse(\"" + c[0] + "\")", c[1], () -> P14_Reverse.reverse(c[0]));
        }
        T.done();
    }
}
