import java.util.Arrays;

public class InplaceTranspose {
    public static void main(String[] args) {
        int[][] arr = {{1,1,1,1},
                {2,2,2,2},
                {3,3,3,3}};
        int n = arr.length;
        transpose(n, arr);
    }
    public static void transpose(int n, int[][] arr)
    {
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
