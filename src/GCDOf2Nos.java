public class GCDOf2Nos {

    public static void main(String[] args) {
        System.out.println(gcd(25,11));
    }

    public static int gcd(int a, int b) {
        if(b == 0){
            return a;
        }

        return gcd(b, a%b);
    }
}
