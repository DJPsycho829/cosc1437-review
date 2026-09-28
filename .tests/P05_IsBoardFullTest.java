public class P05_IsBoardFullTest {
    public static void main(String[] args) {
        check(true, "XOX", "OXO", "OXO");
        check(false, "XOX", "O O", "OXO");
        check(false, "   ", "   ", "   ");
        check(false, "XOX", "OXO", "OX ");
        check(false, " OX", "OXO", "OXO");
        T.done();
    }

    static void check(boolean expected, String... rows) {
        String call = "isBoardFull({\"" + String.join("\", \"", rows) + "\"})";
        T.check(call, expected, () -> P05_IsBoardFull.isBoardFull(T.board(rows)));
    }
}
