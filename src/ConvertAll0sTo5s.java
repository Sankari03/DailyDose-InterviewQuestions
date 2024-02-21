public class ConvertAll0sTo5s {
    public static void main(String[] args) {
        int n = 1005;
        System.out.println(convertFive(n));
    }

    public static int convertFive(int n) {
        int ans = 0;
        int mul = 1;
        if (n == 0) {
            return 5;
        }
        while (n > 0) {
            int rem = n % 10;
            if (rem == 0) {
                ans += 5 * mul;
            } else {
                ans += rem * mul;
            }
            n /= 10;
            mul = mul * 10;
        }
        return ans;
    }
}
