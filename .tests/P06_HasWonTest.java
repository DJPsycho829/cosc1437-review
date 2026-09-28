public class P06_HasWonTest {
    public static void main(String[] args) {
        check(true, 'X', "XXX", "OO ", "   ");
        check(true, 'O', "X X", "X  ", "OOO");
        check(true, 'O', "XO ", "XO ", " O ");
        check(true, 'X', "OOX", "  X", "  X");
        check(true, 'X', "XO ", "OX ", "  X");
        check(true, 'O', "X O", "XO ", "O  ");
        check(false, 'O', "XXX", "OO ", "   ");
        check(false, 'X', "XOX", "OXO", "OXO");
        check(false, 'X', "   ", "   ", "   ");
        check(false, 'X', "XX ", "X  ", "   ");
        check(false, 'O', "OXO", "XXO", "OOX");
        T.done();
    }

    static void check(boolean expected, char player, String... rows) {
        String call = "hasWon({\"" + String.join("\", \"", rows) + "\"}, '" + player + "')";
        T.check(call, expected, () -> P06_HasWon.hasWon(T.board(rows), player));
    }
}
