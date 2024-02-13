public class EquilibriumPoint {
    public static void main(String[] args) {
        int n = 5;
        long[] arr = {1,3,5,2,2};
        System.out.println(equilibriumPoint(arr,n));
    }
    public static int equilibriumPoint(long[] arr, int n) {

        // Your code here
        if(n==1){
            return 1;
        }
        int totSum = sum(arr);
        int rSum,lSum = 0;
        for (int i = 0; i < arr.length; i++) {
            rSum = (int) (totSum - arr[i]);
            if(lSum==rSum){
                return i+1;
            }
            lSum += (int) arr[i];
            totSum-=arr[i];
        }
        return -1;
    }
    private static int sum(long[]arr) {
        int sum = 0;
        for (long l : arr) {
            sum += l;
        }
        return sum;
    }
}
