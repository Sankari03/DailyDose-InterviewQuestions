import java.util.Arrays;

public class MultiplyTwoPolynomials {
    public static void main(String[] args) {
        int M = 4, N = 3;
        int[] Arr1 = {1 , 0, 3, 2};
        int[] Arr2 = {2, 0, 4};
        System.out.println(Arrays.toString(polyMultiply(Arr1, Arr2, M, N)));
    }
    public static int[] polyMultiply(int[] Arr1, int[] Arr2, int M, int N)
    {
        int[] ans = new int[M+N-1];

        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                ans[i+j] += Arr1[i]*Arr2[j];
            }
        }
        return ans;
    }
}
