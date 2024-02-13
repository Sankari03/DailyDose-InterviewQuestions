import java.util.Arrays;

public class SwapTheArrayElements {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(swapElements(arr,n)));
    }
    public static int[] swapElements(int[] arr, int n)
    {
        // Code here
        for(int i = 0; i < n-2; i++){
            swap(arr, i, i+2);
        }
        return arr;
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
