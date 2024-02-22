import java.util.Scanner;

public class GeekonacciNumber {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(NthDigit(a,b,c,n));
        }
    }

    public static int NthDigit(int a, int b, int c, int n){
        int count = 3;
        int sum = 0;
        while(count < n){
            sum = ((a + b)%1000000007 + c)%1000000007;
            a = b;
            b = c;
            c = sum;
            count++;
        }
        return sum;
    }
}
