import java.util.Arrays;

public class SortAnArrayOf0s1s2s {
    public static void main(String[] args) {
        int [] a = {0,1,2,1,0};
        int n = 5;
        System.out.println(Arrays.toString(sort012(a,n)));
    }

    public static int[] sort012(int[] a, int n)
    {
        int c0=0, c1 = 0, c2=0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0){
                c0++;
            }else if(a[i] == 1){
                c1++;
            }else{
                c2++;
            }

        }

        for (int i = 0; i < c0; i++) {
            a[i] = 0;
        }
        for (int i = c0; i < c0+c1 ; i++) {
            a[i] = 1;
        }
        for (int i = c0+c1; i < n; i++) {
            a[i] = 2;
        }
        return a;
    }
}
