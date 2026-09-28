public class P03_RowSumsTest {
    public static void main(String[] args) {
        T.check("rowSums({{1, 2, 3}, {4}, {}})", new int[] {6, 4, 0}, () -> P03_RowSums.rowSums(new int[][] {{1, 2, 3}, {4}, {}}));
        T.check("rowSums({{10, -10}, {7, 7}})", new int[] {0, 14}, () -> P03_RowSums.rowSums(new int[][] {{10, -10}, {7, 7}}));
        T.check("rowSums({{5}})", new int[] {5}, () -> P03_RowSums.rowSums(new int[][] {{5}}));
        T.check("rowSums({})", new int[] {}, () -> P03_RowSums.rowSums(new int[][] {}));
        T.done();
    }
}
