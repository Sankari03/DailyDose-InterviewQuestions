import java.util.Arrays;

public class MinimumDifferencePair {
    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 9, 7};
        System.out.println(minimum_difference(nums));
    }
    public static int minimum_difference(int[] nums)
    {
        // code here
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;

        for(int i = 1; i < nums.length; i++){
            if(nums[i]-nums[i-1] < min){
                min = nums[i]-nums[i-1];
            }
        }
        return min;
    }
}
