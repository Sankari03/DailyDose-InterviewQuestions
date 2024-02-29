import java.util.Arrays;

public class BooleanMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,0}, {0,0}};
        booleanMatrix(matrix);
    }

    public static void booleanMatrix(int matrix[][])
    {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] ans = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[i][j] = matrix[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (ans[i][j] == 1){
                    for (int k = 0; k < m; k++) {
                        matrix[i][k] = 1;
                    }
                    for (int k = 0; k < n; k++) {
                        matrix[k][j] = 1;
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
