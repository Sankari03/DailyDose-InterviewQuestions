public class IndexOfAnExtraElement {
    public static void main(String[] args) {
        int n = 7;
        int[] a = {2,4,6,8,9,10,12};
        int[] b = {2,4,6,8,10,12};
        System.out.println(findExtra(a,b,n));
    }
    public static int findExtra(int[] a, int[] b, int n) {
        // add code here.
        if(n == 1 || a.length==b.length){
            return -1;
        }
        int start = 0;
        int end = n-1;
        while(start <= end){
            int mid = start +(end-start)/2;
            if ((mid == 0 && a[mid] != b[mid]) || mid==n-1) {
                return mid;
            }
            if (a[mid] != b[mid] && a[mid - 1] == b[mid - 1]) {
                return mid;
            } else if (a[mid] == b[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
