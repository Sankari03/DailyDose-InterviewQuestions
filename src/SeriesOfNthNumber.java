public class SeriesOfNthNumber {

    //Series: 1,1,2,3,4,9,8....
    public static void main(String[] args) {
        int n = 7;
        System.out.println(nthTerm(n));
    }

    static int nthTerm(int n){
        int a = 1;
        int r;
        int N;
        if(n%2==0){
            r = 3;
            N = n/2;
          return a * (int)Math.pow(r,N-1);
        }else{
            r = 2;
            N = n/2 + 1;
            return  a * (int)Math.pow(r,N-1);
        }
    }
}
