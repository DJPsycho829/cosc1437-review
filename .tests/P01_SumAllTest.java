public class P01_SumAllTest {
    public static void main(String[] args) {
        T.check("sumAll({{1, 2}, {3}})", 6, () -> P01_SumAll.sumAll(new int[][] {{1, 2}, {3}}));
        T.check("sumAll({{5}})", 5, () -> P01_SumAll.sumAll(new int[][] {{5}}));
        T.check("sumAll({{1, 2, 3}, {4, 5, 6}})", 21, () -> P01_SumAll.sumAll(new int[][] {{1, 2, 3}, {4, 5, 6}}));
        T.check("sumAll({{-4, 4}, {}, {10, -1, 2, 3}})", 14, () -> P01_SumAll.sumAll(new int[][] {{-4, 4}, {}, {10, -1, 2, 3}}));
        T.check("sumAll({})", 0, () -> P01_SumAll.sumAll(new int[][] {}));
        T.done();
    }
}
