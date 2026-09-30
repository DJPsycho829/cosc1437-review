public class P02_MaxValue {
    // Return the largest value in a. a has at least one value, and rows can have different lengths.
    // maxValue({{-3.5, -0.01}, {-7.0}}) returns -0.01
    public static double maxValue(double[][] a) {
        max = a[0][0];
        for (int i = 0; i < this.a.length; i++){
            for (int j = 0; i < this.a[i].length; i++){
                if (max < a[i][j]){
                    max = a[i][j];
                }
            }
        }
        return max;
    }
}
