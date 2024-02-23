import java.util.Arrays;

public class SortAscAndDesc {
    public static void main(String[] args) {
        int[] arr = {1,7,4,8,0,2,5,8,3};
        int n = arr.length;
        customSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    static void customSort(int[] arr, int n) {
        Arrays.sort(arr, 0,n/2);
        Arrays.sort(arr, n/2, n);
        int start = n/2;
        int end = n-1;
        while (start<= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
