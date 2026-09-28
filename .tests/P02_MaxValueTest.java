public class P02_MaxValueTest {
    public static void main(String[] args) {
        T.check("maxValue({{-3.5, -0.01}, {-7.0}})", -0.01, () -> P02_MaxValue.maxValue(new double[][] {{-3.5, -0.01}, {-7.0}}));
        T.check("maxValue({{1.5, 9.25}, {3.0, 4.0, 2.0}})", 9.25, () -> P02_MaxValue.maxValue(new double[][] {{1.5, 9.25}, {3.0, 4.0, 2.0}}));
        T.check("maxValue({{8.0}, {2.0, 99.5}})", 99.5, () -> P02_MaxValue.maxValue(new double[][] {{8.0}, {2.0, 99.5}}));
        T.check("maxValue({{42.0}, {1.0}})", 42.0, () -> P02_MaxValue.maxValue(new double[][] {{42.0}, {1.0}}));
        T.check("maxValue({{-2.0}})", -2.0, () -> P02_MaxValue.maxValue(new double[][] {{-2.0}}));
        T.done();
    }
}
