public class BitonicPoint {
    public static void main(String[] args) {
        int n = 9;
        int[] arr = {1,15,25,45,42,21,17,12,11};
        System.out.println(findMaximum(arr,n));
    }
    public static int findMaximum(int[] arr, int n) {
        // code here
        if(n==1){
            return arr[0];
        }
        int start = 0;
        int end = n-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(mid == 0 && arr[mid+1] > arr[mid]){
                return arr[mid+1];
            }else if(mid == n-1){
                return arr[mid];
            }
            if((arr[mid] > arr[mid-1]) && (arr[mid] > arr[mid+1])){
                return arr[mid];
            }else if(arr[mid] > arr[mid-1]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return 0;
    }
}
