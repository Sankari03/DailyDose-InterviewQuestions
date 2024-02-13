public class TransitionPoint {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {0,0,0,1,1};
        System.out.println(transitionPoint(arr,n));
    }
    public static int transitionPoint(int[] arr, int n) {
        // code here
        if(n==1 & arr[0]==0){
            return -1;
        }
        int start = 0;
        int end = n-1;
        int flag = 0;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == 1 && (mid > 0 && arr[mid-1] == 0)){
                return mid;
            }else if(arr[mid] == 1){
                flag = 1;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        if(flag == 0){
            return -1;
        }
        return 0;
    }
}
