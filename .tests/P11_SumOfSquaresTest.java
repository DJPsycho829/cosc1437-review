public class P11_SumOfSquaresTest {
    public static void main(String[] args) {
        int[][] cases = {{0, 0}, {1, 1}, {2, 5}, {3, 14}, {4, 30}, {10, 385}};
        for (int[] c : cases) {
            T.check("sumOfSquares(" + c[0] + ")", c[1], () -> P11_SumOfSquares.sumOfSquares(c[0]));
        }
        T.done();
    }
}
