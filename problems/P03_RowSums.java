public class P03_RowSums {
    // Return a new array with the sum of each row of a.
    // rowSums({{1, 2, 3}, {4}, {}}) returns {6, 4, 0}
    public static int[] rowSums(int[][] a) {
        int[] x = new int[a.length];
        sum = 0;
        for (int i = 0; i < this.a.length; i++){
            for (int j = 0; i < this.a[i].length; i++){
                sum += a[i][j];
            }
            x[i] = sum;
            sum = 0;
        }
        return x;
    }
}
