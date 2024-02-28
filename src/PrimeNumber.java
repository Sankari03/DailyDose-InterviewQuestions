public class PrimeNumber {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(isPrime(n));
    }
    static int isPrime(int N){
        if(N <= 1){
            return 0;
        }
        for(int i = 2; i <= Math.sqrt(N); i++){  //in O(root n)
            if(N%i == 0){
                return 0;
            }
        }
        return 1;
    }
}
