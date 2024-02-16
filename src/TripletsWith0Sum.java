import java.util.Arrays;

public class TripletsWith0Sum {
    public static void main(String[] args) {
        int[] arr = {4, -16, 43, 4, 7, -36, 18};
        int n = arr.length;
        System.out.println(findTriplets(arr,n));
    }

    public static boolean findTriplets(int[] arr, int n)
    {
        //add code here.
        Arrays.sort(arr);
        for(int i=0; i < n-1; i++){
            int left = i+1;
            int right = n-1;
            while(left < right){
                if(arr[i]+arr[left]+arr[right]==0){
                    return true;
                }else if(arr[i]+arr[left]+arr[right]>0){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return false;
    }
}
