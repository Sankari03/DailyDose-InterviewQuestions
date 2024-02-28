public class DecimalToBinary {

    public static void main(String[] args) {
        toBinary(7);
    }
    public static void toBinary(int N) {
        int ans = 0, factor = 1;
        while(N != 0){
            ans += (N%2)*factor;
            factor = factor * 10;
            N/=2;
        }
        System.out.print(ans);
    }
}
