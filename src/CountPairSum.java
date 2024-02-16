public class CountPairSum {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 3, 5, 8};
        int M = arr1.length;
        int N = arr2.length;
        int x = 10;
        System.out.println(countPairs(arr1,arr2,M,N,x));
    }
    public static int countPairs(int[] arr1, int[] arr2, int M, int N, int x)
    {
        //code here.
        int start = 0;
        int end = N-1;
        int count = 0;

        while(start < M && end >= 0){
            if(arr1[start]+arr2[end] > x){
                end--;
            }else if(arr1[start]+arr2[end] < x){
                start++;
            }else{
                count++;
                start++;
                end--;
            }
        }
        return count;
    }
}
