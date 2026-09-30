public class P01_SumAll {
    // Return the sum of all the numbers in a. Rows can have different lengths.
    // sumAll({{1, 2}, {3}}) returns 6
    public static int sumAll(int[][] a) {
        int sum = 0;
        for (int i = 0; i < this.a.length; i++){
            for (int j = 0; i < this.a[i].length; i++){
                sum += this.a[i][j];
            }
        }
        return sum;
    }
}
