import java.util.ArrayList;

public class SumOfUpperAndLowerTriangle {
    public static void main(String[] args) {
        int n = 3;
        int[][] arr = {{6, 5, 4},{1, 2, 5},{7, 9, 7}};
        System.out.println(sumTriangles(arr,n));
    }
    static ArrayList<Integer> sumTriangles(int[][] matrix, int n)
    {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int upperSum = 0, lowerSum = 0;

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i==j){
                    upperSum+=matrix[i][j];
                    lowerSum+=matrix[i][j];
                }else if(i > j){
                    lowerSum+=matrix[i][j];
                }else{
                    upperSum+=matrix[i][j];
                }
            }
        }

        ans.add(upperSum);
        ans.add(lowerSum);

        return ans;
    }
}
